public class Light extends Appliance implements Controllable {
    private int brightness;
    private String color;
    
    public Light(String deviceId, String deviceName) {
        super(deviceId, deviceName, 10.0);
        this.brightness = 50;
        this.color = "White";
    }
    
    public Light(String deviceId, String deviceName, int brightness, String color) {
        super(deviceId, deviceName, 10.0);
        this.brightness = brightness;
        this.color = color;
    }
    
    public int getBrightness() {
        return brightness;
    }
    
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light " + getDeviceName() + " turned on with brightness " + brightness);
    }
    
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light " + getDeviceName() + " turned off");
    }
}
