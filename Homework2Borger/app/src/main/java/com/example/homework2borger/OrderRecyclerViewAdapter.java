package com.example.homework2borger;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OrderRecyclerViewAdapter extends RecyclerView.Adapter<OrderRecyclerViewAdapter.ViewHolder>{

    //ArrayList of Strings to Hold Imageids
    public ArrayList<Integer> imageIds = new ArrayList<>();
    public Context mContext;
    ArrayList<Integer> myList;
    int uniqueItemsAmt;

    //image view temporarily removed
    public OrderRecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    //inflate the view; same as any recycle adapter, just need to change the id
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_list_recycle, parent, false);
        ViewHolder holder2 = new ViewHolder(myView);
        System.out.println("onCreateViewHolder is called");
        return holder2;
    }

    //changes based on layout
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder2, final int position) {
        //set the item name, price and image
        //image not yet available
        //add 1 to position as food ids start from 1
        System.out.println("!!!!!!!!!!!!!!!!!");
        Set noDupeList = new HashSet(Order.itemId);
        myList = new ArrayList(noDupeList);
        uniqueItemsAmt = myList.size();
        holder2.nameTextView.setText(FoodDatabase.getFoodById(myList.get(position)).getItemName());

        //find the amount of order
        //get the item id inside the array
        //next set the quantity as the amount inside the int array
        int toGoIn = Order.itemId.get(position);
        //since the food items start from 1 but the array starts from 0, we must minus 1
        holder2.quantityTextView.setText(String.valueOf(Order.numberOfItems[toGoIn-1]));

    }

    //get size of the HashSet with no duplicates to see the size of the items
    @Override
    public int getItemCount() {
        Set noDupeList = new HashSet(Order.itemId);
        myList = new ArrayList(noDupeList);
        uniqueItemsAmt = myList.size();
        return uniqueItemsAmt;
    }

    //purpose: holds widgets in memory
    public class ViewHolder extends RecyclerView.ViewHolder {

        //declare everything the ViewHolder holds here (text, price)
        ConstraintLayout layoutMain;
        TextView nameTextView;
        TextView quantityTextView;


        public ViewHolder(@NonNull View v) {
            //super to inherit the View class
            super(v);

            //attach the items to the id
            layoutMain = v.findViewById(R.id.clickableCart);
            nameTextView = v.findViewById(R.id.foodNameCart);
            quantityTextView = v.findViewById(R.id.foodAmtCart);
//Raymond z5161354

        }
}
    }
