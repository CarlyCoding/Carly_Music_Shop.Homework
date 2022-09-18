package Stocktaking;

import Interfaces.iSell;

public class Plectrum extends Stock {

    private String colour;
    public Plectrum(String stockItemDescription, double priceBought, double priceSold, String colour) {
        super(stockItemDescription, priceBought, priceSold);
        this.colour = colour;
    }


    public String getColour(){
        return colour;
    }


}
