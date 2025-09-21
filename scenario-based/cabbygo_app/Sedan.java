public class Sedan extends Vehicle {
    private double baseFare;
    private double ratePerKm;
    
    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Sedan");
        this.baseFare = 80.0;
        this.ratePerKm = 12.0;
    }
    
    public Sedan(String vehicleNumber, int capacity, double baseFare, double ratePerKm) {
        super(vehicleNumber, capacity, "Sedan");
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
