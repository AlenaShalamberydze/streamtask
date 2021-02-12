package leverx.example.stream.task3;

import leverx.example.stream.task2.service.TaskServiceBuilder;
import leverx.example.stream.task3.service.TaskDtoService;

public class TaskConverterApp {
    public static void main(String[] args) {
        TaskServiceBuilder builder = new TaskServiceBuilder();
        TaskDtoService service = new TaskDtoService();

        System.out.println(service.convert(builder.createTaskList()));
    }

}
