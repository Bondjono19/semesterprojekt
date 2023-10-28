import java.util.ArrayList;
public class CommandClean extends BaseCommand implements Command{
    

    @Override
    public void execute(Context context, String command, String Parameters[]){
        ArrayList<Item> inventory = context.getInventory().getInventoryContents();
        if(context.getCurrent().name.equals("Rough filter")){
            if(inventory.size()==0){
                System.out.println("You have no items to pick up water with.");
            }
            for(int i = 0;i<inventory.size();i++){
                if(inventory.get(i).getFiltered()[0]==false){
                    inventory.get(i).setFiltered(i, true);
                    System.out.println("Water filtered successfully");
                    context.getPlayer().setPoints(context.getPlayer().getPoints()+10);
                    System.out.println("10 points awarded!");
                }else{
                    System.out.println("Water has already been through the rough filter!");
                }
            }
        }else if (context.getCurrent().name=="Active Coal Filter"){
            System.out.println("Water cleanded");
        }else if (context.getCurrent().name=="Fine filtering"){
            System.out.println("Water cleaned");
        }else{
            System.out.println("You can't clean your water here.");
     
        }
    }
}
