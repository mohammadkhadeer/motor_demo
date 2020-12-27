package com.my_motors.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.ReportDetails;
import com.my_motors.halamotor.model.ReportType;
import com.my_motors.halamotor.view.adapters.AdapterReportType;

import java.util.ArrayList;
import java.util.Locale;

import static com.my_motors.halamotor.fireBaseDB.InsertToFireBase.addReportToFireStore;
import static com.my_motors.halamotor.functions.Functions.fillFuelArrayL;
import static com.my_motors.halamotor.functions.Functions.getDATE;

public class ReportActivity extends AppCompatActivity implements AdapterReportType.PassReport{

    RecyclerView recyclerView;
    TextView textView;
    ProgressBar progressBar;
    AdapterReportType adapterReportType;
    public ArrayList<ReportType> reportTypesArrayL ;
    AdapterReportType.PassReport passReport;
    String userID,itemID,itemCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        //remove shadow under actionBar
        getSupportActionBar().setElevation(15);

        passReport = (AdapterReportType.PassReport) this;

        statusBarColor();
        actionBarTitle();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getInfoFromIntent();
        inti();
        createRV();
    }

    private void getInfoFromIntent() {
        Bundle bundle = getIntent().getExtras();
        userID =bundle.getString("userID");
        itemCategory =bundle.getString("category");
        itemID =bundle.getString("itemID");
    }

    private void createRV() {
        reportTypesArrayL = new ArrayList<>();
        reportTypesArrayL =fillFuelArrayL(this);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterReportType = new AdapterReportType(getApplicationContext(), reportTypesArrayL,passReport);
        recyclerView.setAdapter(adapterReportType);
    }

    private void inti() {
        progressBar = (ProgressBar) findViewById(R.id.report_activity_progress);
        textView = (TextView) findViewById(R.id.report_activity_tv);
        recyclerView = (RecyclerView) findViewById(R.id.report_activity_rv);
    }

    private void changeFont() {
        textView.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
    }

    private void statusBarColor() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

    private void actionBarTitle() {
        Typeface typeface;
        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_custom_title_view_centered, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        if (Locale.getDefault().getLanguage().equals("ar")) {
            typeface = Typeface.createFromAsset(getAssets(), "GE_DINAR_ONE_LIGHT.TTF");
        }else{
            typeface = Typeface.createFromAsset(getAssets(), "NTAILU.TTF");
        }
        TextView textviewTitle = (TextView) viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setTextColor(Color.parseColor("#FF0000"));
        textviewTitle.setText(getResources().getString(R.string.reports));
        textviewTitle.setTypeface(typeface);
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);
        abar.setDisplayHomeAsUpEnabled(false);
        abar.setHomeButtonEnabled(false);
    }

    @Override
    public void onReportClicked(ReportType reportType) {
        progressBar.setVisibility(View.VISIBLE);
        ReportDetails reportDetails = new ReportDetails(reportType.getReport()
        ,reportType.getReportS(),"NOTYET",userID,itemID,itemCategory,getDATE(),"0","0");
        addReportToFireStore(reportDetails,this);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "Done");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        }, 2000);
        Log.i("TAG",reportType.getReport());
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
