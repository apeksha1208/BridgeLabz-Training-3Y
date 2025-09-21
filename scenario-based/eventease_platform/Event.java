import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    private String eventId;
    private String eventName;
    private String location;
    private String date;
    private int attendees;
    private double venueCost;
    private double servicesCost;
    private double discount;
    
    public Event(String eventId, String eventName, String location, String date) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = 0;
        this.venueCost = 0.0;
        this.servicesCost = 0.0;
        this.discount = 0.0;
    }
    
    public Event(String eventId, String eventName, String location, String date, int attendees) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = 0.0;
        this.servicesCost = 0.0;
        this.discount = 0.0;
    }
    
    public String getEventId() {
        return eventId;
    }
    
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    public String getEventName() {
        return eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public int getAttendees() {
        return attendees;
    }
    
    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }
    
    public double getVenueCost() {
        return venueCost;
    }
    
    public void setVenueCost(double venueCost) {
        this.venueCost = venueCost;
    }
    
    public double getServicesCost() {
        return servicesCost;
    }
    
    public void setServicesCost(double servicesCost) {
        this.servicesCost = servicesCost;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public double calculateTotalCost() {
        return venueCost + servicesCost - discount;
    }
    
    public abstract void schedule();
}
