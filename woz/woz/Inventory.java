/*This class contains the items that Player picks up,
* or to REMOVE them*/
import java.util.ArrayList;

public class Inventory {


    //-Make ArrayList of items
    ArrayList<Item> itemArrayList= new ArrayList(); //ONLY HAS ACCESS TO ITEM'S METHODS


    // addItem method
    public void addItem(Item item){

    }



    // removeItem method
    public void removeItem(Item item){
    itemArrayList.remove(item); //NO GOOD :)
}



}
