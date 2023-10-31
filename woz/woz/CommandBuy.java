import java.util.ArrayList;
public class CommandBuy extends BaseCommand implements Command{
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        if(context.getCurrent().name=="Shop"){
            int balance = context.getPlayer().getPoints();
            Shop shop = context.getShop();
            ArrayList<Item> shopItems = shop.getShopItems();
            ArrayList<Item> inventory=context.getInventory().getInventoryContents();
            Item testitem1 = new Bucket("Bucket","A roughly cylindrical open container with a handle, made of metal. Used to hold and carry liquids.",0,10);
            try{
                
                if(parameters[0].equals("list")){
                    shop.listShopItems();
                }else if(parameters[0].equals("bucket")){ //
                    if ((balance - Bucket.getPrice()) >= 0){
                        System.out.println("Get your money not your funny up or collect points");
                        inventory.add(testitem1);
                    }else {
                        System.out.println("Fuck oof");
                    }
                }else if(parameters[0].equals("wheelbarrow")){
                    //code for appendinng wheelbarrow...
                }else if(parameters[0].equals("firetruck")){
                    //code for appending firetruck
                }
            }
            catch (Exception e){
                System.out.println("You need to specify what to buy: 'buy item_name/list' ");
            }
        }
        else{
            System.out.println("Go to the shop first!");
        }
    }

}
