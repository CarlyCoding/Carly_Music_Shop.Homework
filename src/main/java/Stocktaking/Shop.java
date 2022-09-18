package Stocktaking;


import Instruments.Instrument;
import Interfaces.iSell;

import java.util.ArrayList;

public class Shop implements iSell {

    private ArrayList <Instrument> shopStock;
    private String name;
    private double till;
    private double priceBought;
    private double priceSold;

    public Shop(String name, double till, double priceBought, double priceSold){
        this.name = name;
        this.till = till;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
        this.shopStock = new ArrayList<Instrument>();
    }

    public String getName(){
        return name;
    }

    public double getTill(){
        return till;
    }

    public double getPriceBought(){
        return priceBought;
    }

    public double getPriceSold(){
        return priceSold;
    }


    public double calculateMarkup() {
       return (priceSold - priceBought);
    }
}
