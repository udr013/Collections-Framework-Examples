package com.udr013.map;

import java.util.Arrays;

public class BinarySeach {

    public static void main(String[] args) {

        Object[] myArray = new Object[4];
        myArray[0] = "Java";
        myArray[1] = "Android";
        myArray[2] = "spring";
        myArray[3] = 1;  //ClassCastException in Arrays.sort()
        myArray[3] = null;  //NullPointerException in Arrays.sort()
        myArray[3] = 'z'; //ClassCastException in Arrays.sort()
        myArray[3] = "Git";

        int position = Arrays.binarySearch(myArray, "Cool"); // -3
        System.out.println(position);
        //for binarysearch the array needs to be sorted in ascending order otherwise result is undefined... ?
        position = Arrays.binarySearch(myArray, "Java"); // -3
        System.out.println(position);

        position = Arrays.binarySearch(myArray, "Git"); // -3
        System.out.println(position);

        Arrays.sort(myArray); //Exception at runtime if...
        position = Arrays.binarySearch(myArray, "spring"); // 3
        System.out.println(position);
        position = Arrays.binarySearch(myArray, "Android"); // 0
        System.out.println(position);
        position = Arrays.binarySearch(myArray, "Cool"); // -2
        System.out.println(position);
        for (Object i : myArray){
            System.out.println(i);
        }
    }
}
