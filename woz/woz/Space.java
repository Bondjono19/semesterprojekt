/* Space class for modeling spaces (rooms, caves, ...)
 */

import java.util.Set;

class Space extends Node {

  Space (String name, String description) {
    super(name, description);
  }
  Space (String name, String description, int water){
    super(name,description,water);
  }

  public int getWaterAmount() {
    return water;
  }
  

  public boolean drainWater(int amount){
    if(water>=amount){
      water=water-amount;
      System.out.println("Water collected successfully - " + water + " liters left.");
      return true;
    }else{
      System.out.println("No water here");
      return false;
    }

  }
  public void welcome () {
    System.out.println("You are now at " + name + " " + description);
    if(water>0){
      System.out.println("Liters of water to collect: " + water);
    }
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
