public abstract class Appliance {
    private String deviceId;
    private String deviceName;
    private boolean isOn;
    private double powerConsumption;
    
    public Appliance(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isOn = false;
        this.powerConsumption = 0.0;
    }
    
    public Appliance(String deviceId, String deviceName, double powerConsumption) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isOn = false;
        this.powerConsumption = powerConsumption;
    }
    
    public String getDeviceId() {
        return deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    
    public String getDeviceName() {
        return deviceName;
    }
    
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public void setOn(boolean on) {
        isOn = on;
    }
    
    public double getPowerConsumption() {
        return powerConsumption;
    }
    
    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    
    public abstract void turnOn();
    public abstract void turnOff();
}
