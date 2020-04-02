package com.cars.halamotor.view.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.SimilarItem;
import com.cars.halamotor.model.SuggestedItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterSimilarAds extends RecyclerView.Adapter<AdapterSimilarAds.ViewHolder>{

    private final Context context;
    public ArrayList<SimilarItem> similarAdsArrayL ;

    public AdapterSimilarAds
            (Context context, ArrayList<SimilarItem> similarAdsArrayL)
    {   this.context = context;
        this.similarAdsArrayL = similarAdsArrayL;
    }

    public AdapterSimilarAds.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_similar_ads, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterSimilarAds.ViewHolder holder, final int position) {
        //holder.filterContentTV.setText(filterContentArrayL.get(position));
        //holder.filterContentTV.setTypeface(Functions.changeFontGeneral(context));
        fillImage(context,holder,position);
    }

    private void fillImage(Context context, ViewHolder holder, int position) {
        Picasso.with(context).load(similarAdsArrayL.get(position).getItemImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return similarAdsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView filterContentTV;
        ImageView itemImage;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image_iv);
        }
    }

}