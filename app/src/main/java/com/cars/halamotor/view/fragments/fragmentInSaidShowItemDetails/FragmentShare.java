package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;

public class FragmentShare extends Fragment {

    public FragmentShare(){}

    String test;
    View view;
    RelativeLayout fb_RL,twitter_RL,whatsApp_RL,messages_RL,email_RL;
    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            test = getArguments().getString("category");
        }
        super.onAttach(context);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_selected_share, container, false);
        Log.i("TAG","********");
        Log.i("TAG",test);
        inti();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void inti() {
        fb_RL = (RelativeLayout) view.findViewById(R.id.share_fb_RL);
        twitter_RL = (RelativeLayout) view.findViewById(R.id.share_t_RL);
        whatsApp_RL = (RelativeLayout) view.findViewById(R.id.share_wa_RL);
        messages_RL = (RelativeLayout) view.findViewById(R.id.share_m_RL);
        email_RL = (RelativeLayout) view.findViewById(R.id.share_email_RL);
    }
}
