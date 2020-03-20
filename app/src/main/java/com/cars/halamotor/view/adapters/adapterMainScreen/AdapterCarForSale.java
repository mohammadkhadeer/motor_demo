package com.cars.halamotor.view.adapters.adapterMainScreen;

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
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.SuggestedItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterCarForSale extends RecyclerView.Adapter<AdapterCarForSale.ViewHolder>{

    private final Context context;
    public ArrayList<CCEMTFirestCase> carForSaleArrayL ;
    String fromWhereCome;

    public AdapterCarForSale
            (Context context, ArrayList<CCEMTFirestCase> carForSaleArrayL
            ,String fromWhereCome)
    {   this.context = context;
        this.carForSaleArrayL = carForSaleArrayL;
        this.fromWhereCome = fromWhereCome;
    }

    public AdapterCarForSale.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_for_sale, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarForSale.ViewHolder holder, final int position) {
        makeAllTextViewVISIBLE(holder);
        fillImage(holder, position, context);
        fillPriceAndTitleAndUserName(holder, position, context);
        changeFont(context, holder);
        fillNumberOfImageAndNumberOfComment(holder, position);
        checkTypeAndFillTypeDetails(context,holder,position);
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
        fillCarDetails(position, holder);
    }

    private void fillPriceAndTitleAndUserName(ViewHolder holder, int position, Context context) {
        holder.itemPriceTV.setText(carForSaleArrayL.get(position).getItemPrice()
        +" "+context.getResources().getString(R.string.price_contry));
        holder.itemTitleTV.setText(carForSaleArrayL.get(position).getItemName());
        holder.userNameTV.setText(carForSaleArrayL.get(position).getItemUserName());
    }

    private void fillCarDetails(int position, ViewHolder holder) {
        holder.text1.setText(carForSaleArrayL.get(position).getItemCarMake());
        holder.text2.setText(carForSaleArrayL.get(position).getItemCarYeay());
        holder.text3.setText(carForSaleArrayL.get(position).getItemCarCondition());
        holder.text4.setText(carForSaleArrayL.get(position).getItemCarKilometers());
        holder.itemCityTV.setText(carForSaleArrayL.get(position).getItemCity());

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
        holder.numberOfCommentTV.setText(carForSaleArrayL.get(position).getItemNumberOfComments());
        holder.numberOfImageTV.setText(carForSaleArrayL.get(position).getItemNumberOfImage());
    }

    private void fillImage(final ViewHolder holder, int position, Context context) {

        Picasso.with(context).load(carForSaleArrayL.get(position).getItemImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.itemImage);

        Picasso.with(context).load(carForSaleArrayL.get(position).getItemUserImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.userImage);
    }


    @Override
    public int getItemCount() {
        return carForSaleArrayL.size();
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
            numberOfImageTV = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_number_of_item_image);
            userImage = (ImageView) itemView.findViewById(R.id.adapter_car_for_sale_item_user_image);
            numberOfCommentTV = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_number_of_item_comment);
            itemImage = (ImageView) itemView.findViewById(R.id.adapter_car_for_sale_image_view);
            
            text1 = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_text1);
            text2 = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_text2);
            text3 = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_text3);
            text4 = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_text4);
            itemCityTV = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_city);

            itemTitleTV = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_car_title);
            itemPriceTV = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_car_price);
            userNameTV = (TextView) itemView.findViewById(R.id.adapter_car_for_sale_item_user_name);
        }
    }

}