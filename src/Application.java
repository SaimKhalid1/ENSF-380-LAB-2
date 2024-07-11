import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static List<Client> clients = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Staff staff = new Staff();
        Admin admin = new Admin();

        while (true) {
            System.out.println("Welcome to YYC Pet Resort Management System");
            System.out.println("1. Create a new booking");
            System.out.println("2. Delete existing booking");
            System.out.println("3. View current bookings");
            System.out.println("4. Generate reports");
            System.out.println("5. View historical records");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    staff.createNewBooking(clients, pets, bookings, payments);
                    break;
                case 2:
                    staff.deleteBooking(bookings);
                    break;
                case 3:
                    staff.viewBookings(bookings, clients, pets, payments);
                    break;
                case 4:
                    admin.generateReports(bookings, payments);
                    break;
                case 5:
                    admin.viewHistoricalRecords(bookings);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}







