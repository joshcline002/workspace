package example.com.lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.DownloadManager;
import android.app.ListActivity;
import android.app.VoiceInteractor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity implements DownloadWebpageTask.ResultHandler{

	EditText text;
	ListView list;
	ArrayList<ItunesRecord> records;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (EditText)findViewById(R.id.username);
		Button search = (Button)findViewById(R.id.search);
		list = (ListView)findViewById(android.R.id.list);
		records = new ArrayList<ItunesRecord>();
		search.setOnClickListener(new OnClickListener() {

			/* (non-Javadoc)
			 * @see android.view.View.OnClickListener#onClick(android.view.View)
			 */
			public void onClick(View v) {

				//TODO get the username to search for from the activity_main.xml view
				String artist = text.getText().toString();
				Log.e("Artist Searched", artist);
				String URL = "https://itunes.apple.com/search?term=" + artist + "&entity=song&limit=20";

				//TODO execute a new DownloadWebpageTask
				DownloadWebpageTask task = new DownloadWebpageTask(MainActivity.this);
				task.execute(URL);

			}
		});
	}


	@Override
	public void handleResult(String result) {
		//TODO Handle the Result of a Network Call
		JSONArray resObj = null;
		JSONObject obj = null;
		try {
			resObj = new JSONArray(result.substring(result.indexOf("[")));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		if (!(resObj == null)) {
			for (int i = 0; i < resObj.length(); i++) {
				try {
					obj = resObj.getJSONObject(i);
					String title = obj.getString("collectionName");
					Log.e("TItle", title);
					String album = obj.getString("trackName");
					Log.e("album", album);
					records.add(new ItunesRecord(album, title));
				} catch (JSONException ex) {
					Log.e("Exception:", "Request not completed");
				}
			}
			ItunesAdapter itunesAd = new ItunesAdapter(MainActivity.this, R.layout.list, records);
			list.setAdapter(itunesAd);
			itunesAd.notifyDataSetChanged();
		} else {
			Toast.makeText(getApplicationContext(), "No Results", Toast.LENGTH_SHORT).show();
		}
	}
}
