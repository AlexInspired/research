package com.practice.leetcode.array;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ZigzagIterator {

    // k dimension iterator testing

    LinkedList<Iterator> list;

    ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list = new LinkedList<>();
        if (!v1.isEmpty()) {
            list.add(v1.iterator());
        }
        if (!v2.isEmpty()) {
            list.add(v2.iterator());
        }
    }

    public int next() {
        Iterator pol = list.remove();
        int result = (Integer) pol.next();
        if (pol.hasNext()) {
            list.add(pol);
        }
        return result;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
}
