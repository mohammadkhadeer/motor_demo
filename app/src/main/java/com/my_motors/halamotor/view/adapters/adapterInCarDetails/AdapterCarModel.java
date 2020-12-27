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
import com.my_motors.halamotor.model.CarModel;

import java.util.ArrayList;

public class AdapterCarModel extends RecyclerView.Adapter<AdapterCarModel.ViewHolder>{

    private final Context context;
    public ArrayList<CarModel> carModelArrayL ;
    PassCarModel passCarModel;

    public AdapterCarModel
            (Context context, ArrayList<CarModel> carModelArrayL, PassCarModel passCarModel)
    {   this.context = context;
        this.carModelArrayL = carModelArrayL;
        this.passCarModel = passCarModel;
    }

    public AdapterCarModel.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_model, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarModel.ViewHolder holder, final int position) {

        holder.modelTV.setText(carModelArrayL.get(position).getCarModelStr());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passCarModel.onModeClicked(carModelArrayL.get(position));
            }
        });
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    @Override
    public int getItemCount() {
        return carModelArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrowIV;
        TextView modelTV;
        RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_model_TV);
            arrowIV = (ImageView) itemView.findViewById(R.id.adapter_car_make_image_IV) ;
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_make_container_RL) ;
        }
    }

    public interface PassCarModel {
        void onModeClicked(CarModel carModel);
    }

    public void filterList(ArrayList<CarModel> filterdNames) {
        this.carModelArrayL = filterdNames;
        notifyDataSetChanged();
    }
}