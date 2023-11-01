import java.util.ArrayList;
public class CommandPour extends BaseCommand implements Command{
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        Space area = context.getCurrent();
        ArrayList<Item> inventory = context.getInventory().getInventoryContents();
        int amount = 0;
        if(area.name.equals("Water Reservoir")){

            for(int i = 0;i<inventory.size();i++){
                if(inventory.get(i).getFiltered()[0]==true && inventory.get(i).getFiltered()[1] && inventory.get(i).getFiltered()[2]==true && inventory.get(i).getIsFull()==true){
                    amount = amount + inventory.get(i).getItemCapacity();
                    inventory.get(i).setFiltered(0, false);
                    inventory.get(i).setFiltered(1, false);
                    inventory.get(i).setFiltered(2, false);
                    inventory.get(i).fill(false);
                    System.out.println("Water poured from item " + inventory.get(i).getItemName());
                }
            }
            area.setWaterAmount(area.getWaterAmount()+amount);
        }
        else{
            System.out.println("Can't pour water here!");
        }

    }

}
