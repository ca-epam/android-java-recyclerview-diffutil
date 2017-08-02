package com.example.adrian.android_java_diffutil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian_Czigany on 8/2/2017.
 */

public class DataProvider {

    public static List<Person> getOldPersonList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, 20, "John"));
        persons.add(new Person(2, 12, "Jack"));
        persons.add(new Person(3, 8, "Michael"));
        persons.add(new Person(4, 19, "Rafael"));
        return persons;
    }

    public static List<Person> getNewPersonList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, 20, "John"));
        persons.add(new Person(2, 12, "Jack"));
        persons.add(new Person(3, 8, "Michael"));
        persons.add(new Person(4, 15, "Rafael"));
        persons.add(new Person(5, 30, "Nemtom"));
        return persons;
    }

}
