package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class Database1{
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        };
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        List<Student> students = Arrays.asList(student1,student2);
        students.add(student1);
        students.add(student2);
        Object Database1;
    }
}