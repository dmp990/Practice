package com.sparta.aa.finalpractice;

public class App {
    public static void main(String[] args) {
        Child one = new Child();

        one.printHello();
        one.printHello(1);

        Parent two = new Child();
        two.printHello();
        ((Child) two).printHello(1);
    }
}
