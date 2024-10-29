package com.practice.leetcode.warmup.streamstraining;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Task1------------------------------------------------------------------------------------------------------------
/* Дан класс с переопределнными equals & hashcode и реализованным методом clone().
 Необходимо написать тесты на контракт equals:
 (рефлексивность, симметричность, транзитивность, постоянствоб x.equals(null) должно возвращать false)
 */
//Task2------------------------------------------------------------------------------------------------------------
record Item(int id, String color) {
};

record Client(int id, String name) {
};

class ItemService {
    public Collection<Item> getClientOrders(Client client) {
        return null;
    }
}

public class ITOneIntTasks {
    private ItemService itemService;

    /* Возвращает Stream, содержащий count самых популярных цветов товаров, которые заказывали
      определнные клиенты
     */
    public Stream<Map.Entry<String, Long>> mostPopularColors(Collection<Client> clients, int count) {

        return clients.stream()
                .flatMap(client -> itemService.getClientOrders(client).stream())
                .collect(Collectors.groupingBy(Item::color, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(count);
    }
}

//Task3------------------------------------------------------------------------------------------------------------
/* Необходимо сделать ревью многопоточного кода с разделяемым ресурсом
Необходимо вместо HashMap использовать concurrentHashMap - в этом случае необходима атомарная проверка
computeIfAbsent(), но в 8 Java с ним надо быть аккуратнее (подробсности: https://habr.com/ru/companies/krista/articles/479778/).
Или воспользоваться ConcurrentLinkedQueue.
Также предложил Timestamp + Humidity объединить в 1 SensorData класс для удобства читаемости кода.

 record Timestamp(UUID id, Long timestamp){}
 record Humidity(UUID id, Double humidity){}

@Service
class IndicatorService {
     private final Map<UUID, List<Long>> timestampsById =  new HashMap<>();
     private final Map<UUID, List<Double>> humidityById =  new HashMap<>();

     public void handleData(List<Long> timestamps, List<Double> humidity, UUID id){

         if (timestampsById.containsKey(id)) {
             List<Long> old = timestampsById.get(id);
             old.addAll(timestamps);
         }
         else{
             timestampsById.put(id, timestamps);
         }

         if (humidityById.containsKey(id)) {
             List<Double> old = humidityById.get(id);
             old.addAll(humidity);
         }
         else{
             humidityById.put(id, humidity);
         }
     }

    @Sheduled(fixedDelay = 10000)
    protected void scheduled(){
         sensorDataPublisher.publish(timestampsById, humidityById);
     }
}
 */
