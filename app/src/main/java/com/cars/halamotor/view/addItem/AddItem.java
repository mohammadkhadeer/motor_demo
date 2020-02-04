package com.cars.halamotor.view.addItem;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Action;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CustomGallery;
import com.cars.halamotor.permission.CheckPermission;
import com.cars.halamotor.utils.Utils;
import com.cars.halamotor.view.adapters.ImageListRecyclerAdapter;
import com.cars.halamotor.view.adapters.SelectedImageAdapter;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddItem extends AppCompatActivity {

    RelativeLayout cancelRL,selectImageFGRL;
    TextView insertAddTV;
    private static final int PICK_FROM_GALLERY = 1;

    ImageLoader imageLoader;

    RecyclerView viewSelectedImageRV;
    SelectedImageAdapter selectedImageAdapter;
    ArrayList<String> imagePathArrL = new ArrayList<String>();
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        ButterKnife.bind(this);
        statusBarColor();
        inti();
        initImageLoader();
        changeFontType();
        actionListener();

    }

    public void initImageLoader() {
        imageLoader = Utils.initImageLoader(AddItem.this);
    }

    private void actionListener() {
        cancelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        selectImageFGRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckPermission.checkPermissionMethod(AddItem.this);
                Intent i = new Intent(Action.ACTION_MULTIPLE_PICK);
                startActivityForResult(i, 200);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults)
    {
        switch (requestCode) {
            case PICK_FROM_GALLERY:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult(galleryIntent, PICK_FROM_GALLERY);
                } else {
                }
                break;
        }
    }

    private void changeFontType() {
        insertAddTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
    }

    private void inti() {
        viewSelectedImageRV = (RecyclerView) findViewById(R.id.add_activity_view_selected_image_RV);
        cancelRL = (RelativeLayout) findViewById(R.id.add_activity_cancelRL);
        insertAddTV = (TextView) findViewById(R.id.add_activity_insert_titleTV);
        selectImageFGRL = (RelativeLayout) findViewById(R.id.add_activity_selectIFG_RL);
    }

    private void statusBarColor() {
       getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 200 && resultCode == Activity.RESULT_OK) {
            String[] all_path = data.getStringArrayExtra("all_path");

            ArrayList<CustomGallery> dataT = new ArrayList<CustomGallery>();
            imagePathArrL = new ArrayList<String>();

            for (String string : all_path) {
                CustomGallery item = new CustomGallery();
                item.sdcardPath = string;
                imagePathArrL.add(item.sdcardPath);
                dataT.add(item);
            }

            viewSelectedImageRV.setNestedScrollingEnabled(false);
            viewSelectedImageRV.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(AddItem.this,
                    LinearLayoutManager.HORIZONTAL, false);
            viewSelectedImageRV.setLayoutManager(layoutManager);

            selectedImageAdapter =new SelectedImageAdapter(AddItem.this
                    ,imagePathArrL);
            viewSelectedImageRV.setAdapter(selectedImageAdapter);

        }
    }


}
