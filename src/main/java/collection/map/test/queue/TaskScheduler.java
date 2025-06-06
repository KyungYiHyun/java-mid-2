package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task compressionTask) {
        tasks.offer(compressionTask);

    }

    public int getRemainingTasks() {
        return tasks.size();

    }

    public void processNextTask() {
        Task task = tasks.poll();
        task.execute();
    }
}
