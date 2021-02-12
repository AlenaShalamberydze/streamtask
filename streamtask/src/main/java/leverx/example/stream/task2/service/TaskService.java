package leverx.example.stream.task2.service;

import leverx.example.stream.task2.entity.Task;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService {

    public String filterTaskListByDate(List<Task> tasks, int amount) {
        return tasks.stream()
                .limit(amount)
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .collect(Collectors.joining(", "));
    }
}
