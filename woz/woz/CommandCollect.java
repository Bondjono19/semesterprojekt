public class CommandCollect extends BaseCommand implements Command {
    
    @Override
    public void execute(Context context, String command, String parameters[]){
        Space current = context.getCurrent();
        current.drainWater(1);
    }

}
