package com.cars.halamotor.view.adapters.adapterInsurance;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CityModel;
import com.cars.halamotor.model.DriverInformation;

import java.util.ArrayList;

public class AdapterDriverProcess extends RecyclerView.Adapter<AdapterDriverProcess.ViewHolder>{

    PassProcess passProcess;
    private final Context context;
    public ArrayList<DriverInformation> driverProcessArrayL ;
    int allProcessNotCompleted;
    public AdapterDriverProcess
            (Context context, ArrayList<DriverInformation> driverProcessArrayL
            ,int allProcessNotCompleted,PassProcess passProcess)
    {   this.context = context;
        this.driverProcessArrayL = driverProcessArrayL;
        this.allProcessNotCompleted = allProcessNotCompleted;
        this.passProcess = passProcess;
    }

    public AdapterDriverProcess.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_driver_process, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterDriverProcess.ViewHolder holder, final int position) {
        if (allProcessNotCompleted==0)
        {
            fillAllProcessNotCompleted(context,position,holder);
        }else{
            if (driverProcessArrayL.get(position).isProcessStatus()==true)
            {
                //process completed
            }else{
                //process not completed
            }
        }
        actionListenerToCardView(position,holder);
    }

    private void fillAllProcessNotCompleted(Context context, int position, ViewHolder holder) {
        holder.driverProcessTextView.setText(driverProcessArrayL.get(position).getDriverProcess().getProcess());
        holder.driverProcessContentTextView.setText("");
//        holder.driverProcessContentTextView.setText(driverProcessArrayL.get(position).getProcessContent().getProcessContent());
    }

    private void actionListenerToCardView(final int position, ViewHolder holder) {
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passProcess.onProcessClicked(driverProcessArrayL.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return driverProcessArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView driverProcessTextView,driverProcessContentTextView;
        RelativeLayout relativeLayout;
        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            driverProcessTextView = (TextView) itemView.findViewById(R.id.adapter_driver_process_text_view);
            driverProcessContentTextView = (TextView) itemView.findViewById(R.id.adapter_driver_process_content_text_view);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_driver_process_rl);
        }
    }

    public interface PassProcess {
        void onProcessClicked(DriverInformation driverInformation);
    }

}