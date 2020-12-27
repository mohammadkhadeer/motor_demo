package com.my_motors.halamotor.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.CategoryComp;

import java.util.ArrayList;

public class AdapterSelectCategory extends RecyclerView.Adapter<AdapterSelectCategory.ViewHolder>{

    private final Context context;
    public ArrayList<CategoryComp> categoryCompsArrayL ;

    public AdapterSelectCategory
            (Context context,ArrayList<CategoryComp> categoryCompsArryL)
                {
                     this.context = context;
                     this.categoryCompsArrayL = categoryCompsArryL;
                    notifyDataSetChanged();
                }

    public AdapterSelectCategory.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.adapter_select_category, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdapterSelectCategory.ViewHolder holder, final int position) {

        holder.imageView.setBackgroundResource(categoryCompsArrayL.get(position).getImageIdInt());
        holder.textView.setText(categoryCompsArrayL.get(position).getCategoryNameStr());
        holder.textView.setTypeface(Functions.changeFontGeneral(context));
    }

    @Override
    public int getItemCount() {
        return categoryCompsArrayL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        RelativeLayout radioRL;
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.adapter_select_category_NameTV);
            imageView = (ImageView) itemView.findViewById(R.id.adapter_select_category_image_category) ;
            radioRL = (RelativeLayout) itemView.findViewById(R.id.adapter_select_category_radioRelative) ;
        }

    }

    //add this inner class to can access rv from addItem activity
    public static class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
        private OnItemClickListener mListener;

        public interface OnItemClickListener {
            public void onItemClick(View view, int position);

            public void onLongItemClick(View view, int position);
        }

        GestureDetector mGestureDetector;

        public RecyclerItemClickListener(Context context, final RecyclerView recyclerView
                , OnItemClickListener listener) {
            mListener = listener;
            mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && mListener != null) {
                        mListener.onLongItemClick(child, recyclerView.getChildAdapterPosition(child));
                    }
                }
            });
        }

        @Override public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
            View childView = view.findChildViewUnder(e.getX(), e.getY());
            if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
                mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
                return true;
            }
            return false;
        }

        @Override public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) { }

        @Override
        public void onRequestDisallowInterceptTouchEvent (boolean disallowIntercept){}
    }


}