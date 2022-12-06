package org.DataBase;

import Java_8_Consumer_Example.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Employee2 {
    public static void main(String[] args) {
List<Employee>allEmployee=Employee1.getAllEmployee();
         Supplier<Employee> studentSupplier = () -> {
            return new Employee("Adam", "Vogel" ,2, 37878778,  Arrays.asList("swimming", "basketball", "volleyball"));
        };
        Consumer<Employee>consumer=employee -> {
            System.out.print("Name :"+employee.getFirstname()+"\t");
            System.out.print("LastName :"+employee.getLastname()+"\t");
        };
        consumer.accept(allEmployee.get(0));
    }
}
