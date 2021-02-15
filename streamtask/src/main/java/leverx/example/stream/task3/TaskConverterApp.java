package leverx.example.stream.task3;

import static leverx.example.stream.task2.service.TaskServiceBuilder.createTaskList;
import static leverx.example.stream.task3.service.TaskDtoService.convert;

public class TaskConverterApp {
    public static void main(String[] args) {

        System.out.println(convert(createTaskList()));
    }

}
