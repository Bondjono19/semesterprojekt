/* Space class for modeling spaces (rooms, caves, ...)
 */

import java.util.Set;

class Space extends Node {
  private int waterAmount;

  Space (String name, String description) {
    super(name, description);
    waterAmount = 0;
  }

  public int getWaterAmount() {
    return waterAmount;
  }
  
  public void fillWater(int amount){
    waterAmount += amount;
  }

  public void drainWater(int amount){
    if (waterAmount >= amount){
      waterAmount -= amount;
    }
    else {
      System.out.println("there isn't enough water in the source");
    }

  }
  public void welcome () {
    System.out.println("You are now at " + name + " " + description);
    Set<String> exits = edges.keySet();
    System.out.println("Current exits are:");
    for (String exit: exits) {
      System.out.println(" - "+exit);
    }
  }
  
  public void goodbye () {
  }
  
  @Override
  public Space followEdge (String direction) {
    return (Space) (super.followEdge(direction));
  }
}
