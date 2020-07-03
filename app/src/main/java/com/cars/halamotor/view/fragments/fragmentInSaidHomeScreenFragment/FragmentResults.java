package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.FCSFunctions;
import com.cars.halamotor.model.CityModel;
import com.cars.halamotor.model.ItemFilterModel;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.Neighborhood;
import com.cars.halamotor.model.ResultFilter;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.view.adapters.adapterShowFCS.AdapterShowFCSItems;
import com.cars.halamotor.view.adapters.adapterShowFCS.PaginationListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.fireBaseDB.FilterFireStore.filterResult;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.getDataStoreInstance;
import static com.cars.halamotor.functions.FCSFunctions.convertCat;
import static com.cars.halamotor.view.adapters.adapterShowFCS.PaginationListener.PAGE_START;

public class FragmentResults extends Fragment {

    public FragmentResults(){}
    View view;
    Boolean citySelected;
    String city="empty",neighborhoodStr="empty";
    ArrayList<ItemSelectedFilterModel> itemFilterArrayList = new ArrayList<ItemSelectedFilterModel>();
    List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
    List<SuggestedItem> resultItemsArrayListCont = new ArrayList<>();
    ResultFilter resultFilter = null;

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    AdapterShowFCSItems adapterShowFCSItems;

    private int currentPage = PAGE_START;
    private int totalPage = 10;
    private boolean isLastPage = false;
    private boolean isLoading = false;

    DocumentSnapshot lastVisible;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_results, container, false);
        inti();
        createRV();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                actionListenerToRV();
            }
        }, 2200);

        return view;
    }

    public void onCityClicked(CityModel cityModel) {
        citySelected = true;
        city = cityModel.getCityS();
        handelResult();

//        if (!itemFilterArrayList.isEmpty())
//        {
//            resultFilter=filterResult(itemFilterArrayList,0,getActivity(),city,neighborhoodStr);
//            intiRe();
//        }
    }

    public void onCityCanceled(Boolean isCanceled) {
        citySelected = isCanceled;
        handelResult();

//        city="empty";neighborhoodStr="empty";
//        {
//            resultFilter=filterResult(itemFilterArrayList,0,getActivity(),city,neighborhoodStr);
//            intiRe();
//        }
    }

    public void onNeighborhoodClicked(Neighborhood neighborhood) {
        neighborhoodStr = neighborhood.getNeighborhoodS();
        handelResult();

//        {
//            resultFilter=filterResult(itemFilterArrayList,0,getActivity(),city,neighborhoodStr);
//            intiRe();
//        }
    }

    public void onNeighborhoodCanceled(Boolean isCanceled) {
        neighborhoodStr="empty";
        handelResult();

//        {
//            resultFilter=filterResult(itemFilterArrayList,0,getActivity(),city,neighborhoodStr);
//            intiRe();
//        }
    }

    ////////////////////////+++++++++++++++++++
    public void onFilterClicked(ItemFilterModel itemFilterModel, String filterType) {
        itemFilterArrayList.add(new ItemSelectedFilterModel(itemFilterModel.getFilter()
                ,itemFilterModel.getFilterS(),filterType));
        handelResult();
    }

    private void handelResult() {
        resultFilter=filterResult(itemFilterArrayList,0,getActivity(),city,neighborhoodStr);
        reRV();
        intiRe();
        doApiCall(0);
    }

    private void reRV() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recyclerView.setVisibility(View.GONE);
            }
        }, 200);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                actionListenerToRV();
            }
        }, 2200);
    }

    ///////////////////////---------------------
    public void onFilterCanceled() {
        if (itemFilterArrayList.size() != 0)
        {
            itemFilterArrayList.remove(itemFilterArrayList.size()-1);
            if (itemFilterArrayList.size() != 0) {
                resultFilter = filterResult(itemFilterArrayList, 0, getActivity(), city, neighborhoodStr);
                reRV();
                intiRe();
                doApiCall(0);
            }
        }
    }

    public void loadMore(){
        isLoading = true;
        currentPage++;
        getData();
        doApiCall(1);
    }


    private void doApiCall(final int t) {
        resultItemsArrayList = new ArrayList<>();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recyclerView.setVisibility(View.VISIBLE);
                //set t number to check if this first filter if yes set data else clean old data and load new
                if (t ==1)
                {
                    Log.i("TAG","Size doApiCall 1: "+String.valueOf(resultItemsArrayListCont.size()));
                    for (int i =0 ;i<resultItemsArrayListCont.size();i++)
                    {
                        Log.i("TAG","ItemID doApiCall 1: "+resultItemsArrayListCont.get(i).getItemIdInServer());
                    }
                    resultItemsArrayList.addAll(resultItemsArrayListCont);
                    if (currentPage != PAGE_START) adapterShowFCSItems.removeLoading();
                    adapterShowFCSItems.addItems(resultItemsArrayList);
                    if (currentPage < totalPage) {
                        adapterShowFCSItems.addLoading();
                    } else {
                        isLastPage = true;
                    }
                    isLoading = false;
                }else{
                    Log.i("TAG","Size doApiCall 0: "+String.valueOf(resultItemsArrayListCont.size()));
                    for (int i =0 ;i<resultItemsArrayListCont.size();i++)
                    {
                        Log.i("TAG","ItemID: "+resultItemsArrayListCont.get(i).getItemIdInServer());
                    }
                    createRV();
                    currentPage = PAGE_START;
                    resultItemsArrayList.addAll(resultItemsArrayListCont);
                    if (currentPage != PAGE_START) adapterShowFCSItems.removeLoading();
                    adapterShowFCSItems.addItems(resultItemsArrayList);
                    if (currentPage < totalPage) {
                        adapterShowFCSItems.addLoading();
                    } else {
                        isLastPage = true;
                    }
                    isLoading = false;
                }

            }
        }, 2100);
    }
    List<SuggestedItem> fcsItemsArrayList = new ArrayList<>();

    private void getData() {
        fcsItemsArrayList = new ArrayList<>();
        final String category = itemFilterArrayList.get(0).getFilterS();
        final String categoryAfter = convertCat(category);

        resultItemsArrayListCont = new ArrayList<>();

        int x= currentPage-1;
        if (x == PAGE_START)
            lastVisible = resultFilter.getDocumentSnapshotsArrayL().get(resultFilter.getDocumentSnapshotsArrayL().size()-1);

//        if (lastVisible == null)
//        {
//            Log.i("TAG","lastVisible: "+"Null");
//        }else{
//            Log.i("TAG","lastVisible: "+lastVisible);
//        }
        CollectionReference mRef = getDataStoreInstance().collection(categoryAfter);
        mRef.limit(8)
                .startAfter(lastVisible)
                .get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                                                @Override
                                                public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                                                    for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                                                        Log.i("TAG", "New Object " + documentSnapshots);
                                                        fcsItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,category));
                                                        lastVisible = documentSnapshots;
                                                    }
                                                }
                                            }
        ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                resultItemsArrayListCont.addAll(fcsItemsArrayList);

            }
        }, 2000);
    }


    private void createRV() {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapterShowFCSItems = new AdapterShowFCSItems(new ArrayList<SuggestedItem>(),getActivity(),"call");
        recyclerView.setAdapter(adapterShowFCSItems);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.show_result_RV);
    }

    private void intiRe() {
        resultItemsArrayListCont = new ArrayList<>();
        resultItemsArrayListCont = resultFilter.getResultItemsArrayList();
    }

    private void actionListenerToRV() {
//        recyclerView.addOnScrollListener(new PaginationListener(layoutManager) {
//            @Override
//            protected void loadMoreItems() {
////                progressBar.setVisibility(View.VISIBLE);
//                isLoading = true;
//                currentPage++;
//                Log.i("TAG","HERE:* ");
//                getData();
//                doApiCall(1);
//            }
//
//            @Override
//            public boolean isLastPage() {
//                return isLastPage;
//            }
//
//            @Override
//            public boolean isLoading() {
//                return isLoading;
//            }
//        });
    }

}
