package com.my_motors.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.ItemAccAndJunk;
import com.my_motors.halamotor.model.ItemCCEMT;
import com.my_motors.halamotor.model.ItemPlates;
import com.my_motors.halamotor.model.ItemWheelsRim;
import com.my_motors.halamotor.presnter.FavouriteChange;
import com.my_motors.halamotor.view.activity.ReportActivity;
import com.my_motors.halamotor.view.activity.UserProfile;
import com.squareup.picasso.Picasso;

import static com.my_motors.halamotor.algorithms.ArrangingLists.checkFavouriteOrNot1;
import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.dataBase.InsertFunctions.insertItemsToFCS;
import static com.my_motors.halamotor.fireBaseDB.UpdateFireBase.setFavouriteCallSearchOnServer;
import static com.my_motors.halamotor.functions.Functions.convertCategoryToCategoryS;
import static com.my_motors.halamotor.functions.Functions.getPostTime;

public class FragmentUserInfo extends Fragment {

    public FragmentUserInfo(){}

    String itemIDStr,userNameStr,userImageStr,itemNameStr,timePostStr,postTypeStr
            ,dateStr,timStampStr,categoryStr,messageShare,cat,userID;
    View view;
    TextView userNameTV,userStatusTV,itemNameTV,dateTV;
    RelativeLayout userStatusRL,favouriteRL,profileInfoRL,reportRL,shareRL;
    ImageView userImageIV,favouriteIV,shareIV,reportIV;

    FavouriteChange favouriteChange;
    int numberOfChange =0;

    ItemCCEMT ccemt;
    ItemPlates carPlatesModel;
    ItemWheelsRim wheelsRimModel;
    ItemAccAndJunk accAndJunkObject;
    private static final int REPORT = 2000;
    Dialog myDialog;


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
            cat = getArguments().getString("cat");

            if (cat.equals("ccemt"))
                ccemt = getArguments().getParcelable("object");

            if (cat.equals("cp"))
                carPlatesModel = getArguments().getParcelable("object");

            if (cat.equals("wr"))
                wheelsRimModel = getArguments().getParcelable("object");

            if (cat.equals("aaj"))
                accAndJunkObject = getArguments().getParcelable("object");
        }
        super.onAttach(context);
        if (getActivity() instanceof FavouriteChange) {
            favouriteChange = (FavouriteChange) getActivity();
        }
        //favoriteChange = (FavoriteChange) activity;
        fillInfo();
        messageShare = "Text well share here";
    }

    private void fillInfo() {
        if (cat.equals("ccemt"))
        {
            userNameStr = ccemt.getUserName();
            userImageStr = ccemt.getUserImage();
            itemNameStr = ccemt.getItemName();
            timStampStr = ccemt.getTimeStamp();
            userID = ccemt.getUserIDPathInServer();
            postTypeStr = "empty";
            dateStr = String.valueOf(ccemt.getDayDate())+String.valueOf(ccemt.getMonthDate())+String.valueOf(ccemt.getYear()) ;
        }
        if (cat.equals("cp"))
        {
            userNameStr = carPlatesModel.getUserName();
            userImageStr = carPlatesModel.getUserImage();
            itemNameStr = carPlatesModel.getItemName();
            timStampStr = carPlatesModel.getTimeStamp();
            userID = carPlatesModel.getUserIDPathInServer();
            postTypeStr = "empty";
            dateStr = String.valueOf(carPlatesModel.getDayDate())+"/"+String.valueOf(carPlatesModel.getMonthDate())+"/"+String.valueOf(carPlatesModel.getYearDate()) ;
        }
        if (cat.equals("wr"))
        {
            userNameStr = wheelsRimModel.getUserName();
            userImageStr = wheelsRimModel.getUserImage();
            itemNameStr = wheelsRimModel.getItemName();
            timStampStr = wheelsRimModel.getTimeStamp();
            userID = wheelsRimModel.getUserIDPathInServer();
            postTypeStr = "empty";
            dateStr = String.valueOf(wheelsRimModel.getDayDate())+"/"+String.valueOf(wheelsRimModel.getMonthDate())+"/"+String.valueOf(wheelsRimModel.getYearDate()) ;
        }
        if (cat.equals("aaj"))
        {
            userNameStr = accAndJunkObject.getUserName();
            userImageStr = accAndJunkObject.getUserImage();
            itemNameStr = accAndJunkObject.getItemName();
            timStampStr = accAndJunkObject.getTimeStamp();
            userID = accAndJunkObject.getUserIDPathInServer();
            postTypeStr = "empty";
            dateStr = String.valueOf(accAndJunkObject.getDayDate())+"/"+String.valueOf(accAndJunkObject.getMonthDate())+"/"+String.valueOf(accAndJunkObject.getYearDate()) ;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        favouriteChange = null;
    }

    private void inti() {
        userImageIV = (ImageView) view.findViewById(R.id.fragment_u_i_a_m_image_IV);
        userNameTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_name_TV);
        itemNameTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_item_name_TV);
        dateTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_item_date_TV);
        userStatusRL = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_status);
        userStatusTV = (TextView) view.findViewById(R.id.fragment_u_i_a_m_user_status_TV);

        favouriteRL = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_favourite_RL);
        reportRL = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_report_RL);
        shareRL  = (RelativeLayout) view.findViewById(R.id.fragment_u_i_a_m_share_RL);
        profileInfoRL  = (RelativeLayout) view.findViewById(R.id.fragment_u_i_RL);

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
        actionListenerToShare();
        actionListenerToProfile();
        actionListenerToReport();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REPORT && resultCode == Activity.RESULT_OK) {
            showPopup(view);
        }
    }

    public void showPopup(View anchorView) {
        myDialog = new Dialog(getActivity());
        TextView txtclose;
        RelativeLayout closeRL;
        myDialog.setContentView(R.layout.popup_layout);
        txtclose =(TextView) myDialog.findViewById(R.id.popup_layout_tv);
        txtclose.setTypeface(Functions.changeFontBold(getActivity()));
        closeRL = (RelativeLayout) myDialog.findViewById(R.id.popup_layout_rl);
        closeRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    private void actionListenerToReport() {
        reportRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("userID", userID);
                bundle.putString("category", categoryStr);
                bundle.putString("itemID", itemIDStr);

                Intent intent = new Intent(getActivity(), ReportActivity.class);
                intent.putExtras(bundle);
                startActivityForResult(intent , REPORT);
                getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
            }
        });
    }

    private void actionListenerToProfile() {
        profileInfoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("userID", userID);
                bundle.putString("type", "person");

                Intent intent = new Intent(getActivity(), UserProfile.class);
                intent.putExtras(bundle);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
            }
        });
    }

    private void actionListenerToShare() {
        shareRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, messageShare);
                startActivity(Intent.createChooser(sharingIntent,"com.facebook.katana"));
            }
        });
    }

    private void actionListenerToFavouriteOrNot() {
        favouriteRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfChange = numberOfChange+1;
                favouriteChange.onFavouriteChange(numberOfChange);
                if (checkFavouriteOrNot1(getActivity(),itemIDStr).equals("not_favorite"))
                {
                    favouriteIV.setBackgroundResource(R.drawable.selcted_favorite);
                    insertItemInFCSTable();

                    setFavouriteCallSearchOnServer(getActivity(),itemIDStr
                            ,categoryStr,"favorite");
                }else
                {
                    favouriteIV.setBackgroundResource(R.drawable.item_favu);
                    getDataBaseInstance(getActivity()).deleteFCS(itemIDStr);
                }
            }
        });
    }

    private void insertItemInFCSTable() {
        insertItemsToFCS(itemIDStr,convertCategoryToCategoryS(categoryStr,getActivity()),getDataBaseInstance(getActivity()),"favorite",getActivity());
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
        // dateTV.setText(dateStr);
    }

    private void fillUserImage() {
        Picasso.get()
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