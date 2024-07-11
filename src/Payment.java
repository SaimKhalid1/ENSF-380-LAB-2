import java.util.Date;

public class Payment {
    private int paymentID;
    private int bookingID;
    private double amount;
    private Date date;

    public Payment(int paymentID, int bookingID, double amount, Date date) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.amount = amount;
        this.date = date;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentID + ", Booking ID: " + bookingID + ", Amount: $" + amount + ", Date: " + date;
    }
}


