package Accessories;

import Interfaces.IMarkUp;

public class DrumStick extends AccessoryParent implements IMarkUp {

    public DrumStick(String type, int salePrice, int shopPurchasePrice){
        super(type, salePrice, shopPurchasePrice);
    }



}
