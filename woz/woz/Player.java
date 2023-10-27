/*Klassen her skal bruges til at vi har en mand
som kan have POINTS, INVENTORY og skulle kunne DROP og PICK UP diverse ting*/
public class Player {
    //integers (Points)
    //Inventory
    private int points;
    private String name;
    private int water;


    //Constructor for Player
    public Player(int points, String name) {
        this.points = points;
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWater() {
        return water;
    }

    //Setter (Updating points and name)
    public void setPoints(int NewPoint) {
        points = NewPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWater(int water) {
        this.water = water;
    }
    public boolean hasWater(){
        if (water>0){
            return true;
        }
        else {
            return false;
        }
    }
}

    //Methods for drop() and pickup()

