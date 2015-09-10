package com.example.jccline.helloworld;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] messages;
    private Random random;
    private int red;
    private int green;
    private int blue;
    private Toast toast;
    private int duration;
    private String toastText;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        messages = new String[10];
        messages[0] = "Hello Dave!";
        messages[1] = "These are not the Droids you're looking for.";
        messages[2] = "All your Androids are belong to us!";
        messages[3] = "Thank you! \nBut our Android is in another castle.";
        messages[4] = "It's a Me! \nAndroid!";
        messages[5] = "Would you kindly press the button again?";
        messages[6] = "It's dangerous to go alone, take this. \nThe screen doubles as a flashlight!";
        messages[7] = "Hey! Look! Listen! \nPress the button again!";
        messages[8] = "Fus Ro Droid! \n-unrelenting Android-";
        messages[9] = "The apple is a lie!";

        context = getApplicationContext();
        duration = Toast.LENGTH_SHORT;

        toast = Toast.makeText(context, "Default Color", duration);
        toast.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeText(View view){
        toast.cancel();
        TextView text = (TextView) findViewById(R.id.textview1);
        text.setText(messages[random.nextInt(10)]);
        red = random.nextInt(255);
        green = random.nextInt(255);
        blue = random.nextInt(255);
        text.setTextColor(Color.rgb(red, green, blue));


        toastText = "r=" + red + " g=" + green + " b=" + blue;
        toast = Toast.makeText(context, toastText, duration);
        toast.show();

    }
}
