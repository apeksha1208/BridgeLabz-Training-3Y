public class RentalSystem {
    public static void main(String[] args) {
        Bike bike = new Bike("B001", "Honda CB", 50.0, 150, "Petrol");
        Car car = new Car("C001", "Toyota Camry", 80.0, 5, "Automatic");
        Truck truck = new Truck("T001", "Ford F150", 120.0, 1500, "Pickup");

        Customer customer = new Customer("CUST001", "John Doe", "123-456-7890", "LIC123");

        System.out.println("Bike rental for 5 days: $" + bike.calculateRent(5));
        System.out.println("Car rental for 10 days: $" + car.calculateRent(10));
        System.out.println("Truck rental for 20 days: $" + truck.calculateRent(20));

        bike.setAvailable(false);
        System.out.println("Bike available: " + bike.isAvailable());
    }
}
