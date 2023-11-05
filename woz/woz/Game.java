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
    registry.register("stats", new CommandStats());
    registry.register("pour", new CommandPour());
    registry.register("drop", new CommandDrop());
  }
  private static void initItems (){
    shop.getShopItems().add(shop.itemBucket);
    shop.getShopItems().add(shop.itemBucket);
    shop.getShopItems().add(shop.itemBucket);
    shop.getShopItems().add(shop.itemWheelbarrow);
    // shop.getShopItems().add(shop.itemFiretruck);
    inventory.addItem(new Bucket("test2","lol",10,2));
    inventory.addItem(new Bucket("test","lol",10,2));
  }

  
  public static void main (String args[]) {
    System.out.println("Welcome to the World of Zuul!");
    initRegistry();
    initItems();
    context.getCurrent().welcome();
    
    while (context.isDone()==false) {
      System.out.print("> ");
      String line = scanner.nextLine();

      if (context.getCurrent().getName().contains("eeeee")) {
        // Prompt the player with a question and options in the Water Reservoir
        System.out.println("You've entered the Water Reservoir.");
        System.out.println("Answer this question:");
        System.out.println("What do people die of?" + "please answer using the numerial valuego");
        System.out.println("1. war");
        System.out.println("2. fortnite");
        System.out.println("3. herpes");
        System.out.println("4. sygdom");

        int playerAnswer = scanner.nextInt();
        scanner.nextLine();

        // Check the player's answer
        if (playerAnswer == 2) {
          System.out.println("Correct! You've earned 1 points.");
          context.getPlayer().setPoints(context.getPlayer().getPoints() + 1);
        } else {
          System.out.println("Incorrect. Try again.");
        }
    } else {
        registry.dispatch(line);
    }
  }
  System.out.println("Game Over");
  }
}

