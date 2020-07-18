package com.cars.halamotor.view.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.SuggestedItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterInsurance extends RecyclerView.Adapter<AdapterInsurance.ViewHolder>{

    private final Context context;
    public ArrayList<String> insuranceArrayL ;

    public AdapterInsurance
            (Context context, ArrayList<String> insuranceArrayL
            )
    {   this.context = context;
        this.insuranceArrayL = insuranceArrayL;
    }

    public AdapterInsurance.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_insurance_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterInsurance.ViewHolder holder, final int position) {

        holder.insuranceTV.setText(insuranceArrayL.get(position));
        fillImage(holder,position,context);
    }



    private void fillImage(final ViewHolder holder, int position, Context context) {

        if (position ==0)
        {
            Picasso.get()
                    .load(R.drawable.aman_co)
                    .fit()
                    .centerCrop()
                    .into(holder.insuranceImage);
        }
        if (position ==1)
        {
            Picasso.get()
                    .load(R.drawable.methaq_co)
                    .fit()
                    .centerCrop()
                    .into(holder.insuranceImage);
        }
        if (position ==2)
        {
            Picasso.get()
                    .load(R.drawable.takaful_co)
                    .fit()
                    .centerCrop()
                    .into(holder.insuranceImage);
        }
        if (position ==3)
        {
            Picasso.get()
                    .load(R.drawable.takaful_co)
                    .fit()
                    .centerCrop()
                    .into(holder.insuranceImage);
        }

    }


    @Override
    public int getItemCount() {
        return insuranceArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView insuranceImage;
        TextView insuranceTV;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            insuranceTV = (TextView) itemView.findViewById(R.id.t1);
            insuranceImage = (ImageView) itemView.findViewById(R.id.image) ;
        }
    }

}