package leverx.example.stream.task2.service;

import leverx.example.stream.task2.entity.Task;
import leverx.example.stream.task2.entity.TaskType;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskService {

    public static String filterTaskListByDate(List<Task> tasks, int amount) {
        return tasks.stream()
                .limit(amount)
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .collect(Collectors.joining(", "));
    }

    public static Map<Object, List<Task>> groupTasksByParameters(List<Task> tasks){
        return tasks.stream()
                .collect(Collectors.groupingBy(task -> List. of(
                        task.getTitle(),
                        task.getType(),
                        task.getCreatedOn(),
                        task.getTags())));
    }

}
