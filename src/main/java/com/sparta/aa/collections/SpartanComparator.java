package com.sparta.aa.collections;

import java.util.Comparator;

public class SpartanComparator implements Comparator<Spartan> {
    @Override
    public int compare(Spartan o1, Spartan o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
