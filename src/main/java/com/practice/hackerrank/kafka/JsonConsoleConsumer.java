package com.practice.hackerrank.kafka;


import com.fasterxml.jackson.databind.JsonDeserializer;
import kafka.utils.Json;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;


public class JsonConsoleConsumer {
    public static void main(String[] args) {
        final String topic = "incident_service_incident_log";

        Consumer<String, Json> jsonConsumer = configureJsonConsumer(topic);

        poll(topic, jsonConsumer);
    }

    private static <K, V> void poll(
            String topic, Consumer<K, V> consumer) {

        for(;;) {
            Iterable<ConsumerRecord<K, V>> records = consumer.poll(Duration.ofMillis(200)).records(topic);
            records.forEach(System.out::println);
        }
    }

    private static <K, V> Consumer<K, V> configureJsonConsumer(String topic) {
        Properties consumerProps = new Properties();
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, topic);
        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, Integer.MAX_VALUE);
        consumerProps.put("schema.registry.url", "http://localhost:8081");
        Consumer<K, V> consumer = new KafkaConsumer<>(consumerProps);

        consumer.subscribe(Collections.singletonList(topic));
        return consumer;
    }
}
