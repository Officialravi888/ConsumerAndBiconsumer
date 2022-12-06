package Consumer;
import Java_8_Consumer_Example.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ConsumerStudentExample {
    public static void main(String[] args) {
        List<Student> studentList = createStudentList();
        Consumer<Student> consumerForStudent = s -> System.out.println(s);
        studentList.forEach(consumerForStudent);
    }
    public static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Ravi", "M", 19);
        Student s2 = new Student(2, "Raj", "M", 19);
        studentList.add(s1);
        studentList.add(s2);
        return studentList;
    }
}