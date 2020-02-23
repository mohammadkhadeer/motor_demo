package com.cars.halamotor.view.activity.selectAddress.expandableList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cars.halamotor.R;
import com.cars.halamotor.model.Neighborhood;
import com.cars.halamotor.view.activity.AddItem;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import java.util.ArrayList;

public class NeighborhoodViewHolder extends ChildViewHolder {

    private TextView neighborhoodTV;
    RelativeLayout relativeLayout;

    public NeighborhoodViewHolder(View itemView) {
        super(itemView);

        neighborhoodTV = (TextView) itemView.findViewById(R.id.neighborhood);
        relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeChilde);
    }

    public void onBind(final Neighborhood subFavorite, ExpandableGroup group, final Context context, final int position) {
        if (subFavorite.getNeighborhood().equals(context.getResources().getString(R.string.can_not_find))){
            neighborhoodTV.setTextColor(Color.BLUE);
            neighborhoodTV.setText(subFavorite.getNeighborhood());
        }
        else{
            relativeLayout.setBackgroundResource(R.drawable.neighborhood_bg);
            neighborhoodTV.setText(subFavorite.getNeighborhood());
        }

        actionListenerToRL(position,context);
    }

    private void actionListenerToRL(final int position, final Context context) {
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundResource(R.drawable.neighborhood_selected_bg);
                checkIfSelectAddressOrNotFound(context);
            }
        });
    }

    private void checkIfSelectAddressOrNotFound(Context context) {
        if (!neighborhoodTV.getText().toString().equals(context.getResources().getString(R.string.can_not_find)))
        {
            Intent intent = new Intent(context, AddItem.class);
            intent.putExtra("test",neighborhoodTV.getText().toString());
            ((Activity)context).finish();
        }else{
            neighborhoodTV.setTextColor(Color.WHITE);
        }
    }

}
