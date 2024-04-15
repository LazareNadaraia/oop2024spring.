package quizes.q3.lazare_nadaraia_1;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private boolean occupied;
    private Person occupant;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
        this.occupant = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void checkIn(Person person) {
        this.occupant = person;
        this.occupied = true;
    }

    public void checkOut() {
        this.occupant = null;
        this.occupied = false;
    }
}