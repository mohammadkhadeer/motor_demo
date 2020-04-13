package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.SlidImage;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.view.adapters.adapterShowItemDetails.SlidingImage_Adapter;
import com.squareup.picasso.Picasso;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class FragmentImageSlider extends Fragment {

    public FragmentImageSlider(){}

    View view;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<SlidImage> imageModelArrayList;
    private ArrayList<String> images;
    CirclePageIndicator indicator;
    ImageView imageView;
    String itemIV,cat;

    CCEMT ccemt;
    CarPlatesModel carPlatesModel;
    WheelsRimModel wheelsRimModel;
    AccAndJunk accAndJunkObject;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            itemIV = getArguments().getString("itemIV");
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_image_slider, container, false);
        inti();
        fillImageList();

        return view;
    }

    private void fillImageList() {
        images = new ArrayList<>();
        if (cat.equals("ccemt"))
            images = ccemt.getImagePathArrayL();

        if (cat.equals("cp"))
            images = carPlatesModel.getImagePathArrayL();

        if (cat.equals("wr"))
            images = wheelsRimModel.getImagePathArrayL();

        if (cat.equals("aaj"))
            images = accAndJunkObject.getImagePathArrayL();
        fillSlider();
    }

    private void fillSlider() {
        imageModelArrayList = new ArrayList<>();
        for (int i =0;i<images.size();i++)
        {
            SlidImage slidImage = new SlidImage(images.get(i),i+1,images.size());
            imageModelArrayList.add(slidImage);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPager.setAdapter(new SlidingImage_Adapter(getActivity(),imageModelArrayList));
        //indicator.setViewPager(mPager);
        final float density = getResources().getDisplayMetrics().density;
        NUM_PAGES =imageModelArrayList.size();

    }

    private void inti() {
        mPager = (ViewPager) view.findViewById(R.id.pager);
        imageView = (ImageView) view.findViewById(R.id.firstImage);
    }
}
