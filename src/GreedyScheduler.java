import java.util.PriorityQueue;
import java.util.Comparator;

public class GreedyScheduler {
    PriorityQueue<PracticeTask> queue = new PriorityQueue<>(
        Comparator.comparingDouble(PracticeTask::getPriority).reversed()
    );

    public void addTask(PracticeTask task) {
        queue.add(task);
    }

    public void createSchedule(int availableTime) {

        if (availableTime <= 0){
            throw new IllegalArgumentException("Available practice time must be greater than zero.");
        }

        int remainingTime = availableTime;
        int totalValue = 0;
        int selectedTasks = 0;

        PriorityQueue<PracticeTask> tempQueue = new PriorityQueue<>(queue);

        System.out.println("Practice Schedule:");
        while (!tempQueue.isEmpty()) {
            PracticeTask task = tempQueue.poll();
            if (task.duration <= remainingTime) {
                System.out.println(task.name + " - " + task.duration + " minutes");
            remainingTime -=task.duration;
            totalValue += task.value;
            selectedTasks++;
        }
    }
    System.out.println("Total tasks selected: " + selectedTasks);
    System.out.println("Total time used: " + (availableTime - remainingTime) + " minutes");
    System.out.println("Total value: " + totalValue);
    System.out.println("Remaining time: " + remainingTime + " minutes");

    }
}
