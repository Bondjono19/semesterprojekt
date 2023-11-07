import java.util.ArrayList;

public class CommandList extends BaseCommand implements Command {

    CommandList() {
        description = "Placeholder";
    }

    @Override
    public void execute(Context context, String command, String parameters[]) {
        if (context.getCurrent().name == "Shop") {
            Shop shop = context.getShop();
            ArrayList<Item> shopItems = shop.getShopItems();
            try {
                if (shopItems.size() != 0) {
                    shop.listShopItems();
                } else if (shopItems.size() == 0) {
                    System.out.println("Shop has no more items");
                } 
            } catch (Exception e) {
                // System.out.println(e);
            }
        } else {
            System.out.println("Go to the shop first!");
        }
    }

}
