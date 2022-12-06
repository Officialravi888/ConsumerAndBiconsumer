package org.DataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class Employee1 {
    public static List<Employee> getAllEmployee() {
        Employee Emp1 = new Employee("Ravi", "kant", 3, 75720617, Arrays.asList("swimming", "basketball", "volleyball"));
        List<Employee> employee = Arrays.asList(Emp1);
        return employee;
    }
}


