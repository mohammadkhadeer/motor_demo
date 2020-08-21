package com.cars.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
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
import com.cars.halamotor.view.fragments.insuranceFargment.CounterProcess;

import static com.cars.halamotor.functions.InsuranceFunctions.numberOfDriverProcessSelected;

public class CompleteInsuranceInfo extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
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
    CounterProcess counterProcess = new CounterProcess();

    Fragment allFragment[] = {driverNationality,licenceNationality,driverDuration,registerDate,insurancePay
    ,certificateClaim,name,phoneNumber,email,birthDay};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_insurance_info);

        inti();
        changeFont();
        fillIntiInfo();
        createCounterFragment();
        if (getCompleteOrIntiFromIntent().equals("inti"))
            handelNationalityFragment();
        else
            nextFragment(getNextFragmentFromIntent());
    }

    private void createCounterFragment() {
        int numberOfCompletedProcess = numberOfDriverProcessSelected(this);
        Bundle bundle = new Bundle();
        bundle.putString("ProcessNum",String.valueOf(numberOfCompletedProcess));
        bundle.putString("dOrc","driver");
        counterProcess.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_process_count,counterProcess )
                .commit();
    }

    private void changeFont() {
        textView.setTypeface(Functions.changeFontBold(this));
    }

    private void fillIntiInfo() {
        if (getPartTypeFromIntent().equals("1"))
        {
            textView.setText(R.string.driver_info);
            imageView.setBackgroundResource(R.drawable.driver);
        }else{
            textView.setText(R.string.car_info);
            imageView.setBackgroundResource(R.drawable.car);
        }
    }

    private void inti() {
        imageView = (ImageView) findViewById(R.id.complete_insurance_info_iv);
        textView = (TextView) findViewById(R.id.complete_insurance_info_tv);
    }

    private String getPartTypeFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String processType =bundle.getString("partType");
        return processType;
    }

    private String getNextFragmentFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String processType =bundle.getString("nextFragment");
        return processType;
    }

    private String getCompleteOrIntiFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String processType =bundle.getString("completeOrInti");
        return processType;
    }

    public void nextFragment(String fragmentNext){
        switch (fragmentNext) {
            case "Nationality":
                handelNationalityFragment();
                break;
            case "License Nationality":
                handelLicenseNationalityFragment();
//                counterProcess.updateInfoCounte(1);
                break;
            case "Drive duration":
                handelDriverDurationFragment();
//                counterProcess.updateInfoCounte(2);
                break;
            case "Register Date":
                handelRegisterDateFragment();
//                counterProcess.updateInfoCounte(3);
                break;
            case "Insurance pay":
                handelInsurancePayFragment();
//                counterProcess.updateInfoCounte(4);
                break;
            case "Certificate claims":
                handelCertificateClaimFragment();
//                counterProcess.updateInfoCounte(5);
                break;
            case "Name":
                handelNameFragment();
//                counterProcess.updateInfoCounte(6);
                break;
            case "Phone number":
                handelPhoneFragment();
//                counterProcess.updateInfoCounte(7);
                break;
            case "Email":
                handelEmailFragment();
//                counterProcess.updateInfoCounte(8);
                break;
            case "Birth day":
                handelBDFragment();
//                counterProcess.updateInfoCounte(9);
                break;
        }
    }

    public void updateTitle(String newTitle){
        switch (newTitle) {
            case "License Nationality":
                counterProcess.updateInfoCounte(1);
                break;
            case "Drive duration":
                counterProcess.updateInfoCounte(2);
                break;
            case "Register Date":
                counterProcess.updateInfoCounte(3);
                break;
            case "Insurance pay":
                counterProcess.updateInfoCounte(4);
                break;
            case "Certificate claims":
                counterProcess.updateInfoCounte(5);
                break;
            case "Name":
                counterProcess.updateInfoCounte(6);
                break;
            case "Phone number":
                counterProcess.updateInfoCounte(7);
                break;
            case "Email":
                counterProcess.updateInfoCounte(8);
                break;
            case "Birth day":
                counterProcess.updateInfoCounte(9);
                break;
        }
    }

    private void handelLicenseNationalityFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        licenceNationality.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, licenceNationality)
                .commit();
    }

    private void handelDriverDurationFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        driverDuration.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, driverDuration)
                .commit();
    }

    private void handelRegisterDateFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        registerDate.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, registerDate)
                .commit();
    }

    private void handelInsurancePayFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        insurancePay.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, insurancePay)
                .commit();
    }

    private void handelCertificateClaimFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        certificateClaim.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, certificateClaim)
                .commit();
    }

    private void handelNameFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        name.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, name)
                .commit();
    }

    private void handelPhoneFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        phoneNumber.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, phoneNumber)
                .commit();
    }

    private void handelEmailFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        email.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, email)
                .commit();
    }

    private void handelBDFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        birthDay.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, birthDay)
                .commit();
    }

    private void handelNationalityFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("editOrFill","fill");
        driverNationality.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_all_driver_info_fragments, driverNationality)
                .commit();
    }

    @Override
    public void onBackPressed() {
        Intent resultIntent = new Intent();
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }
}