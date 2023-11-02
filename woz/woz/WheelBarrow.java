public class WheelBarrow extends Item{
    public WheelBarrow(String itemName, String itemDescription, int itemPrice, int capacity) {
        super(itemName, itemDescription, itemPrice,capacity); //Contructor

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
    @Override
    public void setCapacity (int capacity){super.setCapacity(10);} //Kalder superklassens metode :)
}

