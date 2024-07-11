import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Staff {
    protected Scanner scanner = new Scanner(System.in);

    public void createNewBooking(List<Client> clients, List<Pet> pets, List<Booking> bookings, List<Payment> payments) {
        System.out.println("Enter client name:");
        String clientName = scanner.nextLine();
        System.out.println("Enter client phone number:");
        String clientPhone = scanner.nextLine();
        System.out.println("Enter client address:");
        String clientAddress = scanner.nextLine();

        Client client = new Client(clients.size() + 1, clientName, clientPhone, clientAddress);
        clients.add(client);

        System.out.println("Enter pet name:");
        String petName = scanner.nextLine();
        System.out.println("Enter pet species:");
        String petSpecies = scanner.nextLine();
        System.out.println("Enter pet breed:");
        String petBreed = scanner.nextLine();
        System.out.println("Enter pet age:");
        int petAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter feeding instructions:");
        String feedingInstructions = scanner.nextLine();
        System.out.println("Enter medication list:");
        String medicationList = scanner.nextLine();
        System.out.println("Enter medication instructions:");
        String medicationInstructions = scanner.nextLine();

        CareProfile careProfile = new CareProfile(feedingInstructions, medicationList, medicationInstructions);
        Pet pet = new Pet(pets.size() + 1, petName, petSpecies, petBreed, petAge, client.getClientID(), careProfile);
        pets.add(pet);

        System.out.println("Enter booking start date (yyyy-MM-dd):");
        String startDateStr = scanner.nextLine();
        System.out.println("Enter booking end date (yyyy-MM-dd):");
        String endDateStr = scanner.nextLine();

        try {
            Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDateStr);
            Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDateStr);

            Booking booking = new Booking(bookings.size() + 1, client.getClientID(), pet.getPetID(), startDate, endDate);
            bookings.add(booking);

            System.out.println("Enter payment amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Payment payment = new Payment(payments.size() + 1, booking.getBookingID(), amount, new Date());
            payments.add(payment);

            System.out.println("Booking and payment created successfully.");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please try again.");
        }
    }

    public void deleteBooking(List<Booking> bookings) {
        System.out.println("Enter booking ID to delete:");
        int bookingID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Booking bookingToRemove = null;
        for (Booking booking : bookings) {
            if (booking.getBookingID() == bookingID) {
                bookingToRemove = booking;
                break;
            }
        }

        if (bookingToRemove != null) {
            bookings.remove(bookingToRemove);
            System.out.println("Booking deleted successfully.");
        } else {
            System.out.println("Booking ID not found.");
        }
    }

    public void viewBookings(List<Booking> bookings, List<Client> clients, List<Pet> pets, List<Payment> payments) {
        System.out.println("1. View booking by ID");
        System.out.println("2. View all current active bookings");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Enter booking ID:");
                int bookingID = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                for (Booking booking : bookings) {
                    if (booking.getBookingID() == bookingID) {
                        displayBooking(booking, clients, pets, payments);
                        return;
                    }
                }
                System.out.println("Booking ID not found.");
                break;
            case 2:
                if (bookings.isEmpty()) {
                    System.out.println("No active bookings.");
                } else {
                    for (Booking booking : bookings) {
                        displayBooking(booking, clients, pets, payments);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void displayBooking(Booking booking, List<Client> clients, List<Pet> pets, List<Payment> payments) {
        Client client = getClientByID(booking.getClientID(), clients);
        Pet pet = getPetByID(booking.getPetID(), pets);

        if (client != null && pet != null) {
            System.out.println("Booking ID: " + booking.getBookingID() + ", Client: " + client.getName() + ", Pet: " + pet.getName() +
                    ", Start Date: " + booking.getStartDate() + ", End Date: " + booking.getEndDate() + ", Payment: " + getPaymentByBookingID(booking.getBookingID(), payments));
        } else {
            System.out.println("Booking ID: " + booking.getBookingID() + ", Client ID: " + booking.getClientID() + ", Pet ID: " + booking.getPetID() +
                    ", Start Date: " + booking.getStartDate() + ", End Date: " + booking.getEndDate() + ", Payment: " + getPaymentByBookingID(booking.getBookingID(), payments));
        }
    }

    private Client getClientByID(int clientID, List<Client> clients) {
        for (Client client : clients) {
            if (client.getClientID() == clientID) {
                return client;
            }
        }
        return null;
    }

    private Pet getPetByID(int petID, List<Pet> pets) {
        for (Pet pet : pets) {
            if (pet.getPetID() == petID) {
                return pet;
            }
        }
        return null;
    }

    private Payment getPaymentByBookingID(int bookingID, List<Payment> payments) {
        for (Payment payment : payments) {
            if (payment.getBookingID() == bookingID) {
                return payment;
            }
        }
        return null;
    }
}
