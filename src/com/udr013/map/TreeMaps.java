package com.udr013.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        Map<IceCream,String>  favouriteFlavor = new TreeMap<>();
        favouriteFlavor.put(IceCream.CHOCOLATE, "Jane");
        favouriteFlavor.put(IceCream.VANILLA, "Carl");
        favouriteFlavor.put(IceCream.STRAWBERRY, "jack");

        for(String s : favouriteFlavor.values()){
            System.out.println(s);
        }
    }
}

enum IceCream {STRAWBERRY, CHOCOLATE, VANILLA}
