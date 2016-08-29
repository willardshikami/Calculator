package com.example.willardpc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

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

    public void onClickNumber(View v) {
        Button b = (Button) v;
        display += b.getText();
        updateScreen();
    }

    public void onClickOperator(View v) {
        Button b = (Button) v;
        display += b.getText();
        currentOperator = b.getText().toString();
        updateScreen();
    }

    public void clear() {
        display = " ";
        currentOperator = " ";
        updateScreen();
    }

    public void onClickClear (View v) {
        clear();
        updateScreen();
    }

    private double Operate(String a, String b, String op) {
        switch (op) {
            case "+":
                return Double.valueOf(a) + Double.valueOf(b);
            case "-":
                return Double.valueOf(a) - Double.valueOf(b);
            case "x":
                return Double.valueOf(a) * Double.valueOf(b);
            case "/":
                try {
                    return Double.valueOf(a) / Double.valueOf(b);
                } catch (Exception e) {


                }
            default:
                return -1;
        }
    }


    public void onClickEqual(View v) {
        String[] operation = display.split(Pattern.quote(currentOperator));
        if(operation.length < 2 ) return;

        try {


        }catch(Exception e) {

        }
    }
}
