package com.practice.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

// head -- -- tail
public class LRUCacheV2 {

    private int cacheSize;
    private Node head;
    private Node tail;
    private Map<Integer, Node> map = new HashMap<>();

    public LRUCacheV2(int cacheSize) {
        this.cacheSize = cacheSize;
        Node head = new Node(0, 0);
        this.head = head;
        Node tail = new Node(0, 0);
        this.tail = tail;
        head.next = tail;

        tail.prev = head;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(key);
        } else {
            Node node = new Node(key, value);
            map.put(key, node);
            addToHead(node);

            if (map.size() > this.cacheSize) {
                // удаляем самый старый из хвоста
                Node removed = removeTail();
                map.remove(removed.key);
            }
        }
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        moveToHead(key);
        return node.value;
    }

    private void moveToHead(int key) {
        Node node = map.get(key);
        // удалить из середины
        removeNode(node);
        // добавить в голову
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        node.prev = head;          // 1. Ссылка нового узла НАЗАД на head
        node.next = head.next;     // 2. Ссылка нового узла ВПЕРЁД на старый первый элемент
        head.next.prev = node;     // 3. Ссылка старого первого элемента НАЗАД на новый узел
        head.next = node;          // 4. Ссылка head ВПЕРЁД на новый узел (ВАША СТРОКА)
    }

    private Node removeTail() {
        Node res = tail.prev;
        removeNode(res);
        return res;
    }

    class Node {
        Node prev;
        Node next;
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}
