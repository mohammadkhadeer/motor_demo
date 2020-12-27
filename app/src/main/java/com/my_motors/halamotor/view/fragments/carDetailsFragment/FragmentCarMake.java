package com.my_motors.halamotor.view.fragments.carDetailsFragment;

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
import com.my_motors.halamotor.view.activity.CarDetails;
import com.my_motors.halamotor.view.adapters.adapterInCarDetails.AdapterCarMake;
import java.util.ArrayList;
import static com.my_motors.halamotor.functions.FillCarMakeArrayListsInCarDerails.fillCarMakeArrayL;

public class FragmentCarMake extends Fragment implements AdapterCarMake.PassCarMake {

    RecyclerView recyclerView;
    AdapterCarMake adapterCarMake;
    public ArrayList<CarMake> carDetailsArrayList  = new ArrayList<CarMake>();
    View view;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;

    public FragmentCarMake(){
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

    @Override
    public void onCarMakeClicked(CarMake carMake) {
            CarDetails carDetails = (CarDetails) getActivity();
            carDetails.getCarMakeObjFromFragmentCarMakeAndMoveToFragmentModel(carMake);
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

}