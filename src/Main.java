
public class Main {
    public static void main(String[] args) {

        GreedyScheduler scheduler = new GreedyScheduler();

        scheduler.addTask(new PracticeTask("Scales", 10, 8));
        scheduler.addTask(new PracticeTask("Sight-reading", 20, 14));
        scheduler.addTask(new PracticeTask("Difficult passage", 30, 20));

        scheduler.createSchedule(50);
    }
}
