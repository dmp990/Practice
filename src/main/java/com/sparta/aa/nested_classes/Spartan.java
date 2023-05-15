package com.sparta.aa.nested_classes;

import java.util.Comparator;

public class Spartan {

    public class SpartanComparator implements Comparator<com.sparta.aa.collections.Spartan> {
        @Override
        public int compare(com.sparta.aa.collections.Spartan o1, com.sparta.aa.collections.Spartan o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
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
