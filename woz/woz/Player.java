/*Klassen her skal bruges til at vi har en mand
som kan have POINTS, INVENTORY og skulle kunne DROP og PICK UP diverse ting*/
public class Player {
    //integers (Points)
    //Inventory
    private int points;
    private String name;


    //Constructor for Player
    public Player(int points, String name){
        this.points=points;
        this.name=name;
    }
    //Getters
    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }

    //Setter (Updating points)
    public void setPoints(int NewPoint){
        points=NewPoint;
    }

    //Methods for drop() and pickup()





}
