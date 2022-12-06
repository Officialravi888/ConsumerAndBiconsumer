package com.Emp;

import java.util.function.Supplier;

public class SupplierInterfaceEx2 {
    public static void main(String[] args) {
        Supplier<String> name1 = new Supplier<String>() {
            @Override
            public String get() {
                return new String("Ravi");
            }
        };
        System.out.println(name1.get());;
        Supplier<String> name2 = () -> new String("kant");
        System.out.println(name2.get());
        Supplier<String> name3 = () -> "raj";
        System.out.println(name3.get());
    }
    public static void printUser(Supplier<User> userSupplier){
        System.out.println(userSupplier.get());

    }
}
