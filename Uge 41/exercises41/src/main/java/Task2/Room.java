package Task2;

public class Room {
   private int walls;
   private int numberOfDoors;
   private int numberOfLamps;
   private float numberOfWindows;

    public Room(int tempWalls, int tempNumberOfDoors, int tempNumberOfLamps, float tempNumberOfWindows){
        this.walls = tempWalls;
        this.numberOfDoors = tempNumberOfDoors;
        this.numberOfLamps = tempNumberOfLamps;
        this.numberOfWindows = tempNumberOfWindows;


    }

    public int getWalls() {
        return walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public float getNumberOfWindows() {
        return numberOfWindows;
    }


}
