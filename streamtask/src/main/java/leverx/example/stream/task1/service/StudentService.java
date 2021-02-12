package leverx.example.stream.task1.service;

import leverx.example.stream.task1.entity.Student;

import java.util.List;

public class StudentService {

    public Double averageMark(List<Student> students, String subject) {
        return students.stream()
                .filter(student -> student.getRating().containsKey(subject))
                .mapToInt(student -> student.getRating().get(subject))
                .average().orElse(0);
    }
}
