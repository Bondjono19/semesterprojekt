public class CommandStats extends BaseCommand implements Command {
    
    public void execute(Context context,String command, String parameters[]){

        System.out.println("You have: "+context.getPlayer().getPoints()+" points.");

    }

}
