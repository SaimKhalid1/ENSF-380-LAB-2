# ENSF-380-LAB-2
# YYC Pet Resort Management System

## How to Run

To run the YYC Pet Resort Management System application, follow these steps:

### Prerequisites

- Ensure you have Java Development Kit (JDK) installed on your system.
  - You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
  - Verify the installation by running the following command in your terminal or command prompt:
    ```sh
    java -version
    ```
  - The output should display the version of Java installed on your machine.

### Steps to Run

1. **Clone the Repository**:
   - Clone the project repository from GitHub to your local machine:
     ```
     git clone https://github.com/yourusername/ENSF-380-LAB-2.git
     ```
   - Replace `yourusername` with your actual GitHub username.

2. **Navigate to the Project Directory**:
   - Open your terminal or command prompt and navigate to the project directory:
     ```
     cd /ENSF380/LAB2
     ```

3. **Compile the Project**:
   - Compile the Java files using the following command:
     ```sh
     javac -d bin src/*.java
     ```
   - This command compiles all the Java source files in the `src` directory and places the compiled classes in the `bin` directory.

4. **Run the Application**:
   - Run the application using the following command:
     ```sh
     java -cp bin Application
     ```
   - This command runs the main application.

## How to Use

Once the application is running, follow these instructions to use the YYC Pet Resort Management System:

### Main Menu

1. **Create a New Booking**:
   - Select option `1` to create a new booking.
   - Enter the client details when prompted (name, phone number, address).
   - Enter the pet details when prompted (name, species, breed, age).
   - Enter the care profile details for the pet (feeding instructions, medication list, medication instructions).
   - Enter the booking details (start date, end date).
   - Enter the payment amount.
   - The system will save the booking and payment information and confirm the action.

2. **Delete Existing Booking**:
   - Select option `2` to delete an existing booking.
   - Enter the booking ID to be deleted when prompted.
   - The system will delete the booking and confirm the action.

3. **View Current Bookings**:
   - Select option `3` to view current bookings.
   - Choose to view by booking ID or view all active bookings.
   - Enter the booking ID if choosing to view by ID.
   - The system will display the relevant booking information.

4. **Generate Reports**:
   - Select option `4` to generate reports.
   - Choose the type of report to generate (bookings or payments).
   - The system will generate and display the report.

5. **View Historical Records**:
   - Select option `5` to view historical records of bookings.
   - The system will display all historical booking records.
     
6. **Send Notification**:
   - Select option `7` to send a notification about a booking to a client.
   - You can choose the method of sending a notification and the message to be written.
     
7. **Exit**:
   - Select option `6` to exit the application.

### Additional Features

- **Manage Care Profile**:
  - The staff can add, update, or delete care profiles for pets.

### Notes

- The application is designed to be used by both staff and admin roles.
- Admins have additional functionalities such as generating reports and viewing historical records.

For any further assistance or queries, please refer to the project documentation or contact the project maintainers.
