public interface ISchedulable {
    void schedule();
    void reschedule();
    void cancel();
}
