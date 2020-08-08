package com.cars.halamotor.view.fragments.insuranceFargment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.dataBase.DBHelper;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.view.activity.Insurance;
import com.cars.halamotor.view.adapters.adapterInsurance.AdapterDriverProcess;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterSuggestedItem;

import java.util.ArrayList;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.ReadFunction.checkIfDriverProcessCreated;
import static com.cars.halamotor.dataBase.ReadFunction.getAllDriverProcess;
import static com.cars.halamotor.functions.InsuranceFunctions.createDriverInfoTable;
import static com.cars.halamotor.functions.InsuranceFunctions.numberOfDriverProcessSelected;

public class DriverInformation extends Fragment implements AdapterDriverProcess.PassProcess {

    public DriverInformation(){}
    View view;
    TextView textViewCompleteDriverInfo;
    RecyclerView recyclerView;
    LinearLayout linearLayout,linearLayoutRestAllProcess;
    AdapterDriverProcess adapterDriverProcess;
    ArrayList<com.cars.halamotor.model.DriverInformation> driverAllProcessArrayL = new ArrayList<com.cars.halamotor.model.DriverInformation>();
    int numberOfCompletedProcess;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        numberOfCompletedProcess = numberOfDriverProcessSelected(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_driver_info, container, false);

        init();
        creteDriverInfoProcessIfNotHaveIt();
        changeFont();
        actionListenerToRL();
        createProcessRV();
        checkIfNoProcessSelectedMakeRestAllGone();
        return view;
    }

    private void checkIfNoProcessSelectedMakeRestAllGone() {
        if (numberOfCompletedProcess ==0)
        {
            linearLayoutRestAllProcess.setVisibility(View.GONE);
        }else{
            linearLayoutRestAllProcess.setVisibility(View.VISIBLE);
        }
    }

    RecyclerView.LayoutManager layoutManager;
    private void createProcessRV() {
        driverAllProcessArrayL = getAllDriverProcess(getActivity());

        layoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);
        adapterDriverProcess =new AdapterDriverProcess(getActivity()
                ,driverAllProcessArrayL,numberOfCompletedProcess,this);
        recyclerView.setAdapter(adapterDriverProcess);
    }

    private void actionListenerToRL() {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCompleteInsuranceDetails();
            }
        });
    }

    private void moveToCompleteInsuranceDetails() {
        Intent intent = new Intent(getActivity(), Insurance.class);
        startActivity(intent);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void changeFont() {
        textViewCompleteDriverInfo.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void init() {
        textViewCompleteDriverInfo = (TextView) view.findViewById(R.id.driver_info_complete_info_tv);
        linearLayout = (LinearLayout) view.findViewById(R.id.driver_info_complete_info_ll);
        recyclerView = (RecyclerView) view.findViewById(R.id.driver_info_complete_info_rv);
        linearLayoutRestAllProcess = (LinearLayout) view.findViewById(R.id.driver_info_complete_rest_all_ll);
    }

    private void creteDriverInfoProcessIfNotHaveIt() {
        //1.nationality 2.licence nationality 3.from when ur drive in uae ?
        //4.when you want to register your car ?
        //5.Did you pay your uae car insurance last 12 months
        //6.Did you have "no claims certificate" from your insurance company
        //7. full name 8. phone number 9. email 10 birthDay
        createDriverInfoTable(getActivity());
    }

    @Override
    public void onProcessClicked(com.cars.halamotor.model.DriverInformation driverInformation) {

    }
}
