package com.cars.halamotor.view.adapters.adapterShowItemDetails;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.permission.CheckPermission;
import com.cars.halamotor.view.activity.ShowItemDetails;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.cars.halamotor.algorithms.ArrangingLists.checkFavouriteOrNot1;
import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertItemsToFCS;
import static com.cars.halamotor.fireBaseDB.UpdateFireBase.setFavouriteCallSearchOnServer;
import static com.cars.halamotor.functions.Functions.convertCategoryToCategoryS;
import static com.cars.halamotor.functions.NewFunction.callAds;

public class AdapterUserItemLoading extends RecyclerView.Adapter<AdapterUserItemLoading.ViewHolder>{
    String loadedOrDownloading="downloading";

    public AdapterUserItemLoading
            ()
    {
    }

    public AdapterUserItemLoading.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_loading_user_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterUserItemLoading.ViewHolder holder, final int position) {
        AddShineEffect(holder.relativeLayout,holder.shinImageView);
        AddShineEffect(holder.relativeLayout2,holder.shinImageView2);
        AddShineEffect(holder.relativeLayout3,holder.shinImageView3);
        AddShineEffect(holder.relativeLayout4,holder.shinImageView4);
    }

    private void AddShineEffect(final RelativeLayout father, final ImageView child) {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                animationEffect(father,child);
                if (loadedOrDownloading.equals("downloading"))
                    AddShineEffect(father,child);
            }
        }, 400);
    }

    private void animationEffect(RelativeLayout father, ImageView child) {
        Animation animation = new TranslateAnimation(0,
                father.getWidth()+child.getWidth(),0, 0);
        animation.setDuration(550);
        animation.setFillAfter(false);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        child.startAnimation(animation);
    }


    @Override
    public int getItemCount() {
        return 8;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView shinImageView,imageView,shinImageView2,imageView2,shinImageView3,imageView3
                ,shinImageView4,imageView4;
        RelativeLayout relativeLayout,relativeLayout2,relativeLayout3,relativeLayout4;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            shinImageView = (ImageView) itemView.findViewById(R.id.adapter_loading_image_shin);
            imageView = (ImageView) itemView.findViewById(R.id.adapter_loading_image_load);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_loading_image_load_rl);

            shinImageView2 = (ImageView) itemView.findViewById(R.id.adapter_loading_image_shin2);
            imageView2 = (ImageView) itemView.findViewById(R.id.adapter_loading_image_load2);
            relativeLayout2 = (RelativeLayout) itemView.findViewById(R.id.adapter_loading_image_load_rl2);

            shinImageView3 = (ImageView) itemView.findViewById(R.id.adapter_loading_image_shin3);
            imageView3 = (ImageView) itemView.findViewById(R.id.adapter_loading_image_load3);
            relativeLayout3 = (RelativeLayout) itemView.findViewById(R.id.adapter_loading_image_load_rl3);

            shinImageView4 = (ImageView) itemView.findViewById(R.id.adapter_loading_image_shin4);
            imageView4 = (ImageView) itemView.findViewById(R.id.adapter_loading_image_load4);
            relativeLayout4 = (RelativeLayout) itemView.findViewById(R.id.adapter_loading_load_rl4);
        }
    }

}