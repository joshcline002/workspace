package com.paad.todolist;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by jccline on 10/9/2015.
 */
public class NewDateFragment extends Fragment {

    private OnNewItemAddedListener onNewItemAddedListener;

    public interface OnNewItemAddedListener {
        public void onNewDateAdded(String newItem);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_date_fragment, container, false);

        final EditText myEditText =
                (EditText)view.findViewById(R.id.myEditDate);

        myEditText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                    if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER) ||
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        String newItem = myEditText.getText().toString();
                        onNewItemAddedListener.onNewDateAdded(newItem);
                        myEditText.setText("");
                        return true;
                    }
                return false;
            }
        });

        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            onNewItemAddedListener = (OnNewItemAddedListener)activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() +
                    " must implement OnNewItemAddedListener");
        }
    }


}
