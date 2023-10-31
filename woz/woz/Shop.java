//Print out tabel of tools/items to buy
import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> shopItems = new ArrayList<Item>();



    public void listShopItems(){
        for(int i=0;i<shopItems.size();i++){
            System.out.println(shopItems.get(i).getItemName());
        }
    }

    public ArrayList<Item> getShopItems(){
        return shopItems;
    }


}
