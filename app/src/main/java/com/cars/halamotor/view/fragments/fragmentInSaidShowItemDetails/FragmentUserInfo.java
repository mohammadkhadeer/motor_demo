package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesFirstCase;
import com.cars.halamotor.model.WheelsRimFirstCase;
import com.cars.halamotor.presnter.FavouriteChange;
import com.cars.halamotor.presnter.WhenUserSetItemFavoriteFromShowItemDetails;
import com.cars.halamotor.view.activity.ShowItemDetails;
import com.squareup.picasso.Picasso;

import static com.cars.halamotor.algorithms.ArrangingLists.checkFavouriteOrNot1;
import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertAccAndJunkInFCSTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertCCEMTItemInFCSTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertCarPlatesInFCSTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertSuggestedItemInFCSTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertWheelsRimInFCSTable;
import static com.cars.halamotor.functions.Functions.getPostTime;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getAccAndJunkFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCCEMTFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCarPlatesFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getWheelsRimFirstCaseFromDB;

public class FragmentUserInfo extends Fragment {

    public FragmentUserInfo(){}

    String itemIDStr,userNameStr,userImageStr,itemNameStr,timePostStr,postTypeStr,dateStr,timStampStr,categoryStr;
    View view;
    TextView userNameTV,userStatusTV,itemNameTV,dateTV;
    RelativeLayout userStatusRL,favouriteRL,reportRL;
    ImageView userImageIV,favouriteIV,shareIV,reportIV;
    CCEMTFirestCase ccemtFirestCase;
    CarPlatesFirstCase carPlatesFirstCase;
    WheelsRimFirstCase wheelsRimFirstCase;
    AccAndJunkFirstCase accAndJunkFirstCase;
    WhenUserSetItemFavoriteFromShowItemDetails favoriteIsChange;
    FavouriteChange favouriteChange;
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
        if (getActivity() instanceof FavouriteChange) {
            favouriteChange = (FavouriteChange) getActivity();
        }
        //favoriteChange = (FavoriteChange) activity;
        detectObject();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        favoriteIsChange = null;
    }

    private void detectObject() {
        if (categoryStr.equals("Car for sale")
                ||categoryStr.equals("Car for rent")
                ||categoryStr.equals("Exchange car")
                ||categoryStr.equals("Motorcycle")
                ||categoryStr.equals("Trucks")
        ) {
            ccemtFirestCase =getCCEMTFirstCaseFromDB(itemIDStr,getActivity());
        }
        if (categoryStr.equals("Car plates"))
        {
            carPlatesFirstCase =getCarPlatesFirstCaseFromDB(itemIDStr,getActivity());
        }
        if (categoryStr.equals("Wheels rim"))
        {
            wheelsRimFirstCase =getWheelsRimFirstCaseFromDB(itemIDStr,getActivity());
        }
        if (categoryStr.equals("Accessories") || categoryStr.equals("Junk car"))
        {
            accAndJunkFirstCase =getAccAndJunkFirstCaseFromDB(itemIDStr,getActivity());
        }
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
        checkIfFavouriteOrNot();
        actionListenerToFavouriteOrNot();
    }

    private void actionListenerToFavouriteOrNot() {
        favouriteRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favouriteChange.onFavouriteChange(true);
//                test(true);
                if (checkFavouriteOrNot1(getActivity(),itemIDStr).equals("not_favorite"))
                {
                    favouriteIV.setBackgroundResource(R.drawable.selcted_favorite);
                    insertItemInFCSTable();
                }else
                {
                    favouriteIV.setBackgroundResource(R.drawable.item_favu);
                    getDataBaseInstance(getActivity()).deleteFCS(itemIDStr);
                }
            }
        });
    }

    private void insertItemInFCSTable() {
        if (categoryStr.equals("Car for sale")
                ||categoryStr.equals("Car for rent")
                ||categoryStr.equals("Exchange car")
                ||categoryStr.equals("Motorcycle")
                ||categoryStr.equals("Trucks")
        ) {
            insertCCEMTItemInFCSTable(ccemtFirestCase,getDataBaseInstance(getActivity()),"favorite");
        }
        if (categoryStr.equals("Car plates"))
        {
            insertCarPlatesInFCSTable(carPlatesFirstCase,getDataBaseInstance(getActivity()),"favorite");
        }
        if (categoryStr.equals("Wheels rim"))
        {
            insertWheelsRimInFCSTable(wheelsRimFirstCase,getDataBaseInstance(getActivity()),"favorite");
        }
        if (categoryStr.equals("Accessories") || categoryStr.equals("Junk car"))
        {
            insertAccAndJunkInFCSTable(accAndJunkFirstCase,getDataBaseInstance(getActivity()),"favorite");
        }
    }

    private void checkIfFavouriteOrNot() {
        if (checkFavouriteOrNot1(getActivity(),itemIDStr).equals("not_favorite"))
        {
            favouriteIV.setBackgroundResource(R.drawable.item_favu);
        }else
        {
            favouriteIV.setBackgroundResource(R.drawable.selcted_favorite);
        }
    }

    private void fillText() {
        userNameTV.setText(userNameStr);
        itemNameTV.setText(itemNameStr);
        userStatusTV.setText(getActivity().getResources().getString(R.string.online));
        dateTV.setText(getPostTime(dateStr,timStampStr,getActivity()));
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
