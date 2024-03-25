package quizes.q2.lazare_nadaraia_1.bus.sub;

import quizes.q2.lazare_nadaraia_1.bus.A21;
import quizes.q2.lazare_nadaraia_1.teleportation.A22;

public class R21 {
    public static void main(String[] args) {
        int area = A21.hei * A21.len;
        System.out.println("Area of the rectangle: " + area);

        java.lang.String monthName = switch (A22.month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println("Month name: " + monthName);
    }
}
