public class Bike extends Vehicle implements Rentable {
    private int engineCapacity;
    private String fuelType;

    public Bike(String vehicleId, String model, double baseRate, int engineCapacity, String fuelType) {
        super(vehicleId, model, baseRate);
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double calculateRent(int days) {
        double total = baseRate * days;
        if (days > 7) {
            total = total * 0.9;
        }
        return total;
    }
}
