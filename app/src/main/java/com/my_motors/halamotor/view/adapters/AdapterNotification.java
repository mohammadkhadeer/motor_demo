package com.my_motors.halamotor.view.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.NotificationComp;
import com.my_motors.halamotor.view.activity.AboutUs;
import com.my_motors.halamotor.view.activity.ShowItemDetails;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.functions.NotificationFunctions.processName;

public class AdapterNotification extends RecyclerView.Adapter<AdapterNotification.ViewHolder>{

    private final Context context;
    public ArrayList<NotificationComp> notificationCompsArrayL ;

    public AdapterNotification
            (Context context, ArrayList<NotificationComp> notificationCompsArrayL)
    {   this.context = context;
        this.notificationCompsArrayL = notificationCompsArrayL;
    }

    public AdapterNotification.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_notification, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterNotification.ViewHolder holder, final int position) {
        changeFont(context, holder);
        changeNotificationColorIfUserOpen(position,holder,context);
        fillTextHeadAndDes(context,position,holder);
        fillProcessImageAndUserUserImage(context,holder,position);
        fillProcessName(position,context,holder);
        actionListenerToNotification(context,holder,position);
    }

    private void fillProcessName(int position, Context context, ViewHolder holder) {
        holder.processTV.setText(processName(notificationCompsArrayL.get(position).getProcess(),context));
    }

    private void fillProcessImageAndUserUserImage(Context context, ViewHolder holder, int position) {
        if (notificationCompsArrayL.get(position).getInOrOut().equals("welcome"))
        {
            Picasso.get()
                    .load(R.drawable.logo)
                    .fit()
                    .centerCrop()
                    .into(holder.processIV);
        }else {
            Picasso.get()
                    .load(notificationCompsArrayL.get(position).getProcessImage())
                    .fit()
                    .centerCrop()
                    .into(holder.processIV);
        }

    }

    private void actionListenerToNotification(final Context context, final ViewHolder holder, final int position) {
        holder.coverRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.coverRL.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite));
                if (notificationCompsArrayL.get(position).getInOrOut().equals("welcome"))
                {
                    moveToAboutUs();
                }else{
                    getDataBaseInstance(context).updateNotification(notificationCompsArrayL.get(position).getItemServerID(),"1");
                    transporteToShowItemSelectedDetails(context,position,holder);
                }
            }
        });
    }

    private void moveToAboutUs() {
        Intent intent = new Intent(context, AboutUs.class);
        ((Activity)context).startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void transporteToShowItemSelectedDetails(Context context, int position, ViewHolder holder) {
        String cat =notificationCompsArrayL.get(position).getProcess();
        if (cat.equals("Car_For_Sale"))
        {
            cat = "Car for sale";
        }
        if (cat.equals("Car_For_Rent"))
        {
            cat = "Car for rent";
        }
        if (cat.equals("Car_For_Exchange"))
        {
            cat = "Exchange car";
        }

        if (cat.equals("Plates"))
        {
            cat = "Car plates";
        }
        if (cat.equals("Wheels_Rim"))
        {
            cat = "Wheels rim";
        }
        if (cat.equals("JunkCar"))
        {
            cat = "Junk car";
        }
        Bundle bundle = new Bundle();
        bundle.putString("category",cat);
        bundle.putString("from","not");
        bundle.putString("itemID",notificationCompsArrayL.get(position).getItemServerID());

        Intent intent = new Intent(context, ShowItemDetails.class);
        intent.putExtras(bundle);
        ((Activity)context).startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void fillTextHeadAndDes(Context context, int position, ViewHolder holder) {
        holder.notificationTitleTV.setText(notificationCompsArrayL.get(position).getNotificationTitle());
        String notificationDes = null;

        if (notificationCompsArrayL.get(position).getInOrOut().equals("welcome")) {
            notificationDes = context.getResources().getString(R.string.welcome_notifications);
        }

        if (notificationCompsArrayL.get(position).getInOrOut().equals("out")) {
            notificationDes = context.getResources().getString(R.string.ur_product) + " " + notificationCompsArrayL.get(position).getNotificationTitle() + " " + context.getResources().getString(R.string.live);
        }
        holder.notificationDesTV.setText(notificationDes);
    }

    private void changeNotificationColorIfUserOpen(int position, ViewHolder holder,Context context) {
        if (notificationCompsArrayL.get(position).getOpenOrNotYet().equals("0"))
        {
            holder.coverRL.setBackgroundColor(ContextCompat.getColor(context, R.color.notificationNotOpenYet));
        }else{
            holder.coverRL.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite));
        }
    }

    private void changeFont(Context context, ViewHolder holder) {
        holder.notificationTitleTV.setTypeface(Functions.changeFontBold(context));
        holder.notificationDesTV.setTypeface(Functions.changeFontGeneral(context));
        holder.processTV.setTypeface(Functions.changeFontGeneral(context));
    }

    @Override
    public int getItemCount() {
        return notificationCompsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView processIV;
        TextView notificationTitleTV,notificationDesTV,processTV;
        RelativeLayout coverRL;
        public ViewHolder(View itemView) {
            super(itemView);
            notificationTitleTV = (TextView) itemView.findViewById(R.id.adapter_notification_head_tv);
            notificationDesTV = (TextView) itemView.findViewById(R.id.adapter_notification_des_tv);
            processTV = (TextView) itemView.findViewById(R.id.adapter_notification_process_tv);
            processIV = (ImageView) itemView.findViewById(R.id.adapter_notification_process_iv) ;
            coverRL = (RelativeLayout) itemView.findViewById(R.id.adapter_notification_cover) ;
        }
    }

}