package quizes.q3.lazare_nadaraia_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
    private final List<Room> rooms;
    private final Map<String, Room> guests;

    public HotelManager() {
        this.rooms = new ArrayList<>();
        this.guests = new HashMap<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void checkIn(int roomNumber, Person person) {
        Room room = findRoom(roomNumber);
        if (room != null && !room.isOccupied()) {
            room.checkIn(person);
            guests.put(person.getId(), room);
            System.out.println(person.getName() + " checked into room " + roomNumber);
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    public void checkOut(String personId) {
        Room room = guests.get(personId);
        if (room != null && room.isOccupied()) {
            Person occupant = room.getOccupant();
            room.checkOut();
            guests.remove(personId);
            System.out.println(occupant.getName() + " checked out from room " + room.getRoomNumber());
        } else {
            System.out.println("Person with ID " + personId + " is not checked in.");
        }
    }

    public void displayInfo() {
        System.out.println("Guests Information:");
        for (Map.Entry<String, Room> entry : guests.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person person = room.getOccupant();
            System.out.println("Person ID: " + personId + ", Name: " + person.getName() + ", Surname: " + person.getSurname() + ", Room Number: " + room.getRoomNumber());
        }
    }

    private Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
