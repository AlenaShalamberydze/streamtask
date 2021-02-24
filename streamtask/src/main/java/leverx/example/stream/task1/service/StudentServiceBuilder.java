package leverx.example.stream.task1.service;

import leverx.example.stream.task1.entity.Student;

import static java.util.Arrays.asList;
import java.util.List;

public class StudentServiceBuilder {

    public static List<Student> createStudentList() {
        Student student1 = new Student("Ivan Petrov")
                .rate("Math", 9).rate("Physics", 9);

        Student student2 = new Student("Petr Ivanov")
                .rate("Math", 4).rate("Biology", 5);

        Student student3 = new Student("Alex Smith")
                .rate("History", 6).rate("Economy", 7);

        Student student4 = new Student("John Williams")
                .rate("Math", 10).rate("Physics", 9);

        Student student5 = new Student("Anna Smith")
                .rate("Chemistry", 7).rate("Biology", 4);

        Student student6 = new Student("Nikolay Sidorov")
                .rate("Math", 8).rate("Economy", 5);

        return asList(student1, student2, student3, student4, student5, student6);
    }
}
