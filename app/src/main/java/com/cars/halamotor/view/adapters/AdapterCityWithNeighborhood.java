package com.cars.halamotor.view.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CategoryComp;
import com.cars.halamotor.model.CityWithNeighborhood;

import java.util.ArrayList;

import static com.cars.halamotor.functions.Functions.check;

public class AdapterCityWithNeighborhood extends RecyclerView.Adapter<AdapterCityWithNeighborhood.ViewHolder>{

    private final Context context;
    public ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayL ;

    public AdapterCityWithNeighborhood
            (Context context,ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayL)
                {
                    this.context = context;
                    this.cityWithNeighborhoodsArrayL = cityWithNeighborhoodsArrayL;
                }

    public AdapterCityWithNeighborhood.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_city_with_neighborhood, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCityWithNeighborhood.ViewHolder holder, final int position) {
        holder.textViewCity.setText(cityWithNeighborhoodsArrayL.get(position).getCityStr()+ " , ");
        holder.textViewNeighborhood.setText(cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStr());
        holder.textViewCity.setTypeface(Functions.changeFontBold(context));
        holder.textViewNeighborhood.setTypeface(Functions.changeFontGeneral(context));

        holder.radioRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("city", cityWithNeighborhoodsArrayL.get(position).getCityStr());
                resultIntent.putExtra("nei", cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStr());
                ((Activity)context).setResult(Activity.RESULT_OK, resultIntent);
                ((Activity)context).finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cityWithNeighborhoodsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout radioRL;
        TextView textViewCity,textViewNeighborhood;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewCity = (TextView) itemView.findViewById(R.id.adapter_city_with_neighborhood_city_TV);
            textViewNeighborhood = (TextView) itemView.findViewById(R.id.adapter_city_with_neighborhood_neighborhood_TV) ;
            radioRL = (RelativeLayout) itemView.findViewById(R.id.adapter_city_with_neighborhoodRelative) ;
        }

    }

    public void filterList(ArrayList<CityWithNeighborhood> cityWithNeighborhoods) {
        this.cityWithNeighborhoodsArrayL = cityWithNeighborhoods;
        notifyDataSetChanged();
    }
}