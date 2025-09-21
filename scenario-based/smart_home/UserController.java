import java.util.ArrayList;
import java.util.List;

public class UserController {
    private String controllerId;
    private String userName;
    private List<Appliance> appliances;
    
    public UserController(String controllerId, String userName) {
        this.controllerId = controllerId;
        this.userName = userName;
        this.appliances = new ArrayList<>();
    }
    
    public String getControllerId() {
        return controllerId;
    }
    
    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public List<Appliance> getAppliances() {
        return appliances;
    }
    
    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }
    
    public void removeAppliance(Appliance appliance) {
        appliances.remove(appliance);
    }
    
    public double getTotalPowerConsumption() {
        double total = 0;
        for (Appliance appliance : appliances) {
            if (appliance.isOn()) {
                total += appliance.getPowerConsumption();
            }
        }
        return total;
    }
}
