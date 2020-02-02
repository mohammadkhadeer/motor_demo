package com.cars.halamotor.view.addItem;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;

public class AddItem extends AppCompatActivity {

    RelativeLayout cancelRL;
    TextView insertAddTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        statusBarColor();
        inti();
        changeFontType();
        actionListener();

    }

    private void actionListener() {
        cancelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void changeFontType() {
        insertAddTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
    }

    private void inti() {
        cancelRL = (RelativeLayout) findViewById(R.id.add_activity_cancelRL);
        insertAddTV = (TextView) findViewById(R.id.add_activity_insert_titleTV);
    }

    private void statusBarColor() {
       getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

    }

}
