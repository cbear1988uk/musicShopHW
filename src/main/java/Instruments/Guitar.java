package Instruments;

import Interfaces.IMarkUp;
import Interfaces.IPlay;
import enums.guitarType;

public class Guitar extends InstrumentParent implements IMarkUp {

    private guitarType type;
    private String guitarNoises;
    private int numOfStrings;

    public Guitar(guitarType type, int salePrice, int shopPurchasePrice){
        super(salePrice, shopPurchasePrice);
        this.guitarNoises = "dingly ding ding";
        this.numOfStrings = 6;
        this.type = type;
    }

    public String play(){
        return guitarNoises;
    }

    public int getStrings(){
        return numOfStrings;
    }

    public guitarType getType(){
        return type;
    }


}
