package com.cars.halamotor.view.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class SelectedImageAdapter extends RecyclerView.Adapter<SelectedImageAdapter.ViewHolder>{

    private final Context context;
    public ArrayList<String> imagePath = new ArrayList<String>();


    public SelectedImageAdapter
            (Context context
                    ,ArrayList<String> imagePath
            )
    {
        this.context = context;
        this.imagePath = imagePath;

    }

    public SelectedImageAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_view_selected_image, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SelectedImageAdapter.ViewHolder holder, final int position) {

        Log.i("TAGIMAGEPATH",imagePath.get(position));

        Bitmap bmImg = BitmapFactory.decodeFile(imagePath.get(position));
        holder.imageView.setImageBitmap(bmImg);
    }



    @Override
    public int getItemCount() {
        return imagePath.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.selected_image_IV) ;

        }
    }

}
