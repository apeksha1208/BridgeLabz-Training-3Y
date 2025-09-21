public class BirthdayEvent extends Event {
    private int age;
    private String theme;
    private boolean hasCake;
    
    public BirthdayEvent(String eventId, String eventName, String location, String date, int age) {
        super(eventId, eventName, location, date);
        this.age = age;
        this.theme = "General";
        this.hasCake = true;
    }
    
    public BirthdayEvent(String eventId, String eventName, String location, String date, int attendees, int age, String theme, boolean hasCake) {
        super(eventId, eventName, location, date, attendees);
        this.age = age;
        this.theme = theme;
        this.hasCake = hasCake;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getTheme() {
        return theme;
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    public boolean isHasCake() {
        return hasCake;
    }
    
    public void setHasCake(boolean hasCake) {
        this.hasCake = hasCake;
    }
    
    @Override
    public void schedule() {
        System.out.println("Birthday party scheduled for " + getEventName() + " at age " + age + " with " + getTheme() + " theme");
    }
}
