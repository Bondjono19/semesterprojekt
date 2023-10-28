/* Main class for launching the game
 */

import java.util.Scanner;

class Game {
  static World    world    = new World();
  static Command  fallback = new CommandUnknown();
  static Scanner  scanner  = new Scanner(System.in);


  static Inventory inventory = new Inventory();

  static Player player     = new Player(0,"navn");
  static Shop shop         = new Shop();
  static Context  context  = new Context(world.getEntry(),player,shop,inventory);
  static Registry registry = new Registry(context, fallback);


  private static void initRegistry () {
    Command cmdExit = new CommandExit();
    registry.register("collect", new CommandCollect());
    registry.register("exit", cmdExit);
    registry.register("quit", cmdExit);
    registry.register("bye", cmdExit);
    registry.register("go", new CommandGo());
    registry.register("help", new CommandHelp(registry));
    registry.register("clean", new CommandClean());
    registry.register("buy", new CommandBuy());
  }
  private static void initItems (){
    Item testitem1 = new Bucket("lol","hejsa",100);
    Item testitem2 = new Bucket("andetitem","hejsa2",1039);
    shop.shopItems.add(testitem1);
    shop.shopItems.add(testitem2);
  }
  
  public static void main (String args[]) {
    System.out.println("Welcome to the World of Zuul!");
    
    initRegistry();
    initItems();
    context.getCurrent().welcome();
    
    while (context.isDone()==false) {
      System.out.print("> ");
      String line = scanner.nextLine();
      registry.dispatch(line);
    }
    System.out.println("Game Over");
  }
}
