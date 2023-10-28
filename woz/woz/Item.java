public abstract class Item {
    private String itemName;
    private String itemDescription;
    private int itemPrice;

    public Item(String itemName, String itemDescription, int itemPrice){ //Contructor
        this.itemName=itemName;
        this.itemDescription=itemDescription;
        this.itemPrice=itemPrice;
    }

    //Getter
    public String getItemName(){
        return itemName;
    }
    public String getItemDescription(){
        return itemDescription;
    }
    public int getItemPrice(){
        return itemPrice;
    }

    //Setter
    public void setItemName(String newItemName){
        if(newItemName == null){
            itemName="(UNKNOWN-ITEM)"; //Checks if the item name is legal.
        }
        else {
            itemName=newItemName;
        }
    }

    public void setItemDescription(String newItemDescription){
        itemDescription=newItemDescription;
    }
    public void setItemPrice(int newItemPrice){
        itemPrice=newItemPrice;
    }



}
