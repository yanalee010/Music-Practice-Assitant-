public class GreedyScheduler {
    private PracticeTaskHeap queue;
    public GreedyScheduler() {
        queue = new PracticeTaskHeap();
    }

    public void addTask(PracticeTask task) {
        queue.insert(task);
    }

    public void createSchedule(int availableTime) {

        if (availableTime <= 0){
            throw new IllegalArgumentException("Available practice time must be greater than zero.");
        }

        int remainingTime = availableTime;
        int totalValue = 0;
        int selectedTasks = 0;

        PracticeTaskHeap tempQueue = queue.copy();

        System.out.println("Practice Schedule:");
        while (!tempQueue.isEmpty()) {
            PracticeTask task = tempQueue.extractMax();
            if (task.duration <= remainingTime) {
                System.out.println(task.name + " - " + task.duration + " minutes");
            remainingTime -= task.duration;
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
