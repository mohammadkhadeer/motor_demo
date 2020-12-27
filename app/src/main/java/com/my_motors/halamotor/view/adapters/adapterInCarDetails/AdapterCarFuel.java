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
import com.my_motors.halamotor.model.CarFuel;

import java.util.ArrayList;

public class AdapterCarFuel extends RecyclerView.Adapter<AdapterCarFuel.ViewHolder>{

    private final Context context;
    public ArrayList<CarFuel> carFuelArrayL ;
    PassFuel passFuel;

    public AdapterCarFuel
            (Context context, ArrayList<CarFuel> carFuelArrayL,PassFuel passFuel)
    {   this.context = context;
        this.carFuelArrayL = carFuelArrayL;
        this.passFuel = passFuel;
    }

    public AdapterCarFuel.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_fuel, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarFuel.ViewHolder holder, final int position) {

        holder.modelTV.setText(carFuelArrayL.get(position).getCarFuelStr());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFuel.onFuelClicked(carFuelArrayL.get(position));
            }
        });
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    @Override
    public int getItemCount() {
        return carFuelArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrowIV;
        TextView modelTV;
        RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_fuel_TV);
            arrowIV = (ImageView) itemView.findViewById(R.id.adapter_car_fuel_IV) ;
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_fuel_container_RL) ;
        }
    }

    public interface PassFuel {
        void onFuelClicked(CarFuel carFuel);
    }

    public void filterList(ArrayList<CarFuel> filterdNames) {
        this.carFuelArrayL = filterdNames;
        notifyDataSetChanged();
    }
}