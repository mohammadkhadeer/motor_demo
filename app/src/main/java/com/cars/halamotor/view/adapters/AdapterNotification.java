package com.cars.halamotor.view.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.NotificationComp;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.functions.NotificationFunctions.processName;

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
        Picasso.with(context)
                .load(notificationCompsArrayL.get(position).getProcessImage())
                .config(Bitmap.Config.RGB_565)
                .fit().centerCrop()
                .into(holder.processIV);

    }

    private void actionListenerToNotification(final Context context, final ViewHolder holder, final int position) {
        holder.coverRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataBaseInstance(context).updateNotification(notificationCompsArrayL.get(position).getItemServerID(),"1");
                holder.coverRL.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite));
            }
        });
    }

    private void fillTextHeadAndDes(Context context, int position, ViewHolder holder) {
        holder.notificationTitleTV.setText(notificationCompsArrayL.get(position).getNotificationTitle());
        String notificationDes = null;

        if (notificationCompsArrayL.get(position).getInOrOut().equals("out"))
            notificationDes = context.getResources().getString(R.string.ur_product) +" "+ notificationCompsArrayL.get(position).getNotificationTitle() +" " +context.getResources().getString(R.string.live);
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