package com.cars.halamotor.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cars.halamotor.R;
import com.cars.halamotor.view.adapters.SelectedImageAdapter;

import java.util.ArrayList;

public class SelectCategory extends AppCompatActivity {

    RecyclerView viewSelectedImageRV;
    SelectedImageAdapter selectedImageAdapter;
    ArrayList<String> imagePathArrL = new ArrayList<String>();
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);


    }
}
