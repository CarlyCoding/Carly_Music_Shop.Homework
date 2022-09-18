package Stocktaking;


import Instruments.Instrument;
import Interfaces.iSell;

import java.util.ArrayList;

public class Shop {

    private ArrayList <iSell> shopStock;
    private String name;
    private double till;


    public Shop(String name, double till){
        this.name = name;
        this.till = till;
        this.shopStock = new ArrayList<iSell>();
    }

    public String getName(){
        return name;
    }

    public double getTill(){
        return till;
    }


    public void addToStock(iSell item){
        this.shopStock.add(item);
    }

    public void removeFromStock(iSell item){
        this.shopStock.remove(item);
    }

    public int getStockCount(){
        return this.shopStock.size();
    }


}
