package Shop;

import Accessories.AccessoryParent;
import Accessories.DrumStick;
import Instruments.InstrumentParent;
import Interfaces.IMarkUp;
import Interfaces.ISell;

public class Shop extends AccessoryParent implements IMarkUp {

    private String name;
    private int stockCount;
    private DrumStick drumStick;

    public Shop(String name, int stockCount){
        super("Vic Firth",10,6);
        this.name = name;
        this.stockCount = stockCount;
    }

    public String getName() {
        return this.name;
    }

    public DrumStick getDrumStick(){
        return this.drumStick;
    }

    public void add(DrumStick drumStick){
        this.drumStick = drumStick;
    }

    public int getStockCount(){
        return this.stockCount;
    }
    

}
