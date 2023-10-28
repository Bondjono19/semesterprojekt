public class WheelBarrow extends Item{
    public WheelBarrow(String itemName, String itemDescription, int itemPrice) {
        super(itemName, itemDescription, itemPrice); //Contructor

    }

    @Override
    public void setItemName(String newItemName) {
        super.setItemName("Wheelbarrow");
    }
    @Override
    public void setItemDescription (String newItemDescription){
        super.setItemDescription("A small cart with a single wheel at the front." +
                "\n used typically for carrying loads in building work or gardening.");
    }
    @Override
    public void setItemPrice (int itemPrice){
        super.setItemPrice(10);
    }

}
