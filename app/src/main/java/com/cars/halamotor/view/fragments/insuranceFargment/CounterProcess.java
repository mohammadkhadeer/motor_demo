package com.cars.halamotor.view.fragments.insuranceFargment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.functions.InsuranceFunctions.numberOfDriverProcessSelected;
import static com.cars.halamotor.functions.InsuranceFunctions.processName;

public class CounterProcess extends Fragment {

    public CounterProcess(){}
    View view;
    TextView textViewProcessName,textView1,textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_counter_process, container, false);

        init();
        changeFont();
        checkDriverOrCar();
        checkIntiOrComplete();

        return view;
    }

    public void updateInfoCounte(int numberOfCompletedProcess) {
        int y = numberOfCompletedProcess+1;
        textView1.setText(String.valueOf(y));
        textViewProcessName.setText(processName(numberOfCompletedProcess,getActivity()));
    }

    private void checkIntiOrComplete() {
        int x = Integer.parseInt(getNumberOrProcessFromIntent())+1;
        textView1.setText(String.valueOf(x));
        textViewProcessName.setText(processName(Integer.parseInt(getNumberOrProcessFromIntent()),getActivity()));
    }

    private void checkDriverOrCar() {
        if (getDriverOrCarFromIntent().equals("driver"))
        {
            textView2.setText(getResources().getString(R.string.coute10));
        }else{
            textView2.setText(getResources().getString(R.string.coute11));
        }
    }

    private String getNumberOrProcessFromIntent() {
        String processType = null;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            processType =bundle.getString("ProcessNum");
        }
        return processType;
    }

    private String getDriverOrCarFromIntent() {
        String processType = null;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            processType =bundle.getString("dOrc");
        }
        return processType;
    }

    private void init() {
        textViewProcessName = (TextView) view.findViewById(R.id.fragment_counter_process_name_tv);
        textView1 = (TextView) view.findViewById(R.id.fragment_counter_process_1_tv);
        textView2 = (TextView) view.findViewById(R.id.fragment_counter_process_2_tv);
    }

    private void changeFont() {
        textViewProcessName.setTypeface(Functions.changeFontGeneral(getActivity()));
        textView1.setTypeface(Functions.changeFontGeneral(getActivity()));
        textView2.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

}
