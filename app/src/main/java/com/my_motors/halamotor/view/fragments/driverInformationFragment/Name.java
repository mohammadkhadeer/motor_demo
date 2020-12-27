package com.my_motors.halamotor.view.fragments.driverInformationFragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.view.activity.CompleteInsuranceInfo;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.sharedPreferences.UserInfoSP.getUserNameFromSP;

public class Name extends Fragment {

    View view;
    TextView textViewQ,textViewNext,textViewHint;
    RelativeLayout relativeLayoutNext;
    String userName;
    EditText editText;
    public Name(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_name, container, false);

        inti();
        userName = getUserNameFromSP(getActivity());
        fillNameInEditText();
        changeFont();
        actionListener();
        return view;
    }

    private void fillNameInEditText() {
        if (userName != null || userName.equals(""))
        {
            textViewHint.setVisibility(View.GONE);
            editText.setText(userName);
        }
    }

    private void actionListener() {
        ationListenerToEdt();
        actionListenerToNext();
    }

    private void ationListenerToEdt() {
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() != 0)
                    makeCancelTitleIVVISIBLE();
                else
                    makeCancelTitleIVGONE();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

        });
    }

    private void makeCancelTitleIVGONE() {
        textViewHint.setVisibility(View.VISIBLE);
    }

    private void makeCancelTitleIVVISIBLE() {
        textViewHint.setVisibility(View.GONE);
    }

    private String getProcessTypeFromIntent() {
        String processType = null;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            processType =bundle.getString("editOrFill");
        }
        return processType;
    }

    private void actionListenerToNext() {
        relativeLayoutNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(),getActivity().getResources().getString(R.string.fill_name)
                            ,Toast.LENGTH_SHORT).show();
                }else{
                    saveInDB();
                    if (getProcessTypeFromIntent().equals("fill"))
                    {
                        CompleteInsuranceInfo completeInsuranceInfo = (CompleteInsuranceInfo) getActivity();
                        completeInsuranceInfo.nextFragment("Phone number");
                        completeInsuranceInfo.updateTitle("Phone number");
                    }else{
                        Intent resultIntent = new Intent();
                        getActivity().setResult(Activity.RESULT_OK, resultIntent);
                        getActivity().finish();
                    }
                }
            }
        });
    }

    private void saveInDB() {
        getDataBaseInstance(getActivity()).updateDriverInfo(
                "Name",getActivity().getResources().getString(R.string.name_process)
                ,editText.getText().toString()
                ,editText.getText().toString(),"true");
    }

    private void inti() {
        textViewQ = (TextView) view.findViewById(R.id.fragment_home_q_tv);
        textViewHint = (TextView) view.findViewById(R.id.fragment_home_edt_tv);
        textViewNext = (TextView) view.findViewById(R.id.fragment_home_next_tv);
        relativeLayoutNext = (RelativeLayout) view.findViewById(R.id.fragment_home_next_rl);
        editText = (EditText) view.findViewById(R.id.fragment_home_edt);

    }

    private void changeFont() {
        textViewQ.setTypeface(Functions.changeFontGeneral(getActivity()));
        textViewHint.setTypeface(Functions.changeFontGeneral(getActivity()));
        textViewNext.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    public void endDriverNationality(){
        Intent resultIntent = new Intent();
        getActivity().setResult(Activity.RESULT_OK, resultIntent);
        getActivity().finish();
    }
}