package com.practice.leetcode.heap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    // 1 Собрать в мапу<String, Integer> частоты слов
    // 2 Создать minHeap<String> с логикой приоритетности по
    //        - по частотам
    //        - для равных частот по алфавиту
    // 3 Заполнить heap
    // 4 Тк куча отсортирована по возрастанию, все, что выше k - выкидываем
    // 5 Добавляем в результаирующий список ответ по убыванию
    // Таким образом храним в куче не N элементов, а только К, что оптимальнее.
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(
                (s1, s2) -> {
                    int count1 = frequencyMap.get(s1);
                    int count2 = frequencyMap.get(s2);
                    if (count1 == count2) {
                        return s2.compareTo(s1);
                    }
                    return count1 - count2;
                });

        for (String word : frequencyMap.keySet()) {
            priorityQueue.offer(word);

            //  frequencyMap.contains(word);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        LinkedList<String> result = new LinkedList<>();
        while (!priorityQueue.isEmpty()) {
            result.addFirst(priorityQueue.poll());
        }
        return result;
    }
}
