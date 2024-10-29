package com.practice.leetcode.warmup.streamstraining;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

record Worker(String name, int age, int salary, String position) {
}

public class StreamGroupingByExamples {

    void sevenGroupings(Collection<Worker> workers) {
        // 1. Группировка списка рабочих по их должности (деление на списки)
        Map<String, List<Worker>> map1 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position));

        // 2. Группировка списка рабочих по их должности (деление на множества)
        Map<String, Set<Worker>> map2 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position, Collectors.toSet()));

        // 3. Подсчет количества рабочих, занимаемых конкретную должность
        Map<String, Long> map3 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position, Collectors.counting()));

        // 4. Группировка списка рабочих по их должности, при этом нас интересуют только имена
        Map<String, Set<String>> map4 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position,
                        Collectors.mapping(Worker::name, Collectors.toSet())));

        // 5. Расчет средней зарплаты для данной должности
        Map<String, Double> map5 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position,
                        Collectors.averagingDouble(Worker::salary)));

        // 6. Группировка списка рабочих по их должности, рабочие представлены только именами единой строкой
        Map<String, String> map6 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position,
                        Collectors.mapping(Worker::name,
                                Collectors.joining(", ", "{", "}")))
                );

        // 7. Группировка списка рабочих по их должности и по возрасту.
        Map<String, Map<Integer, List<Worker>>> map7 = workers.stream()
                .collect(Collectors.groupingBy(Worker::position,
                 Collectors.groupingBy(Worker::age)));
    }
}
