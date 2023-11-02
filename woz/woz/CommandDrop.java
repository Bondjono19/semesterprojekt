import java.util.Scanner;

//Bruger drop method fra Inventory klassen.
public class CommandDrop extends BaseCommand implements Command{
    @Override
    public void execute (Context context, String command, String parameters[]){
        Inventory inventory= context.getInventory();
            if (parameters.length<2){
                System.out.println("drop one item, type number to pick item from list displayed: "); //Looper igennem navne på Items
                for (int i = 0;i<inventory.getInventoryContents().size();i++){
                    System.out.println(inventory.getInventoryContents().get(i).getItemName());
                }
            }
            try{
                Scanner s = new Scanner(System.in); //Opretter scanner.
                int choice= s.nextInt();
                if (choice==1){
                    System.out.println("First item in inventory has been removed"); //If statement der fjerne elementet på index 0
                    inventory.getInventoryContents().remove(0);
                }

                if (choice==2){
                    inventory.getInventoryContents().remove(1);
                    System.out.println("Second item in inventory has been removed"); //If statement der fjerne elementet på index 1
                }
                //For loop igennem int i inde i inventory. i skal være choice + indexet + Skal fortælle hvilket item vi
                // er i inventory <--- (Idriis schizo rambling) (evt. bedre måde at gøre det på, if it works)


            }catch (Exception e){
                System.out.println("This item doesn't exist in your inventory or you have no items to drop"); //Catch Exception
            }


    }

}
