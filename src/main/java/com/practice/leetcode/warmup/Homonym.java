package com.practice.leetcode.warmup;

import java.text.Collator;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Homonym {
    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    /*  Raw data:

        0 - Harry
        0 - Harry
        1 - Harry
        2 - Harry
        3 - Emily
        4 - Jack
        4 - Jack
        5 - Amelia
        5 - Amelia
        6 - Amelia
        7 - Amelia
        8 - Amelia

        **************************************************

        Sorted and filtered data:

        5 - Amelia (1)
        6 - Amelia (2)
        7 - Amelia (3)
        8 - Amelia (4)
        3 - Emily (1)
        0 - Harry (1)
        1 - Harry (2)
        2 - Harry (3)
        4 - Jack (1)
     */
    public static <T> Predicate<T> distinctByKey(
            Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        List<Person> rawList = Arrays.asList(RAW_DATA);
        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }
        Comparator<Person> comparator = (a, b) -> {
            Collator collator = Collator.getInstance(new Locale("en", "US"));
            return collator.compare(a.name, b.name);
        };

        List<Person> resultList = rawList.stream()
                .filter(distinctByKey(p -> p.id))
                .sorted(comparator)
                .collect(Collectors.toList());




        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Sorted and filtered data:");
        for (Person person : resultList) {
            System.out.println(person.id + " - " + person.name);
        }
        System.out.println();

        /*
            your code here
         */

    }
}
