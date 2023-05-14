package com.sparta.aa.record;

public class App {
    public static void main(String[] args) {
        Customer one = new Customer(2, "Ali");
        System.out.println(one.name());
        System.out.println(one);

    }
}

record Customer(int id, String name) {}
