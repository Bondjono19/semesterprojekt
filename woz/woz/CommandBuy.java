import java.util.ArrayList;

public class CommandBuy extends BaseCommand implements Command {

    // public static Item itemBucket;

    @Override
    public void execute(Context context, String command, String parameters[]) {
        if (context.getCurrent().name == "Shop") {
            int balance = context.getPlayer().getPoints();
            Shop shop = context.getShop();
            ArrayList<Item> shopItems = shop.getShopItems();
            ArrayList<Item> inventory = context.getInventory().getInventoryContents();

            try {
                if (parameters[0].equals("list")) {
                    shop.listShopItems();

                } else if (parameters[0].equals("bucket")) {
                    if ((balance - Bucket.getPrice()) >= 0 && shop.gg("Bucket") == true) {
                        System.out.println("You bought a bucket");
                        shopItems.remove(shop.itemBucket);

                        inventory.add(shop.itemBucket);

                    } else if ((balance - Bucket.getPrice()) >= 0 && shop.gg("Bucket") != true) {
                        System.out.println("No more bucket's");
                    } else {
                        System.out.println("Not enough points");
                    }
                } 
                
                else if (parameters[0].equals("wheelbarrow")) {
                    if ((balance - WheelBarrow.getPrice()) >= 0 && shop.gg("Wheelbarrow") == true) {
                        System.out.println("You bought a wheelbarrow");
                        shopItems.remove(shop.itemWheelbarrow);

                        inventory.add(shop.itemWheelbarrow);

                    } else if ((balance - WheelBarrow.getPrice()) >= 0 && shop.gg("Wheelbarrow") != true) {
                        System.out.println("No more wheelbarrow's");
                    } else {
                        System.out.println("Not enough points");
                    }
                } 
                
                else if (parameters[0].equals("firetruck")) {
                    if ((balance - Firetruck.getPrice()) >= 0 && shop.gg("Firetruck") == true) {
                        System.out.println("You bought a firetruck");
                        shopItems.remove(shop.itemWheelbarrow);

                        inventory.add(shop.itemWheelbarrow);

                    } else if ((balance - Firetruck.getPrice()) >= 0 && shop.gg("Firetruck") != true) {
                        System.out.println("No more firetruck's");
                    } else {
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
