import java.util.ArrayList;

public class CommandBuy extends BaseCommand implements Command {

    // public static Item itemBucket;

    CommandBuy () {
        description = "Used to buy items";
      }

    @Override
    public void execute(Context context, String command, String parameters[]) {
        if (context.getCurrent().name == "Shop") {
            int balance = context.getPlayer().getPoints();
            Shop shop = context.getShop();
            ArrayList<Item> shopItems = shop.getShopItems();
            parameters[0] = parameters[0].toLowerCase();
            try {
                if (parameters[0].equals("list")) {
                    shop.listShopItems();
                } 

                else if (parameters[0].equals("bucket")) {
                    if (shop.gg("Bucket") != true) {
                        System.out.println("No more buckets");
                    } 
                    else if ((balance - shop.itemBucket.getItemPrice()) >= 0  && shop.gg("Bucket") == true) {
                        System.out.println("You bought a bucket");
                        shopItems.remove(shop.itemBucket);
                        context.getInventory().addItem(new Bucket("bucket", "description", 5, 2));
                        context.getPlayer().setPoints(balance-(shop.itemBucket.getItemPrice()));
                         
                    }
                    else {
                        System.out.println("Not enough points");
                    }
                }

                else if (parameters[0].equals("wheelbarrow")) {
                    if (shop.gg("Wheelbarrow") != true) {
                        System.out.println("No more wheelbarrow's");
                    }
                    else if ((balance - shop.itemWheelbarrow.getItemPrice()) >= 0 && shop.gg("Wheelbarrow") == true) {
                        System.out.println("You bought a wheelbarrow");
                        shopItems.remove(shop.itemWheelbarrow);

                        context.getInventory().addItem(new WheelBarrow("wheelbarrow", "description", 10, 10));
                        context.getPlayer().setPoints(balance-(shop.itemWheelbarrow.getItemPrice()));
                    } 
                    else {
                        System.out.println("Not enough points");
                    }
                }

                else if (parameters[0].equals("firetruck")) {
                    if (shop.gg("Firetruck") != true) {
                        System.out.println("No more firetruck's");
                    } 
                    else if ((balance - shop.itemFiretruck.getItemPrice()) >= 0 && shop.gg("Firetruck") == true) {
                        System.out.println("You bought a firetruck");
                        shopItems.remove(shop.itemFiretruck);

                        context.getInventory().addItem(new Firetruck("firetruck", "description", 100, 50));
                        context.getPlayer().setPoints(balance-(shop.itemFiretruck.getItemPrice()));
                    }
                    else {
                        System.out.println("Not enough points");
                    }
                }
            } catch (Exception e) {
                System.out.println("You need to specify what to buy: 'buy item_name/list' ");
            }
        } else {
            System.out.println("Go to the shop first!");
        }
    }

}
