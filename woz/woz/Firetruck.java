public class Firetruck extends Item{
    public Firetruck(String itemName, String itemDescription, int itemPrice) {
        super(itemName, itemDescription, itemPrice); //Contructor

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
}
