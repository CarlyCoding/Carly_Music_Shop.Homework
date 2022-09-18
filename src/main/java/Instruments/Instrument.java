package Instruments;

import Interfaces.iPlay;

public abstract class Instrument implements iPlay {
    private String brand;
    private String family;
    private String colour;
    private String sound;
    private double buy;
    private double sell;

//    Note- After completing the code for this I would amend this by removing buy and sell from here and
//    have them inherited from stock class so that instruments could be easily added and methods not be
//    mixed up.

    public Instrument(String brand, String family, String colour, String sound, double buy, double sell){
        this.brand = brand;
        this.family = family;
        this.colour = colour;
        this.sound = sound;
        this.buy = buy;
        this.sell = sell;
    }

//    Notes for instruments- brand refers to Epiphone, Steinway etc., family refers to woodwind, percussion etc.

    public String playInstrument(){
        return sound;
    }

    public String getBrand(){
        return brand;
    }

    public String getFamily(){
        return family;
    }

    public String getColour(){
        return colour;
    }

    public double getPriceBought(){
        return buy;
    }

    public double getPriceToBeSold(){
        return sell;
    }

}


