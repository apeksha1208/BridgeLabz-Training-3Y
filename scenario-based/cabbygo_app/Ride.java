public class Ride implements IRideService {
    private String rideId;
    private Vehicle vehicle;
    private Driver driver;
    private String pickupLocation;
    private String dropLocation;
    private double distance;
    private double fare;
    private boolean isCompleted;
    
    public Ride(String rideId, Vehicle vehicle, Driver driver, String pickupLocation, String dropLocation) {
        this.rideId = rideId;
        this.vehicle = vehicle;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = 0.0;
        this.fare = 0.0;
        this.isCompleted = false;
    }
    
    public String getRideId() {
        return rideId;
    }
    
    public void setRideId(String rideId) {
        this.rideId = rideId;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    public String getPickupLocation() {
        return pickupLocation;
    }
    
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    
    public String getDropLocation() {
        return dropLocation;
    }
    
    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public double getFare() {
        return fare;
    }
    
    public void setFare(double fare) {
        this.fare = fare;
    }
    
    public boolean isCompleted() {
        return isCompleted;
    }
    
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    
    @Override
    public void bookRide() {
        System.out.println("Ride " + rideId + " booked from " + pickupLocation + " to " + dropLocation);
        vehicle.setAvailable(false);
        driver.setAvailable(false);
    }
    
    @Override
    public void endRide() {
        System.out.println("Ride " + rideId + " completed. Fare: $" + fare);
        vehicle.setAvailable(true);
        driver.setAvailable(true);
        isCompleted = true;
    }
}
