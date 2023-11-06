import java.util.ArrayList;
public class CommandPour extends BaseCommand implements Command{
    

    CommandPour(){
        description = "Used to pour water.";
    }

    @Override
    public void execute(Context context, String command, String parameters[]){

        Space area = context.getCurrent();
        ArrayList<Item> inventory = context.getInventory().getInventoryContents();
        int amount = 0;
        if(inventory.size()==0){
            System.out.println("You don't have any items.");
        }
        else{
            if(area.name.contains("Reservoir")){
                for(int i = 0;i<inventory.size();i++){
                    if(inventory.get(i).getFiltered()[0]==true && inventory.get(i).getFiltered()[1]==true && inventory.get(i).getFiltered()[2]==true && inventory.get(i).getIsFull()==true){
                        amount = inventory.get(i).getItemCapacity();
                        area.setWaterAmount(area.getWaterAmount()+amount);
                        inventory.get(i).setFiltered(0, false);
                        inventory.get(i).setFiltered(1, false);
                        inventory.get(i).setFiltered(2, false);
                        inventory.get(i).fill(false);
                        System.out.println("Water poured from item " + inventory.get(i).getItemName() + " successfully - 100 points awarded.");
                        context.getPlayer().setPoints(context.getPlayer().getPoints()+100);
                    }else if(inventory.get(i).getIsFull()==true){
                        inventory.get(i).setFiltered(0, false);
                        inventory.get(i).setFiltered(1, false);
                        inventory.get(i).setFiltered(2, false);
                        inventory.get(i).fill(false);
                        System.out.println("You poured dirty water into the water reservoir from item " +
                                inventory.get(i).getItemName() + " causing it all to go bad. 25 points deducted.");
                        context.getPlayer().setPoints(context.getPlayer().getPoints()-25); //Bad behaviour
                        context.getCurrent().setWaterAmount(0);
                    }else{
                        System.out.println("No water in item: " + inventory.get(i).getItemName());
                    }
                }
            }
            else{
                System.out.println("Can't pour water here!");
            }
        }
        

    }

}
