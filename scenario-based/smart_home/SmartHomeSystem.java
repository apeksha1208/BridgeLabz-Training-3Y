public class SmartHomeSystem {
    public static void main(String[] args) {
        UserController controller = new UserController("CTRL001", "John Doe");
        
        Light livingRoomLight = new Light("L001", "Living Room Light", 80, "Warm White");
        Fan bedroomFan = new Fan("F001", "Bedroom Fan", 2, true);
        AC livingRoomAC = new AC("AC001", "Living Room AC", 24, "Cool");
        
        controller.addAppliance(livingRoomLight);
        controller.addAppliance(bedroomFan);
        controller.addAppliance(livingRoomAC);
        
        livingRoomLight.turnOn();
        bedroomFan.turnOn();
        livingRoomAC.turnOn();
        
        System.out.println("Total power consumption: " + controller.getTotalPowerConsumption() + "W");
        
        if (livingRoomLight.getPowerConsumption() > bedroomFan.getPowerConsumption()) {
            System.out.println("Light consumes more power than fan");
        }
    }
}
