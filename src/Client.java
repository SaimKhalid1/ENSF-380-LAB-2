public class Client {
    private int clientID;
    private String name;
    private String phoneNumber;
    private String address;

    public Client(int clientID, String name, String phoneNumber, String address) {
        this.clientID = clientID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client ID: " + clientID + ", Name: " + name + ", Phone: " + phoneNumber + ", Address: " + address;
    }
}



