public class Firetruck extends Item{
    public Firetruck(String itemName, String itemDescription, int itemPrice, int capacity) {
        super(itemName, itemDescription, itemPrice, capacity); //Contructor

    }

    @Override
    public void setItemName(String newItemName) {
        super.setItemName("Firetruck");
    }
    @Override
    public void setItemDescription (String newItemDescription){
        super.setItemDescription("A BIG RED FIRETRUCK!!! \n This bad boy pumps water like crazy.");
    }
    @Override
    public void setItemPrice (int itemPrice){
        super.setItemPrice(30);
    }
    @Override
    public void setCapacity (int capacity){super.setCapacity(50);}
}
