package Accessories;

import Interfaces.IMarkUp;

public class Accessory extends AccessoryParent implements IMarkUp {

    public Accessory(String type, int salePrice, int shopPurchasePrice){
        super(type, salePrice, shopPurchasePrice);
    }



}
