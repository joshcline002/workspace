package com.example.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *
 * Sample Stopwatch Android activity
 *
 */
public class StopWatchActivity extends Activity {

    /**
     * REFRESH_RATE defines how often we should update the timer to show how much time has elapsed.
     * refresh every 100 milliseconds
     */
    private final int REFRESH_RATE = 100;
    private boolean run = false;
    private Handler mHandler = new Handler();

    /**
     * A variable to keep track of the seconds
     */
    private long tenth;
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stopwatch);
    }



    // TODO: Create a Stopwatch!
    /**
     * This method will start the current stopwatch clock
     *
     * @param view the current view
     */

    public void startClick(View view){
       showStopButton();
       mHandler.postDelayed(startTimer, REFRESH_RATE);
    }
    /**
     * This method will reset the current stopwatch clock
     *
     * @param view the current view
     */
    public void resetClick(View view){

        tenth =0;
        TextView text = (TextView)findViewById(R.id.Timer);
        text.setText("00:00:00");
        TextView textms = (TextView)findViewById(R.id.ms);
        textms.setText(".0");


    }

    /**
     * This method will stop the current stopwatch.
     *
     * @param view the current view
     */
    public void stopClick(View view){

        hideStopButton();
        mHandler.removeCallbacks(startTimer);

    }

    /**
     * This method will show the stop button when called by hiding the 
     * start and reset button and making the stop button visible.
     */
    private void showStopButton(){

        TextView start = (TextView)findViewById(R.id.start);
        start.setVisibility(View.GONE);
        TextView reset = (TextView)findViewById(R.id.reset);
        reset.setVisibility(View.GONE);
        TextView stop = (TextView)findViewById(R.id.stop);
        stop.setVisibility(View.VISIBLE);

    }

    /**
     * This method will show the start and reset buttons by hiding the 
     * stop button and making the start and reset buttons visible.
     */
    private void hideStopButton(){
        TextView start = (TextView)findViewById(R.id.start);
        start.setVisibility(View.VISIBLE);
        TextView reset = (TextView)findViewById(R.id.reset);
        reset.setVisibility(View.VISIBLE);
        TextView stop = (TextView)findViewById(R.id.stop);
        stop.setVisibility(View.GONE);

    }

    /**
     * Converts the elapsed given time and updates the display
     *
     * @param time the time to update the current display to
     */
    private void updateTimer (long time){
        long ms = time % 10;
        long sec = time/10;
        long min = sec/60;
        long hours = min/60;
        min = min % 60;
        sec = sec % 60;

        TextView text = (TextView)findViewById(R.id.Timer);
        text.setText("" + hours + ":" + min + ":" + sec);
        TextView textms = (TextView)findViewById(R.id.ms);
        textms.setText("." + ms);


    }

    /**
     * Create a Runnable startTimer that makes timer runnable.
     */
    private Runnable startTimer = new Runnable() {
        public void run() {
                tenth++;
                updateTimer(tenth);
            mHandler.postDelayed(startTimer, REFRESH_RATE);
            }
    };

}
    