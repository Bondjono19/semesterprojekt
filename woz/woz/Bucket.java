// Subclass Bucket extends Item. Bucket is the worst out of three items in the game.
// Therefore Bucket will not hold many liters.
// This code can be copy-pasted and adjusted to other Items in the game <-- IMPORTANT
public class Bucket extends Item {
    public Bucket(String itemName, String itemDescription, int itemPrice, int capacity) {
        super(itemName, itemDescription, itemPrice,capacity); //Contructor

    }

    @Override
    public void setItemName(String newItemName) {
        super.setItemName("Bucket");
    }
    @Override
    public void setItemDescription (String newItemDescription){
        super.setItemDescription("A roughly cylindrical open container with a handle," +
                "\n made of metal. Used to hold and carry liquids.");
    }
    @Override
    public void setItemPrice (int itemPrice){
        super.setItemPrice(0);
    }
    public static int getPrice(){
        return 0;
    }
    @Override
    public void setCapacity (int capacity){super.setCapacity(2);}

}
