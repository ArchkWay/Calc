package com.example.archek.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double firstValue;
    double secondValue;
    String  firstInput;
    String  secondInput;
    String allInput;
    String operation;

    TextView tvResult;
    TextView tvFirstValue;
    TextView tvOperation;
    TextView tvSecondValue;

    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDev;
    Button btnEqual;
    Button btnClear;

    boolean negative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        logic();
    }
    private void init(){
        tvResult = findViewById(R.id.tvResult);
        tvFirstValue = findViewById(R.id.tvFirstValue);
        tvOperation = findViewById(R.id.tvOperation);
        tvSecondValue = findViewById(R.id.tvSecondValue);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDev = findViewById(R.id.btnDev);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
    }
    private void logic(){
        operation = "";
        firstInput = "";
        secondInput = "";
        btnOne.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            if(operation.isEmpty()){
                firstInput += "1";
                tvFirstValue.setText(firstInput);
            }
            else {
                secondInput += "1";
                tvSecondValue.setText(secondInput);
            }
        }

        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "2";
                    firstInput = firstInput + "2";
                    tvFirstValue.setText(firstInput + "2");
                }
                else secondInput = secondInput + "2";
                tvSecondValue.setText(secondInput + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "3";
                    firstInput = firstInput + "3";
                    tvFirstValue.setText(firstInput + "3");
                }
                else allInput = allInput + "3";
                tvSecondValue.setText(secondInput + "3");
                secondInput = secondInput + "3";
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "4";
                    firstInput = firstInput + "4";
                    tvFirstValue.setText(firstInput + "4");
                }
                else allInput = allInput + "4";
                tvSecondValue.setText(secondInput + "4");
                secondInput = secondInput + "4";
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "5";
                    firstInput = firstInput + "5";
                    tvFirstValue.setText(firstInput + "5");
                }
                else allInput = allInput + "5";
                tvSecondValue.setText(secondInput + "5");
                secondInput = secondInput + "5";
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "6";
                    firstInput = firstInput + "6";
                    tvFirstValue.setText(firstInput + "6");
                }
                else allInput = allInput + "6";
                tvSecondValue.setText(secondInput + "6");
                secondInput = secondInput + "6";
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "7";
                    firstInput = firstInput + "7";
                    tvFirstValue.setText(firstInput + "7");
                }
                else allInput = allInput + "7";
                tvSecondValue.setText(secondInput + "7");
                secondInput = secondInput + "7";
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "8";
                    firstInput = firstInput + "8";
                    tvFirstValue.setText(firstInput + "8");
                }
                else allInput = allInput + "8";
                tvSecondValue.setText(secondInput + "8");
                secondInput = secondInput + "8";
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "9";
                    firstInput = firstInput + "9";
                    tvFirstValue.setText(firstInput + "9");
                }
                else allInput = allInput + "9";
                tvSecondValue.setText(secondInput + "9");
                secondInput = secondInput + "9";
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(operation.isEmpty()){
                    allInput = allInput + "0";
                    firstInput = firstInput + "0";
                    tvFirstValue.setText(firstInput + "0");
                }
                else allInput = allInput + "0";
                tvSecondValue.setText(secondInput + "0");
                secondInput = secondInput + "0";
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("+");
                operation = "+";
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!negative) {
                    tvFirstValue.setText("-");
                    firstInput = "-";
                    negative = true;
                }
                else if(operation.equals("-")&negative){
                    tvSecondValue.setText("-");
                    secondInput = "-";
                    negative = true;
                }
                else {
                    operation = "-";
                    tvOperation.setText(operation);
                    negative = true;
                }

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("*");
                operation = "*";
            }
        });
        btnDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOperation.setText("/");
                operation = "/";
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvFirstValue.getText().equals("") && tvOperation.equals("") && tvSecondValue.getText().equals("")) {
                    if(operation.equals("+")) {
                        double result = Double.valueOf(firstValue) + Double.valueOf(secondValue);
                        tvResult.setText(String.valueOf(result));
                        negative = false;
                    }
                    else if(operation.equals("-")) {
                        tvResult.setText(String.valueOf(firstValue - secondValue));
                        allInput = String.valueOf(firstValue - secondValue);
                        negative = false;
                    }
                    else if(operation.equals("*")) {
                        tvResult.setText(String.valueOf(firstValue * secondValue));
                        allInput = String.valueOf(firstValue * secondValue);
                        negative = false;
                    }
                    else if(operation.equals("/")) {
                        tvResult.setText(String.valueOf(firstValue / secondValue));
                        allInput = String.valueOf(firstValue / secondValue);
                        negative = false;
                    }
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                firstValue = 0;
                secondValue = 0;
                tvOperation.setText("");
                operation = "";
                firstInput = "";
                secondInput = "";
                tvFirstValue.setText("");
                tvSecondValue.setText("");
                negative = false;
            }
        });

    }
}
