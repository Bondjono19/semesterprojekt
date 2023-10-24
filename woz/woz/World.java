/* World class for modeling the entire in-game world
 */

class World {
  Space entry;
  
  World () {
    Space entry    = new Space("Entry","there isn't much to see here");
    Space northern_watersource = new Space("Northern Watersource", "here you can collect water", 100);
    Space fine_filter = new Space("Fine filtering", "here you can filter water using the fine filter");
    Space western_watersource = new Space("Western Watersource", "here you can collect water", 100);
    Space Shop     = new Space("Shop", "here you can purchase new tools");
    Space northeastern_watersource = new Space("North-Eastern Watersource", "here you can collect water", 100);
    Space water_reservoir = new Space("Water Reservoir", "here you can store clean water");
    Space active_coal_filter = new Space("Active Coal Filter", "here you can filter water using the active coal filter");
    Space northwestern_watersource = new Space("North-Western Watersource", "here you can collect water", 100);
    Space rough_filter = new Space("Rough filter", "here you can filter water using the rough filter");
    
    entry.addEdge("north", northern_watersource);
    entry.addEdge("south", fine_filter);
    entry.addEdge("east", Shop);
    entry.addEdge("west", western_watersource);

    northern_watersource.addEdge("east", northeastern_watersource);
    northern_watersource.addEdge("south", entry);
    northern_watersource.addEdge("west", northwestern_watersource);

    northeastern_watersource.addEdge("west", northern_watersource);
    northeastern_watersource.addEdge("south", Shop);

    northwestern_watersource.addEdge("east", northern_watersource);
    northwestern_watersource.addEdge("south", western_watersource);

    western_watersource.addEdge("north", northwestern_watersource);
    western_watersource.addEdge("east", entry);
    western_watersource.addEdge("south", rough_filter);

    Shop.addEdge("east", water_reservoir);
    Shop.addEdge("north", northeastern_watersource);
    Shop.addEdge("south", active_coal_filter);
    Shop.addEdge("west", entry);

    water_reservoir.addEdge("west", Shop);

    rough_filter.addEdge("north", western_watersource);
    rough_filter.addEdge("east", fine_filter);

    fine_filter.addEdge("north", entry);
    fine_filter.addEdge("east", active_coal_filter);

    active_coal_filter.addEdge("west", fine_filter);
    active_coal_filter.addEdge("north", Shop);
    
    
    this.entry = entry;
  }
  
  Space getEntry () {
    return entry;
  }
}

