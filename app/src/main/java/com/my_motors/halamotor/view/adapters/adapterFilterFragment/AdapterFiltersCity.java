package com.my_motors.halamotor.view.adapters.adapterFilterFragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.CityModel;

import java.util.ArrayList;

public class AdapterFiltersCity extends RecyclerView.Adapter<AdapterFiltersCity.ViewHolder>{

    PassCity passCity;
    private final Context context;
    public ArrayList<CityModel> filterContentArrayL ;
    String fromWhereCome;
    //Neighborhood

    public AdapterFiltersCity
            (Context context, ArrayList<CityModel> filterContentArrayL
            ,String fromWhereCome,PassCity passCity)
    {   this.context = context;
        this.filterContentArrayL = filterContentArrayL;
        this.fromWhereCome = fromWhereCome;
        this.passCity = passCity;
    }

    public AdapterFiltersCity.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_filter_content, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterFiltersCity.ViewHolder holder, final int position) {
        holder.filterContentTV.setText(filterContentArrayL.get(position).getCity());
        holder.filterContentTV.setTypeface(Functions.changeFontGeneral(context));
        actionListenerToCardView(context,position,holder);
    }

    private void actionListenerToCardView(Context context, final int position, ViewHolder holder) {
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passCity.onCityClicked(filterContentArrayL.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return filterContentArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView filterContentTV;
        RelativeLayout relativeLayout;
        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            filterContentTV = (TextView) itemView.findViewById(R.id.adapter_filter_content_text_view);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.coverRL);
        }
    }

    public interface PassCity {
        void onCityClicked(CityModel cityModel);
    }

}