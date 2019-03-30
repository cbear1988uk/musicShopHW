package Accessories;

import Interfaces.IMarkUp;
import enums.accessoryType;


public class Accessory extends AccessoryParent implements IMarkUp {

    private accessoryType type;

    public Accessory(accessoryType type, int salePrice, int shopPurchasePrice){
        super(salePrice, shopPurchasePrice);
        this.type = type;
    }

    public accessoryType getType(){
        return type;
    }

}
