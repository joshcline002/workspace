package com.example.mediaplayerpreferences;


import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * CPRE 388 - Labs
 * 
 * Copyright 2013
 */
public class MyMediaPlayerActivity extends Activity {

	/**
	 * Other view elements
	 */
	private TextView songTitleLabel;

	private boolean shuffle;
	/**
	 *  media player:
	 *  http://developer.android.com/reference/android/media/MediaPlayer.html 
	 */
	private MediaPlayer mp;

	/**
	 * Index of the current song being played
	 */
	private int currentSongIndex = 0;

	private SharedPreferences prefs;
	private Button playPausebtn;

	MediaPlayer.OnCompletionListener listener = new MediaPlayer.OnCompletionListener() {
		@Override
		public void onCompletion(MediaPlayer mp) {
			boolean shuffle = prefs.getBoolean(getResources().getString(R.string.mp_shuffle_pref), false);
			boolean repeat = prefs.getBoolean(getResources().getString(R.string.mp_repeat_pref), false);

			if(repeat) {
				playSong(currentSongIndex);
			}
			else if(shuffle) {
				Random rand = new Random(System.currentTimeMillis());
				playSong(rand.nextInt(songsList.size()));
			}
			else {
				forward(playPausebtn);
			}
		}
	};

	static final int request = 52;

	/**
	 * List of Sounds that can be played in the form of SongObjects
	 */
	private static ArrayList<SongObject> songsList = new ArrayList<SongObject>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.media_player_main);

		songTitleLabel = (TextView) findViewById(R.id.songTitle);

		playPausebtn = (Button)findViewById(R.id.playpausebutton);
		// Initialize the media player
		mp = new MediaPlayer();

		mp.setOnCompletionListener(listener);

		prefs = PreferenceManager.getDefaultSharedPreferences(this);

		// Getting all songs in a list
		populateSongsList();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.media_player_menu, menu);
		return true;
	} 

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.menu_choose_song:
			// Open SongList to display a list of audio files to play
			Intent intent = new Intent(this, SongList.class);
			startActivityForResult(intent, request);

			return true;
		case R.id.menu_preferences:
			startActivity(new Intent(this, MediaPreferences.class));
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void playPause(View v){
		if (mp.isPlaying()){
			mp.pause();
			playPausebtn.setBackground(getResources().getDrawable(R.drawable.btn_play));
		} else {
			mp.start();
			playPausebtn.setBackground(getResources().getDrawable(R.drawable.btn_pause));
		}
	}

	public void back(View v){
		if (currentSongIndex == 0){
			playSong(songsList.size()-1);
		} else {
			playSong(currentSongIndex - 1);
		}
	}

	public void forward(View v) {
		if (currentSongIndex == songsList.size() - 1) {
			playSong(0);
		} else {
			playSong(currentSongIndex + 1);
		}
	}

	/**
	 * Helper function to play a song at a specific index of songsList
	 * @param songIndex - index of song to be played
	 */
	public void  playSong(int songIndex){
		// Play song if index is within the songsList
		if (songIndex < songsList.size() && songIndex >= 0) {
			try {
				mp.stop();
				mp.reset();
				mp.setDataSource(songsList.get(songIndex).getFilePath());
				mp.prepare();
				mp.start();
				// Displaying Song title
				String songTitle = songsList.get(songIndex).getTitle();
				songTitleLabel.setText(songTitle);

				// Changing Button Image to pause image
				((Button)findViewById(R.id.playpausebutton)).setBackgroundResource(R.drawable.btn_pause);

				// Update song index
				currentSongIndex = songIndex;

			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} else if (songsList.size() > 0) {
			playSong(0);
		}
	}


	/** 
	 * Get list of info for all sounds to be played
	 */
	public void populateSongsList(){
		//TODO add all songs from audio content URI to this.songsList
		Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
		String[] columns = {MediaStore.Audio.Media.TITLE, MediaStore.Audio.Media.DATA};
		// Get a Cursor object from the content URI
		Cursor mCursor = getContentResolver().query(
				uri, columns, null, null, null);
		mCursor.getColumnIndex(columns[1]);
		
		// Use the cursor to loop through the results and add them to 
		//		the songsList as SongObjects
		if (mCursor.moveToFirst()){
			do{
				String title = mCursor.getString(mCursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
				String data = mCursor.getString(mCursor.getColumnIndex(MediaStore.Audio.Media.DATA));
				SongObject song = new SongObject(title, data);
				songsList.add(song);

			} while (mCursor.moveToNext());
		}
	}

	/**
	 * Get song list for display in ListView
	 * @return list of Songs 
	 */
	public static ArrayList<SongObject> getSongsList(){
		return songsList;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == request && resultCode == RESULT_OK){
			playSong(data.getIntExtra("songIndex", 0));
		}
	}
}
