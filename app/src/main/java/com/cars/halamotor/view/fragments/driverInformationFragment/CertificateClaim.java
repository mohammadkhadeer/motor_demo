package com.cars.halamotor.view.fragments.driverInformationFragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CertificateClaims;
import com.cars.halamotor.model.LicenseDuration;
import com.cars.halamotor.view.activity.CompleteInsuranceInfo;
import com.cars.halamotor.view.adapters.adapterDriverInfo.AdapterCertificateClaims;
import com.cars.halamotor.view.adapters.adapterDriverInfo.AdapterDriverDuration;

import java.util.ArrayList;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.functions.InsuranceFunctions.fillCertificateClaimsArrayL;
import static com.cars.halamotor.functions.InsuranceFunctions.fillLicenseDurationArrayL;

public class CertificateClaim extends Fragment implements AdapterCertificateClaims.PassCertificateClaims {

    public ArrayList<CertificateClaims> certificateClaimsArrayL  = new ArrayList<CertificateClaims>();
    RecyclerView recyclerView;
    AdapterCertificateClaims adapterCertificateClaims;
    View view;
    TextView textViewQ;

    public CertificateClaim(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_certificate_claim, container, false);

        inti();
        createRV();
        changeFont();

        return view;
    }

    private void createRV() {
        certificateClaimsArrayL =fillCertificateClaimsArrayL(getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCertificateClaims = new AdapterCertificateClaims(getActivity(), certificateClaimsArrayL,this);
        recyclerView.setAdapter(adapterCertificateClaims);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_certificate_claim_RV);
        textViewQ = (TextView) view.findViewById(R.id.fragment_certificate_claim_q_tv);
    }

    private void changeFont() {
        textViewQ.setTypeface(Functions.changeFontGeneral(getActivity()));
    }


    public void endDriverNationality(){
        Intent resultIntent = new Intent();
        getActivity().setResult(Activity.RESULT_OK, resultIntent);
        getActivity().finish();
    }

    private String getProcessTypeFromIntent() {
        String processType = null;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            processType =bundle.getString("editOrFill");
        }
        return processType;
    }

    @Override
    public void onLicenseCertificateClaimsClicked(CertificateClaims certificateClaims) {
        saveInDB(certificateClaims);

        if (getProcessTypeFromIntent().equals("fill"))
        {
            CompleteInsuranceInfo completeInsuranceInfo = (CompleteInsuranceInfo) getActivity();
            completeInsuranceInfo.nextFragment("Name");
            completeInsuranceInfo.updateTitle("Name");
        }else{
            Intent resultIntent = new Intent();
            getActivity().setResult(Activity.RESULT_OK, resultIntent);
            getActivity().finish();
        }
    }

    private void saveInDB(CertificateClaims certificateClaims) {
        getDataBaseInstance(getActivity()).updateDriverInfo(
                "Certificate claims",getActivity().getResources().getString(R.string.certificate_claims_process)
                ,certificateClaims.getClaims()
                ,certificateClaims.getClaimsS(),"true");
    }
}