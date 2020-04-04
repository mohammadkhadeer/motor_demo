package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.utils.LinearLayoutThatDetectsSoftKeyboard;
import com.cars.halamotor.view.adapters.AdapterCarOption;

import java.util.ArrayList;

public class FragmentItemSelectedDetails extends Fragment implements LinearLayoutThatDetectsSoftKeyboard.Listener{

    public FragmentItemSelectedDetails(){}

    String test;
     TextView text_title1,text_title_content1,text_title2,text_title_content2
             ,text_title3,text_title_content3,text_title4,text_title_content4
             ,text_title5,text_title_content5,text_title6,text_title_content6
             ,text_title7,text_title_content7,text_title8,text_title_content8
             ,text_title9,text_title_content9,text_title10,text_title_content10
             ,text_title11,text_title_content11,text_title12,text_title_content12
             ,cityTV,neighborhoodTV,categoryTV,cityTitleTV,neighborhoodTitleTV
             ,categoryTitleTV;
     LinearLayout itemDetailsLL;
     RecyclerView carOptionRV;
    ArrayList<String> carOptionsArrayList = new ArrayList<String>();
    AdapterCarOption adapterCarOption;
    View view;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            test = getArguments().getString("category");
        }
        super.onAttach(context);
    }

    private void inti() {
        itemDetailsLL = (LinearLayout) view.findViewById(R.id.itemDetailsLL);
        cityTitleTV = (TextView) view.findViewById(R.id.common_title1);
        neighborhoodTitleTV = (TextView) view.findViewById(R.id.common_title2);
        categoryTitleTV = (TextView) view.findViewById(R.id.common_title3);
        cityTV = (TextView) view.findViewById(R.id.text_common_content1);
        neighborhoodTV = (TextView) view.findViewById(R.id.text_common_content2);
        categoryTV = (TextView) view.findViewById(R.id.text_common_content3);
        text_title1 = (TextView) view.findViewById(R.id.text_title1);
        text_title2 = (TextView) view.findViewById(R.id.text_title2);
        text_title3 = (TextView) view.findViewById(R.id.text_title3);
        text_title4 = (TextView) view.findViewById(R.id.text_title4);
        text_title5 = (TextView) view.findViewById(R.id.text_title5);
        text_title6 = (TextView) view.findViewById(R.id.text_title6);
        text_title7 = (TextView) view.findViewById(R.id.text_title7);
        text_title8 = (TextView) view.findViewById(R.id.text_title8);
        text_title9 = (TextView) view.findViewById(R.id.text_title9);
        text_title10 = (TextView) view.findViewById(R.id.text_title10);
        text_title11 = (TextView) view.findViewById(R.id.text_title11);
        text_title12 = (TextView) view.findViewById(R.id.text_title12);
        text_title_content1 = (TextView) view.findViewById(R.id.text_title_content1);
        text_title_content2 = (TextView) view.findViewById(R.id.text_title_content2);
        text_title_content3 = (TextView) view.findViewById(R.id.text_title_content3);
        text_title_content4 = (TextView) view.findViewById(R.id.text_title_content4);
        text_title_content5 = (TextView) view.findViewById(R.id.text_title_content5);
        text_title_content6 = (TextView) view.findViewById(R.id.text_title_content6);
        text_title_content7 = (TextView) view.findViewById(R.id.text_title_content7);
        text_title_content8 = (TextView) view.findViewById(R.id.text_title_content8);
        carOptionRV = (RecyclerView) view.findViewById(R.id.car_options_RV);
        text_title_content9 = (TextView) view.findViewById(R.id.text_title_content9);
        text_title_content10 = (TextView) view.findViewById(R.id.text_title_content10);
        text_title_content11 = (TextView) view.findViewById(R.id.text_title_content11);
        text_title_content12 = (TextView) view.findViewById(R.id.text_title_content12);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_selected_details, container, false);
        Log.i("TAG","12********");
        Log.i("TAG",test);
        inti();
        return view;
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        changeFont();
        fillCarOptions();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void fillCarOptions() {
        fillArrayList();
        if (carOptionsArrayList.size() == 0)
        {
            carOptionRV.setVisibility(View.GONE);
            text_title_content8.setVisibility(View.VISIBLE);
            text_title8.setTextColor(getActivity().getResources()
                    .getColor(R.color.colorBlack5, null));
            text_title_content8.setText(getActivity().getResources().getString(R.string.no_options));
        }else{
            text_title8.setTextColor(getActivity().getResources()
                    .getColor(R.color.colorBlack, null));
            text_title_content8.setVisibility(View.GONE);
            carOptionRV.setVisibility(View.VISIBLE);
            carOptionRV.setHasFixedSize(true);
            GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
            carOptionRV.setLayoutManager(mLayoutManager);
            adapterCarOption = new AdapterCarOption(getActivity(), carOptionsArrayList);
            carOptionRV.setAdapter(adapterCarOption);
        }
    }

    private void fillArrayList() {
        carOptionsArrayList = new ArrayList<>();
        carOptionsArrayList.add("Option 1");
        carOptionsArrayList.add("Option 2");
        carOptionsArrayList.add("Option 3");
        carOptionsArrayList.add("Option 4");
        carOptionsArrayList.add("Option 5");
        carOptionsArrayList.add("Option 6");
        carOptionsArrayList.add("Option 7");
        carOptionsArrayList.add("Option 8");
        carOptionsArrayList.add("Option 9");
        carOptionsArrayList.add("Option 10");
    }

    private void changeFont() {
        cityTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        neighborhoodTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        categoryTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        cityTitleTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        neighborhoodTitleTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        categoryTitleTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title1.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title2.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title3.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title4.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title5.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title6.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title7.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title8.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title9.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title10.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title11.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title12.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content1.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content2.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content3.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content4.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content5.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content6.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content7.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content8.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content9.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content10.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content11.setTypeface(Functions.changeFontGeneral(getActivity()));
        text_title_content12.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    @Override
    public void onSoftKeyboardShown(boolean isShowing) {

    }
}
