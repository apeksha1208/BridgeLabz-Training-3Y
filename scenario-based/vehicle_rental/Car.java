public class Car extends Vehicle implements Rentable {
    private int seatingCapacity;
    private String transmission;

    public Car(String vehicleId, String model, double baseRate, int seatingCapacity, String transmission) {
        super(vehicleId, model, baseRate);
        this.seatingCapacity = seatingCapacity;
        this.transmission = transmission;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public double calculateRent(int days) {
        double total = baseRate * days;
        if (seatingCapacity > 4) {
            total = total * 1.2;
        }
        if (days > 14) {
            total = total * 0.85;
        }
        return total;
    }
}
