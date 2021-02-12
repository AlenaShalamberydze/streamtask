package leverx.example.stream.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
public class Student {

    private Map<String, Integer> rating;
    private String name;

    public Student(String name) {
        rating = new HashMap<>();
        this.name = name;
    }

    public Student rate(String subject, Integer rate) {
        rating.put(subject, rate);
        return this;
    }

}
