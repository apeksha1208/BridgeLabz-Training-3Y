public class Fan extends Appliance implements Controllable {
    private int speed;
    private boolean oscillation;
    
    public Fan(String deviceId, String deviceName) {
        super(deviceId, deviceName, 75.0);
        this.speed = 1;
        this.oscillation = false;
    }
    
    public Fan(String deviceId, String deviceName, int speed, boolean oscillation) {
        super(deviceId, deviceName, 75.0);
        this.speed = speed;
        this.oscillation = oscillation;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean isOscillation() {
        return oscillation;
    }
    
    public void setOscillation(boolean oscillation) {
        this.oscillation = oscillation;
    }
    
    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan " + getDeviceName() + " turned on at speed " + speed);
    }
    
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan " + getDeviceName() + " turned off");
    }
}
