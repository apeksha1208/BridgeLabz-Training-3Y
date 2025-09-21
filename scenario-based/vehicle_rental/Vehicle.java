public abstract class Vehicle {
    protected String vehicleId;
    protected String model;
    protected double baseRate;
    protected boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRate = baseRate;
        this.isAvailable = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract double calculateRent(int days);
}
