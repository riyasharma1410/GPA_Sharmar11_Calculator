package com.example.gpa_calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Gpacalculator.databinding.ActivityMainBinding;
public class GPACalculatorActivity extends AppCompatActivity {

    EditText grade1, grade2, grade3, grade4, grade5;
    Button computeButton;
    TextView gpaLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpacalculator);

        grade1 = (EditText) findViewById(R.id.grade1);
        grade2 = (EditText) findViewById(R.id.grade2);
        grade3 = (EditText) findViewById(R.id.grade3);
        grade4 = (EditText) findViewById(R.id.grade4);
        grade5 = (EditText) findViewById(R.id.grade5);

        computeButton = (Button) findViewById(R.id.computeButton);
        gpaLabel = (TextView) findViewById(R.id.gpaLabel);
        computeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate the inputs
                if (grade1.getText().toString().trim().length() == 0 ||
                        grade2.getText().toString().trim().length() == 0 ||
                        grade3.getText().toString().trim().length() == 0 ||
                        grade4.getText().toString().trim().length() == 0 ||
                        grade5.getText().toString().trim().length() == 0) {
                    gpaLabel.setText("Please enter grades for all courses");
                    gpaLabel.setBackgroundColor(Color.RED);
                    return;
                }

                // Compute GPA
                double grade1Val = Double.parseDouble(grade1.getText().toString());
                double grade2Val = Double.parseDouble(grade2.getText().toString());
                double grade3Val = Double.parseDouble(grade3.getText().toString());
                double grade4Val = Double.parseDouble(grade4.getText().toString());
                double grade5Val = Double.parseDouble(grade5.getText().toString());
                double total = (grade1Val + grade2Val + grade3Val + grade4Val + grade5Val) / 5;
                gpaLabel.setText("GPA: " + total);

                // Set background color based on GPA
                if (total >= 80) {
                    gpaLabel.setBackgroundColor(Color.GREEN);
                } else if (total >= 60) {
                    gpaLabel.setBackgroundColor(Color.YELLOW);
                } else {
                    gpaLabel.setBackgroundColor(Color.RED);
                }

                // Change the button text
                computeButton.setText("Clear Form");
            }
        });


public class MainActivity<NavController> extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    public EditText e1, e2;
    TextView t1;
    int num1, num2;
    public boolean getNumbers() {

        //checkAndClear();
        // defining the edit text 1 to e1
        e1 = (EditText) grade1.findViewById();

        // defining the edit text 2 to e2
        e2 = (EditText) grade2.findViewById();

        // defining the text view to t1
        t1 = (TextView) grade3.findViewById();

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();



        if(s1.equals("Please enter value 1") && s2.equals(null))
        {
            String result = "Please enter value 2";
            e2.setText(result);
            return false;
        }
        if(s1.equals(null) && s2.equals("Please enter value 2"))
        {
            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }
        if(s1.equals("Please enter value 1") || s2.equals("Please enter value 2"))
        {
            return false;
        }

        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")) ){

            String result = "Please enter value 2";

            e2.setText(result);
            return false;
        }
        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){
            //checkAndClear();
            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }
        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){
            //checkAndClear();
            String result1 = "Please enter value 1";
            e1.setText(result1);
            String result2 = "Please enter value 2";
            e2.setText(result2);
            return false;
        }

        else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);


        }
        return true;
    }

    public void doSum(View v) {

        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }

    }
    public void clearTextNum1(View v) {

        // get the input numbers
        e1.getText().clear();
    }
    public void clearTextNum2(View v) {
        // get the input numbers
        e2.getText().clear();
    }
    public void doPow(View v) {

        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    // a public method to perform subtraction
    public void doSub(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    // a public method to perform multiplication
    public void doMul(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }
    // a public method to perform Division
    public void doDiv(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }
    // a public method to perform modulus function
    public void doMod(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.num1);
        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.num2);
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

    @Override
    public boolean onSupportNavigateUp() {
        Object Navigation;
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        Object NavigationUI;
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
}