import java.util.Date;

public class Notification {
    private int notificationID;
    private int clientID;
    private String message;
    private Date date;

    public Notification(int notificationID, int clientID, String message, Date date) {
        this.notificationID = notificationID;
        this.clientID = clientID;
        this.message = message;
        this.date = date;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notification ID: " + notificationID + ", Client ID: " + clientID + ", Message: " + message + ", Date: " + date;
    }
}


