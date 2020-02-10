package com.cars.halamotor.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cars.halamotor.R;

public class Insurance extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);

        textView = (TextView) findViewById(R.id.MessageTV);
        editText = (EditText) findViewById(R.id.interNumberTV);
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =editText.getText().toString();
                if (number.isEmpty())
                {
                    textView.setText("Please fill a number");
                }else{
                    int numberInt = Integer.parseInt(number);
                    testCases(numberInt);
                }

            }
        });
        
    }

    private void testCases(int number) {
        if (number > 100 || number < 0)
        {
            textView.setText("Please number must be between 100 and 0");
        }else{
            if (number % 3 == 0)
            {
                if (number % 5 == 0)
                {
                    textView.setText("Foo Boo");
                }else{
                    textView.setText("Foo");
                }
            }else{
                if (number % 5 == 0)
                {
                    textView.setText("Boo");
                }else{
                    textView.setText(String.valueOf(number));
                }
            }
        }
    }
}
