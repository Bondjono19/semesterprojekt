class Context {
  Space current;
  boolean done = false;
  Player player;
  Shop shop;
  Inventory inventory;

  Context(Space node, Player playerIn, Shop shopIn, Inventory inventoryIn) {
    current = node;
    player = playerIn;
    shop = shopIn;
    inventory = inventoryIn;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public Player getPlayer() {
    return player;
  }

  public Space getCurrent() {
    return current;
  }

  public Shop getShop() {
    return shop;
  }

  public void transition(String direction) {
    Space next = current.followEdge(direction);
    if (next == null) {
      System.out.println("You are confused, and walk in a circle looking for '" + direction + "'. In the end you give up 😩");
    } else {
      current.goodbye();
      current = next;
      current.welcome();
    }
  }

  public void makeDone() {
    done = true;
  }

  public boolean isDone() {
    return done;
  }
  public void setDone(boolean done){
    this.done = done;
  }
}
