package Instruments;

import Interfaces.iPlay;

public class Drums extends Instrument implements iPlay {

    private String drumType;
    private String drumSize;

    public Drums(String brand, String family, String colour, String sound, double buy, double sell, String drumType, String drumSize) {
        super(brand, family, colour, sound, buy, sell);
        this.drumType = drumType;
        this.drumSize = drumSize;
    }

    public String getDrumType(){
        return drumType;
    }

    public String getDrumSize(){
        return drumSize;
    }


}
