package com.Emp;

import java.util.function.Supplier;

public class SupplierInterfaceEx1 {
    public static void main(String[] args) {
        Supplier<String> name1 = new Supplier(){
            @Override
            public Object get() {
                return new String("Ravi");
            }
        };

        System.out.println(name1.get());;
        Supplier<String> name2 = () -> new String("Ravi");

        System.out.println(name1.get());
    }
}
