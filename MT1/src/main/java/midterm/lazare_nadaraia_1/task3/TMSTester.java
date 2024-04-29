package midterm.lazare_nadaraia_1.task3;

public class TMSTester {
    public static void main(String[] args) {

        TMS tms = new TMS();

        tms.addTask(new Task("Task 1", "Learn to play an instrument"));
        tms.addTask(new Task("Task 2", "Make a Task Management System"));
        tms.addTask(new Task("Task 3", "Complete all other tasks"));

        tms.removeTask("Task 2");

        tms.printTasks();
    }
}