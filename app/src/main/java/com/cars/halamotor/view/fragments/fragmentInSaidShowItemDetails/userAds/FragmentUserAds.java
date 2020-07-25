package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.userAds;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.FCSFunctions;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.SimilarNeeded;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.model.UserItem;
import com.cars.halamotor.view.adapters.adapterShowItemDetails.AdapterUserItemLoading;
import com.cars.halamotor.view.adapters.userAds.AdapterShowUserItems;
import com.cars.halamotor.utils.PaginationListenerUser;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServer;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.getDataStoreInstance;
import static com.cars.halamotor.functions.FCSFunctions.convertCat;
import static com.cars.halamotor.functions.FillSimilarNeeded.intiEmptyObject;
import static com.cars.halamotor.functions.NewFunction.handelNumberOfObject;
import static com.cars.halamotor.functions.NewFunction.nowNumberOfObject;

public class FragmentUserAds extends Fragment {

    RecyclerView recyclerView,recyclerViewLoading;
    TextView textView;
    ArrayList<UserItem> itemIDsArrayL= new ArrayList<>();
    public List<SuggestedItem> suggestedItemsArrayListTest;
    public List<SuggestedItem> suggestedItemsArrayListDO;
    public FragmentUserAds(){}

    String userID,userName;
    View view;

    public static final int PAGE_START = 1;
    private int currentPage = PAGE_START;
    private boolean isLastPage = false;
    private int totalPage = 3;
    private boolean isLoading = false;
    int itemCount = 0,itemNotActive=0;
    SimilarNeeded similarNeeded;
    int numberOfObjectNow = 0;
    LinearLayoutManager mLayoutManager;

    AdapterShowUserItems adapterShowUserItems;
    AdapterUserItemLoading adapterUserItemLoading;
    RecyclerView.LayoutManager layoutManagerLoading;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            userID = getArguments().getString("userID");
            userName = getArguments().getString("userName");
        }
        super.onAttach(context);
        similarNeeded = intiEmptyObject();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_user_ads, container, false);
        inti();
        changeFont();
        getUserItemInfoList();
        timer();
        return view;
    }

    private void changeFont() {
        textView.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void createLoadingRV() {
        recyclerViewLoading.setHasFixedSize(true);
        layoutManagerLoading = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        recyclerViewLoading.setLayoutManager(layoutManagerLoading);
        adapterUserItemLoading =new AdapterUserItemLoading();
        recyclerViewLoading.setAdapter(adapterUserItemLoading);
    }

    private void timer() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                prite();
            }
        }, 1000);
    }

    private void prite() {
        if (itemIDsArrayL.size()==0)
        {
            timer();
        }else {
            //number of ads itemIDsArrayL
            if (itemIDsArrayL.size()==1)
            {
                //if user just have one active item and not hot price well show nothing
            }else{
                fillTextView();
                createLoadingRV();
                createRV();
                actionListenerToRV();
            }
        }
    }

    private void fillTextView() {
        String text = userName+" "+getActivity().getResources().getString(R.string.user_ads);
        textView.setText(text);
    }


    private void actionListenerToRV() {
        recyclerView.addOnScrollListener(new PaginationListenerUser(mLayoutManager) {
            @Override
            protected void loadMoreItems() {
                numberOfObjectNow =handelNumberOfObject(numberOfObjectNow,suggestedItemsArrayListTest.size());
                Log.i("TAG","numberOfObjectNow "+String.valueOf(numberOfObjectNow));
                isLoading = true;
                currentPage++;
                getData();
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });
    }
    private void createRV() {
        adapterShowUserItems = new AdapterShowUserItems(new ArrayList<SuggestedItem>(),getActivity(),"call",similarNeeded);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapterShowUserItems);
        getData();
    }
    int loopStart=0;
    private void getData() {
        final List<SuggestedItem> fcsItemsArrayList = new ArrayList<>();
        suggestedItemsArrayListTest = new ArrayList<>();

        int numberOfObject = nowNumberOfObject(numberOfObjectNow,itemIDsArrayL.size());
        if (numberOfObject!=1000) {
            for (int i = 0; i < numberOfObject; i++) {
                loopStart++;
                final String category = convertCat(itemIDsArrayL.get(loopStart).getCategoryS());
                final String categoryBefore = itemIDsArrayL.get(loopStart).getCategoryS();

                DocumentReference mRef = null;
                mRef = getDataStoreInstance().collection(category)
                        .document(itemIDsArrayL.get(loopStart).getItemID());
                mRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
                                Long itemBurnedPrice = (Long) document.getLong("burnedPrice");
                                String itemActiveOrNotT = (String) document.getString("activeOrNotS");
                                if (itemActiveOrNotT.equals("1") && itemBurnedPrice == 0)
                                    fcsItemsArrayList.add(FCSFunctions.handelNumberOfObject(document, categoryBefore));
                                else
                                    itemNotActive = itemNotActive + 1;

                            }
                        }
                    }
                });
            }
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                suggestedItemsArrayListTest.addAll(fcsItemsArrayList);
                doApiCall();
            }
        }, 3000);
    }

    private void doApiCall() {
        suggestedItemsArrayListDO = new ArrayList<>();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                recyclerViewLoading.setVisibility(View.GONE);
                suggestedItemsArrayListDO.addAll(suggestedItemsArrayListTest);
                if (currentPage != PAGE_START) adapterShowUserItems.removeLoading();
                adapterShowUserItems.addItems(suggestedItemsArrayListDO,similarNeeded);
                if (currentPage < totalPage) {
                    adapterShowUserItems.addLoading();
                } else {
                    isLastPage = true;
                }
                isLoading = false;
            }
        }, 100);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.mRecyclerView);
        recyclerViewLoading = (RecyclerView) view.findViewById(R.id.fragment_user_item_loading_rv);
        textView = (TextView) view.findViewById(R.id.fragment_user_ads_more_ads);
    }

    private void getUserItemInfoList() {
        itemIDsArrayL = new ArrayList<>();
        getUserPathInServer(userID)
                .child("usersAds")
                .limitToFirst(500)
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()) {
                            UserItem userItem = dataSnapshot1.getValue(UserItem.class);
                            itemIDsArrayL.add(userItem);
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.i("TAG ERROR", databaseError.toString());
                    }
                });
    }
}
