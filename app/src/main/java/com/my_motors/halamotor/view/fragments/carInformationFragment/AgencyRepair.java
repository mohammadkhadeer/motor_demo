package com.my_motors.halamotor.view.fragments.carInformationFragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;

public class AgencyRepair extends Fragment {

    View view;
    TextView textViewQ,textViewYes,textViewNo;
    RelativeLayout relativeLayoutNo,relativeLayoutYes;

    public AgencyRepair(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_agency_repair, container, false);

        inti();
        changeFont();
        actionListener();
        return view;
    }

    private void actionListener() {
        actionListenerToNo();
        actionListenerToYes();
    }

    private void actionListenerToYes() {
        relativeLayoutYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataBaseInstance(getActivity()).updateCarDetails(
                        "Agency repair", getActivity().getResources().getString(R.string.agency_repair_process)
                        , getActivity().getResources().getString(R.string.agency_repair_yes)
                        , getActivity().getResources().getString(R.string.agency_repair_yes_s)
                        , "true");

                Intent resultIntent = new Intent();
                getActivity().setResult(Activity.RESULT_OK, resultIntent);
                getActivity().finish();
            }
        });
    }

    private String getProcessTypeFromIntent() {
        String processType = null;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            processType =bundle.getString("editOrFill");
        }
        return processType;
    }

    private void actionListenerToNo() {
        relativeLayoutNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveInDB();
                Intent resultIntent = new Intent();
                getActivity().setResult(Activity.RESULT_OK, resultIntent);
                getActivity().finish();
            }
        });
    }

    private void saveInDB() {
        getDataBaseInstance(getActivity()).updateCarDetails(
                "Agency repair", getActivity().getResources().getString(R.string.agency_repair_process)
                , getActivity().getResources().getString(R.string.agency_repair_no)
                , getActivity().getResources().getString(R.string.agency_repair_no_s)
                , "true");
    }

    private void inti() {
        textViewQ = (TextView) view.findViewById(R.id.fragment_agency_repair_q_tv);
        textViewNo = (TextView) view.findViewById(R.id.fragment_agency_repair_no_tv);
        textViewYes = (TextView) view.findViewById(R.id.fragment_agency_repair_yes_tv);

        relativeLayoutNo = (RelativeLayout) view.findViewById(R.id.fragment_agency_repair_no_rl);
        relativeLayoutYes = (RelativeLayout) view.findViewById(R.id.fragment_agency_repair_yes_rl);
    }

    private void changeFont() {
        textViewQ.setTypeface(Functions.changeFontGeneral(getActivity()));
        textViewNo.setTypeface(Functions.changeFontGeneral(getActivity()));
        textViewYes.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    public void endDriverNationality(){
        Intent resultIntent = new Intent();
        getActivity().setResult(Activity.RESULT_OK, resultIntent);
        getActivity().finish();
    }
}