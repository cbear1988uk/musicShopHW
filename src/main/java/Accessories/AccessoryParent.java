package Accessories;

public abstract class AccessoryParent {

    private String type;
    private int salePrice;
    private int shopPurchasePrice;
    private DrumStick drumStick;

    public AccessoryParent(String type, int salePrice, int shopPurchasePrice){
        this.type = type;
        this.salePrice = salePrice;
        this.shopPurchasePrice = shopPurchasePrice;
    }

    public String getType() {
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

    public void add(DrumStick drumStick){
        this.drumStick = drumStick;
    }

}
