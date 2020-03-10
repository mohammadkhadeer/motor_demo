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
            if (suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.car_for_sale))
                    ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.car_for_rent))
                    ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.exchange_car))
                    ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.motorcycle))
                    ||suggestedItemsArrayL.get(position).getItemType().equals(context.getResources().getString(R.string.trucks))
            )
            fillImage(holder,position,context);
            fillPriceAndTitle(holder,position,context);
            changeFont(context,holder);
            fillNumberOfImageAndNumberOfComment(holder,position);
            fillCarDetails(position,holder);

        }

    }

    private void fillPriceAndTitle(ViewHolder holder, int position,Context context) {
        holder.itemPriceTV.setText(suggestedItemsArrayL.get(position).getItemPrice()
        +" "+context.getResources().getString(R.string.price_contry));
        holder.itemTitleTV.setText(suggestedItemsArrayL.get(position).getItemName());
    }

    private void fillCarDetails(int position, ViewHolder holder) {
        holder.carMakeTV.setText(suggestedItemsArrayL.get(position).getItemCarMake());
        holder.carModelTV.setText(suggestedItemsArrayL.get(position).getItemCarModel());
        holder.carYearTV.setText(suggestedItemsArrayL.get(position).getItemCarYear());
        holder.carConditionTV.setText(suggestedItemsArrayL.get(position).getItemCarCondition());
        holder.carKilometersTV.setText(suggestedItemsArrayL.get(position).getItemCarKilometers());
        holder.carLicenseTV.setText(suggestedItemsArrayL.get(position).getItemCarLicense());
        holder.carInsuranceTV.setText(suggestedItemsArrayL.get(position).getItemCarInsurance());
        holder.carTransmissionTV.setText(suggestedItemsArrayL.get(position).getItemCarTransmission());
        holder.carPaymentMethodTV.setText(suggestedItemsArrayL.get(position).getItemCarPaymentMethod());
        holder.carFuelTV.setText(suggestedItemsArrayL.get(position).getItemCarFuel());
    }

    private void changeFont(Context context, ViewHolder holder) {
        holder.numberOfImageTV.setTypeface(Functions.changeFontGeneral(context));
        holder.numberOfCommentTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carMakeTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carModelTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carYearTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carConditionTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carKilometersTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carLicenseTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carInsuranceTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carTransmissionTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carPaymentMethodTV.setTypeface(Functions.changeFontGeneral(context));
        holder.carFuelTV.setTypeface(Functions.changeFontGeneral(context));
        holder.itemPriceTV.setTypeface(Functions.changeFontBold(context));
        holder.itemTitleTV.setTypeface(Functions.changeFontBold(context));
    }

    private void fillNumberOfImageAndNumberOfComment(ViewHolder holder, int position) {
        holder.numberOfCommentTV.setText(suggestedItemsArrayL.get(position).getItemNumberOfComment());
        holder.numberOfImageTV.setText(suggestedItemsArrayL.get(position).getItemNumberOfImage());
    }

    private void fillImage(final ViewHolder holder, int position, Context context) {

        Picasso.with(context).load(suggestedItemsArrayL.get(position).getItemImage())
                .fit()
                .centerCrop()
                .into(holder.itemImage);

        Picasso.with(context).load(suggestedItemsArrayL.get(position).getUserImage())
                .fit()
                .centerCrop()
                .into(holder.userImage);
    }


    @Override
    public int getItemCount() {
        return suggestedItemsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage,userImage;
        TextView numberOfImageTV,numberOfCommentTV,carMakeTV,carModelTV,carYearTV,carConditionTV
                ,carKilometersTV,carLicenseTV,carInsuranceTV,carTransmissionTV
                ,carPaymentMethodTV,carFuelTV,itemTitleTV,itemPriceTV;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            numberOfImageTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_number_of_item_image);
            userImage = (ImageView) itemView.findViewById(R.id.adapter_suggested_item_user_image);
            numberOfCommentTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_number_of_item_comment);
            itemImage = (ImageView) itemView.findViewById(R.id.adapter_suggested_item_image_view) ;
            carMakeTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_make);
            carModelTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_model);
            carYearTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_year);
            carConditionTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_condition);
            carKilometersTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_kilometers);
            carLicenseTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_license);
            carInsuranceTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_insurance);
            carTransmissionTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_transmission);
            carPaymentMethodTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_paymentMethod);
            carFuelTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_fuel);
            itemTitleTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_title);
            itemPriceTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_price);
        }
    }

}