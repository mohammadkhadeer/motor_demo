package com.my_motors.halamotor.view.fragments.carInformationFragment;

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

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.CarMake;
import com.my_motors.halamotor.view.activity.CompleteInsuranceInfo;
import com.my_motors.halamotor.view.adapters.adapterInCarDetails.AdapterCarMake;

import java.util.ArrayList;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.dataBase.ReadFunction.getAllCarProcess;
import static com.my_motors.halamotor.functions.FillCarMakeArrayListsInCarDerails.fillCarMakeArrayL;

public class CarMakeFragment extends Fragment implements AdapterCarMake.PassCarMake {

    RecyclerView recyclerView;
    AdapterCarMake adapterCarMake;
    public ArrayList<CarMake> carDetailsArrayList  = new ArrayList<CarMake>();
    View view;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    String carModel;

    public CarMakeFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_make, container, false);
        inti();
        CreateRV();
        actionListenerToSearchEdt();
        actionListenerToRemoveTextInSearchEdt();
        changeFont();
        return view;
    }

    private void changeFont() {
        searchEdt.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_make_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_make_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_make_cancel_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_make_ImageV);
    }

    private void CreateRV() {
        carDetailsArrayList= fillCarMakeArrayL(carDetailsArrayList,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarMake = new AdapterCarMake(getActivity(), carDetailsArrayList,this);
        recyclerView.setAdapter(adapterCarMake);
    }

    //car make search comp down 4 methodes to handel search

    private void actionListenerToSearchEdt() {
        searchEdt.addTextChangedListener(new TextWatcher() {

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
                filter(editable.toString());
            }

        });
    }

    private void filter(String text) {
        ArrayList<CarMake> carDetailsArrayList2  = new ArrayList<CarMake>();
        for (CarMake carMake : carDetailsArrayList) {
            //if the existing elements contains the search input
            if (carMake.getMakeStr().toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                carDetailsArrayList2.add(carMake);
            }
        }
        //calling a method of the adapter class and passing the filtered list
        adapterCarMake.filterList(carDetailsArrayList2);
    }

    private void makeCancelTitleIVGONE() {
        cancelIV.setVisibility(View.GONE);
    }

    private void makeCancelTitleIVVISIBLE() {
        cancelIV.setVisibility(View.VISIBLE);
    }

    private void actionListenerToRemoveTextInSearchEdt() {
        cancelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchEdt.setText("");
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

    @Override
    public void onCarMakeClicked(CarMake carMake) {
        deleteCarModelIfSelected();
        saveInDataBase(carMake);
        if (getProcessTypeFromIntent().equals("fill"))
        {
            CompleteInsuranceInfo completeInsuranceInfo = (CompleteInsuranceInfo) getActivity();
            completeInsuranceInfo.nextFragmentCar("Car model");
            completeInsuranceInfo.updateTitleCar("Car model");
        }else{
            Intent resultIntent = new Intent();
            getActivity().setResult(Activity.RESULT_OK, resultIntent);
            getActivity().finish();
        }
    }

    private void deleteCarModelIfSelected() {
        carModel = getAllCarProcess(getActivity()).get(1).getProcessContent().getProcessContent();
        if (!carModel.equals(getActivity().getResources().getString(R.string.empty)))
        {
            getDataBaseInstance(getActivity()).updateCarDetails(
                    "Car model",getActivity().getResources().getString(R.string.car_model_process)
                    ,getActivity().getResources().getString(R.string.empty)
                    ,"empty","false");
        }
    }

    private void saveInDataBase(CarMake carMake) {
        getDataBaseInstance(getActivity()).updateCarDetails(
                "Car make",getActivity().getResources().getString(R.string.car_make_process)
                ,carMake.getMakeStr()
                ,carMake.getMakeStrS(),"true");
    }

    public void endDriverNationality(){
        Intent resultIntent = new Intent();
        getActivity().setResult(Activity.RESULT_OK, resultIntent);
        getActivity().finish();
    }
}