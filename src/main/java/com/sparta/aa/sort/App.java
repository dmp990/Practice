package com.sparta.aa.sort;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int size = Integer.MAX_VALUE / 10;
        double start, end;
        ArrayList<Integer> arr = new ArrayList<>();

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arr.add(size - i);
        }
        end = System.nanoTime();

        System.out.printf("Array initialized in %f ms\n", (end - start) / 1_000_000);

        start = System.nanoTime();
        Collections.sort(arr);
        end = System.nanoTime();

        System.out.printf("Array sorted in %f ms", (end - start) / 1_000_000);

        /*int[] array = new int[size];
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array[i] = (size - i);
        }
        end = System.nanoTime();
        System.out.printf("Array initialized in %f ms\n", (end - start) / 1_000_000);

        start = System.nanoTime();
        BubbleSort.bubbleSort(array);
        end = System.nanoTime();

        System.out.printf("Array sorted in %f ms", (end - start) / 1_000_000);

         */

    }
}
