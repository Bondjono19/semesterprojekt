/* Space class for modeling spaces (rooms, caves, ...)
 */

import java.util.Set;

class Space extends Node {
  Space (String name, String description) {
    super(name, description);
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
