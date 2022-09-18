package Stocktaking;

import Interfaces.iSell;

public abstract class Stock implements iSell {

    private String stockItemDescription;
    private double priceBought;
    private double priceSold;

    public Stock(String stockItemDescription, double priceBought, double priceSold){
        this.stockItemDescription = stockItemDescription;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getStockItemDescription(){
        return stockItemDescription;
    }

    public double getPriceBought(){
        return priceBought;
    }

    public double getPriceSold(){
        return priceSold;
    }


    public double calculateMarkup() {
        return (getPriceSold() - getPriceBought());
    }

}
