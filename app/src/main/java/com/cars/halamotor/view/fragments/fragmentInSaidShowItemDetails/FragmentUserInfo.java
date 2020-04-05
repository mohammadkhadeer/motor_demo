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
import com.squareup.picasso.Picasso;

import static com.cars.halamotor.functions.Functions.getPostTime;

public class FragmentUserInfo extends Fragment {

    public FragmentUserInfo(){}

    String itemIDStr,userNameStr,userImageStr,itemNameStr,timePostStr,postTypeStr,dateStr,timStampStr,categoryStr;
    View view;
    TextView userNameTV,userStatusTV,itemNameTV,dateTV;
    RelativeLayout userStatusRL,favouriteRL,reportRL;
    ImageView userImageIV,favouriteIV,shareIV,reportIV;
    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            categoryStr = getArguments().getString("category");
            itemIDStr = getArguments().getString("itemID");
            userNameStr = getArguments().getString("userName");
            userImageStr = getArguments().getString("userImage");
            itemNameStr = getArguments().getString("itemName");
            timePostStr = getArguments().getString("timePost");
            postTypeStr = getArguments().getString("postType");
            dateStr = getArguments().getString("date");
            timStampStr = getArguments().getString("timStamp");
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
        inti();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        changeFont();
        fillUserImage();
        fillText();
    }

    private void fillText() {
        userNameTV.setText(userNameStr);
        itemNameTV.setText(itemNameStr);
        userStatusTV.setText(getActivity().getResources().getString(R.string.online));
        dateTV.setText(getPostTime(timStampStr));
    }

    private void fillUserImage() {
        Picasso.with(getActivity())
                .load(userImageStr)
                .fit()
                .centerCrop()
                .into(userImageIV);
    }

    private void changeFont() {
        userNameTV.setTypeface(Functions.changeFontBold(getActivity()));
        userStatusTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        itemNameTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        dateTV.setTypeface(Functions.changeFontGeneral(getActivity()));
    }
}
