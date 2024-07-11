import java.util.List;

public class Report {
    public static void generateBookingReport(List<Booking> bookings) {
        System.out.println("Booking Report:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public static void generatePaymentReport(List<Payment> payments) {
        System.out.println("Payment Report:");
        for (Payment payment : payments) {
            System.out.println(payment);
        }
    }
}


