package com.udr013.list;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("test1");
        list.add("test2");
        list.add(null);
//         list.offer("bla"); //compile error
        ((LinkedList<String>) list).offer("test3"); // temporary cast as offer List doesn't support offer();
        Deque<String> linkedList = (LinkedList<String>) list;
        linkedList.add("test4"); // offer(), addLast(), offerLast()
        linkedList.addFirst("test5"); // offerFirst(), push()
        ((LinkedList<String>)linkedList).add(3,"test6"); //cast as Deque only supports add("bla")
        linkedList.remove(); // removeFirst(), pop()
        linkedList.removeLast();
        linkedList.addFirst(null); // though adviced not to support null it works
        String peekfront = linkedList.element();// peek(), peekFirst(), getFirst()
        String peekend = linkedList.peekLast();// getLast()
        String pollfirst = linkedList.poll(); //pollFirst()
        String pollLast = linkedList.pollLast();

        System.out.println("pollfirst: " + pollfirst+ ",  polllast: " + pollLast);
        System.out.println(linkedList);

        Iterator<String> iterator = linkedList.descendingIterator(); //Deque has a reversed iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
