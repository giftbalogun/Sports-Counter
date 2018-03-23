package com.smx.engrbalogungift.sportcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.c_score);
        scoreTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.af_score);
        scoreTextView.setText("" + number);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void threePointC(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }
    public void twoPointC(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }
    public void freeThrowC(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }
    public void threePointaf(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }
    public void twoPointaf(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }
    public void freeThrowaf(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
    public void cursorc(View v){
        final TextView nameTextView = (TextView) findViewById(R.id.cricket);
        if (v.getId() == nameTextView.getId())
        {
            nameTextView.setCursorVisible(true);
        }
        nameTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                nameTextView.setCursorVisible(false);
                if (event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(nameTextView.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
                return false;
            }
        });
    }
    public void cursoraf(View v){
        final TextView nameTextView = (TextView) findViewById(R.id.afootball);
        if (v.getId() == nameTextView.getId())
        {
            nameTextView.setCursorVisible(true);
        }
        nameTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                nameTextView.setCursorVisible(false);
                if (event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(nameTextView.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
                return false;
            }
        });
    }
}
