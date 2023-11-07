public class CommandStats extends BaseCommand implements Command {
    
    CommandStats(){
        description = "Display stats.";
    }

    public void execute(Context context,String command, String parameters[]){

        System.out.println("You have: "+context.getPlayer().getPoints()+" points.");
        System.out.println("You have the following items in your inventory: ");
        for (int i = 0;i<context.getInventory().getInventoryContents().size();i++){
            System.out.println(" - " + context.getInventory().getInventoryContents().get(i).getItemName() + ", with a capacity of " + context.getInventory().getInventoryContents().get(i).getItemCapacity() + " liters.");
            if(context.getInventory().getInventoryContents().get(i).getIsFull()){
                int x = 0;
                System.out.println(" -- Item full of water");
                System.out.print(" -- it's been through ");
                for(int h = 0;h<context.getInventory().getInventoryContents().get(i).getFiltered().length;h++){
                    if(context.getInventory().getInventoryContents().get(i).getFiltered()[h]==true){
                        x++;
                    }
                }
                String x2 = Integer.toString(x);
                System.out.println(x2 + " filters.");
            }else{
                System.out.println(" -- Item is empty.");
            }
        }
    }

}
