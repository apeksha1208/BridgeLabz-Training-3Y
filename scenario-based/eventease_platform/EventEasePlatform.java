public class EventEasePlatform {
    public static void main(String[] args) {
        User organizer = new User("U001", "John Smith", "john@email.com", "123-456-7890");
        
        BirthdayEvent birthday = new BirthdayEvent("E001", "Alice's Birthday", "Community Hall", "2024-02-15", 25, 50, "Princess", true);
        ConferenceEvent conference = new ConferenceEvent("E002", "Tech Summit 2024", "Convention Center", "2024-03-20", "Artificial Intelligence", 100, 5, true);
        
        birthday.setVenueCost(500.0);
        birthday.setServicesCost(300.0);
        birthday.setDiscount(50.0);
        
        conference.setVenueCost(2000.0);
        conference.setServicesCost(800.0);
        conference.setDiscount(200.0);
        
        EventManager birthdayManager = new EventManager(birthday);
        EventManager conferenceManager = new EventManager(conference);
        
        birthdayManager.schedule();
        conferenceManager.schedule();
        
        System.out.println("Birthday total cost: $" + birthday.calculateTotalCost());
        System.out.println("Conference total cost: $" + conference.calculateTotalCost());
        
        double totalCost = birthday.getVenueCost() + birthday.getServicesCost() - birthday.getDiscount();
        System.out.println("Birthday cost calculation: $" + totalCost);
    }
}
