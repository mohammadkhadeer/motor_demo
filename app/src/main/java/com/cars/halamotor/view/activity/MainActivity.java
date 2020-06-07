package com.cars.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.BrowsingFilter;
import com.cars.halamotor.presnter.OnNewNotification;
import com.cars.halamotor.view.fragments.FragmentHomeScreen;
import com.cars.halamotor.view.fragments.browsingFragment.BrowsingItems;
import com.cars.halamotor.view.fragments.browsingFragment.FilterBrowsingFragment;
import com.cars.halamotor.view.fragments.browsingFragment.FragmentBrowsing;
import com.cars.halamotor.view.fragments.FragmentNotification;
import com.cars.halamotor.view.fragments.FragmentProfile;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.ListsMainScreenFragment;
import com.google.firebase.database.DatabaseReference;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.sharedPreferences.NotificationSharedPreferences.getUnreadNotificationsInSP;
import static com.cars.halamotor.sharedPreferences.NotificationSharedPreferences.updateAllUnreadNotificationsToChecked;
import static com.cars.halamotor.sharedPreferences.NotificationSharedPreferences.updateNumberUnreadNotifications;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOrNotFromSP;

public class MainActivity extends AppCompatActivity  {
    private TextView appNameTV;
    DatabaseReference mDatabase;
    BottomBar bottomBar;
    EditText searchEdt;
    RelativeLayout headRL;

    final Fragment fragmentHome = new FragmentHomeScreen();
    final Fragment fragmentMessage = new FragmentBrowsing();
    final Fragment fragmentNotification = new FragmentNotification();
    final Fragment fragmentProfile = new FragmentProfile();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragmentHome;

    BottomBarTab homeBBT,messagesBBT, notificationsBBT, addItemBBT,profileBBT;
    private BottomBarTab[] bbtArr = {homeBBT, messagesBBT, notificationsBBT, addItemBBT, profileBBT};
    private String[] bbtArrStr = {"homeBBT", "messagesBBT", "notificationsBBT", "addItemBBT", "profileBBT"};
    String lastFragmentStr;
    private static final int ADD_NEW_ITEM = 101;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;
    OnNewNotification onNewNotification;
    private static final int REQUEST_SHOW_ITEM_SELECTED_DETAILS = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusBarColor();
        inti();

        changeAppNameFontType();
        changeGeneralFontType();
        BottomBarMenu();
        moveBetweenFragment();
        updateNumberUnCheckedNotifications();

    }

    // to can inti interface in said activity
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        if (fragment instanceof OnNewNotification) {
            onNewNotification = (OnNewNotification) fragment;
        }
    }

    public void onNewNotifications() {
        if (onNewNotification != null) {
            onNewNotification.onNewNotification(1);
        }
    }

    private void moveBetweenFragment() {
        fm.beginTransaction().add(R.id.main_container, fragmentProfile, "4").hide(fragmentProfile).commit();
        fm.beginTransaction().add(R.id.main_container, fragmentNotification, "3").hide(fragmentNotification).commit();
        fm.beginTransaction().add(R.id.main_container, fragmentMessage, "2").hide(fragmentMessage).commit();
        fm.beginTransaction().add(R.id.main_container,fragmentHome, "1").commit();
    }

    private void changeGeneralFontType() {
        searchEdt.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
    }

    private void changeAppNameFontType() {
        appNameTV.setTypeface(Functions.changeFontAppName(getApplicationContext()));
    }

    private void inti() {
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        appNameTV =(TextView) findViewById(R.id.app_name_tv);
        searchEdt = (EditText) findViewById(R.id.searchEdt);
        headRL = (RelativeLayout) findViewById(R.id.main_activity_head);
    }

    private void BottomBarMenu() {
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switchFragment(tabId);
            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_adv)
                {
                    if (checkIfUserRegisterOrNotFromSP(getApplicationContext()) == false)
                    {
                        Toast.makeText(getBaseContext(),getResources().getString(R.string.must_login), Toast.LENGTH_SHORT).show();
                        handelProfileFragment();
                    }else{
                        moveToAddItem();
                    }
                }
                //Toast.makeText(getApplicationContext(), TabMessage.get(tabId, true), Toast.LENGTH_LONG).show();
            }
        });

        intiBBT();

        //messagesBBT.setBadgeCount(12);
    }

    private void intiBBT() {
        homeBBT = bottomBar.getTabWithId(R.id.tab_home);
        messagesBBT = bottomBar.getTabWithId(R.id.tab_messages);
        notificationsBBT = bottomBar.getTabWithId(R.id.tab_notifications);
        addItemBBT = bottomBar.getTabWithId(R.id.tab_adv);
        profileBBT = bottomBar.getTabWithId(R.id.tab_profile);
    }

    private boolean switchFragment(int tabId) {
        switch (tabId) {
            case R.id.tab_home:
                handelHomeFragment();
                return true;

            case R.id.tab_messages:
                handelMessageFragment();
                return true;

            case R.id.tab_adv:
                if (checkIfUserRegisterOrNotFromSP(this) == false)
                {
                    Toast.makeText(getBaseContext(),getResources().getString(R.string.must_login), Toast.LENGTH_SHORT).show();
                    handelProfileFragment();
                }else{
                    checkWhatIsLastFragmentAndKeepItOn();
                    moveToAddItem();
                }
                return true;

            case R.id.tab_notifications:
                updateAllUnreadNotificationsToChecked(MainActivity.this,sharedPreferences,editor,"0");
                updateNumberUnCheckedNotifications();
                onNewNotifications();
                handelNotificationsFragment();
                return true;

            case R.id.tab_profile:
                handelProfileFragment();
                return true;
        }
        return false;
    }

    private void visibleHeadRL(){
        headRL.setVisibility(View.VISIBLE);
    }

    private void handelProfileFragment() {
        headRL.setVisibility(View.GONE);
        fm.beginTransaction().hide(active).show(fragmentProfile).commit();
        active = fragmentProfile;
        lastFragmentStr= "fragmentProfile";
    }

    private void handelNotificationsFragment() {
        visibleHeadRL();
        fm.beginTransaction().hide(active).show(fragmentNotification).commit();
        active = fragmentNotification;
        lastFragmentStr= "fragmentNotification";
    }

    private void handelMessageFragment() {
        visibleHeadRL();
        fm.beginTransaction().hide(active).show(fragmentMessage).commit();
        active = fragmentMessage;
        lastFragmentStr= "fragmentMessage";
    }

    private void handelHomeFragment() {
        visibleHeadRL();
        fm.beginTransaction().hide(active).show(fragmentHome).commit();
        active = fragmentHome;
        lastFragmentStr= "fragmentHome";
    }

    private void checkWhatIsLastFragmentAndKeepItOn() {
        switch (lastFragmentStr) {
            case "fragmentHome":
                fm.beginTransaction().hide(active).show(fragmentHome).commit();
                active = fragmentHome;
                //keepItPressed(homeBBT);
                break;
            case "fragmentMessage":
                fm.beginTransaction().hide(active).show(fragmentMessage).commit();
                active = fragmentMessage;
                //keepItPressed(messagesBBT);
                break;

            case "fragmentNotification":
                fm.beginTransaction().hide(active).show(fragmentNotification).commit();
                active = fragmentNotification;
                //keepItPressed(notificationsBBT);
                break;

            case "fragmentProfile":
                fm.beginTransaction().hide(active).show(fragmentProfile).commit();
                active = fragmentProfile;
                //keepItPressed(profileBBT);
                break;

        }
    }

    private void resetOtherBBTToDefault(String bbtStr,BottomBarTab bbt) {
        for (int i=0;i<bbtArrStr.length;i++)
        {
            if (!bbtArrStr[i].equals(bbtStr))
            {
                Log.i("TAGEQ",bbtArrStr[i]);
                //bbt.performClick(false);
                //bbtArr[i].isSelected();
                bbtArr[i].callOnClick();
            }
        }
    }

    private void keepItPressed(BottomBarTab bbt) {
        //bbt.performClick();
         bbt.callOnClick();

    }

    private void moveToAddItem() {
        Intent intent = new Intent(MainActivity.this, AddItem.class);
        startActivityForResult(intent, ADD_NEW_ITEM);
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation);
    }

    private void statusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorRed));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SHOW_ITEM_SELECTED_DETAILS && resultCode == RESULT_OK && data != null) {
            // to update UI in lists can't handel it via interface must to overright method
            //listsMainScreenFragment.onActivityResult(requestCode, resultCode, data);
            //to update fragment must to use new object
            //we calculate mode to know if have to change UI "Update"
            String numberOfChangeStr =data.getExtras().getString("numberOfChange");
            int numberOfChange =Integer.parseInt(numberOfChangeStr);
            int result = numberOfChange % 2;

            if (result != 0) {
                FragmentHomeScreen fragmentHomeScreen = new FragmentHomeScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_container, fragmentHomeScreen);
                transaction.commit();
            }
        }
        if (requestCode == ADD_NEW_ITEM && resultCode == Activity.RESULT_OK) {
            if (getUnreadNotificationsInSP(MainActivity.this) != null)
            {
                int unreadNotification = Integer.parseInt(getUnreadNotificationsInSP(MainActivity.this));
                unreadNotification = unreadNotification + 1;
                updateNumberUnreadNotifications(MainActivity.this,sharedPreferences,editor,String.valueOf(unreadNotification));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        updateNumberUnCheckedNotifications();

                    }
                }, 6000);
            }else{
                updateNumberUnreadNotifications(MainActivity.this,sharedPreferences,editor,String.valueOf(1));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        updateNumberUnCheckedNotifications();
                    }
                }, 6000);
            }
        }
    }

    ListsMainScreenFragment listsMainScreenFragment = new ListsMainScreenFragment();
    private void updateNumberUnCheckedNotifications() {
        if (getUnreadNotificationsInSP(this) != null)
        {
            int num = Integer.parseInt(getUnreadNotificationsInSP(MainActivity.this));
            if(num >0)
                notificationsBBT.setBadgeCount(num);
            else
                notificationsBBT.setBadgeCount(0);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getDataBaseInstance(getApplicationContext()).deleteAllItem();
        getDataBaseInstance(getApplicationContext()).deleteCCEMTItem();
        getDataBaseInstance(getApplicationContext()).deleteWheels_RimItem();
        getDataBaseInstance(getApplicationContext()).deleteCarPlatesItem();
        getDataBaseInstance(getApplicationContext()).deleteAccAndJunkItem();
    }
}
