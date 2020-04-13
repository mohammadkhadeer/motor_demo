package com.cars.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.cars.halamotor.R;
import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesFirstCase;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.WheelsRimFirstCase;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.presnter.FavouriteChange;
import com.cars.halamotor.presnter.ItemModel;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentComments;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentFollowUser;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentIDescriptionAndGeneralTips;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentImageSlider;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentItemSelectedDetails;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentShare;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentSimilarItems;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentUserInfo;

import static com.cars.halamotor.fireBaseDB.GetFromFireBaseDB.getAccAndJunkObject;
import static com.cars.halamotor.fireBaseDB.GetFromFireBaseDB.getCCEMTObject;
import static com.cars.halamotor.fireBaseDB.GetFromFireBaseDB.getCarPlatesObject;
import static com.cars.halamotor.fireBaseDB.GetFromFireBaseDB.getWheelsSizeObject;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getAccAndJunkFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCCEMTFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCarPlatesFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getWheelsRimFirstCaseFromDB;

public class ShowItemDetails extends AppCompatActivity
         implements FavouriteChange , ItemModel {

    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;
    AppBarLayout appbar;
    FragmentUserInfo fragmentUserInfoAndMainButton = new FragmentUserInfo();
    FragmentItemSelectedDetails fragmentItemSelectedDetails = new FragmentItemSelectedDetails();
    FragmentIDescriptionAndGeneralTips fragmentIDescriptionAndGeneralTips = new FragmentIDescriptionAndGeneralTips();
    FragmentShare fragmentShare = new FragmentShare();
    FragmentSimilarItems fragmentSuggestedAntherItems = new FragmentSimilarItems();
    FragmentComments fragmentComments = new FragmentComments();
    FragmentFollowUser fragmentFollowUser = new FragmentFollowUser();
    FragmentImageSlider fragmentImageSlider = new FragmentImageSlider();

    String category;

    CCEMTFirestCase ccemtFirestCase;
    CarPlatesFirstCase carPlatesFirstCase;
    WheelsRimFirstCase wheelsRimFirstCase;
    AccAndJunkFirstCase accAndJunkFirstCase;

    CCEMT ccemtObject;
    CarPlatesModel carPlatesModel;
    WheelsRimModel wheelsRimModel;
    AccAndJunk accAndJunkObject;

    String itemIDStr,userNameStr,userImageStr,itemNameStr,timePostStr,postTypeStr
            ,dateStr,timStampStr,itemDescription,userID,itemImage,numberOfImage,whereCome
            ,categoryStr,cat;

    int numberOfChangeFromInterface;

    ItemModel itemModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item_details);

        makeKeyBordDownEditText();
        //statusBarTransparent();
        itemModel = (ItemModel) this;
        inti();
        getItemIDFromIntent();

        intiObject();

        titleActionBar();

        intiItemDescriptionAndGeneralTips();
        intiShareFragment();
        intiFollowUser();
        intiSuggestedFragment();
        //intiCommentsFragment();

    }

    private void makeKeyBordDownEditText() {
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
    }

    private void intiObject() {
        category =categoryStr;

        if (category.equals("Car for sale")
                ||category.equals("Car for rent")
                ||category.equals("Exchange car")
                ||category.equals("Motorcycle")
                ||category.equals("Trucks")
        ) {
//            ccemtFirestCase =getCCEMTFirstCaseFromDB(itemIDStr,this);
//            intiUserInfoComp(ccemtFirestCase.getItemIdInServer(),ccemtFirestCase.getItemUserName()
//            ,ccemtFirestCase.getItemUserImage(),ccemtFirestCase.getItemName()
//            ,ccemtFirestCase.getItemTimePost(),ccemtFirestCase.getBoostType()
//            ,ccemtFirestCase.getDate(),ccemtFirestCase.getTimeStamp()
//            ,ccemtFirestCase.getItemDescription(),ccemtFirestCase.getUserID());
            cat = "ccemt";
            getCCEMTObject(categoryStr,itemIDStr,itemModel);
        }
        if (category.equals("Car plates"))
        {
//            carPlatesFirstCase =getCarPlatesFirstCaseFromDB(itemIDStr,this);
//            intiUserInfoComp(carPlatesFirstCase.getItemIdInServer(),carPlatesFirstCase.getItemUserName()
//                    ,carPlatesFirstCase.getItemUserImage(),carPlatesFirstCase.getItemName()
//                    ,carPlatesFirstCase.getItemTimePost(),carPlatesFirstCase.getBoostType()
//                    ,carPlatesFirstCase.getDate(),carPlatesFirstCase.getTimeStamp()
//                    ,carPlatesFirstCase.getItemDescription(),carPlatesFirstCase.getUserID());
            cat = "cp";
            getCarPlatesObject(categoryStr,itemIDStr,itemModel);
        }
        if (category.equals("Wheels rim"))
        {
//            wheelsRimFirstCase =getWheelsRimFirstCaseFromDB(itemIDStr,this);
//            intiUserInfoComp(wheelsRimFirstCase.getItemIdInServer(),wheelsRimFirstCase.getItemUserName()
//                    ,wheelsRimFirstCase.getItemUserImage(),wheelsRimFirstCase.getItemName()
//                    ,wheelsRimFirstCase.getItemTimePost(),wheelsRimFirstCase.getBoostType()
//                    ,wheelsRimFirstCase.getData(),wheelsRimFirstCase.getTimeStamp()
//                    ,wheelsRimFirstCase.getItemDescription(),wheelsRimFirstCase.getUserID());
            cat = "wr";
            getWheelsSizeObject(categoryStr,itemIDStr,itemModel);
        }
        if (category.equals("Accessories") || category.equals("Junk car"))
        {
//            accAndJunkFirstCase =getAccAndJunkFirstCaseFromDB(itemIDStr,this);
//            intiUserInfoComp(accAndJunkFirstCase.getItemIdInServer(),accAndJunkFirstCase.getItemUserName()
//                    ,accAndJunkFirstCase.getItemUserImage(),accAndJunkFirstCase.getItemName()
//                    ,accAndJunkFirstCase.getItemTimePost(),accAndJunkFirstCase.getBoostType()
//                    ,accAndJunkFirstCase.getData(),accAndJunkFirstCase.getTimeStamp()
//                    ,accAndJunkFirstCase.getItemDescription(),accAndJunkFirstCase.getUserID());
            cat = "aaj";
            getAccAndJunkObject(categoryStr,itemIDStr,itemModel);
        }
    }

    private void intiUserInfoComp(String itemIdInServer, String itemUserName, String itemUserImage
            , String itemName, String itemTimePost, String boostType
            ,String date,String timeStamp,String itemDescriptionStr,String userIDStr) {
        itemIDStr = itemIdInServer;
        userNameStr = itemUserName;
        userImageStr = itemUserImage;
        itemNameStr = itemName;
        timePostStr = itemTimePost;
        postTypeStr = boostType;
        dateStr = date;
        timStampStr = timeStamp;
        itemDescription = itemDescriptionStr;
        userID = userIDStr;
    }

    private String getCategoryFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String category =bundle.getString("category");
        return category;
    }


    private void getItemIDFromIntent() {
        Bundle bundle = getIntent().getExtras();
        itemIDStr =bundle.getString("itemID");
        userNameStr =bundle.getString("userName");
        userImageStr =bundle.getString("userImage");
        itemNameStr =bundle.getString("itemName");
        timePostStr =bundle.getString("time");
        postTypeStr =bundle.getString("postBoostType");
        dateStr =bundle.getString("2/3/2020");
        timStampStr =bundle.getString("time");
        itemDescription =bundle.getString("itemDes");
        userID =bundle.getString("userID");
        itemImage =bundle.getString("itemIV");
        whereCome =bundle.getString("from");
        categoryStr =bundle.getString("category");
        numberOfImage =bundle.getString("numberOfImage");
    }


    private void intiImageSlider() {
        Bundle bundle = new Bundle();
        bundle.putString("itemIV", itemImage);
        bundle.putString("cat", cat);

        if (cat.equals("ccemt"))
            bundle.putParcelable("object",ccemtObject);

        if (cat.equals("cp"))
            bundle.putParcelable("object",carPlatesModel);

        if (cat.equals("wr"))
            bundle.putParcelable("object",wheelsRimModel);

        if (cat.equals("aaj"))
            bundle.putParcelable("object",accAndJunkObject);

        fragmentImageSlider.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_image_slider_container, fragmentImageSlider);
        transaction.commit();
    }

    private void intiFollowUser() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getCategoryFromIntent());
        bundle.putString("userName", userNameStr);
        bundle.putString("userImage", userImageStr);
        bundle.putString("userID", userID);

        fragmentFollowUser.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_follow_user_container, fragmentFollowUser);
        transaction.commit();
    }

//    private void intiCommentsFragment() {
//
//        Bundle bundle = new Bundle();
//        bundle.putString("category", getCategoryFromIntent());
//        bundle.putString("itemID", itemIDStr);
//        bundle.putString("userID", userID);
//
//        fragmentComments.setArguments(bundle);
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.selected_item_details_comments_container, fragmentComments);
//        transaction.commit();
//    }

    private void intiSuggestedFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getCategoryFromIntent());
        bundle.putString("itemID", itemIDStr);

        fragmentSuggestedAntherItems.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_suggested_container, fragmentSuggestedAntherItems);
        transaction.commit();
    }

    private void intiShareFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.sharjah));

        fragmentShare.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_share_container, fragmentShare);
        transaction.commit();
    }

    private void intiItemDescriptionAndGeneralTips() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getCategoryFromIntent());
        bundle.putString("itemDes", itemDescription);

        fragmentIDescriptionAndGeneralTips.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_des_general_container, fragmentIDescriptionAndGeneralTips);
        transaction.commit();
    }

    private void intiItemDetails() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getCategoryFromIntent());
        bundle.putString("itemID", itemIDStr);
        bundle.putString("cat", cat);

        if (cat.equals("ccemt"))
            bundle.putParcelable("object",ccemtObject);

        if (cat.equals("cp"))
            bundle.putParcelable("object",carPlatesModel);

        if (cat.equals("wr"))
            bundle.putParcelable("object",wheelsRimModel);

        if (cat.equals("aaj"))
            bundle.putParcelable("object",accAndJunkObject);

        fragmentItemSelectedDetails.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_container, fragmentItemSelectedDetails);
        transaction.commit();
    }

    private void intiUserInfoFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getCategoryFromIntent());
        bundle.putString("itemID", itemIDStr);
        bundle.putString("userName", userNameStr);
        bundle.putString("userImage", userImageStr);
        bundle.putString("itemName", itemNameStr);
        bundle.putString("timePost", timePostStr);
        bundle.putString("postType", postTypeStr);
        bundle.putString("date", dateStr);
        bundle.putString("timStamp", timStampStr);
        bundle.putString("cat", cat);

        if (cat.equals("ccemt"))
        bundle.putParcelable("object",ccemtObject);

        if (cat.equals("cp"))
            bundle.putParcelable("object",carPlatesModel);

        if (cat.equals("wr"))
            bundle.putParcelable("object",wheelsRimModel);

        if (cat.equals("aaj"))
            bundle.putParcelable("object",accAndJunkObject);

        fragmentUserInfoAndMainButton.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.selected_item_details_user_info_container, fragmentUserInfoAndMainButton);
        transaction.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        changeFont();
    }

    private void titleActionBar() {
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);

        appbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isVisible = true;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    toolbar.setTitle("Title");
                    isVisible = true;
                } else if(isVisible) {
                    toolbar.setTitle("");
                    isVisible = false;
                }
            }
        });

    }


    private void changeFont() {

    }

    private void inti() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.show_item_details_toolbar);
        appbar = (AppBarLayout)findViewById(R.id.show_item_details_app_bar);
    }

    private void statusBarTransparent() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    @Override
    public void onFavouriteChange(int numberOfChange) {
        numberOfChangeFromInterface = numberOfChange;
    }

    @Override
    public void onBackPressed() {
        String number = String.valueOf(numberOfChangeFromInterface);
        Intent resultIntent = new Intent();
        resultIntent.putExtra("numberOfChange",number);
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    @Override
    public void onReceiveCCEMTObject(CCEMT ccemt) {
       //to pass object to fragment
        Log.i("TAG",ccemt.getItemID());
        ccemtObject = ccemt;
        intiAllFragment();
    }

    private void intiAllFragment() {
        intiUserInfoFragment();
        intiItemDetails();
        intiImageSlider();
    }

    @Override
    public void onReceiveAccAndJunkObject(AccAndJunk accAndJunk) {
        accAndJunkObject = accAndJunk;
        intiAllFragment();
    }

    @Override
    public void onReceiveWheelsRimObject(WheelsRimModel wheelsRim) {
        wheelsRimModel = wheelsRim;
        intiAllFragment();
    }

    @Override
    public void onReceiveCarPlatesObject(CarPlatesModel carPlates) {
        carPlatesModel = carPlates;
        intiAllFragment();
    }

}
