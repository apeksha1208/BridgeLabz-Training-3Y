public class SUV extends Vehicle {
    private double baseFare;
    private double ratePerKm;
    
    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "SUV");
        this.baseFare = 120.0;
        this.ratePerKm = 15.0;
    }
    
    public SUV(String vehicleNumber, int capacity, double baseFare, double ratePerKm) {
        super(vehicleNumber, capacity, "SUV");
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
