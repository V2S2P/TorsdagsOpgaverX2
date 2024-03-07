package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 0, 5);
        Room room2 = new Room(4, 0, 1);
        Room room3 = new Room(6, 0, 4);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 4, 2, true);

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total number of lamps in the building: " + totalLamps);

        boolean isBuildingNormal = isNormal(building);
        if (isBuildingNormal) {
            System.out.println("This building is normal.");
        }

    }
    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        List<Room> rooms = building.getRooms();
        for (Room room : rooms){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
    public static boolean isNormal(Building building){
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();
        if (numberOfFloors > numberOfRooms){
            return true;
        }else {
            System.out.println("This is an old building");
            return false;
        }
    }
}
