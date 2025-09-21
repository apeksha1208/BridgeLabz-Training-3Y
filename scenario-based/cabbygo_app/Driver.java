public class Driver {
    private String name;
    private String licenseNumber;
    private double rating;
    private String location;
    private boolean isAvailable;
    
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = 5.0;
        this.location = "";
        this.isAvailable = true;
    }
    
    public Driver(String name, String licenseNumber, double rating, String location) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
        this.location = location;
        this.isAvailable = true;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }
    
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
