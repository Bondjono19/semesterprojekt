
//Print out tabel of tools/items to buy
import java.util.ArrayList;

public class Shop {

    
    public static ArrayList<Item> shopItems = new ArrayList<Item>();

    public Item itemBucket = new Bucket("Bucket",
            "A roughly cylindrical open container with a handle, made of metal. Used to hold and carry liquids.", 5,
            2);
    public Item itemWheelbarrow = new WheelBarrow("Wheelbarrow",
            "A small cart with a single wheel at the front, used typically for carrying loads in building work or gardening.",
            10,
            10);

    public Item itemFiretruck = new Firetruck("Firetruck",
            "A BIG RED FIRETRUCK!!! This bad boy pumps water like crazy.", 30, 50);

    public void listShopItems() {
        for (int i = 0; i < shopItems.size(); i++) {
            System.out.print(" - ");
            System.out.println(shopItems.get(i).getItemName());
        }
    }

    public ArrayList<Item> getShopItems() {
        return shopItems;
    }

    public boolean gg(String itemLookingFor) {
        for (int i = 0; i < shopItems.size(); i++) {
            if (itemLookingFor == shopItems.get(i).getItemName()) {
                return true;
            }
        }
        return false;
    }
}
