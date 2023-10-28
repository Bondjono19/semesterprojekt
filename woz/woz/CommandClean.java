public class CommandClean extends BaseCommand implements Command{
    

    @Override
    public void execute(Context context, String command, String Parameters[]){
        if(context.getCurrent().name=="Rough filter"){
            System.out.println("Water cleaned");
        }else if (context.getCurrent().name=="Active Coal Filter"){
            System.out.println("Water cleanded");
        }else if (context.getCurrent().name=="Fine filtering"){
            System.out.println("Water cleaned");
        }else{
            System.out.println("You can't clean your water here.");
     
        }
    }
}
