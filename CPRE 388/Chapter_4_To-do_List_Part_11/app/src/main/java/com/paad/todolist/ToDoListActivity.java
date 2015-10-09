package com.paad.todolist;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ToDoListActivity extends Activity {

  ListView myListView;
  private EditText myEditText;
  private EditText myEditMM;
  private EditText myEditDD;
  private EditText myEditYY;
  private ArrayList<String> todoItems;
  private ArrayAdapter<String> aa;

  private String text;
  private String MM;
  private String DD;
  private String YY;

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  
    // Inflate your View
    setContentView(R.layout.main);
  
    // Get references to UI widgets
    myListView = (ListView)findViewById(R.id.myListView);
    myEditText = (EditText)findViewById(R.id.myEditText);
    myEditMM =(EditText)findViewById(R.id.myEditMM);
    myEditDD =(EditText)findViewById(R.id.myEditDD);
    myEditYY =(EditText)findViewById(R.id.myEditYY);

    // Create the Array List of to do items
    todoItems = new ArrayList<String>();
   
    aa = new ArrayAdapter<String>(this,
                                  android.R.layout.simple_list_item_1,
                                  todoItems);
   
    // Bind the Array Adapter to the List View
    myListView.setAdapter(aa);

    myEditText.setOnKeyListener(new View.OnKeyListener() {
      public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN)
          if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER) ||
                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
            text = myEditText.getText().toString();
            MM = myEditMM.getText().toString();
            DD = myEditDD.getText().toString();
            YY = myEditYY.getText().toString();
            if (text.compareTo("") == 0 || MM.compareTo("") == 0 || DD.compareTo("") == 0 || YY.compareTo("") == 0 ){
              Toast.makeText(getApplicationContext(), "One or More field is empty", Toast.LENGTH_SHORT).show();
            } else {
              updateList();
            }
            return true;
          }
        return false;
      }
    });

    myEditMM.setOnKeyListener(new View.OnKeyListener() {
      public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN)
          if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER) ||
                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
            text = myEditText.getText().toString();
            MM = myEditMM.getText().toString();
            DD = myEditDD.getText().toString();
            YY = myEditYY.getText().toString();
            if (text.compareTo("") == 0 || MM.compareTo("") == 0 || DD.compareTo("") == 0 || YY.compareTo("") == 0) {
              Toast.makeText(getApplicationContext(), "One or More field is empty", Toast.LENGTH_SHORT).show();
            } else {
              updateList();
            }
            return true;
          }
        return false;
      }
    });

    myEditDD.setOnKeyListener(new View.OnKeyListener() {
      public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN)
          if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER) ||
                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
            text = myEditText.getText().toString();
            MM = myEditMM.getText().toString();
            DD = myEditDD.getText().toString();
            YY = myEditYY.getText().toString();
            if (text.compareTo("") == 0 || MM.compareTo("") == 0 || DD.compareTo("") == 0 || YY.compareTo("") == 0) {
              Toast.makeText(getApplicationContext(), "One or More field is empty", Toast.LENGTH_SHORT).show();
            } else {
              updateList();
            }
            return true;
      }

        return false;
      }
    });

    myEditYY.setOnKeyListener(new View.OnKeyListener() {
      public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN)
          if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER) ||
                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
            text = myEditText.getText().toString();
            MM = myEditMM.getText().toString();
            DD = myEditDD.getText().toString();
            YY = myEditYY.getText().toString();
            if (text.compareTo("") == 0 || MM.compareTo("") == 0 || DD.compareTo("") == 0 || YY.compareTo("") == 0) {
              Toast.makeText(getApplicationContext(), "One or More field is empty", Toast.LENGTH_SHORT).show();
            } else {
              updateList();
            }
            return true;
          }
        return false;
      }
    });

  }

  private void updateList(){
    todoItems.add(0, myEditText.getText().toString() + " " + myEditMM.getText().toString() + "/" +
            myEditDD.getText().toString() + "/" + myEditYY.getText().toString());
    aa.notifyDataSetChanged();
    myEditText.setText("");
    myEditMM.setText("");
    myEditDD.setText("");
    myEditYY.setText("");
  }

}