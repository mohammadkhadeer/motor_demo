package com.cars.halamotor.view.adapters.adapterMainScreen;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterAccAndJunkFirstCase extends RecyclerView.Adapter<AdapterAccAndJunkFirstCase.ViewHolder>{

    private final Context context;
    public ArrayList<AccAndJunkFirstCase> accAndJunkArrayL;
    String fromWhereCome;

    public AdapterAccAndJunkFirstCase
            (Context context, ArrayList<AccAndJunkFirstCase> accAndJunkArrayL
            ,String fromWhereCome)
    {   this.context = context;
        this.accAndJunkArrayL = accAndJunkArrayL;
        this.fromWhereCome = fromWhereCome;
    }

    public AdapterAccAndJunkFirstCase.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_acc_and_junk, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterAccAndJunkFirstCase.ViewHolder holder, final int position) {
        if (accAndJunkArrayL.get(position).getItemActiveOrNot().equals("1")) {
            fillImage(holder, position, context);
            fillTitleAndUserName(holder, position, context);
            fillPrice(holder, position, context);
            changeFont(context, holder);
            fillNumberOfImageAndNumberOfComment(holder, position);
            fillCarDetails(position, holder);
        }
    }

    private void fillPrice(ViewHolder holder, int position, Context context) {
        if (accAndJunkArrayL.get(position).getItemPostEdit().equals("0"))
        {
            holder.itemPriceTV.setText(accAndJunkArrayL.get(position).getItemPrice()
                    +" "+context.getResources().getString(R.string.price_contry));
            holder.itemPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
            //set new price empty to stay design
            holder.itemNewPriceTV.setText("");
            holder.itemNewPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 12);
        }else{
            holder.itemPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 12);
            //change text color
            holder.itemPriceTV.setTextColor(context.getResources().getColor(R.color.colorSilver));
            //set line above old price
            holder.itemPriceTV.setPaintFlags(holder.itemPriceTV.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

            //change size new price
            holder.itemNewPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);

            holder.itemNewPriceTV.setText(accAndJunkArrayL.get(position).getItemNewPrice()
                    +" "+context.getResources().getString(R.string.price_contry));
            //fill old price
            holder.itemPriceTV.setText(accAndJunkArrayL.get(position).getItemPrice()
                    +" "+context.getResources().getString(R.string.price_contry));
            //VISIBLE fire image view
            holder.fireIV.setVisibility(View.VISIBLE);

        }
    }

    private void fillTitleAndUserName(ViewHolder holder, int position, Context context) {
        holder.itemTitleTV.setText(accAndJunkArrayL.get(position).getItemName());
        holder.userNameTV.setText(accAndJunkArrayL.get(position).getItemUserName());
    }

    private void fillCarDetails(int position, ViewHolder holder) {
        holder.text1.setText(accAndJunkArrayL.get(position).getItemCity());
    }

    private void changeFont(Context context, ViewHolder holder) {
        holder.numberOfImageTV.setTypeface(Functions.changeFontGeneral(context));
        holder.numberOfCommentTV.setTypeface(Functions.changeFontGeneral(context));
        holder.text1.setTypeface(Functions.changeFontGeneral(context));
        holder.userNameTV.setTypeface(Functions.changeFontGeneral(context));

        holder.itemPriceTV.setTypeface(Functions.changeFontBold(context));
        holder.itemTitleTV.setTypeface(Functions.changeFontBold(context));
    }

    private void fillNumberOfImageAndNumberOfComment(ViewHolder holder, int position) {
        holder.numberOfCommentTV.setText(accAndJunkArrayL.get(position).getItemNumberOfComments());
        holder.numberOfImageTV.setText(accAndJunkArrayL.get(position).getItemNumberOfImage());
    }

    private void fillImage(final ViewHolder holder, int position, Context context) {

        Picasso.with(context).load(accAndJunkArrayL.get(position).getItemImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.itemImage);

        Picasso.with(context).load(accAndJunkArrayL.get(position).getItemUserImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.userImage);
    }


    @Override
    public int getItemCount() {
        return accAndJunkArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage,userImage,fireIV;
        TextView numberOfImageTV,numberOfCommentTV
                , text1
                , itemTitleTV,itemPriceTV,itemNewPriceTV
                , userNameTV;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            numberOfImageTV = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_number_of_item_image);
            userImage = (ImageView) itemView.findViewById(R.id.adapter_acc_and_junk_user_image);
            numberOfCommentTV = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_number_of_item_comment);
            itemImage = (ImageView) itemView.findViewById(R.id.adapter_acc_and_junk_image_view);
            fireIV = (ImageView) itemView.findViewById(R.id.adapter_acc_and_junk_fire_iv);

            text1 = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_text1);

            itemTitleTV = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_title);
            itemPriceTV = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_price);
            itemNewPriceTV = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_new_price);
            userNameTV = (TextView) itemView.findViewById(R.id.adapter_acc_and_junk_user_name);

        }
    }

}