package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;

public class FragmentUserInfo extends Fragment {

    public FragmentUserInfo(){}

    String test;
    View view;
    TextView userNameTV,userStatusTV,itemNameTV,dateTV;
    RelativeLayout userStatusRL,favouriteRL,reportRL;
    ImageView userImageIV,favouriteIV,shareIV,reportIV;
    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            test = getArguments().getString("category");
        }
        super.onAttach(context);
    }

    private void inti() {
        userImageIV = (ImageView) view.findViewById(R.id.fragment_u_i_a_m_image_IV);
        userNameTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_name_TV);
        itemNameTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_item_name_TV);
        dateTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_item_date_TV);
        userStatusRL = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_status);
        userStatusTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_status_TV);

        favouriteRL = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_favourite_RL);
        reportRL = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_share_RL);

        favouriteIV = (ImageView) view.findViewById(R.id.fragment_u_i_a_m_favourite_IV);
        shareIV = (ImageView) view.findViewById(R.id.fragment_u_i_a_m_share_IV);
        reportIV = (ImageView) view.findViewById(R.id.fragment_u_i_a_m_report_IV);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_user_info, container, false);
        Log.i("TAG","User info");
        Log.i("TAG",test);
        inti();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        changeFont();
    }

    private void changeFont() {
        userNameTV.setTypeface(Functions.changeFontBold(getActivity()));
        userStatusTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        itemNameTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        dateTV.setTypeface(Functions.changeFontGeneral(getActivity()));
    }
}
