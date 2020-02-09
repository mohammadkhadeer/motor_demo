package com.cars.halamotor.view.adapters.adapterInCarDetails;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CarOption;

import java.util.ArrayList;

public class AdapterCarOptions extends RecyclerView.Adapter<AdapterCarOptions.ViewHolder>{

    private final Context context;
    public ArrayList<CarOption> carOptionsArrayL ;
    PassOptions passOptions;

    public AdapterCarOptions
            (Context context, ArrayList<CarOption> carOptionsArrayL,PassOptions passOptions)
    {   this.context = context;
        this.carOptionsArrayL = carOptionsArrayL;
        this.passOptions = passOptions;
    }

    public AdapterCarOptions.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_options, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarOptions.ViewHolder holder, final int position) {

        holder.modelTV.setText(carOptionsArrayL.get(position).getCarOptionStr());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passOptions.onOptionClicked(carOptionsArrayL.get(position).getCarOptionStr());
            }
        });
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    @Override
    public int getItemCount() {
        return carOptionsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView modelTV;
        RelativeLayout relativeLayout,relativeLayoutSplit;
        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_options_TV);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_options_container_RL) ;
            relativeLayoutSplit = (RelativeLayout) itemView.findViewById(R.id.adapter_car_options_split_TV) ;
        }
    }

    public interface PassOptions {
        void onOptionClicked(String carFuelStr);
    }

    public void filterList(ArrayList<CarOption> filterdNames) {
        this.carOptionsArrayL = filterdNames;
        notifyDataSetChanged();
    }
}