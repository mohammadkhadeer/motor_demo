package com.my_motors.halamotor.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.model.NotificationComp;
import com.my_motors.halamotor.presnter.OnNewNotification;
import com.my_motors.halamotor.view.adapters.AdapterNotification;

import java.util.ArrayList;

import static com.my_motors.halamotor.dataBase.ReadFunction.getNotificationFromDatabase;

public class FragmentNotification extends Fragment implements OnNewNotification {

    public FragmentNotification(){}
    RecyclerView recyclerView;
    View view;
    AdapterNotification adapterNotification;
    public ArrayList<NotificationComp> notificationCompsArrayL = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_notification, container, false);

        init();
        createRV();
        return view;
    }

    private void createRV() {
        notificationCompsArrayL = getNotificationFromDatabase(getActivity(),35000);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterNotification = new AdapterNotification(getActivity(), notificationCompsArrayL);
        recyclerView.setAdapter(adapterNotification);
    }

    private void init() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_notification_rv);
    }

    @Override
    public void onNewNotification(int newNotification) {
        createRV();
    }
}
