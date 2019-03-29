package Instruments;

import Interfaces.IPlay;

public class Guitar extends InstrumentParent implements IPlay {

    private String guitarNoises;
    private int numOfStrings;

    public Guitar(String type, int salePrice, int shopPurchasePrice){
        super(type, salePrice, shopPurchasePrice);
        this.guitarNoises = "dingly ding ding";
        this.numOfStrings = 6;
    }

    public String play(){
        return guitarNoises;
    }

    public int getStrings(){
        return numOfStrings;
    }



}
