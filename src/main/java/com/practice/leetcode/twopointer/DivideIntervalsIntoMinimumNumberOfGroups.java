package com.practice.leetcode.twopointer;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// 2604
// The minimum number of groups we need is equivalent to the maximum number of intervals that overlap at some point
// Need to find max number of intervals that overlap
public class DivideIntervalsIntoMinimumNumberOfGroups {

//    {{5, 10},
//    {6, 8},
//    {1, 5},
//    {2, 3},
//    {1, 10}};

    // 1 2 3 4 5 6 7 8 9 10
    // 1       5
    // 1                 10
    //   2 3
    //           6   8
    //         5         10
    public int minGroups(int[][] intervals) {

        // 1) Пройти по интервалам, положить все точки в TreeMap(сразу отсортированный по ключам),
        // где ключ = точка, значение - объект с количеством интервалов,
        // заканчивающихся или начинающихся в данной точке.
        // 3) Пройти по отсортированным точкам и отследить максимальное количество пересекающихся отрезков
        // Заходим в точку, берем DotInfo. К текущему счетчику прибавляем все начала, вычитаем все концы.
        // В глобальный счетчик сохраняем max(глобальный счетчик, текущий счетчик).
        Map<Integer, PointInfo> points = new TreeMap<>();
        for (int[] row : intervals) {

            if (points.containsKey(row[0])) {
                PointInfo dotInfo = points.get(row[0]);
                dotInfo.startCounterForPoint++;
            } else {
                PointInfo dotInfo = new PointInfo();
                dotInfo.point = row[0];
                dotInfo.startCounterForPoint++;
                points.put(row[0], dotInfo);
            }

            if (points.containsKey(row[1])) {
                PointInfo dotInfo = points.get(row[1]);
                dotInfo.endCounterForPoint++;
            } else {
                PointInfo dotInfo = new PointInfo();
                dotInfo.point = row[1];
                dotInfo.endCounterForPoint++;
                points.put(row[1], dotInfo);
            }
        }

        int maxOverlapsCounter = 0;
        int currentOverlaps = 0;

        for (Map.Entry<Integer, PointInfo> entry : points.entrySet()) {
            PointInfo pointInfo = entry.getValue();

            // Увеличиваем счётчик при входе в интервал
            currentOverlaps += pointInfo.startCounterForPoint;

            // Обновляем максимум
            maxOverlapsCounter = Math.max(maxOverlapsCounter, currentOverlaps);

            // Уменьшаем счётчик при выходе из интервала
            // Ключевой момент: в точке x все интервалы, начинающиеся в x, уже активны,
            // а заканчивающиеся в x — ещё активны (потому что [left, right] включает right). Поэтому:
            // Сначала добавляем все начала
            // Фиксируем максимум (все интервалы, включающие точку x, учтены)
            // Только потом вычитаем концы (они перестанут быть активными после точки x)
            currentOverlaps -= pointInfo.endCounterForPoint;

        }

        return maxOverlapsCounter;
    }

    class PointInfo {
        Integer point;
        int startCounterForPoint = 0;
        int endCounterForPoint = 0;
    }
}
