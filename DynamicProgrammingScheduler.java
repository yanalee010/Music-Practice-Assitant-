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
    public int calculateOptimalValue(int availableTime) {

        if(availableTime <= 0) {
            throw new IllegalArgumentException("Available practice time must be greater than zero.");
        }

        int n = tasks.size();

        int[][] dp = new int[n + 1][availableTime + 1];

        for (int i = 1; i<= n; i++) {
            PracticeTask task = tasks.get(i - 1);

            for(int time = 0; time <= availableTime; time++) {
                if(task.duration <= time){
                    int include = task.value + dp[i - 1][time - task.duration];

                    int exclude = dp[i - 1][time];
                    dp[i][time] = Math.max(include, exclude);
                } else {
                    dp[i][time] = dp[i - 1][time];
                }
            }
        }
        return dp[n][availableTime];
    }

    public ArrayList<PracticeTask> getSelectedTasks(int availableTime) {
        if (availableTime <= 0) {
            throw new IllegalArgumentException("Available practice time must be greater than zero.");
        }

        int n = tasks.size();
        int[][] dp = new int[n + 1][availableTime + 1];

        for (int i = 1; i <= n; i++) {
            
            PracticeTask task = tasks.get(i - 1);

            for(int time = 0; time <= availableTime; time++) {
                if (task.duration <= time) {

                    int include = task.value + dp[i - 1][time - task.duration];

                    int exclude = dp[i - 1][time];

                    dp[i][time] = Math.max(include, exclude);
                } else {
                    dp[i][time] = dp[i - 1][time];
                }
            }
        }
        ArrayList<PracticeTask> selectedTasks = new ArrayList<>();
        int remainingTime = availableTime;

        for(int i = n; i > 0; i--){
            if(dp[i][remainingTime] != dp[i-1][remainingTime]) {
                PracticeTask task = tasks.get(i - 1);
                selectedTasks.add(0, task);
                remainingTime -= task.duration;
            }
        }
        return selectedTasks;
    }
}
