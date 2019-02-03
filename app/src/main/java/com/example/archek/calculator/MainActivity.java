package com.example.archek.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String result;
    String firstInput= "";
    String secondInput= "";
    String operation= "";

    TextView tvResult;
    TextView tvOperation;
    TextView tvFirstValue;
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
    Button btnPoint;
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
        setTitle("Please, enter first value");
        tvResult = findViewById(R.id.tvResult);
        tvOperation = findViewById(R.id.tvOperation);
        tvFirstValue = findViewById(R.id.tvFirstValue);
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
        btnPoint = findViewById(R.id.btnPoint);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDev = findViewById(R.id.btnDev);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
    }
    private void logic(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id) {
                    case R.id.btnOne:
                        if (operation.isEmpty()) {
                            firstInput += "1";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "1";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnTwo:
                        if (operation.isEmpty()) {
                            firstInput += "2";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "2";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnThree:
                        if (operation.isEmpty()) {
                            firstInput += "3";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "3";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnFour:
                        if (operation.isEmpty()) {
                            firstInput += "4";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "4";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnFive:
                        if (operation.isEmpty()) {
                            firstInput += "5";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "5";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnSix:
                        if (operation.isEmpty()) {
                            firstInput += "6";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "6";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnSeven:
                        if (operation.isEmpty()) {
                            firstInput += "7";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "7";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnEight:
                        if (operation.isEmpty()) {
                            firstInput += "8";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "8";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnNine:
                        if (operation.isEmpty()) {
                            firstInput += "9";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "9";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnZero:
                        if (operation.isEmpty()) {
                            firstInput += "0";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += "0";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnPoint:
                        if (operation.isEmpty()) {
                            firstInput += ".";
                            tvFirstValue.setText(firstInput);
                        } else {
                            secondInput += ".";
                            tvSecondValue.setText(secondInput);
                        }
                        break;
                    case R.id.btnPlus:
                        tvOperation.setText("+");
                        operation = "+";
                        setTitle("Please, enter second value");
                        break;
                    case R.id.btnMinus:
                        if(firstInput.isEmpty() && operation.isEmpty()){
                                firstInput += "-";
                                tvFirstValue.setText(firstInput);
                            }
                            else if(!firstInput.isEmpty() && !operation.isEmpty()&&secondInput.isEmpty()){
                            secondInput += "-";
                            tvSecondValue.setText(secondInput);
                        }
                            else {
                            operation = "-";
                            tvOperation.setText(operation);
                            negative = true;
                            setTitle("Please, enter second value");
                        }
                        break;
                    case R.id.btnMultiply:
                        tvOperation.setText("*");
                        operation = "*";
                        setTitle("Please, enter second value");
                        break;
                    case R.id.btnDev:
                        tvOperation.setText("/");
                        operation = "/";
                        setTitle("Please, enter second value");
                        break;
                    case R.id.btnEqual:
                        setTitle("Push \"CLEAR\" for a new calculation");
                            if (operation.equals("+")) {
                                result = String.valueOf(Double.parseDouble(firstInput) + Double.parseDouble(secondInput));
                                if(result.substring(result.length() - 2, result.length()).equals(".0")) {
                                    result = result.substring(0, result.length() - 2);
                                }
                                tvResult.setText(result);
                                negative = false;
                            } else if (operation.equals("-")) {
                                result = String.valueOf(Double.parseDouble(firstInput) - Double.parseDouble(secondInput));
                                if(result.substring(result.length() - 2, result.length()).equals(".0")) {
                                    result = result.substring(0, result.length() - 2);
                                }
                                tvResult.setText(result);
                                negative = false;
                            } else if (operation.equals("*")) {
                                result = String.valueOf(Double.parseDouble(firstInput) * Double.parseDouble(secondInput));
                                if(result.substring(result.length() - 2, result.length()).equals(".0")) {
                                    result = result.substring(0, result.length() - 2);
                                }
                                tvResult.setText(result);
                                negative = false;
                            } else if (operation.equals("/")) {
                                result = String.valueOf(Double.parseDouble(firstInput) / Double.parseDouble(secondInput));
                                if(result.substring(result.length() - 2, result.length()).equals(".0")) {
                                    result = result.substring(0, result.length() - 2);
                                }
                                tvResult.setText(result);
                                negative = false;
                            }
                                break;
                    case R.id.btnClear:
                        setTitle("Please, enter first value");
                        tvResult.setText("");
                        tvOperation.setText("");
                        operation = "";
                        firstInput = "";
                        secondInput = "";
                        tvFirstValue.setText("");
                        tvSecondValue.setText("");
                        negative = false;
                        break;
                }
            }
        };

        btnOne.setOnClickListener(listener);
        btnTwo.setOnClickListener(listener);
        btnThree.setOnClickListener(listener);
        btnFour.setOnClickListener(listener);
        btnFive.setOnClickListener(listener);
        btnSix.setOnClickListener(listener);
        btnSeven.setOnClickListener(listener);
        btnEight.setOnClickListener(listener);
        btnNine.setOnClickListener(listener);
        btnZero.setOnClickListener(listener);
        btnPlus.setOnClickListener(listener);
        btnMinus.setOnClickListener(listener);
        btnMultiply.setOnClickListener(listener);
        btnDev.setOnClickListener(listener);
        btnEqual.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);
        btnPoint.setOnClickListener(listener);
    }
}
