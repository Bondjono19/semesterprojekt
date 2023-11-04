public class CommandStats extends BaseCommand implements Command {
    
    CommandStats(){
        description = "Display stats.";
    }

    public void execute(Context context,String command, String parameters[]){

        System.out.println("You have: "+context.getPlayer().getPoints()+" points.");
        System.out.println("You have the following items in your inventory: ");
        for (int i = 0;i<context.getInventory().getInventoryContents().size();i++){
            System.out.println("- " + context.getInventory().getInventoryContents().get(i).getItemName() + ", with a capacity of " + context.getInventory().getInventoryContents().get(i).getItemCapacity() + " liters.");
            if(context.getInventory().getInventoryContents().get(i).getIsFull()){
                System.out.println("-- Item full of water");
            }else{
                System.out.println("-- Item is empty.");
            }
        }
    }

}
