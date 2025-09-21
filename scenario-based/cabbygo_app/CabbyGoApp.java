public class CabbyGoApp {
    public static void main(String[] args) {
        Mini mini = new Mini("MH01AB1234", 4);
        Sedan sedan = new Sedan("MH02CD5678", 4);
        SUV suv = new SUV("MH03EF9012", 6);
        
        Driver driver1 = new Driver("Raj Kumar", "DL123456", 4.5, "Airport");
        Driver driver2 = new Driver("Priya Singh", "DL789012", 4.8, "Mall");
        
        Ride ride1 = new Ride("R001", mini, driver1, "Airport", "Downtown");
        ride1.setDistance(15.5);
        ride1.setFare(mini.calculateFare(15.5));
        
        ride1.bookRide();
        ride1.endRide();
        
        Ride ride2 = new Ride("R002", suv, driver2, "Mall", "Beach");
        ride2.setDistance(8.2);
        ride2.setFare(suv.calculateFare(8.2));
        
        ride2.bookRide();
        ride2.endRide();
        
        System.out.println("Mini fare for 15.5km: $" + mini.calculateFare(15.5));
        System.out.println("SUV fare for 8.2km: $" + suv.calculateFare(8.2));
    }
}
