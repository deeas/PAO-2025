package markerinterface;

public class TaskRunner {

    public static void runTask(Object task) {
        if (task instanceof ImportantTask) {
            System.out.println("[!!!] This is an important task");
        } else if (task instanceof RegularTask regularTask) {
            regularTask.execute();
        } else if (task instanceof CriticalTask criticalTask) {
            criticalTask.execute();
        }
    }
    public static void main(String[] args) {
        runTask(new RegularTask());
        runTask(new CriticalTask());
    }
}
