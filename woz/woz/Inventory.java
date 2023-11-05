/*This class contains the items that Player picks up,
* or to REMOVE them*/
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Inventory{

    static int maxInvtorySize = 3; // dette 
    //-Make ArrayList of items
    public static ArrayList<Item> itemArrayList= new ArrayList<Item>(); 

    /*Inventory(ArrayList<Item> itemArrayList){
        this.itemArrayList=itemArrayList;
    }*/
    public ArrayList<Item> getInventoryContents(){ //Getter method
        return itemArrayList;
    }


    // addItem method
    public void addItem(Item item){
        if(itemArrayList.size()<=maxInvtorySize){         //If the inventory size is under 3 you can add an item.
            itemArrayList.add(item);}

    }


    // removeItem method
    public void removeItem(Item item){
    if(itemArrayList!=null){
        itemArrayList.remove(item);} //NO GOOD (I think):) Make some command that uses this method same with addItem
    }

    public void newItemtoInventory(){
        addItem(new Bucket("dw","wd",2,2));
    }

}
