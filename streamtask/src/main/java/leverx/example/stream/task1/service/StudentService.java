package leverx.example.stream.task1.service;

import leverx.example.stream.task1.entity.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.joining;

public class StudentService {

    public static Double countAverageMark(List<Student> students, String subject) {
        return students.stream()
                .filter(student -> student.getRating().containsKey(subject))
                .mapToInt(student -> student.getRating().get(subject))
                .average().orElse(0);
    }

    public static List<String> getRatingReport(List<Student> students) {

        List<String> rating = new ArrayList<>();

        getAllSubjects(students).forEach(subject -> {
            String subjectRating = students.stream()
                    .filter(student -> student.getRating().containsKey(subject))
                    .map(student -> student.getName() + " : "
                            + student.getRating().get(subject).toString())
                    .collect(joining(", "));
            rating.add(subject.toUpperCase() + ": (" + subjectRating + ")");
        });

        return rating;
    }

    private static Set<String> getAllSubjects(List<Student> students) {
        Set<String> subjects = new HashSet<>();
        students.forEach(student -> subjects.addAll(student.getRating().keySet()));
        return subjects;
    }
}
