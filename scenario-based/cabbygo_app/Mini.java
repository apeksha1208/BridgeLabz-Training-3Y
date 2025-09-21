public class Mini extends Vehicle {
    private double baseFare;
    private double ratePerKm;
    
    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Mini");
        this.baseFare = 50.0;
        this.ratePerKm = 8.0;
    }
    
    public Mini(String vehicleNumber, int capacity, double baseFare, double ratePerKm) {
        super(vehicleNumber, capacity, "Mini");
        this.baseFare = baseFare;
        this.ratePerKm = ratePerKm;
    }
    
    public double getBaseFare() {
        return baseFare;
    }
    
    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }
    
    public double getRatePerKm() {
        return ratePerKm;
    }
    
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
    
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}
