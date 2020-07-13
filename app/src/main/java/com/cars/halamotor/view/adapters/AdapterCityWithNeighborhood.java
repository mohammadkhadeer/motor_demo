package com.cars.halamotor.view.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import com.cars.halamotor.view.activity.SplashScreen;
import com.cars.halamotor.view.activity.selectAddress.SelectCityAndNeighborhood;

import java.util.ArrayList;

import static com.cars.halamotor.fireBaseDB.UpdateFireBase.updateCityNeighborhood;
import static com.cars.halamotor.functions.Functions.check;
import static com.cars.halamotor.sharedPreferences.AddressSharedPreferences.saveUserInfoInSP;

public class AdapterCityWithNeighborhood extends RecyclerView.Adapter<AdapterCityWithNeighborhood.ViewHolder>{

    private final Context context;
    public ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayL ;
    String whereComeFrom;
    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;

    public AdapterCityWithNeighborhood
            (Context context
                    ,ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayL
                    ,String whereComeFrom)
                {
                    this.context = context;
                    this.cityWithNeighborhoodsArrayL = cityWithNeighborhoodsArrayL;
                    this.whereComeFrom = whereComeFrom;
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
                if (whereComeFrom.equals("fragment"))
                {
                 backToSelectCityFragment(holder,position);   
                }
                if (whereComeFrom.equals("activity"))
                {
                    //saveCityAndNeighborhoodInSPAndUpdateInServer(position);

//                    String city = cityWithNeighborhoodsArrayL.get(position).getCityStr();
//                    String neighborhood = cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStr();
//                    String cityS = cityWithNeighborhoodsArrayL.get(position).getCityStrS();
//                    String neighborhoodS = cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStrS();

                    Intent intent = new Intent();

                    intent.putExtra("city", cityWithNeighborhoodsArrayL.get(position).getCityStr());
                    intent.putExtra("nei", cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStr());
                    intent.putExtra("cityS", cityWithNeighborhoodsArrayL.get(position).getCityStrS());
                    intent.putExtra("neiS", cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStrS());

                    ((Activity)context).setResult(Activity.RESULT_OK, intent);
                    ((Activity)context).finish();
                }
            }
        });
    }

    private void saveCityAndNeighborhoodInSPAndUpdateInServer(int position) {
        String city = cityWithNeighborhoodsArrayL.get(position).getCityStr();
        String neighborhood = cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStr();
        String cityS = cityWithNeighborhoodsArrayL.get(position).getCityStrS();
        String neighborhoodS = cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStrS();
        saveUserInfoInSP(context,sharedPreferences,editor,city
        ,neighborhood,cityS,neighborhoodS);
        updateCityNeighborhood(context,cityS,neighborhoodS);
    }

    private void backToSelectCityFragment(ViewHolder holder, int position) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("city", cityWithNeighborhoodsArrayL.get(position).getCityStr());
        resultIntent.putExtra("nei", cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStr());
        resultIntent.putExtra("cityS", cityWithNeighborhoodsArrayL.get(position).getCityStrS());
        resultIntent.putExtra("neiS", cityWithNeighborhoodsArrayL.get(position).getNeighborhoodStrS());
        ((Activity)context).setResult(Activity.RESULT_OK, resultIntent);
        ((Activity)context).finish();
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