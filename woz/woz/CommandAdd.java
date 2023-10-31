public class CommandAdd extends BaseCommand implements Command{
    /*CommandAdd skal kunne tage det som vi har købt fra en ArrayList (Shop)
     og lægge det i et andet ArrayList (Inventory)*/
    @Override
    public void execute(Context context, String command, String parameters[]){
        Shop shop =context.getShop();
        //inventory=context.getInventory().getInventoryContents();


    }


}
