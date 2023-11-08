public class CommandCollect extends BaseCommand implements Command {
    

    CommandCollect(){
        description = "Used to collect water.";
    }

    @Override
    public void execute(Context context, String command, String parameters[]){
        Space current = context.getCurrent();
        Inventory inventory = context.getInventory();
        int count = 0;


        if(!current.name.contains("Watersource")){
            System.out.println("Location not eligible for pickup");
            return;
        }
        for (int i = 0;i<inventory.getInventoryContents().size();i++){
            if(inventory.getInventoryContents().get(i).getIsFull()==true){
                System.out.println("Item " +inventory.getInventoryContents().get(i).getItemName()+ "  already full");
            }else{
                int amount = inventory.getInventoryContents().get(i).getItemCapacity();
                if(current.drainWater(amount)==true){
                    inventory.getInventoryContents().get(i).fill(true);
                }else{
                    if(count==0){ //Ændring af count>1 til ==0 (betyder det samme)
                        System.out.println("No water here");
                    }
                    count++;
                }
            }
        
        }
        
    }

}
