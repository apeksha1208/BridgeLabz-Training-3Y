public class Truck extends Vehicle implements Rentable {
    private double loadCapacity;
    private String truckType;

    public Truck(String vehicleId, String model, double baseRate, double loadCapacity, String truckType) {
        super(vehicleId, model, baseRate);
        this.loadCapacity = loadCapacity;
        this.truckType = truckType;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public double calculateRent(int days) {
        double total = baseRate * days;
        if (loadCapacity > 1000) {
            total = total * 1.5;
        }
        if (days > 30) {
            total = total * 0.8;
        }
        return total;
    }
}
