import java.util.Date;

public class Booking {
    private int bookingID;
    private int clientID;
    private int petID;
    private Date startDate;
    private Date endDate;

    public Booking(int bookingID, int clientID, int petID, Date startDate, Date endDate) {
        this.bookingID = bookingID;
        this.clientID = clientID;
        this.petID = petID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID + ", Client ID: " + clientID + ", Pet ID: " + petID + ", Start Date: " + startDate + ", End Date: " + endDate;
    }
}



