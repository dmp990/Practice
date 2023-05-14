package com.sparta.aa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 2, 7, 4, 15));
        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(new Spartan("Manish", 1), new Spartan("Gary", 2)));

        Collections.sort(numbers);
        Collections.sort(spartans, new SpartanComparator());
    }
}
