package leverx.example.stream.task1.service;

import leverx.example.stream.task1.entity.Student;

import java.util.Arrays;
import java.util.List;

public class StudentServiceBuilder {

    public List<Student> createStudentList() {
        Student student1 = new Student("Ivan Petrov")
                .rate("Math", 9).rate("Physics", 9);

        Student student2 = new Student("Petr Ivanov")
                .rate("Math", 4).rate("Biology", 5);

        Student student3 = new Student("Alex Smith")
                .rate("History", 6).rate("Economy", 7);

        return Arrays.asList(student1, student2, student3);
    }
}
