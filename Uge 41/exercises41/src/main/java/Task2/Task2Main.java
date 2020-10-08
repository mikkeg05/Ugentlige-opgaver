package Task2;

public class Task2Main {
    public static void main(String[] args){
        Room newRooms[] = new Room[3];
        newRooms[0] = new Room(4, 2, 75, 4);
        newRooms[1] = new Room(8, 7, 0, 0);
        newRooms[2] = new Room(1, 0, 5, 4);

        Building building1 = new Building(newRooms, 0, 6, true);
        System.out.println(building1.checkLamps());

        if(building1.getNumberOfFloors() > newRooms.length){
            System.out.println("This is an odd building");
        } else {
            System.out.println("This is a regular old boring building");
        }



    }
}
