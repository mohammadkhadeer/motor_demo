package com.cars.halamotor.view.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

        fillImageInImageView(context,holder,position);
        deleteImageActionListener(context,holder,position);
    }

    private void deleteImageActionListener(Context context, ViewHolder holder, final int position) {
        holder.deleteImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeAt(position);
            }
        });
    }

    public void removeAt(int position) {
        imagePath.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, imagePath.size());
    }

    private void fillImageInImageView(Context context, ViewHolder holder, int position) {
        Bitmap bmImg = BitmapFactory.decodeFile(imagePath.get(position));
        BitmapDrawable ob = new BitmapDrawable(context.getResources(), bmImg);
        holder.imageView.setBackground(ob);
    }


    @Override
    public int getItemCount() {
        return imagePath.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        Button deleteImageBtn;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.selected_image_IV) ;
            deleteImageBtn = (Button) itemView.findViewById(R.id.adapter_view_s_delete_imageBtn) ;

        }
    }

}
