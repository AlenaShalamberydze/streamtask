package leverx.example.stream.task2;

import leverx.example.stream.task2.entity.Task;

import java.util.List;

import static leverx.example.stream.task2.service.TaskService.*;
import static leverx.example.stream.task2.service.TaskServiceBuilder.createTaskList;

public class TaskSearchApp {
    public static void main(String[] args) {
        List<Task> tasks = createTaskList();

        System.out.println(filterTaskListByDate(tasks, 6));

        System.out.println(groupTasksByParameters(tasks));
    }

}
