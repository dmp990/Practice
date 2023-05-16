package com.sparta.aa.jackson;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            JsonWriter writer = new JsonWriter("output.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}