public class CommandStats extends BaseCommand implements Command {
    
    public void execute(Context context,String command, String parameters[]){

        System.out.println("You have: "+context.getPlayer().getPoints()+" points.");
        System.out.println("You have the following items in your inventory: ");
        for (int i = 0;i<context.getInventory().getInventoryContents().size();i++){
            System.out.println("- " + context.getInventory().getInventoryContents().get(i).getItemName());
        }
    }

}
