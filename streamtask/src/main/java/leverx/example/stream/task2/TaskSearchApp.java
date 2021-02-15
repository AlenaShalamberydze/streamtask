package leverx.example.stream.task2;

import static leverx.example.stream.task2.service.TaskService.filterTaskListByDate;
import static leverx.example.stream.task2.service.TaskServiceBuilder.createTaskList;

public class TaskSearchApp {
    public static void main(String[] args) {

        System.out.println(filterTaskListByDate(createTaskList(), 6));
    }

}
