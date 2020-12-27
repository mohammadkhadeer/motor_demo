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
import com.my_motors.halamotor.model.CarInsurance;

import java.util.ArrayList;

public class AdapterCarInsurance extends RecyclerView.Adapter<AdapterCarInsurance.ViewHolder>{

    private final Context context;
    public ArrayList<CarInsurance> carIncenseArrayL ;
    PassIncense passIncense;

    public AdapterCarInsurance
            (Context context, ArrayList<CarInsurance> carIncenseArrayL, PassIncense passIncense)
    {   this.context = context;
        this.carIncenseArrayL = carIncenseArrayL;
        this.passIncense = passIncense;
    }

    public AdapterCarInsurance.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_incense, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarInsurance.ViewHolder holder, final int position) {

        holder.modelTV.setText(carIncenseArrayL.get(position).getCarInsuranceStr());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passIncense.onIncenseClicked(carIncenseArrayL.get(position));
            }
        });
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    @Override
    public int getItemCount() {
        return carIncenseArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrowIV;
        TextView modelTV;
        RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_incense_TV);
            arrowIV = (ImageView) itemView.findViewById(R.id.adapter_car_incense_IV) ;
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_incense_container_RL) ;
        }
    }

    public interface PassIncense {
        void onIncenseClicked(CarInsurance carInsurance);
    }

    public void filterList(ArrayList<CarInsurance> filterdNames) {
        this.carIncenseArrayL = filterdNames;
        notifyDataSetChanged();
    }
}