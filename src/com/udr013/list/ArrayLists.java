package com.udr013.list;

import java.util.*;

public class ArrayLists {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>(10);

        final boolean added = list.add("bla0");
        list.add("bla1");
        list.add("bla3");
        list.add(2, "bla2");

        final String old = list.set(0, "test");
        System.out.println("replaced: " + old + " with: " + list.get(0));

        String result = null;
        List<String> sublist = null;

        try {
            list.set(4, "update"); //IndexOutOfBoundsException
            list.remove(4); //IndexOutOfBoundsExceptio
            result = list.get(7); //IndexOutOfBoundsException
            sublist = list.subList(3, 7); //IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException i) {
            System.out.println(i.getClass());
        }

        boolean removed = list.remove("ppp");
        System.out.println("removed: " + removed);

        boolean contains = list.contains("ppp");
        System.out.println("contains:" + contains);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("no result");
        }
        sublist = list.subList(0, 4);
        System.out.println("sublist: " + sublist);
        int index = list.indexOf("ppp");
        System.out.println("index at:" + index);

//        while(list.listIterator().hasNext()){  //this will keep looping on the first element, we need to instantiate it
//            System.out.println(" next:" +list.iterator().next());
//        }
        ListIterator<String> listIterator = list.listIterator(2);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
//            iterator.remove();   //IllegalStateException
            System.out.println(iterator.next());
        }
        System.out.println(list.size());

        List<String> list2 = new ArrayList<>(list);
        list2.set(0, "test2");
        list2.set(1, "test3");
        list2.set(3, "test");
        list2.set(2, "test4");

        System.out.println(list2);
        System.out.println(list.removeAll(list2));
        System.out.println(list);
        list.clear(); //void
        System.out.println(list.size());
    }
}
