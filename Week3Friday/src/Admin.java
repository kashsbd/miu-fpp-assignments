import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<>();
        for (Student stu : students) {
            studentMap.put(new Key(stu.getFirstName(), stu.getLastName()), stu);
        }
        return studentMap;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        double result = 0.0;
        for (Student stu : maps.values()) {
            result += stu.getGpa();
        }
        return (result / maps.size());
    }
}
