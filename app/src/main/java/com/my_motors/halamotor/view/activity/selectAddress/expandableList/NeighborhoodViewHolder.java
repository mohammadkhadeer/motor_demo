package com.my_motors.halamotor.view.activity.selectAddress.expandableList;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.my_motors.halamotor.R;
import com.my_motors.halamotor.model.Neighborhood;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import static com.my_motors.halamotor.functions.Functions.check;
import static com.my_motors.halamotor.functions.Functions.convertFromCityToCityS;

public class NeighborhoodViewHolder extends ChildViewHolder {

    private TextView neighborhoodTV;
    RelativeLayout relativeLayout;
    Dialog myDialog;

    public NeighborhoodViewHolder(View itemView) {
        super(itemView);

        neighborhoodTV = (TextView) itemView.findViewById(R.id.neighborhoodChild);
        relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeChild);
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

        actionListenerToRL(position,context,group.getItems().size(),subFavorite.getNeighborhoodS());
    }

    private void actionListenerToRL(final int position, final Context context, final int size, final String neighborhoodS) {
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundResource(R.drawable.neighborhood_selected_bg);
                checkIfSelectAddressOrNotFound(context,size,neighborhoodS);
            }
        });
    }

    private void checkIfSelectAddressOrNotFound(Context context, int size, String neighborhoodS) {
        String city,cityS;
        if (!neighborhoodTV.getText().toString().equals(context.getResources().getString(R.string.can_not_find)))
        {
            city = check(size,context);
            cityS = convertFromCityToCityS(city,context);
            Intent resultIntent = new Intent();
            resultIntent.putExtra("city", city);
            resultIntent.putExtra("nei", neighborhoodTV.getText().toString());
            resultIntent.putExtra("cityS", cityS);
            resultIntent.putExtra("neiS", neighborhoodS);
            ((Activity)context).setResult(Activity.RESULT_OK, resultIntent);
            ((Activity)context).finish();
        }else{
            city = check(size,context);
            cityS = convertFromCityToCityS(city,context);
            myDialog = new Dialog(context);
            Intent resultIntent = new Intent();
            resultIntent.putExtra("city", city);
            resultIntent.putExtra("nei", neighborhoodTV.getText().toString());
            resultIntent.putExtra("cityS",cityS );
            resultIntent.putExtra("neiS", neighborhoodS);
            ((Activity)context).setResult(Activity.RESULT_OK, resultIntent);
            ((Activity)context).finish();
             neighborhoodTV.setTextColor(Color.WHITE);
        }
    }

}
