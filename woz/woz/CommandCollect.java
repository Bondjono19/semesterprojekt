public class CommandCollect extends BaseCommand implements Command {
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        Space current = context.getCurrent();
        Player player = context.getPlayer();
        current.drainWater(1,player);
    }

}
