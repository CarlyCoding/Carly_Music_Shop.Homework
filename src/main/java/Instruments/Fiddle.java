package Instruments;

import Interfaces.iPlay;

public class Fiddle extends Instrument implements iPlay {

    private String fiddleOutfit;
    private String fiddleWood;
    private String fiddleType;
    public Fiddle(String brand, String family, String colour, String sound, double buy, double sell, String fiddleOutfit, String fiddleWood, String fiddleType) {
        super(brand, family, colour, sound, buy, sell);
        this.fiddleOutfit = fiddleOutfit;
        this.fiddleWood = fiddleWood;
        this.fiddleType = fiddleType;

    }

    public String getFiddleOutfit(){
        return fiddleOutfit;
    }

    public String getFiddleWood(){
        return fiddleWood;
    }

    public String getFiddleType(){
        return fiddleType;
    }
}
