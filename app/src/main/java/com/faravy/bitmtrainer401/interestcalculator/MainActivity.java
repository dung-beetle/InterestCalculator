package com.faravy.bitmtrainer401.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText principalAmountEditText;
    EditText interestRateEditText;
    EditText timePeriodEditText;

    TextView interestAmountTv;
    TextView totalAmountTv;
    InterestCalculator interestCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principalAmountEditText=(EditText)findViewById(R.id.principalAmount);
        interestRateEditText=(EditText)findViewById(R.id.interestRate);
        timePeriodEditText=(EditText)findViewById(R.id.timePeriod);

        interestAmountTv=(TextView) findViewById(R.id.interestAmount);
        totalAmountTv=(TextView)findViewById(R.id.totalAmount);
        interestCalculator=new InterestCalculator();

    }

    public  void calculate(View view){


        interestCalculator.principalAmount=Double.parseDouble(principalAmountEditText.getText().toString());
        interestCalculator.timePeriod=Float.parseFloat(timePeriodEditText.getText().toString());
        interestCalculator.interestRate=Float.parseFloat(interestRateEditText.getText().toString());

        double interestAmount=interestCalculator.calculateInterest();

        interestAmountTv.setText(String.valueOf(interestAmount));

        double totalAmount=interestCalculator.principalAmount+interestAmount;

        totalAmountTv.setText(String.valueOf(totalAmount));



    }
}
