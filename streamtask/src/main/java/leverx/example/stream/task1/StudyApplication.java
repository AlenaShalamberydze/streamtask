package leverx.example.stream.task1;

import leverx.example.stream.task1.entity.Student;

import java.util.List;

import static leverx.example.stream.task1.service.StudentService.*;
import static leverx.example.stream.task1.service.StudentServiceBuilder.createStudentList;

public class StudyApplication {
    public static void main(String[] args) {
        String subject = "Physics";
        List<Student> students = createStudentList();

        System.out.println(countAverageMark(students, subject));

        getRatingReport(students).stream()
                .forEach(System.out::println);
    }

}
