public abstract class Item {
    private String itemName;
    private String itemDescription;
    private int price;

    public Item(String itemName, String itemDescription){ //Contructor
        this.itemName=itemName;
        this.itemDescription=itemDescription;
    }

    //Getter
    public String getItemName(){
        return itemName;
    }
    public String getItemDescription(){
        return itemDescription;
    }
    public int getItemPrice(){
        return price;
    }

    //Setter
    public void setItemName(String newItemName){
        itemName=newItemName;
    }

    public void setItemDescription(String newItemDescription){
        itemDescription=newItemDescription;
    }



}
