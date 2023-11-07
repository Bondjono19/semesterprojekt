// Subclass Bucket extends Item. Bucket is the worst out of three items in the game.
// Therefore Bucket will not hold many liters.
// This code can be copy-pasted and adjusted to other Items in the game <-- IMPORTANT
public class Bucket extends Item {
    public Bucket(String itemName, String itemDescription, int itemPrice, int capacity) {
        super(itemName, itemDescription, itemPrice,capacity); //Contructor
    }

}
