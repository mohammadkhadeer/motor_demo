package com.cars.halamotor.view.adapters.adapterInCarDetails;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;

import java.util.ArrayList;

public class AdapterCarLicensed extends RecyclerView.Adapter<AdapterCarLicensed.ViewHolder>{

    private final Context context;
    public ArrayList<String> carLicensedArrayL ;
    PassLicensed passLicensed;

    public AdapterCarLicensed
            (Context context, ArrayList<String> carLicensedArrayL,PassLicensed passLicensed)
    {   this.context = context;
        this.carLicensedArrayL = carLicensedArrayL;
        this.passLicensed = passLicensed;
    }

    public AdapterCarLicensed.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_licensed, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarLicensed.ViewHolder holder, final int position) {

        holder.modelTV.setText(carLicensedArrayL.get(position));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passLicensed.onLicensedClicked(carLicensedArrayL.get(position));
            }
        });
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    @Override
    public int getItemCount() {
        return carLicensedArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrowIV;
        TextView modelTV;
        RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_licensed_TV);
            arrowIV = (ImageView) itemView.findViewById(R.id.adapter_car_licensed_IV) ;
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_licensed_container_RL) ;
        }
    }

    public interface PassLicensed {
        void onLicensedClicked(String carFuelStr);
    }

    public void filterList(ArrayList<String> filterdNames) {
        this.carLicensedArrayL = filterdNames;
        notifyDataSetChanged();
    }
}