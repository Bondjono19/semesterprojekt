public class CommandBuy extends BaseCommand implements Command{
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        if(context.getCurrent().name=="Shop"){
            int balance = context.getPlayer().getPoints();
            Shop shop = context.getShop();
            try{
                if(parameters[0].equals("list")){
                    shop.listShopItems();
                }else if(parameters[0].equals("bucket")){
                    //code for appending item to inventory, subtracting money and so on
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

    private void purchaseItem(){
        
    }

}
