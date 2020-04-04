package com.cars.halamotor.view.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import com.cars.halamotor.R;
import com.cars.halamotor.utils.LinearLayoutThatDetectsSoftKeyboard;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentComments;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentFollowUser;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentIDescriptionAndGeneralTips;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentItemSelectedDetails;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentShare;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentSimilarItems;
import com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.FragmentUserInfo;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item_details);

        //statusBarTransparent();
        inti();
        titleActionBar();
        intiUserInfoFragment();
        intiItemDetails();
        intiItemDescriptionAndGeneralTips();
        intiShareFragment();
        intiFollowUser();
        intiSuggestedFragment();
        intiCommentsFragment();

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
        bundle.putString("category", getResources().getString(R.string.car_plates));
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
