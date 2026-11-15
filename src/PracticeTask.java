public class PracticeTask {
    String name;
    int duration;
    int value;

    public PracticeTask(String name, int duration, int value){
         if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Task name cannot be empty.");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than zero.");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative.");
        }
        this.name = name;
        this.duration = duration;
        this.value = value;
    }

    public double getPriority() {
        return (double) value / duration;
    }
}
