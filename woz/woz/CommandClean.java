import java.util.ArrayList;
public class CommandClean extends BaseCommand implements Command {


    @Override
    public void execute(Context context, String command, String Parameters[]) {
        ArrayList<Item> inventory = context.getInventory().getInventoryContents();
        if (context.getCurrent().name == "Rough filter") {
                if (inventory.size() == 0) {
                    System.out.println("You have no items, purchase items and fill them with water before cleaning.");
                }
                for (int i = 0; i < inventory.size(); i++) {
                    if(inventory.get(i).getIsFull()==false){
                        System.out.println("You have no water in item " + inventory.get(i).getItemName());
                        break;
                    }
                    if (inventory.get(i).getFiltered()[i] == false) {
                        inventory.get(i).setFiltered(0, true);
                        System.out.println("Water filtered successfully for item " + inventory.get(i).getItemName());
                        context.getPlayer().setPoints(context.getPlayer().getPoints() + 10);
                        System.out.println("10 points awarded!");
                    } else {
                        System.out.println("Water has already been through the rough filter for item " + inventory.get(i).getItemName());
                    }
                }
        }
        else if (context.getCurrent().name == "Active Coal Filter") {
            if(inventory.size()==0){
                System.out.println("You have no items, purchase items and fill them with water before cleaning.");
            }
            for (int i = 0;i<inventory.size();i++){
                if(inventory.get(i).getFiltered()[0]==true && inventory.get(i).getIsFull()==true){
                    if(inventory.get(i).getFiltered()[1]==true){
                        System.out.println("Item has already been through the fine filter.");
                    }else{
                        inventory.get(i).setFiltered(1, true);
                        System.out.println("Water filtered successfully for item " + inventory.get(i).getItemName());
                        context.getPlayer().setPoints(context.getPlayer().getPoints() + 10);
                        System.out.println("10 points awarded!");
                    }
                }else{
                    System.out.println("Item is either not full or has not been through the rough filter.");
                }
            }
        } else if (context.getCurrent().name == "Fine filtering") {
            System.out.println("... \n Water cleaned");
        } else {
            System.out.println("You can't clean your water here. Try in the filtering rooms");

        }
    }
}

