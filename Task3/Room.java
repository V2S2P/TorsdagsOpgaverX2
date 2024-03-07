package Task3;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public  Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
        this.numberOfLamps = numberOfLamps;
        this.numberOfDoors = numberOfDoors;

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
