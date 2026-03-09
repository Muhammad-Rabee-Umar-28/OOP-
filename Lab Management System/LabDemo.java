public class LabDemo {

    public static void main(String[] args) {

        // making multiple objects
        Lab l1 = new Lab();
        Lab l2 = new Lab(22, 10, 2023);
        Lab l3 = new Lab(50, 0, 8, 6, 2025);
        Lab l4 = new Lab("Comsats University", "Computer Science", "C", "Programming Lab", 14, 5, 2027);
        Lab l5 = new Lab(80, 10, "Comsats University", "Software Engineering", "A", "OOP Lab", 8, 7, 2021);
        Lab l6 = new Lab(l4);

        // Booking more computers
        System.out.printf(
                "\n-----------------------------------\nBooking %d more computers in lab %d \nResult:  %s.\n-----------------------------------",
                20, l5.getId(), l5.bookComputers(20));

        // Cancelling bookings

        System.out.printf("\nCanceling the booking of %d computers from lab %d \nResult:  %s \n", 60,
                l3.getId(), l3.cancelBooking(60));

        // using equals method
        System.out.println("-----------------------------------");
        System.out.println("Comparing lab Objects :-");
        System.out.printf("\nAre lab 5  and lab 6 equal ? (%b) \n", l5.equals(l6));
        System.out.printf("\nAre lab 4  and lab 6 equal ? (%b) \n", l4.equals(l6));
        System.out.printf("\nAre lab 5  and lab 5 equal ? (%b)\n", l5.equals(l5));
        System.out.println("-----------------------------------");

        // Printing all lab's details
        System.out.println("Printing all Lab details :-");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);

        // Printing total no of lab objects created.
        System.out.printf("Total number of Lab Objects created are %d \n", Lab.totalObjects());

    }

}
