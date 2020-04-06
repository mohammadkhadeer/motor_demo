package com.cars.halamotor.view.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.cars.halamotor.R;
import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesFirstCase;
import com.cars.halamotor.model.WheelsRimFirstCase;
import com.cars.halamotor.utils.LinearLayoutThatDetectsSoftKeyboard;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentComments;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentFollowUser;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentIDescriptionAndGeneralTips;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentImageSlider;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentItemSelectedDetails;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentShare;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentSimilarItems;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentUserInfo;

import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getAccAndJunkFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCCEMTFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCarPlatesFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getWheelsRimFirstCaseFromDB;

public class ShowItemDetails extends AppCompatActivity implements LinearLayoutThatDetectsSoftKeyboard.Listener{

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

    String itemIDStr,userNameStr,userImageStr,itemNameStr,timePostStr,postTypeStr,dateStr,timStampStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item_details);

        //statusBarTransparent();
        inti();
        intiObject();
        titleActionBar();
        intiImageSlider();
        intiUserInfoFragment();
        intiItemDetails();
        intiItemDescriptionAndGeneralTips();
        intiShareFragment();
        intiFollowUser();
        intiSuggestedFragment();
        intiCommentsFragment();

    }

    private void intiObject() {
        category =getCategoryFromIntent();

        if (category.equals("Car for sale")
                ||category.equals("Car for rent")
                ||category.equals("Exchange car")
                ||category.equals("Motorcycle")
                ||category.equals("Trucks")
        ) {
            ccemtFirestCase =getCCEMTFirstCaseFromDB(getItemIDFromIntent(),this);
            intiUserInfoComp(ccemtFirestCase.getItemIdInServer(),ccemtFirestCase.getItemUserName()
            ,ccemtFirestCase.getItemUserImage(),ccemtFirestCase.getItemName()
            ,ccemtFirestCase.getItemTimePost(),ccemtFirestCase.getBoostType()
            ,ccemtFirestCase.getDate(),ccemtFirestCase.getTimeStamp());
        }
        if (category.equals("Car plates"))
        {
            carPlatesFirstCase =getCarPlatesFirstCaseFromDB(getItemIDFromIntent(),this);
            intiUserInfoComp(carPlatesFirstCase.getItemIdInServer(),carPlatesFirstCase.getItemUserName()
                    ,carPlatesFirstCase.getItemUserImage(),carPlatesFirstCase.getItemName()
                    ,carPlatesFirstCase.getItemTimePost(),carPlatesFirstCase.getBoostType()
                    ,carPlatesFirstCase.getDate(),carPlatesFirstCase.getTimeStamp());
        }
        if (category.equals("Wheels rim"))
        {
            wheelsRimFirstCase =getWheelsRimFirstCaseFromDB(getItemIDFromIntent(),this);
            intiUserInfoComp(wheelsRimFirstCase.getItemIdInServer(),wheelsRimFirstCase.getItemUserName()
                    ,wheelsRimFirstCase.getItemUserImage(),wheelsRimFirstCase.getItemName()
                    ,wheelsRimFirstCase.getItemTimePost(),wheelsRimFirstCase.getBoostType()
                    ,wheelsRimFirstCase.getData(),wheelsRimFirstCase.getTimeStamp());
        }
        if (category.equals("Accessories") || category.equals("Junk car"))
        {
            accAndJunkFirstCase =getAccAndJunkFirstCaseFromDB(getItemIDFromIntent(),this);
            intiUserInfoComp(accAndJunkFirstCase.getItemIdInServer(),accAndJunkFirstCase.getItemUserName()
                    ,accAndJunkFirstCase.getItemUserImage(),accAndJunkFirstCase.getItemName()
                    ,accAndJunkFirstCase.getItemTimePost(),accAndJunkFirstCase.getBoostType()
                    ,accAndJunkFirstCase.getData(),accAndJunkFirstCase.getTimeStamp());
        }
    }

    private void intiUserInfoComp(String itemIdInServer, String itemUserName, String itemUserImage
            , String itemName, String itemTimePost, String boostType,String date,String timeStamp) {
        itemIDStr = itemIdInServer;
        userNameStr = itemUserName;
        userImageStr = itemUserImage;
        itemNameStr = itemName;
        timePostStr = itemTimePost;
        postTypeStr = boostType;
        dateStr = date;
        timStampStr = timeStamp;
    }

    private String getCategoryFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String category =bundle.getString("category");
        return category;
    }

    private String getFromWhereFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String fromWhere =bundle.getString("from");
        return fromWhere;
    }

    private String getItemIDFromIntent() {
        Bundle bundle = getIntent().getExtras();
        String fromWhere =bundle.getString("itemID");
        return fromWhere;
    }

    private void intiImageSlider() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.sharjah));
        fragmentImageSlider.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_image_slider_container, fragmentImageSlider);
        transaction.commit();
    }

    private void intiFollowUser() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.dubai));
        fragmentFollowUser.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_follow_user_container, fragmentFollowUser);
        transaction.commit();
    }

    private void intiCommentsFragment() {

        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.sharjah));
        fragmentComments.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_comments_container, fragmentComments);
        transaction.commit();
    }

    private void intiSuggestedFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.sharjah));
        fragmentSuggestedAntherItems.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_suggested_container, fragmentSuggestedAntherItems);
        transaction.commit();
    }

    private void intiShareFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.sharjah));
        fragmentShare.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_share_container, fragmentShare);
        transaction.commit();
    }

    private void intiItemDescriptionAndGeneralTips() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.terracan));
        fragmentIDescriptionAndGeneralTips.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_des_general_container, fragmentIDescriptionAndGeneralTips);
        transaction.commit();
    }

    private void intiItemDetails() {
        Bundle bundle = new Bundle();
        bundle.putString("category", getResources().getString(R.string.complete_car_details));
        fragmentItemSelectedDetails.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_container, fragmentItemSelectedDetails);
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

        fragmentUserInfoAndMainButton.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.selected_item_details_user_info_container, fragmentUserInfoAndMainButton);
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
    public void onSoftKeyboardShown(boolean isShowing) {

    }
}
