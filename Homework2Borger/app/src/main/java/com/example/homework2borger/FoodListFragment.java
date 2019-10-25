package com.example.homework2borger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodListFragment extends Fragment {
    public ConstraintLayout top;

    //layout manager
    RecyclerView.LayoutManager layoutManager;

    public FoodListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v2 = inflater.inflate(R.layout.fragment_foodlist, container, false);
        RecyclerView recyclerViewB = v2.findViewById(R.id.recycler_itemlist_view);
        layoutManager = new LinearLayoutManager(getActivity());
        FoodRecyclerViewAdapter adapterBook = new FoodRecyclerViewAdapter(getActivity());
        recyclerViewB.setAdapter(adapterBook);
        recyclerViewB.setLayoutManager(layoutManager);

        return v2;
    }

}
