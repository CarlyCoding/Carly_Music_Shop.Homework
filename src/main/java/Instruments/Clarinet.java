package Instruments;

import Interfaces.iPlay;

public class Clarinet extends Instrument implements iPlay {

    private String bassType;

    public Clarinet(String brand, String family, String colour, String sound, double buy, double sell, String bassType) {
        super(brand, family, colour, sound, buy, sell);
        this.bassType = bassType;
    }
//Write test for the bass type as all other tests should run as per piano test
    public String getBassType(){
        return bassType;
    }
}
