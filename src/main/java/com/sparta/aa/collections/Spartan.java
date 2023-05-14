package com.sparta.aa.collections;

public class Spartan {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public Spartan(String name, int id) {
        this.name = name;
        this.id = id;
    }

}
