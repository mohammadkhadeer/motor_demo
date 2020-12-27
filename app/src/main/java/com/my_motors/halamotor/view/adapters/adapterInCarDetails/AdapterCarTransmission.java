package com.my_motors.halamotor.view.adapters.adapterInCarDetails;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;

import java.util.ArrayList;

public class AdapterCarTransmission extends RecyclerView.Adapter<AdapterCarTransmission.ViewHolder>{

    private final Context context;
    public ArrayList<String> carTransmissionArrayL ;
    PassTransmission PassTransmission;

    public AdapterCarTransmission
            (Context context, ArrayList<String> carTransmissionArrayL,PassTransmission PassTransmission)
    {   this.context = context;
        this.carTransmissionArrayL = carTransmissionArrayL;
        this.PassTransmission = PassTransmission;
    }

    public AdapterCarTransmission.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_transmission, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarTransmission.ViewHolder holder, final int position) {

        holder.modelTV.setText(carTransmissionArrayL.get(position));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PassTransmission.onTransmissionClicked(carTransmissionArrayL.get(position));
            }
        });
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    @Override
    public int getItemCount() {
        return carTransmissionArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrowIV;
        TextView modelTV;
        RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_transmission_TV);
            arrowIV = (ImageView) itemView.findViewById(R.id.adapter_car_transmission_IV) ;
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_transmission_container_RL) ;
        }
    }

    public interface PassTransmission {
        void onTransmissionClicked(String carTransmissionStr);
    }

    public void filterList(ArrayList<String> filterdNames) {
        this.carTransmissionArrayL = filterdNames;
        notifyDataSetChanged();
    }
}