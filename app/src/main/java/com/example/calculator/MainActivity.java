package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAddition;
    Button buttonSubtraction;
    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonDecimal;
    Button buttonCancel;
    Button buttonEquals;

    TextView textView;
    TextView textView2;

    float mValueOne;
    float mValueTwo;

    boolean Addition;
    boolean Subtraction;
    boolean Multiplication;
    boolean Division;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonAddition = (Button) findViewById(R.id.buttonAddition);
        buttonSubtraction = (Button) findViewById(R.id.buttonSubtract);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView == null) {
                    textView.setText("");
                } else {
                    mValueOne = Float.parseFloat(textView.getText() + "");
                    Addition = true;
                    textView.setText(null);
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(textView.getText() + "");
                Subtraction = true;
                textView.setText(null);
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(textView.getText() + "");
                Multiplication = true;
                textView.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(textView.getText() + "");
                Division = true;
                textView.setText(null);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(textView.getText() + "");

                if (Addition == true) {
                    textView.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if (Subtraction == true) {
                    textView.setText(mValueOne - mValueTwo + "");
                    Subtraction = false;
                }
                if (Multiplication == true) {
                    textView.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    textView.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + ".");
            }
        });



    }
}