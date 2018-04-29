package com.udr013.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearchComparator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        list.add(9999);
        list.add(10);
        list.add(55);
        list.add(28);

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 55)); //2
//        Collections.sort(list, comparator);
        list.sort(comparator);
        System.out.println(Collections.binarySearch(list, 55)); //1

    }
}
