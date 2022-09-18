package Instruments;

import Interfaces.iPlay;

public class Guitar extends Instrument implements iPlay {

    private String guitarType;
    private String fretboard;
    private String pickups;
    public Guitar(String brand, String family, String colour, String sound, double buy, double sell, String guitarType, String fretboard, String pickups) {
        super(brand, family, colour, sound, buy, sell);
        this.guitarType = guitarType;
        this.fretboard = fretboard;
        this.pickups = pickups;
    }

    public String getGuitarType(){
        return guitarType;
    }

    public String getFretboard(){
        return fretboard;
    }

    public String getPickups(){
        return pickups;
    }
}
