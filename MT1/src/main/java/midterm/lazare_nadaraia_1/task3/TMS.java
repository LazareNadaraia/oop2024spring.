package midterm.lazare_nadaraia_1.task3;

import java.util.ArrayList;
import java.util.List;

class TMS {
    private ArrayList<Task> tasks;

    public TMS() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(String title) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTitle().equals(title)) {
                tasks.remove(i);
                return; // Exit loop after removing the task
            }
        }
        System.out.println("Task with title '" + title + "' not found.");
    }

    public void printTasks() {
        System.out.println("Tasks in the system:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
