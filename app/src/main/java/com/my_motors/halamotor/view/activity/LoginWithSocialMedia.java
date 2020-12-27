package com.my_motors.halamotor.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.UserInfo;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

import static com.my_motors.halamotor.fireBaseDB.InsertToFireBase.addNewUser;
import static com.my_motors.halamotor.fireBaseDB.ReadFromFireBase.getUserInfo;
import static com.my_motors.halamotor.functions.Functions.changeFontBold;
import static com.my_motors.halamotor.functions.Functions.getDAY;
import static com.my_motors.halamotor.functions.Functions.getMONTH;
import static com.my_motors.halamotor.functions.Functions.getYEAR;
import static com.my_motors.halamotor.sharedPreferences.LoginInfo.saveLoginInSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.checkFBLoginOrNot;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOnServerSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOrNotFromSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.getUserTokenInFromSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.saveFBInfoInSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.saveUserInfoInSP;

public class LoginWithSocialMedia extends AppCompatActivity {
    Button login;
    RelativeLayout fb,g,skip;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;
    UserInfo newUser;
    int numberOfAllowedPosts = 7;
    String userImage ="https://firebasestorage.googleapis.com/v0/b/mymotor-2c75d.appspot.com/o/12366.jpg?alt=media&token=c0fa3836-4662-4365-9b65-8fbfb412a7e6";
    private static final String REGISTER = "REGISTER";
    SharedPreferences.Editor fbEditor, rgEditor;
    SharedPreferences fbSharedPreferences, rgSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_social_media);
        statusBarColor();
        inti();
        actionListenerToLogin();
        actionListenerToFB();
        actionListenerToG();
        actionListenerToSkip();
    }

    private void actionListenerToSkip() {
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewUserInfo();
            }
        });
    }

    private void actionListenerToG() {
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveLoginInSP(getApplicationContext(),sharedPreferences,editor,"1");
                moveBack();
            }
        });
    }

    private void actionListenerToFB() {
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveLoginInSP(getApplicationContext(),sharedPreferences,editor,"1");
                moveBack();
            }
        });
    }

    private void actionListenerToLogin() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveLoginInSP(getApplicationContext(),sharedPreferences,editor,"1");
                moveBack();

            }
        });
    }

    public void moveBack() {
        createNewUserInfo();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        }, 1500);

    }

    private void inti() {
        login = (Button) findViewById(R.id.login);
        fb = (RelativeLayout) findViewById(R.id.fb);
        fb = (RelativeLayout) findViewById(R.id.fb);
        g = (RelativeLayout) findViewById(R.id.g);
        skip = (RelativeLayout) findViewById(R.id.skip);
    }

    private void statusBarColor() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

    private void createNewUserInfo() {
        String year =getYEAR();
        String month = getMONTH();
        String day = getDAY();
        String date = year+"/"+month+"/"+day;

        newUser = new UserInfo("Mohammad Obeidat"
                ,userImage
                ,"Mohammad","Mohammadkhadeer1992@gmail.com"
                ,"000","notYet","notYet"
                ,"notYet","notYet"
                ,"notYet","notYet",getUserTokenInFromSP(getApplicationContext())
                ,0,1,0,0
                ,1,0,0,numberOfAllowedPosts,date);

        checkIfUserRegisterOrNotFromSP(getApplicationContext(), rgSharedPreferences, rgEditor, "1");

        addNewUser(newUser,rgSharedPreferences,rgEditor,getApplicationContext());

        saveUserInfoInSP(getApplicationContext(), fbSharedPreferences, fbEditor,"Mohammad"
                , "Obeidat", "Mohammadkhadeer1992@gmail.com"
                , "TEST", "1/1/2020"
                , userImage);

    }

    public static void checkIfUserRegisterOrNotFromSP(Context context, SharedPreferences rgSharedPreferences,
                                                      SharedPreferences.Editor rgEditor, String status) {
        rgSharedPreferences = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        rgEditor = rgSharedPreferences.edit();
        rgEditor.putString("registerOrNotYet",status);
        rgEditor.commit();
    }

}
