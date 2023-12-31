/* Node class for modeling graphs
 */

import java.util.HashMap;
import java.util.Map;

class Node {
  int water;
  String name;
  String description;
  Map<String, Node> edges = new HashMap<String, Node>();
  
  Node (String name, String description) {
    this.name = name;
    this.description = description;
  }
  Node (String name, String description, int water){
    this.name = name;
    this.description = description;
    this.water = water;
  }
  
  public String getName () {
    return name;
  }

  public String getDescription () {
    return description;}
  
  public void addEdge (String name, Node node) {
    edges.put(name, node);
  }
  
  public Node followEdge (String direction) {
    return edges.get(direction);
  }
}

