public class CommandCollect extends BaseCommand implements Command {
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        Space current = context.getCurrent();
        Inventory inventory = context.getInventory();
        int count = 0;
        for (int i = 0;i<inventory.getInventoryContents().size();i++){
            if(inventory.getInventoryContents().get(i).getIsFull()==true){
                System.out.println("Item " +inventory.getInventoryContents().get(i).getItemName()+ "  already full");
            }else{
                int amount = inventory.getInventoryContents().get(i).getItemCapacity();
                if(current.drainWater(amount)==true){
                    inventory.getInventoryContents().get(i).fill(true);
                }else{
                    if(count<1){
                        System.out.println("No water here");
                    }
                    count++;
                }
            }
        
        }
        
    }

}
