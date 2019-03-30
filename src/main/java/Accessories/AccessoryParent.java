package Accessories;

public abstract class AccessoryParent {

    private String type;
    private int salePrice;
    private int shopPurchasePrice;
    private Accessory accessory;

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

    public int  calculateProfit(){
        int markUpPrice = (getShopPurchasePrice() / 2) + getShopPurchasePrice();
        int profit = (markUpPrice - getShopPurchasePrice());
        return profit;
    }

    public void add(Accessory accessory){
        this.accessory = accessory;
    }

}
