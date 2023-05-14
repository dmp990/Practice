package com.sparta.aa.stringpool;

public class App {
    public static void main(String[] args) {
        int size = Integer.MAX_VALUE / 10;

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = "Hello";
        }

        /*
        for (int i = 0; i < size; i++) {
            arr[i] = "Hello" + i;
        }
        */

    }
}
