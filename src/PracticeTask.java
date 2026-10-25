public class PracticeTask {
    String name;
    int duration;
    int value;

    public PracticeTask(String name, int duration, int value){
        this.name = name;
        this.duration = duration;
        this.value = value;
    }

    public double getPriority() {
        return (double) value / duration;
    }
}
