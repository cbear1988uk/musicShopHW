package Shop;

import Accessories.AccessoryParent;
import Accessories.Accessory;
import Instruments.Guitar;
import Instruments.InstrumentParent;
import Interfaces.IMarkUp;
import Interfaces.ISell;
import enums.accessoryType;

import java.util.ArrayList;

public class Shop extends AccessoryParent implements IMarkUp {

    private String name;
    private int stockCount;
    private Accessory accessory;
    private Guitar guitar;
    private ArrayList<ISell> stock;


    public Shop(String name, int stockCount){
        super(10, 6);
        this.name = name;
        this.stockCount = stockCount;
        stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public Accessory getAccessory(){
        return this.accessory;
    }

    public Guitar getGuitar(){
        return this.guitar;
    }

    public void addAccessory(Accessory accessory){
        this.accessory = accessory;
    }

    public void addGuitar(Guitar guitar){
        this.guitar = guitar;
    }

    public Accessory removeAccessory(){
        return null;
    }

    public Guitar removeGuitar(){
        return null;
    }

    public int getStockCount(){
        return this.stockCount;
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


}
