package com.cars.halamotor.view.showImageFromGallery;

import android.support.v7.app.AppCompatActivity;

import com.cars.halamotor.utils.Utils;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 */
public class BaseActivity extends AppCompatActivity {

    ImageLoader imageLoader;;

    public void initImageLoader() {
        try {
            imageLoader = Utils.initImageLoader(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BaseActivity getActivity() {
        return this;
    }


}
