import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static class NotificationService {
        private List<Notification> notifications;

        public NotificationService() {
            this.notifications = new ArrayList<>();
        }

        public void sendNotification(int clientID, String message, String method) {
            int notificationID = notifications.size() + 1;
            Notification notification = new Notification(notificationID, clientID, message, new Date());
            notifications.add(notification);

            // Simulate sending notification
            if (method.equalsIgnoreCase("email")) {
                System.out.println("Sending email to client " + clientID + ": " + message);
            } else if (method.equalsIgnoreCase("phone")) {
                System.out.println("Sending SMS to client " + clientID + ": " + message);
            } else {
                System.out.println("Unknown method. Notification not sent.");
            }
        }

        public List<Notification> getNotificationsForClient(int clientID) {
            List<Notification> clientNotifications = new ArrayList<>();
            for (Notification notification : notifications) {
                if (notification.getClientID() == clientID) {
                    clientNotifications.add(notification);
                }
            }
            return clientNotifications;
        }
    }
}



