package com.cars.halamotor.view.adapters.adapterInCarDetails;

import android.content.Context;
import android.os.Handler;
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
import com.cars.halamotor.model.CarOption;

import java.util.ArrayList;

import butterknife.BindView;

public class AdapterCarOptions extends RecyclerView.Adapter<AdapterCarOptions.ViewHolder>{

    private final Context context;
    public ArrayList<CarOption> carOptionsArrayL ;
    public ArrayList<String> carSelectedOptionsArrayL  = new ArrayList<String>();;
    PassOptions passOptions;


    public AdapterCarOptions
            (Context context, ArrayList<CarOption> carOptionsArrayL,PassOptions passOptions)
    {   this.context = context;
        this.carOptionsArrayL = carOptionsArrayL;
        this.passOptions = passOptions;
    }

    public AdapterCarOptions.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_car_options, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterCarOptions.ViewHolder holder, final int position) {

        holder.modelTV.setText(carOptionsArrayL.get(position).getCarOptionStr());
        
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carSelectedOptionsArrayL.isEmpty())
                {
                    carSelectedOptionsArrayL.add(carOptionsArrayL.get(position).getCarOptionStr());

                    holder.imgQueueMultiSelected
                            .setSelected(true);
                    passOptions.onOptionClicked(carOptionsArrayL.get(position).getCarOptionStr());
                    holder.relativeLayoutSplit.setVisibility(View.GONE);
                    reActiveSplit(context, holder);
                }else {
                    int flag =0;

                    for (int i = 0; i < carSelectedOptionsArrayL.size(); i++) {
                        if (carSelectedOptionsArrayL.get(i).equals(carOptionsArrayL.get(position).getCarOptionStr()))
                        {
                            Log.i("TAG carSelectedOArrayL" , carSelectedOptionsArrayL.get(i));
                            Log.i("TAG carOptionsArrayL" , carOptionsArrayL.get(position).getCarOptionStr());

                            Log.i("TAG 0" , "FALS");
                            flag =1;
                            carSelectedOptionsArrayL.remove(i);

                            holder.imgQueueMultiSelected
                                    .setSelected(false);
                            passOptions.onOptionClicked(carOptionsArrayL.get(position).getCarOptionStr());
                            holder.relativeLayoutSplit.setVisibility(View.GONE);
                            reActiveSplit(context, holder);
                        }
                    }

                    if (flag==0) {
                        carSelectedOptionsArrayL.add(carOptionsArrayL.get(position).getCarOptionStr());

                        holder.imgQueueMultiSelected
                                .setSelected(true);
                        passOptions.onOptionClicked(carOptionsArrayL.get(position).getCarOptionStr());
                        holder.relativeLayoutSplit.setVisibility(View.GONE);
                        reActiveSplit(context, holder);
                    }
                }
            }
        });
        
        holder.modelTV.setTypeface(Functions.changeFontGeneral(context));

    }

    private void reActiveSplit(Context context, final ViewHolder holder) {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                holder.relativeLayoutSplit.setVisibility(View.VISIBLE);
            }
        }, 300);
    }

    @Override
    public int getItemCount() {
        return carOptionsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView modelTV;
        RelativeLayout relativeLayout,relativeLayoutSplit,relativeLayoutSelect;
        ImageView imgQueueMultiSelected;

        public ViewHolder(View itemView) {
            super(itemView);
            modelTV = (TextView) itemView.findViewById(R.id.adapter_car_options_TV);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.adapter_car_options_container_RL) ;
            relativeLayoutSplit = (RelativeLayout) itemView.findViewById(R.id.adapter_car_options_split_TV) ;
            relativeLayoutSelect = (RelativeLayout) itemView.findViewById(R.id.adapter_car_options_select_RL) ;
            imgQueueMultiSelected = (ImageView) itemView.findViewById(R.id.imgQueueMultiSelected) ;
        }
    }

    public interface PassOptions {
        void onOptionClicked(String carFuelStr);
    }

    public void filterList(ArrayList<CarOption> filterdNames) {
        this.carOptionsArrayL = filterdNames;
        notifyDataSetChanged();
    }

}