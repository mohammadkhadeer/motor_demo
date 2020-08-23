package com.cars.halamotor.view.fragments.insuranceFargment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;

import static com.cars.halamotor.functions.InsuranceFunctions.numberOfCarProcessSelected;
import static com.cars.halamotor.functions.InsuranceFunctions.numberOfDriverProcessSelected;
import static com.cars.halamotor.functions.InsuranceFunctions.processCarName;
import static com.cars.halamotor.functions.InsuranceFunctions.processName;

public class InsuranceResult extends Fragment {

    public InsuranceResult(){}
    View view;
    TextView textViewProcessName,textView1,textView2;
    RelativeLayout relativeLayout;
    int numberOfDriverCompletedProcess,numberOfCarCompletedProcess;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_insurance_result, container, false);

        init();
        changeFont();
        checkAllReqFill();

        return view;
    }

    public void checkAllReqFill(){
        numberOfDriverCompletedProcess = numberOfDriverProcessSelected(getActivity());
        numberOfCarCompletedProcess = numberOfCarProcessSelected(getActivity());
        if (numberOfDriverCompletedProcess ==10 && numberOfCarCompletedProcess==10)
        {
            updateResult();
        }else{
            hideResult();
        }

    }

    public void updateResult() {
//        Toast.makeText(getActivity(),"Im here",Toast.LENGTH_SHORT).show();
        relativeLayout.setVisibility(View.VISIBLE);
        String num = textView1.getText().toString();
        int num1 = Integer.parseInt(num)+1;
        textView1.setText(String.valueOf(num1));
    }

    public void hideResult() {
        relativeLayout.setVisibility(View.GONE);
    }

    private void init() {
        textViewProcessName = (TextView) view.findViewById(R.id.fragment_counter_process_name_tv);
        textView1 = (TextView) view.findViewById(R.id.fragment_counter_process_1_tv);
        textView2 = (TextView) view.findViewById(R.id.fragment_counter_process_2_tv);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_insurance_result_rl);
    }

    private void changeFont() {
        textViewProcessName.setTypeface(Functions.changeFontGeneral(getActivity()));
        textView1.setTypeface(Functions.changeFontGeneral(getActivity()));
        textView2.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

}
