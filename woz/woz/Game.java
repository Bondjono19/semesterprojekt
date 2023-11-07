import java.util.Scanner;

class Game {
    static World world = new World();
    static Command fallback = new CommandUnknown();
    static Scanner scanner = new Scanner(System.in);
    static Inventory inventory = new Inventory();
    static Player player = new Player(0, "navn");
    static Shop shop = new Shop();
    static Context context = new Context(world.getEntry(), player, shop, inventory);
    static Registry registry = new Registry(context, fallback);

    private static void initRegistry() {
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

    private static void initItems() {
        shop.getShopItems().add(shop.itemBucket);
        shop.getShopItems().add(shop.itemWheelbarrow);
        shop.getShopItems().add(shop.itemFiretruck);
        inventory.addItem(new Bucket("Hands", "Your hands", 0, 1));
    }

    public static void main(String args[]) {
        System.out.println("Welcome to the World of Zuul!");
        initRegistry();
        initItems();
        context.getCurrent().welcome();

        boolean askedQuestion = false;

        while (!context.isDone()) {
        System.out.println();
        System.out.print("> ");
        String line = scanner.nextLine();

        if (context.getCurrent().getName().equals("Water Reservoir") && askedQuestion == false) {
            if (!askedQuestion) {
                // Prompt the player with a question and options in the Water Reservoir
                System.out.println("Before you go, please answer this question:");
                System.out.println("How many people lack access to safe water?");
                System.out.println("1. 3.1 billion");
                System.out.println("2. 1.5 billion");
                System.out.println("3. 2.2 billion");
                System.out.println("4. 2 billion");

                int playerAnswer = scanner.nextInt();
                scanner.nextLine();

                // Check the player's answer
                if (playerAnswer == 3) {
                    System.out.println("Correct! You've earned 15 point.");
                    context.getPlayer().setPoints(context.getPlayer().getPoints() + 15);
                } else {
                    System.out.println("Incorrect. Try again.");
                    context.getPlayer().setPoints(context.getPlayer().getPoints() - 15);

                }

                askedQuestion = true;
            } else {
                System.out.println("You've answered the question. You may proceed.");      
            }
        } else {
            registry.dispatch(line);
        }
    }
    System.out.println("Game Over");
    }
}