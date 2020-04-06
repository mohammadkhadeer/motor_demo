package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.model.SlidImage;
import com.cars.halamotor.view.adapters.adapterShowItemDetails.SlidingImage_Adapter;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class FragmentImageSlider extends Fragment {

    public FragmentImageSlider(){}
    private String[] imageUrls = new String[]{
            "https://cdn.pixabay.com/photo/2016/11/11/23/34/cat-1817970_960_720.jpg",
            "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
            "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
            "https://cdn.pixabay.com/photo/2017/11/07/00/07/fantasy-2925250_960_720.jpg",
            "https://cdn.pixabay.com/photo/2017/10/10/15/28/butterfly-2837589_960_720.jpg"
    };

    View view;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<SlidImage> imageModelArrayList;
    CirclePageIndicator indicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_image_slider, container, false);
        inti();
        imageModelArrayList = new ArrayList<>();
        SlidImage slidImage = new SlidImage("https://cdn.pixabay.com/photo/2016/11/11/23/34/cat-1817970_960_720.jpg",1,3);
        SlidImage slidImage2 = new SlidImage("https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",2,3);
        SlidImage slidImage3 = new SlidImage("https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",3,3);
        imageModelArrayList.add(slidImage);
        imageModelArrayList.add(slidImage2);
        imageModelArrayList.add(slidImage3);
        return view;
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

    }
}
