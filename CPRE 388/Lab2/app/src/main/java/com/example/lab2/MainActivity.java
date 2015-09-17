package com.example.lab2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author jamiekujawa
 *
 */
public class MainActivity extends Activity {

    /**
     * A string builder to represent the first number entered in the series of entries
     */
    private StringBuilder expression1;

    /**
     * A string builder to represent the second number entered in the series of entries
     */
    private StringBuilder expression2;

    /**
     * A string to represent the last operator performed
     */
    private String oldOperator;

    private String operator = "";

    double result;

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare all buttons used within the layout
        Button zero = (Button) findViewById(R.id.button0);
        Button one = (Button) findViewById(R.id.button1);
        Button two = (Button) findViewById(R.id.button2);
        Button three = (Button) findViewById(R.id.button3);
        Button four = (Button) findViewById(R.id.button4);
        Button five = (Button) findViewById(R.id.button5);
        Button six = (Button) findViewById(R.id.button6);
        Button seven = (Button) findViewById(R.id.button7);
        Button eight = (Button) findViewById(R.id.button8);
        Button nine = (Button) findViewById(R.id.button9);
        Button times = (Button) findViewById(R.id.buttontimes);
        Button clear = (Button) findViewById(R.id.buttonClear);
        Button equal = (Button) findViewById(R.id.buttonEqual);
        Button decimal = (Button) findViewById(R.id.buttonDecimal);
        Button divide = (Button) findViewById(R.id.buttondivide);
        Button add = (Button) findViewById(R.id.buttonplus);
        Button subtract = (Button) findViewById(R.id.buttonminus);

        // declare main text view
        final TextView main = (TextView) findViewById(R.id.CalculatorText);

        // Main Strings to represent the expressions
        expression1 = new StringBuilder();
        expression2 = new StringBuilder();
        //main.setText(expression1.append("0.0"));

		/*
		 * Set up all key listener events
		 */
        zero.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(0);
                main.setText(expression1);
            }

        });

        one.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(1);
                main.setText(expression1);
            }

        });

        two.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(2);
                main.setText(expression1);
            }

        });

        three.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(3);
                main.setText(expression1);
            }

        });

        four.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(4);
                main.setText(expression1);
            }

        });

        five.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(5);
                main.setText(expression1);
            }

        });

        six.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(6);
                main.setText(expression1);
            }

        });

        seven.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(7);
                main.setText(expression1);
            }

        });

        eight.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(8);
                main.setText(expression1);
            }

        });

        nine.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(9);
                main.setText(expression1);
            }

        });

        times.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                main.setText("");
                if (expression1.toString() == "") {
                    operator = "*";
                } else if (operator == "="){
                    expression2.delete(0, expression2.length());
                    expression2.append(result);
                    operator="*";
                } else if (operator == ""){
                    operator = "*";
                    expression2.delete(0, expression2.length());
                    expression2.append(expression1);
                    expression1.delete(0, expression1.length());
                } else {
                    expression2.delete(0, expression2.length());
                    expression2.append(result);
                    operator="*";
                }
            }
        });

        clear.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.delete(0, expression1.length());
                expression2.delete(0, expression2.length());
                oldOperator = "";
                operator = "";
                main.setText("");
            }

        });

        equal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (operator == "="){
                    expression1.append(expression2);
                    expression2.delete(0, expression2.length());
                    expression2.append(result);
                    evaluate(oldOperator);
                } else {
                    evaluate(operator);
                }
                operator = "=";
                main.setText(result+"");
            }
        });

        decimal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                expression1.append(".");
                main.setText(expression1);
            }

        });

        divide.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (expression1.toString() == "") {
                    main.setText("");
                    operator = "/";
                    expression2.delete(0, expression2.length());
                    expression2.append(expression1);
                    expression1.delete(0, expression1.length());
                }
            }
        });

        add.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (expression1.toString() == "") {
                    main.setText("");
                    operator = "+";
                    expression2.delete(0, expression2.length());
                    expression2.append(expression1);
                    expression1.delete(0, expression1.length());
                }
            }

        });

        subtract.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (expression1.toString() == "") {
                    main.setText("");
                    operator = "-";
                    expression2.delete(0, expression2.length());
                    expression2.append(expression1);
                    expression1.delete(0, expression1.length());
                }
            }
        });
    }

    /**
     * This method will evaluate an operation using expression1 and expression 2
     *
     * @param buttonPressed or operation to be performed
     * @return the result of the operation
     */
    public void evaluate(String buttonPressed) {
        double number2 = Double.parseDouble(expression1.toString());
        double number1 = Double.parseDouble(expression2.toString());
        if (buttonPressed == "*") {
            result = number1 * number2;
        } else if (buttonPressed == "/") {
            result = number1 / number2;
        } else if (buttonPressed == "+") {
            result = number1 + number2;
        } else if (buttonPressed == "-") {
            result = number1 - number2;
        }
        expression2.delete(0, expression2.length());
        expression2.append(expression1);
        expression1.delete(0, expression1.length());
        oldOperator = buttonPressed;
    }
}