package Task2;

public class Building {
    private final Room rooms[];
    private int numberOfBathrooms;
    private int numberOfFloors;
    boolean isOfficeBuilding;

    public Building (Room tempRooms[], int tempNumberOfBathrooms,int tempNumberOfFloors, boolean tempIsOfficeBuilding){
        this.rooms = tempRooms;
        this.numberOfBathrooms = tempNumberOfBathrooms;
        this.numberOfFloors = tempNumberOfFloors;
        this.isOfficeBuilding = tempIsOfficeBuilding;

    }
    public int checkLamps(){
        int totalLamps = 0;
        for(Room room:rooms){
            totalLamps += room.getNumberOfLamps();

        }
        return totalLamps;
    }


    public Room[] getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }


}
