package com.cars.halamotor.view.activity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.License_Nationality;
import com.cars.halamotor.view.fragments.driverInformationFragment.BirthDay;
import com.cars.halamotor.view.fragments.driverInformationFragment.CertificateClaim;
import com.cars.halamotor.view.fragments.driverInformationFragment.DriverDuration;
import com.cars.halamotor.view.fragments.driverInformationFragment.DriverNationality;
import com.cars.halamotor.view.fragments.driverInformationFragment.Email;
import com.cars.halamotor.view.fragments.driverInformationFragment.InsurancePay;
import com.cars.halamotor.view.fragments.driverInformationFragment.LicenceNationality;
import com.cars.halamotor.view.fragments.driverInformationFragment.Name;
import com.cars.halamotor.view.fragments.driverInformationFragment.PhoneNumber;
import com.cars.halamotor.view.fragments.driverInformationFragment.RegisterDate;

import java.util.Locale;

import static com.cars.halamotor.functions.NewFunction.actionBarTitleInFCS;

public class EditDriverInfo extends AppCompatActivity {

    DriverNationality driverNationality = new DriverNationality();
    LicenceNationality licenceNationality = new LicenceNationality();
    DriverDuration driverDuration = new DriverDuration();
    RegisterDate registerDate = new RegisterDate();
    InsurancePay insurancePay = new InsurancePay();
    CertificateClaim certificateClaim = new CertificateClaim();
    Name name = new Name();
    PhoneNumber phoneNumber = new PhoneNumber();
    Email email = new Email();
    BirthDay birthDay = new BirthDay();

    String processType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_driver_info);

        statusBarColor();
        actionBarTitle();

        switch (getProcessTypeSFromIntent()) {
            case "Nationality":
                handelNationalityFragment();
                break;
            case "License Nationality":
                handelLicenseNationalityFragment();
                break;
            case "Drive duration":
                handelDriverDurationFragment();
                break;
            case "Register Date":
                handelRegisterDateFragment();
                break;
            case "Insurance pay":
                handelInsurancePayFragment();
                break;
            case "Certificate claims":
                handelCertificateClaimFragment();
                break;
            case "Name":
                handelNameFragment();
                break;
            case "Phone number":
                handelPhoneFragment();
                break;
            case "Email":
                handelEmailFragment();
                break;
            case "Birth day":
                handelBDFragment();
                break;
        }

    }

    private void handelLicenseNationalityFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, licenceNationality)
                .commit();
    }

    private void handelDriverDurationFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, driverDuration)
                .commit();
    }

    private void handelRegisterDateFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, registerDate)
                .commit();
    }

    private void handelInsurancePayFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, insurancePay)
                .commit();
    }

    private void handelCertificateClaimFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, certificateClaim)
                .commit();
    }

    private void handelNameFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, name)
                .commit();
    }

    private void handelPhoneFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, phoneNumber)
                .commit();
    }

    private void handelEmailFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, email)
                .commit();
    }

    private void handelBDFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, birthDay)
                .commit();
    }

    private void handelNationalityFragment() {
//        Bundle bundle = new Bundle();
//        bundle.putString("processTypeS",getProcessTypeFromIntent());
//        driverNationality.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_driver_info_fragments, driverNationality)
                .commit();
    }

    private String getProcessTypeSFromIntent() {
        Bundle bundle = getIntent().getExtras();
        processType =bundle.getString("processTypeS");
        return processType;
    }

    private String getProcessTypeFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String processType =bundle.getString("processType");
        return processType;
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
        textviewTitle.setText(getProcessTypeFromIntent());
        textviewTitle.setTypeface(typeface);
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);
        abar.setDisplayHomeAsUpEnabled(false);
        abar.setHomeButtonEnabled(false);
    }

    @Override
    public void onBackPressed() {
        switch (getProcessTypeSFromIntent()) {
            case "Nationality":
                driverNationality.endDriverNationality();
                break;
            case "License Nationality":
                licenceNationality.endDriverNationality();
                break;
            case "Drive duration":
                driverDuration.endDriverNationality();
                break;
            case "Register Date":
                registerDate.endDriverNationality();
                break;
            case "Insurance pay":
                insurancePay.endDriverNationality();
                break;
            case "Certificate claims":
                certificateClaim.endDriverNationality();
                break;
            case "Name":
                name.endDriverNationality();
                break;
            case "Phone number":
                phoneNumber.endDriverNationality();
                break;
            case "Email":
                email.endDriverNationality();
                break;
            case "Birth day":
                birthDay.endDriverNationality();
                break;
        }
    }
}