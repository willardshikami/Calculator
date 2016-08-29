package com.example.willardpc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView _screen;
    private String display = " ";
    private String currentOperator = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _screen = (TextView)findViewById(R.id.textView);
        _screen.setText(display);

    }

    private void updateScreen() {
        _screen.setText(display);
    }

    protected void onClickNumber(View v) {
        Button b = (Button) v;
        display += b.getText();
        updateScreen();
    }

    protected void onClickOperator(View v) {
        Button b = (Button) v;
        display += b.getText();
        currentOperator = b.getText().toString();
        updateScreen();
    }

    private void clear() {
        display = " ";
        currentOperator = " ";
        updateScreen();
    }

    protected void onClickClear (View v) {

        updateScreen();
    }


    protected void onClickEqual(View v) {

    }
}
