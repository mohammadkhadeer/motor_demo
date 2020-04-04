package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.utils.LinearLayoutThatDetectsSoftKeyboard;

public class FragmentComments extends Fragment implements LinearLayoutThatDetectsSoftKeyboard.Listener{

    public FragmentComments(){}

    String test;
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
        View view = inflater.inflate(R.layout.fragment_item_selected_comment, container, false);
        Log.i("TAG",test);

        return view;
    }

    @Override
    public void onSoftKeyboardShown(boolean isShowing) {
        Log.i("TAG","********");
    }
}
