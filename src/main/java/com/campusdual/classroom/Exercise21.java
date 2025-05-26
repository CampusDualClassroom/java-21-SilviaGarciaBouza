package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> mySet = new HashSet<>();
        mySet.add("ELEMENT KPRBC");
        mySet.add("ELEMENT YPBTM");
        mySet.add("ELEMENT AADXU");
        mySet.add("ELEMENT RXCGJ");
        mySet.add("ELEMENT WYMVD");
        mySet.add("ELEMENT WFGEJ");
        mySet.add("ELEMENT TYGBS");
        mySet.add("ELEMENT MAPTK");
        mySet.add("ELEMENT GJXVE");
        mySet.add("ELEMENT BAFGL");

        return mySet;
    }

    public static Set<String> createTreeSet() {
        Set<String> mySet = new TreeSet<>();
        mySet.add("ELEMENT KPRBC");
        mySet.add("ELEMENT YPBTM");
        mySet.add("ELEMENT AADXU");
        mySet.add("ELEMENT RXCGJ");
        mySet.add("ELEMENT WYMVD");
        mySet.add("ELEMENT WFGEJ");
        mySet.add("ELEMENT TYGBS");
        mySet.add("ELEMENT MAPTK");
        mySet.add("ELEMENT GJXVE");
        mySet.add("ELEMENT BAFGL");

        return mySet;
    }

    private static void printSet(Set<String> customSet) {
        for(String element:customSet){
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
       return set.add(elementToAdd);

    }

    public static void main(String[] args) {
        printSet(createHashSet());
        System.out.println();
        printSet(createTreeSet());
        ;
    }

}
