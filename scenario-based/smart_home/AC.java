public class AC extends Appliance implements Controllable {
    private int temperature;
    private String mode;
    
    public AC(String deviceId, String deviceName) {
        super(deviceId, deviceName, 1500.0);
        this.temperature = 22;
        this.mode = "Cool";
    }
    
    public AC(String deviceId, String deviceName, int temperature, String mode) {
        super(deviceId, deviceName, 1500.0);
        this.temperature = temperature;
        this.mode = mode;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    public String getMode() {
        return mode;
    }
    
    public void setMode(String mode) {
        this.mode = mode;
    }
    
    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC " + getDeviceName() + " turned on at " + temperature + "°C in " + mode + " mode");
    }
    
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC " + getDeviceName() + " turned off");
    }
}
