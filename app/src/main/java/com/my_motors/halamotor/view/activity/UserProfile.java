package com.my_motors.halamotor.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.model.UserProfileInfo;
import com.my_motors.halamotor.presnter.UserInfo;
import com.my_motors.halamotor.view.fragments.userProfileFragment.UserProfileDetailsInfo;
import com.my_motors.halamotor.view.fragments.userProfileFragment.UserProfilePostsList;

import static com.my_motors.halamotor.fireBaseDB.GetFromFireBaseDB.getProfileUserInfo;

public class UserProfile extends AppCompatActivity implements UserInfo {

    UserProfileDetailsInfo userProfileDetailsInfo = new UserProfileDetailsInfo();
    UserProfilePostsList userProfilePostsList = new UserProfilePostsList();

    String userID,type;
    UserInfo userInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        getInfoFromIntent();
        fillStatusBar();
        userInfo = (UserInfo) this;
        getProfileUserInfo(userID,userInfo);
        intiUserPostsFragment();

    }

    private void intiUserPostsFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("userID", userID);
        userProfilePostsList.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_user_profile_posts, userProfilePostsList)
                .commit();
    }

    private void fillStatusBar() {
        if (type.equals("person"))
        {
            statusBarColorWhite();
        }
    }

    private void statusBarColorWhite() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

    private void getInfoFromIntent() {
        Bundle bundle = getIntent().getExtras();
        userID =bundle.getString("userID");
        type =bundle.getString("type");

    }

    private void intiFragment(UserProfileInfo userProfileInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("object", userProfileInfo);
        bundle.putString("userID", userID);
        bundle.putString("type", type);
        userProfileDetailsInfo.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_user_profile_comp, userProfileDetailsInfo)
                .commit();

    }

    @Override
    public void userInfo(UserProfileInfo userProfileInfo) {
        intiFragment(userProfileInfo);

    }
}
