package com.my_motors.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.permission.CheckPermission;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.dataBase.InsertFunctions.insertItemsToFCS;
import static com.my_motors.halamotor.fireBaseDB.UpdateFireBase.setFavouriteCallSearchOnServer;
import static com.my_motors.halamotor.functions.Functions.convertCategoryToCategoryS;
import static com.my_motors.halamotor.functions.Functions.openWhatsApp;
import static com.my_motors.halamotor.functions.NewFunction.callAds;

public class FragmentContact extends Fragment {

    public FragmentContact() {
    }

    View view;
    RelativeLayout sendMessage, call;
    String phoneNumber,itemID,category;
    private static final int PHONE = 102;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            phoneNumber = getArguments().getString("phoneN");
            itemID = getArguments().getString("itemID");
            category = getArguments().getString("category");

        }
        super.onAttach(context);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        inti();
        actionListener();
        return view;
    }

    private void actionListener() {
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAdsHere();
            }
        });
        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertItemsToFCS(itemID,convertCategoryToCategoryS(category,getActivity()),getDataBaseInstance(getActivity()),"message",getActivity());
                setFavouriteCallSearchOnServer(getActivity(),itemID,category,"message");
                openWhatsApp(phoneNumber,getActivity());
            }
        });
    }

    @SuppressLint("MissingPermission")
    private void callAdsHere() {
        if (CheckPermission.checkPermissionMethodToPhone(getActivity()) == true) {
            insertItemsToFCS(itemID,convertCategoryToCategoryS(category,getActivity()),getDataBaseInstance(getActivity()),"call",getActivity());
            setFavouriteCallSearchOnServer(getActivity(),itemID,category,"call");
            callAds(getActivity(),phoneNumber);
        }else{
            //Toast.makeText(getActivity(),getActivity().getResources().getString(R.string.we_cant),Toast.LENGTH_SHORT).show();
        }
    }

    private void inti() {
        sendMessage = (RelativeLayout) view.findViewById(R.id.contact_send_message);
        call = (RelativeLayout) view.findViewById(R.id.contact_call);
    }

}
