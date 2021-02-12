package leverx.example.stream.task1;

import leverx.example.stream.task1.service.StudentService;
import leverx.example.stream.task1.service.StudentServiceBuilder;

public class AverageMarkApp {
    public static void main(String[] args) {
        StudentServiceBuilder builder = new StudentServiceBuilder();
        StudentService service = new StudentService();
        String subject = "Physics";

        System.out.println(service.averageMark(builder.createStudentList(), subject));
    }

}
