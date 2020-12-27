package com.my_motors.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.my_motors.halamotor.R;
import com.my_motors.halamotor.dataBase.DBHelper;
import com.my_motors.halamotor.model.SimilarNeeded;
import com.my_motors.halamotor.view.fragments.fragmentInSaidShowItemDetails.userAds.FragmentSuggestedAds;
import com.my_motors.halamotor.view.fragments.fragmentInSaidShowItemDetails.userAds.FragmentUserAds;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.functions.Functions.replace;

public class FragmentSimilarItems extends Fragment {

    public FragmentSimilarItems(){}

    String categoryStr,itemIDStr,personOrGalleryStr,userID,userName,category;
    DBHelper myDB;
    View view;

    SimilarNeeded similarNeeded;
    FragmentUserAds fragmentUserAds = new FragmentUserAds();
    FragmentSuggestedAds fragmentSuggestedAds = new FragmentSuggestedAds();
    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            categoryStr = getArguments().getString("category");
            categoryStr = replace(categoryStr);
            itemIDStr = getArguments().getString("itemID");
            userID = getArguments().getString("userID");
            personOrGalleryStr = getArguments().getString("peronOrGallery");
            userName = getArguments().getString("userName");
            category = getArguments().getString("category");

            similarNeeded = (SimilarNeeded) getArguments().getParcelable("similarNeeded");
//            categoryStr = "Car_For_Exchange";
        }
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_selected_suggested, container, false);
        intiUserAds();
        intiSuggestedAds();
        return view;
    }

    private void intiUserAds() {
        Bundle bundle = new Bundle();
        bundle.putString("userID", userID);
        bundle.putString("userName", userName);
        fragmentUserAds.setArguments(bundle);

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_fragment_user_ads, fragmentUserAds)
                .commit();
    }

    private void intiSuggestedAds() {
        Bundle bundle = new Bundle();
        bundle.putString("userID", userID);
        bundle.putString("category", category);
        bundle.putString("itemID", itemIDStr);
        bundle.putParcelable("similarNeeded", similarNeeded);
        fragmentSuggestedAds.setArguments(bundle);

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_fragment_suggested_ads, fragmentSuggestedAds)
                .commit();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getDataBaseInstance(getActivity()).deleteSimilarAds();
    }

}
