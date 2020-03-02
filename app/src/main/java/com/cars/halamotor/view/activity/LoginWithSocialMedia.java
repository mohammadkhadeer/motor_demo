package com.cars.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
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
import android.widget.TextView;
import android.widget.Toast;

import com.cars.halamotor.R;
import com.cars.halamotor.model.UserInfo;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONException;
import org.json.JSONObject;

import static com.cars.halamotor.fireBaseDB.InsertToFireBase.addNewUser;
import static com.cars.halamotor.functions.Functions.changeFontBold;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkFBLoginOrNot;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOnServerSP;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOrNotFromSP;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveFBInfoInSP;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveUserInfoInSP;

public class LoginWithSocialMedia extends AppCompatActivity {

    LoginButton loginButtonFB;
    CallbackManager callbackManager;
    SharedPreferences.Editor fbEditor, rgEditor;
    SharedPreferences fbSharedPreferences, rgSharedPreferences;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_social_media);

        inti();
        statusBarColor();
        actionBarTitle();
        handelFBLoginButton();
    }

    private void handelFBLoginButton() {
        callbackManager = CallbackManager.Factory.create();
        loginButtonFB.setPermissions("email", "public_profile");
        loginButtonFB.setPermissions("user_birthday");

        loginButtonFB.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {
                Log.i("TAG fn", error.toString());
            }
        });
    }

    private void inti() {
        mAuth = FirebaseAuth.getInstance();
        loginButtonFB = (LoginButton) findViewById(R.id.login_with_s_m_fb);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    AccessTokenTracker accessTokenTracker = new AccessTokenTracker() {
        @Override
        protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
            if (currentAccessToken != null) {
                checkIfUserRegisterOrNotFromSP(getApplicationContext(), rgSharedPreferences, rgEditor, "1");
                checkFBLoginOrNot(getApplicationContext(), fbSharedPreferences, fbEditor, "1");
                loadUserProfile(currentAccessToken);
            } else {
                checkIfUserRegisterOrNotFromSP(getApplicationContext(), rgSharedPreferences, rgEditor, "0");
                checkFBLoginOrNot(getApplicationContext(), fbSharedPreferences, fbEditor, "0");
                moveBack();
            }
        }
    };

    private void loadUserProfile(AccessToken accessToken) {
        GraphRequest graphRequest = GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() {
            @Override
            public void onCompleted(final JSONObject object, GraphResponse response) {
                try {
                    mAuth.createUserWithEmailAndPassword(object.getString("email"), "@ajfhafjb#$ASW1235")
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        try {
                                            registerUserInServer(object);

                                            saveFBInfoInSP(getApplicationContext(), fbSharedPreferences, fbEditor, object.getString("first_name")
                                                    , object.getString("last_name"), object.getString("email")
                                                    , object.getString("id"), object.getString("birthday")
                                                    , "https://graph.facebook.com/" + object.getString("id") + "/picture?type=normal");

                                            saveUserInfoIfNotRegister(object.getString("first_name")
                                                    , object.getString("last_name"), object.getString("email")
                                                    , object.getString("id"), object.getString("birthday")
                                                    , "https://graph.facebook.com/" + object.getString("id") + "/picture?type=normal");

                                            moveBack();
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            });
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        Bundle parmeters = new Bundle();
        parmeters.putString("fields", "first_name,last_name,email,id,birthday");
        graphRequest.setParameters(parmeters);
        graphRequest.executeAsync();
    }

    private void registerUserInServer(JSONObject object) {
        if(checkIfUserRegisterOnServerSP(getApplicationContext())==false)
        {
            try {
                UserInfo newUser = new UserInfo(object.getString("first_name")
                        ,"https://graph.facebook.com/" + object.getString("id") + "/picture?type=normal"
                        ,object.getString("last_name"),object.getString("email")
                        ,"000","notYet","notYet"
                        ,"notYet","notYet"
                        ,"notYet","notYet","0");

                addNewUser(newUser,rgSharedPreferences,rgEditor,getApplicationContext());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveUserInfoIfNotRegister(String first_name, String last_name, String email, String id, String birthday, String user_image) {
        if (checkIfUserRegisterOrNotFromSP(getApplicationContext()) == false) {
            saveUserInfoInSP(getApplicationContext(), rgSharedPreferences, rgEditor, first_name, last_name, email, id, birthday, user_image);
        }
    }

    private void moveBack() {
        Intent resultIntent = new Intent();
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }


    private void actionBarTitle() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_custom_title_view_centered, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        TextView textviewTitle = (TextView) viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setText(getResources().getString(R.string.login_with_social_media));
        textviewTitle.setTypeface(changeFontBold(this));
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);
        abar.setDisplayHomeAsUpEnabled(true);
        abar.setHomeButtonEnabled(true);
    }

    private void statusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorRed));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
