package com.cars.halamotor.view.adapters.adapterShowFCS;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.permission.CheckPermission;
import com.cars.halamotor.view.activity.ShowItemDetails;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertItemsToFCS;
import static com.cars.halamotor.fireBaseDB.UpdateFireBase.setFavouriteCallSearchOnServer;
import static com.cars.halamotor.functions.NewFunction.callAds;

public class AdapterShowFCSItems extends RecyclerView.Adapter<BaseViewHolder> {
  private static final int VIEW_TYPE_LOADING = 0;
  private static final int VIEW_TYPE_NORMAL = 1;
  private boolean isLoaderVisible = false;

  private List<SuggestedItem> suggestedItemsList;
  Context context;

  public AdapterShowFCSItems(List<SuggestedItem> postItems, Context context) {
    this.suggestedItemsList = postItems;
    this.context = context;
  }

  @NonNull
  @Override
  public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

    switch (viewType) {
      case VIEW_TYPE_NORMAL:
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_fcs_items, parent, false));
      case VIEW_TYPE_LOADING:
        return new ProgressHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_loading, parent, false));
      default:
        return null;
    }
  }

  @Override
  public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
    holder.onBind(position);
    switch (getItemViewType(position)) {
      case VIEW_TYPE_NORMAL:

      case VIEW_TYPE_LOADING:

      default:
        break;
    }
  }

  @Override
  public int getItemViewType(int position) {
    if (isLoaderVisible) {
      return position == suggestedItemsList.size() - 1 ? VIEW_TYPE_LOADING : VIEW_TYPE_NORMAL;
    } else {
      return VIEW_TYPE_NORMAL;
    }
  }

  @Override
  public int getItemCount() {
    return suggestedItemsList == null ? 0 : suggestedItemsList.size();
  }

  public void addItems(List<SuggestedItem> postItems) {
    suggestedItemsList.addAll(postItems);
    notifyDataSetChanged();
  }

  public void addLoading() {
    isLoaderVisible = true;
    suggestedItemsList.add(new SuggestedItem());
    notifyItemInserted(suggestedItemsList.size() - 1);
  }

  public void removeLoading() {
    isLoaderVisible = false;
    int position = suggestedItemsList.size() - 1;
    SuggestedItem item = getItem(position);
    if (item != null) {
      suggestedItemsList.remove(position);
      notifyItemRemoved(position);
    }
  }

  public void clear() {
    suggestedItemsList.clear();
    notifyDataSetChanged();
  }

  SuggestedItem getItem(int position) {
    return suggestedItemsList.get(position);
  }

  public class ViewHolder extends BaseViewHolder {
    CardView cardView;
    ImageView itemImage,userImage,fireIV,favoriteIV;
    TextView text1, text2, text3
            , text4,itemTitleTV,itemPriceTV,itemCityTV
            ,userNameTV,itemNewPriceTV,oldPriceTV;
    RelativeLayout text2RL,text3RL,text4RL,itemCityRL,favoriteRL,cardButton,callButtonRL;

    ViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      cardView = (CardView) itemView.findViewById(R.id.adapter_suggested_item_CV);
      userImage = (ImageView) itemView.findViewById(R.id.adapter_suggested_item_user_image);
      fireIV = (ImageView) itemView.findViewById(R.id.adapter_suggested_fire_iv);
      favoriteIV = (ImageView) itemView.findViewById(R.id.adapter_suggested_favorite_iv);
      itemImage = (ImageView) itemView.findViewById(R.id.adapter_suggested_item_image_view);

      text1 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text1);
      text2 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text2);
      text3 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text3);
      text4 = (TextView) itemView.findViewById(R.id.adapter_suggested_item_text4);
      itemCityTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_city);

      text2RL = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_item_container_text2);
      text3RL = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_item_container_text3);
      text4RL = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_item_container_text4);
      itemCityRL = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_item_container_city);
      cardButton = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_item_card_button);

      itemTitleTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_title);
      itemPriceTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_price);
      itemNewPriceTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_new_price);
      oldPriceTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_car_old_price);
      userNameTV = (TextView) itemView.findViewById(R.id.adapter_suggested_item_user_name);

      favoriteRL = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_favorite_rl);
      callButtonRL = (RelativeLayout) itemView.findViewById(R.id.adapter_suggested_call_button);
    }

    protected void clear() {

    }

    public void onBind(int position) {
      super.onBind(position);
      SuggestedItem item = getObject(position);

      makeAllTextViewVISIBLE(text1,text2,text3,text4,itemCityTV,text2RL,text3RL,text4RL,itemCityRL);
      fillImage(itemImage, userImage,position, context);
      fillTitleAndUserName(itemTitleTV,userNameTV, position);
      fillPrice(itemPriceTV,oldPriceTV,fireIV,itemNewPriceTV, position, context);
      changeFont(context,text1,text2,text3,text4,itemCityTV,userNameTV,itemPriceTV,itemTitleTV);
      checkTypeAndFillTypeDetails(context, text1,text2,text3,text4,text2RL,text3RL,text4RL
              ,itemCityTV,itemCityRL, position);
      favoriteIV.setBackgroundResource(R.drawable.selcted_favorite);
//      actionListenerToFavorite(context, holder, position);
      actionListenerToGoShowItemDetails(context, cardButton, position);
      actionListenerToCallButton(context, callButtonRL, position);

    }
  }

  private SuggestedItem getObject(int position){
    SuggestedItem item = suggestedItemsList.get(position);
    return item;
  }

  private void actionListenerToCallButton(final Context context, RelativeLayout callButtonRL, final int position) {
    callButtonRL.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        insertItemsToFCS(getObject(position).getItemIdInServer(),getObject(position).getItemType()
                ,getDataBaseInstance(context),"seen");

        if (CheckPermission.checkPermissionMethodToPhone((Activity) context) == true) {
          setFavouriteCallSearchOnServer(context,getObject(position).getItemIdInServer(),getObject(position).getItemType(),"call");
          callAds(context,getObject(position).getItemUserPhoneNumber());
        }
      }
    });
  }

  private void actionListenerToGoShowItemDetails(final Context context, RelativeLayout cardButton, final int position) {
    cardButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("category",getObject(position).getItemType());
        bundle.putString("from","stu");
        bundle.putString("itemID",getObject(position).getItemIdInServer());

        Intent intent = new Intent(context, ShowItemDetails.class);
        intent.putExtras(bundle);
        ((Activity)context).startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);

      }
    });
  }

  private void checkTypeAndFillTypeDetails(Context context, TextView text1, TextView text2
          , TextView text3, TextView text4, RelativeLayout text2RL, RelativeLayout text3RL
          , RelativeLayout text4RL, TextView itemCityTV, RelativeLayout itemCityRL, int position) {
    if (getObject(position).getItemType().equals("Car for sale")
            ||getObject(position).getItemType().equals("Car for rent")
            ||getObject(position).getItemType().equals("Exchange car")
            ||getObject(position).getItemType().equals("Motorcycle")
            ||getObject(position).getItemType().equals("Trucks")
    ) {
      fillCarDetails(position,text1,text2,text3,text4);
    }
    if (getObject(position).getItemType().equals("Plates"))
    {
      fillCarPlates(context,position,text1,text2,text3,text3RL,text4RL,text4,itemCityTV,itemCityRL);
    }
    if (getObject(position).getItemType().equals("Wheels_Rim"))
    {
      fillWheelsRim(context,position,text1,text2,text3,text4,itemCityTV,text3RL,text4RL,itemCityRL);
    }
    if (getObject(position).getItemType().equals("Accessories"))
    {
      fillAccAndJunk(text1,text2,text3,text4,itemCityTV,text2RL,text3RL,text4RL,itemCityRL,position);
    }
    if (getObject(position).getItemType().equals("Junk car"))
    {
      fillAccAndJunk(text1,text2,text3,text4,itemCityTV,text2RL,text3RL,text4RL,itemCityRL,position);
    }
  }

  private void fillAccAndJunk(TextView text1, TextView text2, TextView text3, TextView text4
          , TextView itemCityTV, RelativeLayout text2RL, RelativeLayout text3RL
          , RelativeLayout text4RL, RelativeLayout itemCityRL, int position) {
    text1.setText(getObject(position).getItemCity());
    text2.setAlpha(0);
    text3.setAlpha(0);
    text4.setAlpha(0);
    itemCityTV.setAlpha(0);

    text2RL.setAlpha(0);
    text3RL.setAlpha(0);
    text4RL.setAlpha(0);
    itemCityRL.setAlpha(0);
  }


  private void fillWheelsRim(Context context, int position, TextView text1, TextView text2
          , TextView text3, TextView text4, TextView itemCityTV, RelativeLayout text3RL
          , RelativeLayout text4RL, RelativeLayout itemCityRL) {
    text1.setText(getObject(position).getItemCity());
    text2.setText(getObject(position).getItemWheelsSize());
    text3.setAlpha(0);
    text4.setAlpha(0);
    itemCityTV.setAlpha(0);

    text3RL.setAlpha(0);
    text4RL.setAlpha(0);
    itemCityRL.setAlpha(0);
  }

  private void fillCarPlates(Context context, int position, TextView text1, TextView text2
          , TextView text3, RelativeLayout text3RL, RelativeLayout text4RL, TextView text4
          , TextView itemCityTV, RelativeLayout itemCityRL) {
    text1.setText(getObject(position).getItemCarPlatesCity());
    text2.setText(getObject(position).getItemCarPlatesNumber().replace(".0",""));
    if(getObject(position).getItemCarPlatesSpecial().equals(context.getResources().getString(R.string.special)))
    {
      text3.setText(context.getResources().getString(R.string.special));
    }else{
      text3.setAlpha(0);
      text3RL.setAlpha(0);
    }
    text4RL.setAlpha(0);
    text4.setAlpha(0);
    itemCityTV.setAlpha(0);
    itemCityRL.setAlpha(0);
    itemCityTV.setText(getObject(position).getItemCity());
  }

  private void fillCarDetails(int position, TextView text1, TextView text2,
                              TextView text3, TextView text4) {
    text1.setText(getObject(position).getItemCarMake());
    text2.setText(getObject(position).getItemCarYear());
    text3.setText(getObject(position).getItemType());
    text4.setText(getObject(position).getItemCarKilometers());
  }

  private void changeFont(Context context, TextView text1, TextView text2, TextView text3
          , TextView text4, TextView itemCityTV, TextView userNameTV
          , TextView itemPriceTV, TextView itemTitleTV) {
    text1.setTypeface(Functions.changeFontGeneral(context));
    text2.setTypeface(Functions.changeFontGeneral(context));
    text3.setTypeface(Functions.changeFontGeneral(context));
    text4.setTypeface(Functions.changeFontGeneral(context));
    itemCityTV.setTypeface(Functions.changeFontGeneral(context));
    userNameTV.setTypeface(Functions.changeFontGeneral(context));

    itemPriceTV.setTypeface(Functions.changeFontGeneral(context));
    itemTitleTV.setTypeface(Functions.changeFontBold(context));
  }

  private void fillPrice(TextView itemPriceTV, TextView oldPriceTV, ImageView fireIV
          , TextView itemNewPriceTV, int position, Context context) {
    if (getObject(position).getItemPostEdit().equals("0"))
    {
      itemPriceTV.setVisibility(View.VISIBLE);
      oldPriceTV.setVisibility(View.GONE);
      fireIV.setVisibility(View.GONE);
      itemPriceTV.setText(getObject(position).getItemPrice()
              +" "+context.getResources().getString(R.string.price_contry));
      itemPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);

      itemNewPriceTV.setText("");
      itemNewPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 12);
    }else{
      itemPriceTV.setVisibility(View.GONE);
      oldPriceTV.setVisibility(View.VISIBLE);

      oldPriceTV.setText(getObject(position).getItemPrice());
      oldPriceTV.setTextColor(context.getResources().getColor(R.color.colorSilver));
      oldPriceTV.setPaintFlags(itemPriceTV.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
      itemNewPriceTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
      itemNewPriceTV.setText(getObject(position).getItemNewPrice()
              +" "+context.getResources().getString(R.string.price_contry));
      itemPriceTV.setText(getObject(position).getItemPrice()
              +" "+context.getResources().getString(R.string.price_contry));
      fireIV.setVisibility(View.VISIBLE);

    }
  }

  private void fillTitleAndUserName(TextView itemTitleTV,TextView userNameTV, int position) {
    itemTitleTV.setText(getObject(position).getItemName());
    userNameTV.setText(getObject(position).getUserName());
  }

  private void fillImage(ImageView itemImage, ImageView userImage,
                         int position, Context context) {

    Picasso.with(context).load(getObject(position).getItemImage())
            .config(Bitmap.Config.RGB_565)
            .fit().centerCrop()
            .into(itemImage);

    Picasso.with(context).load(getObject(position).getUserImage())
            .config(Bitmap.Config.RGB_565)
            .fit().centerCrop()
            .into(userImage);
  }

  private void makeAllTextViewVISIBLE(TextView text1, TextView text2, TextView text3, TextView text4
          , TextView itemCityTV, RelativeLayout text2RL, RelativeLayout text3RL
          , RelativeLayout text4RL, RelativeLayout itemCityRL) {
    //we use this method because some time need to gone some textView
    text1.setAlpha(1);
    text2.setAlpha(1);
    text3.setAlpha(1);
    text4.setAlpha(1);
    itemCityTV.setAlpha(1);

    text2RL.setAlpha(1);
    text3RL.setAlpha(1);
    text4RL.setAlpha(1);
    itemCityRL.setAlpha(1);
  }


  public class ProgressHolder extends BaseViewHolder {
    ProgressHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }

    @Override
    protected void clear() {
    }

    public void onBind(int position) {
      super.onBind(position);
    }
  }

}