public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this("Guest", "Compact", 1, 40.0);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this(customerName, carModel, rentalDays, 40.0);
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public String toString() {
        return "CarRental{customerName='" + customerName + "', carModel='" + carModel + "', rentalDays=" + rentalDays
                + ", dailyRate=" + dailyRate + ", totalCost=" + calculateTotalCost() + "}";
    }
}
