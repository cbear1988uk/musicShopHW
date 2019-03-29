package Instruments;

import javax.sound.midi.Instrument;

public abstract class InstrumentParent {

    private String type;
    private int salePrice;
    private int shopPurchasePrice;

    public InstrumentParent(String type, int salePrice, int shopPurchasePrice){
        this.type = type;
        this.salePrice = salePrice;
        this.shopPurchasePrice = shopPurchasePrice;
    }

    public String getType(){
        return type;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int getShopPurchasePrice() {
        return shopPurchasePrice;
    }

    public int markUp(){
        int markUpPrice = (getShopPurchasePrice() / 2) + getShopPurchasePrice();
        return markUpPrice;
    }

}
