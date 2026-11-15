import java.util.ArrayList;

public class DynamicProgrammingScheduler {
    
    private ArrayList<PracticeTask> tasks;

    public DynamicProgrammingScheduler() {
        tasks = new ArrayList<>();
    }

    public void addTask(PracticeTask task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null.");
        }
        tasks.add(task);
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
