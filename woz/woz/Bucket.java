// Subclass Bucket extends Item. Bucket is the worst out of three items in the game.
// Therefore Bucket will not hold many liters.
// This code can be copy-pasted and adjusted to other Items in the game <-- IMPORTANT
public class Bucket extends Item {
    public Bucket(String itemName, String itemDescription, int itemPrice) {
        super(itemName, itemDescription, itemPrice); //Contructor

    }

    @Override
    final public void setItemName(String newItemName) { //FINAL cuz why not
        super.setItemName("Bucket");
    }
    @Override
    final public void setItemDescription (String newItemDescription){ //FINAL cuz why not
        super.setItemDescription("A roughly cylindrical open container with a handle," +
                " made of metal. Used to hold and carry liquids.");
    }
    @Override
    final public void setItemPrice (int itemPrice){ //FINAL cuz why not
        super.setItemPrice(0);
    }

}
