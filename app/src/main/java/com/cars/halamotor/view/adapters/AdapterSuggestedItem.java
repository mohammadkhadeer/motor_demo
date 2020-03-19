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
import com.cars.halamotor.model.SuggestedItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterSuggestedItem extends RecyclerView.Adapter<AdapterSuggestedItem.ViewHolder>{

    private final Context context;
    public ArrayList<SuggestedItem> suggestedItemsArrayL ;
    String fromWhereCome;

    public AdapterSuggestedItem
            (Context context, ArrayList<SuggestedItem> suggestedItemsArrayL
            ,String fromWhereCome)
    {   this.context = context;
        this.suggestedItemsArrayL = suggestedItemsArrayL;
        this.fromWhereCome = fromWhereCome;
    }

    public AdapterSuggestedItem.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_suggested_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterSuggestedItem.ViewHolder holder, final int position) {
        if (fromWhereCome.equals("suggested_fragment"))
        {
            makeAllTextViewVISIBLE(holder);
            fillImage(holder, position, context);
            fillPriceAndTitleAndUserName(holder, position, context);
            changeFont(context, holder);
            fillNumberOfImageAndNumberOfComment(holder, position);
            checkTypeAndFillTypeDetails(context,holder,position);
        }


    }

    private void makeAllTextViewVISIBLE(ViewHolder holder) {
        //we use this method because some time need to gone some textView
        holder.text1.setVisibility(View.VISIBLE);
        holder.text2.setVisibility(View.VISIBLE);
        holder.text3.setVisibility(View.VISIBLE);
        holder.text4.setVisibility(View.VISIBLE);
        holder.itemCityTV.setVisibility(View.VISIBLE);
    }

    private void checkTypeAndFillTypeDetails(Context context, ViewHolder holder, int position) {
        if (suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.car_for_sale))
                ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.car_for_rent))
                ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.exchange_car))
                ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.motorcycle))
                ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.trucks))
        ) {
            fillCarDetails(position, holder);
        }
        if (suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.car_plates)))
        {
            fillCarPlates(context,position, holder);
        }
        if (suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.wheels_rim)))
        {
            fillWheelsRim(context,position,holder);
        }
        if (suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.accessories)))
        {
            fillAccAndJuck(context,holder,position);
        }
        if (suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.junk_car)))
        {
            fillAccAndJuck(context,holder,position);
        }
    }

    private void fillAccAndJuck(Context context, ViewHolder holder, int position) {
        holder.text1.setText(suggestedItemsArrayL.get(position).getItemCity());
        holder.text2.setVisibility(View.GONE);
        holder.text3.setVisibility(View.GONE);
        holder.text4.setVisibility(View.GONE);
        holder.itemCityTV.setVisibility(View.GONE);
    }

    private void fillWheelsRim(Context context, int position, ViewHolder holder) {
        holder.text1.setText(suggestedItemsArrayL.get(position).getItemCity());
        holder.text2.setText(suggestedItemsArrayL.get(position).getItemWheelsSize());
        holder.text3.setVisibility(View.GONE);
        holder.text4.setVisibility(View.GONE);
        holder.itemCityTV.setVisibility(View.GONE);
    }

    private void fillCarPlates(Context context, int position, ViewHolder holder) {
        holder.text1.setText(suggestedItemsArrayL.get(position).getItemCarPlatesCity());
        holder.text2.setText(suggestedItemsArrayL.get(position).getItemCarPlatesNumber().replace(".0",""));
        if(suggestedItemsArrayL.get(position).getItemCarPlatesSpecial().equals(context.getResources().getString(R.string.special)))
        {
            holder.text3.setText(context.getResources().getString(R.string.special));
        }else{
            holder.text3.setVisibility(View.GONE);
        }
        holder.text4.setVisibility(View.GONE);
        holder.itemCityTV.setText(suggestedItemsArrayL.get(position).getItemCity());
    }

    private void fillPriceAndTitleAndUserName(ViewHolder holder, int position, Context context) {
        holder.itemPriceTV.setText(suggestedItemsArrayL.get(position).getItemPrice()
        +" "+context.getResources().getString(R.string.price_contry));
        holder.itemTitleTV.setText(suggestedItemsArrayL.get(position).getItemName());
        holder.userNameTV.setText(suggestedItemsArrayL.get(position).getUserName());
    }

    private void fillCarDetails(int position, ViewHolder holder) {
        holder.text1.setText(suggestedItemsArrayL.get(position).getItemCarMake());
        holder.text2.setText(suggestedItemsArrayL.get(position).getItemCarYear());
        holder.text3.setText(suggestedItemsArrayL.get(position).getItemCarCondition());
        holder.text4.setText(suggestedItemsArrayL.get(position).getItemCarKilometers());
        holder.itemCityTV.setText(suggestedItemsArrayL.get(position).getItemCity());

    }

    private void changeFont(Context context, ViewHolder holder) {
        holder.numberOfImageTV.setTypeface(Functions.changeFontGeneral(context));
        holder.numberOfCommentTV.setTypeface(Functions.changeFontGeneral(context));
        holder.text1.setTypeface(Functions.changeFontGeneral(context));
        holder.text2.setTypeface(Functions.changeFontGeneral(context));
        holder.text3.setTypeface(Functions.changeFontGeneral(context));
        holder.text4.setTypeface(Functions.changeFontGeneral(context));
        holder.itemCityTV.setTypeface(Functions.changeFontGeneral(context));
        holder.userNameTV.setTypeface(Functions.changeFontGeneral(context));

        holder.itemPriceTV.setTypeface(Functions.changeFontBold(context));
        holder.itemTitleTV.setTypeface(Functions.changeFontBold(context));
    }

    private void fillNumberOfImageAndNumberOfComment(ViewHolder holder, int position) {
        holder.numberOfCommentTV.setText(suggestedItemsArrayL.get(position).getItemNumberOfComment());
        holder.numberOfImageTV.setText(suggestedItemsArrayL.get(position).getItemNumberOfImage());
    }

    private void fillImage(final ViewHolder holder, int position, Context context) {

        Picasso.with(context).load(suggestedItemsArrayL.get(position).getItemImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.itemImage);

        Picasso.with(context).load(suggestedItemsArrayL.get(position).getUserImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.userImage);
    }


    @Override
    public int getItemCount() {
        return suggestedItemsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage,userImage;
        TextView numberOfImageTV,numberOfCommentTV
                , text1, text2, text3
                , text4,itemTitleTV,itemPriceTV,itemCityTV
                ,userNameTV;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            numberOfImageTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_number_of_item_image);
            userImage = (ImageView) itemView.findViewById(R.id.adapter_suggested_item_user_image);
            numberOfCommentTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_number_of_item_comment);
            itemImage = (ImageView) itemView.findViewById(R.id.adapter_suggested_item_image_view);
            
            text1 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text1);
            text2 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text2);
            text3 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text3);
            text4 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text4);
            itemCityTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_city);

            itemTitleTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_title);
            itemPriceTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_price);
            userNameTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_user_name);
        }
    }

}