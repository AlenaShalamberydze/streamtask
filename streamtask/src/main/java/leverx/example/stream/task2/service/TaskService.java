package leverx.example.stream.task2.service;

import leverx.example.stream.task2.entity.Task;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

public class TaskService {

    public static String filterTaskListByDate(List<Task> tasks, int amount) {
        return tasks.stream()
                .limit(amount)
                .sorted(comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .collect(joining(", "));
    }

    public static Map<Object, List<Task>> groupTasksByParameters(List<Task> tasks) {
        return tasks.stream()
                .collect(groupingBy(task -> List.of(
                        task.getTitle(),
                        task.getType(),
                        task.getCreatedOn(),
                        task.getTags())));
    }

}
