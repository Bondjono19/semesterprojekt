public class CommandBuy extends BaseCommand implements Command{
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        int balance = context.getPlayer().getPoints();
        String item = parameters[0];
        if(context.getCurrent().name=="Shop"){
            //købsmekanisme
            
        }
        else{
            System.out.println("Go to the shop first!");
        }
    }

}
