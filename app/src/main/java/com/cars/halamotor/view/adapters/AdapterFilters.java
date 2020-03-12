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

public class AdapterFilters extends RecyclerView.Adapter<AdapterFilters.ViewHolder>{

    private final Context context;
    public ArrayList<String> filterContentArrayL ;
    String fromWhereCome;

    public AdapterFilters
            (Context context, ArrayList<String> filterContentArrayL
            ,String fromWhereCome)
    {   this.context = context;
        this.filterContentArrayL = filterContentArrayL;
        this.fromWhereCome = fromWhereCome;
    }

    public AdapterFilters.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_filter_content, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterFilters.ViewHolder holder, final int position) {
        holder.filterContentTV.setText(filterContentArrayL.get(position));
        holder.filterContentTV.setTypeface(Functions.changeFontGeneral(context));
    }

    @Override
    public int getItemCount() {
        return filterContentArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView filterContentTV;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            filterContentTV = (TextView) itemView.findViewById(R.id.adapter_filter_content_text_view);
        }
    }

}