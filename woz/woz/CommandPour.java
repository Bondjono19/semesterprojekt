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
                }
            }
            area.setWaterAmount(area.getWaterAmount()+amount);
        }

    }

}
