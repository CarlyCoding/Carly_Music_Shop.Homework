package Instruments;

import Interfaces.iPlay;

public class Piano extends Instrument implements iPlay {

    public String type;
    public Piano(String brand, String family, String colour, String sound, double buy, double sell, String type) {
        super(brand, family, colour, sound, buy, sell);
        this.type = type;
    }

//    This type will be not family but type of piano eg. Grand, Upright etc.
    public String getType(){
        return type;
    }
}
