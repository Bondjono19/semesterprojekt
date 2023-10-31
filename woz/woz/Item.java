public abstract class Item {
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int capacity;
    private boolean[] filtered = new boolean[3];
    private boolean isFull = false;

    public Item(String itemName, String itemDescription,int itemPrice ,int capacity){ //Contructor
        this.itemName=itemName;
        this.itemDescription=itemDescription;
        this.itemPrice=itemPrice;
        this.capacity=capacity;
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
    public boolean[] getFiltered(){
        return filtered;
    }
    public int getItemCapacity(){
        return capacity;
    }
    public boolean getIsFull(){
        return isFull;
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

    public void setFiltered(int i,boolean value){

        filtered[i] = value;

    }
    public void fill(boolean value){
        isFull = value;
    }

}
