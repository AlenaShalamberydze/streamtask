package leverx.example.stream.task2;

import leverx.example.stream.task2.service.TaskService;
import leverx.example.stream.task2.service.TaskServiceBuilder;

public class TaskSearchApp {
    public static void main(String[] args) {
        TaskServiceBuilder builder = new TaskServiceBuilder();
        TaskService service = new TaskService();

        System.out.println(service.filterTaskListByDate(builder.createTaskList(), 6));
    }

}
