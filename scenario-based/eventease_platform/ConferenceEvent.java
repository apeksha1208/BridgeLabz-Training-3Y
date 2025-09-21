public class ConferenceEvent extends Event {
    private String topic;
    private int speakers;
    private boolean hasCatering;
    
    public ConferenceEvent(String eventId, String eventName, String location, String date, String topic) {
        super(eventId, eventName, location, date);
        this.topic = topic;
        this.speakers = 1;
        this.hasCatering = false;
    }
    
    public ConferenceEvent(String eventId, String eventName, String location, String date, int attendees, String topic, int speakers, boolean hasCatering) {
        super(eventId, eventName, location, date, attendees);
        this.topic = topic;
        this.speakers = speakers;
        this.hasCatering = hasCatering;
    }
    
    public String getTopic() {
        return topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    public int getSpeakers() {
        return speakers;
    }
    
    public void setSpeakers(int speakers) {
        this.speakers = speakers;
    }
    
    public boolean isHasCatering() {
        return hasCatering;
    }
    
    public void setHasCatering(boolean hasCatering) {
        this.hasCatering = hasCatering;
    }
    
    @Override
    public void schedule() {
        System.out.println("Conference scheduled: " + getEventName() + " on " + topic + " with " + speakers + " speakers");
    }
}
