import java.util.List;

public class Admin extends Staff {

    public void generateReports(List<Booking> bookings, List<Payment> payments) {
        Report.generateBookingReport(bookings);
        Report.generatePaymentReport(payments);
    }

    public void viewHistoricalRecords(List<Booking> bookings) {
        System.out.println("Historical Booking Records:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}


