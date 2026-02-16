class Vehicle {
    String ownerName;      // Instance variable
    String vehicleType;    // Instance variable
    static double registrationFee = 500.0; // Class variable

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType +
                           ", Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(700);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
