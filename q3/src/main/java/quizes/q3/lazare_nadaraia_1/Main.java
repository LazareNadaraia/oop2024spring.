package quizes.q3.lazare_nadaraia_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person lazare = new Person();
        lazare.setName("Lazare");
        lazare.setSurname("Nadaraia");
        lazare.setId("lazare_id");

        PersonManager personManager = new PersonManager();
        List<Person> persons = personManager.getPersons();

        if (!persons.isEmpty()) {
            Person otherPerson = persons.get(0);
            HotelManager hotelManager = new HotelManager();
            hotelManager.addRoom(new Room(101));

            hotelManager.checkIn(101, lazare);
            hotelManager.checkIn(101, otherPerson);

            hotelManager.displayInfo();
        } else {
            System.out.println("No persons available to check in.");
        }
    }
}
