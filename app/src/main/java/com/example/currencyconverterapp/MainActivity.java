package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickEvent(View view){
        EditText editText = (EditText)findViewById(R.id.amountField);

        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Field is empty! please enter a value.", Toast.LENGTH_SHORT).show();
        }else {

            try{
                Double amountInPounds = Double.parseDouble(editText.getText().toString().trim());
                Double amountInDollars = amountInPounds * 1.3;

                Toast.makeText(this, String.format("%s is now %.2f", amountInPounds, amountInDollars), Toast.LENGTH_SHORT).show();
            }catch(Exception e){
                Toast.makeText(this, "Invalid input. Please enter a number!", Toast.LENGTH_SHORT).show();
            }

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
