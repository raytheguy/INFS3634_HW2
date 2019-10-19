package com.example.homework2borger;

import java.util.ArrayList;

//class is to record the orders into an Array
public class Order {

static public ArrayList<Integer> itemId = new ArrayList<Integer>();
static public ArrayList<Double> itemPrice = new ArrayList<Double>();
static public ArrayList<Integer> itemAmount = new ArrayList<Integer>();
static public ArrayList<Double> itemArrayTotal = new ArrayList<Double>();
//create an array to hold the number of items ordered
static public int[] numberOfItems = new int[FoodDatabase.getAllFood().size()];

    public Order() {
    }

    public static ArrayList<Integer> getItemId() {
        return itemId;
    }

    public static void setItemId(ArrayList<Integer> itemId) {
        Order.itemId = itemId;
    }

    public static ArrayList<Double> getItemPrice() {
        return itemPrice;
    }

    public static void setItemPrice(ArrayList<Double> itemPrice) {
        Order.itemPrice = itemPrice;
    }

    public static ArrayList<Integer> getItemAmount() {
        return itemAmount;
    }

    public static void setItemAmount(ArrayList<Integer> itemAmount) {
        Order.itemAmount = itemAmount;
    }
}
