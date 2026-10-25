import java.util.PriorityQueue;
import java.util.Comparator;

public class GreedyScheduler {
    PriorityQueue<PracticeTask> queue = new PriorityQueue<>(
        Comparator.comparingDouble(PracticeTask::getPriority).reversed()
    );

    public void addTask(PracticeTask task) {
        queue.add(task);
    }

    public void displayTasks() {
        while (!queue.isEmpty()) {

            PracticeTask task = queue.poll();
            System.out.println(
                task.name + " - Priority: " + task.getPriority()
            );
        }
    }

    public void createSchedule(int availableTime) {

        int remainingTime = availableTime;
        int totalValue = 0;

        System.out.println("Practice Schedule:");
        while (!queue.isEmpty()) {
            PracticeTask task = queue.poll();
            if (task.duration <= remainingTime) {
                System.out.println(task.name + " - " + task.duration + " minutes");
            remainingTime -=task.duration;
            totalValue += task.value;
        }
    }
    System.out.println("Total value: " + totalValue);
    System.out.println("Remaining time: " + remainingTime);

    }
}
