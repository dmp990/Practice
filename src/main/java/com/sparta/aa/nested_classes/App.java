package com.sparta.aa.nested_classes;

import com.sparta.aa.collections.Spartan;
import com.sparta.aa.collections.SpartanComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 2, 7, 4, 15));
        ArrayList<com.sparta.aa.collections.Spartan> spartans = new ArrayList<>(Arrays.asList(new com.sparta.aa.collections.Spartan("Manish", 1), new Spartan("Gary", 2)));

        Collections.sort(numbers);
        Collections.sort(spartans, new SpartanComparator());
    }
}
