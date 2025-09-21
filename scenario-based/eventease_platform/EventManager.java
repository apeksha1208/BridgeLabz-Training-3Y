public class EventManager implements ISchedulable {
    private Event event;
    
    public EventManager(Event event) {
        this.event = event;
    }
    
    public Event getEvent() {
        return event;
    }
    
    public void setEvent(Event event) {
        this.event = event;
    }
    
    @Override
    public void schedule() {
        event.schedule();
    }
    
    @Override
    public void reschedule() {
        System.out.println("Event " + event.getEventName() + " has been rescheduled");
    }
    
    @Override
    public void cancel() {
        System.out.println("Event " + event.getEventName() + " has been cancelled");
    }
}
