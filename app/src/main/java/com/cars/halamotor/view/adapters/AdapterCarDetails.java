package com.cars.halamotor.view.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarDetails;

import java.util.ArrayList;

public class AdapterCarDetails extends RecyclerView.Adapter<AdapterCarDetails.ViewHolder>{

    private final Context context;
    public ArrayList<CarDetails> carDetailsArrayList = new ArrayList<CarDetails>();


    public AdapterCarDetails
            (Context context
                    ,ArrayList<CarDetails> carDetailsArrayList
            )
    {
        this.context = context;
        this.carDetailsArrayList = carDetailsArrayList;
    }

    public AdapterCarDetails.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_details, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarDetails.ViewHolder holder, final int position) {

        holder.titleTV.setText(carDetailsArrayList.get(position).getTitleStr());
        holder.subTitleTV.setText(carDetailsArrayList.get(position).getSubTitleStr());
    }


    @Override
    public int getItemCount() {
        return carDetailsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrowIV;
        TextView titleTV,subTitleTV;
        public ViewHolder(View itemView) {
            super(itemView);
            titleTV = (TextView) itemView.findViewById(R.id.adapter_car_details_titleTV);
            subTitleTV = (TextView) itemView.findViewById(R.id.adapter_car_details_sub_titleTV);
            arrowIV = (ImageView) itemView.findViewById(R.id.adapter_car_details_arrow_IV) ;
        }
    }

}
