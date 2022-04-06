package com.practice.leetcode.warmup;

import java.util.ArrayList;
import java.util.List;

public class GenericsPracitce {
    List<Integer> intList = new ArrayList<>();
    List<? super Number> kontravariantList;
    List<? extends Number> kovariantList;

    void m(){
//        kontravariantList = intList;
        intList.add(Integer.valueOf(1));

        kovariantList = intList;
        Integer e = (Integer) kovariantList.get(0);
        //    method add on lists  on kontravariantList
    }
}
