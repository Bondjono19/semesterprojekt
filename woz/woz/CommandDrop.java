import java.util.Scanner;

//Bruger drop method fra Inventory klassen.
public class CommandDrop extends BaseCommand implements Command {

    CommandDrop(){
        description = "Used to drop items.";
    }

    @Override
    public void execute(Context context, String command, String parameters[]) {
        Inventory inventory = context.getInventory();
        if (parameters.length < 2) {
            System.out.println("drop one item, type number to pick item from list displayed: ");
            for (int i = 0; i < inventory.getInventoryContents().size(); i++) {
                System.out.println(inventory.getInventoryContents().get(i).getItemName());
            }
        }
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        try {

            if (choice == 1 || choice == 2 || choice == 3) { //If backpack is able to be bigger, then this needs to change.
                choice--;
                inventory.getInventoryContents().remove(choice);

                System.out.println("Item in inventory has been removed");
            } else {
                System.out.println("Not a valid choice");
            }

        } catch (Exception e) {
            System.out.println("You have no items to drop");
            // System.out.println(e);
        }

    }

}
