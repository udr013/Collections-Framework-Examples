package com.udr013.map;

import java.util.*;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("yo", 10);

        Integer yo = map.put("yo", null);//overrides the previous value
        Integer put = map.put("yo", 40); //returns 'old' value
        Integer put2 = map.put("boy", 40); //returns 'old' value
        boolean b = map.containsKey(null);
        System.out.println(b + " yo :" + yo + " put: " + put + " put2: " + put2);
        Collection<Integer> values = map.values();
        Set<String> strings = map.keySet();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        boolean containsValue = map.containsValue(5);
//        System.out.println(map);
        System.out.println("containsValue: " + containsValue);
        System.out.println(map.size());

//        map.keySet().add("aDEED"); //UnsupportedOperationException at runtime

//        Map<String, String> copy = new HashMap<>(map); //incompatible types, won't compile!

        LinkedHashMap<Artist, LinkedList<Album>> artistAlbums = new LinkedHashMap<>();
        LinkedList<Album> albums  = new LinkedList<>();
        albums.add(new Album(12, "First"));
        albums.add(new Album(14, "Second"));
        albums.add(new Album(14, "Third"));

        artistAlbums.put(new Artist("Run the Jewels"), albums);
        //hashCode() and equals() needs to be overridden for key object, or this will be null
        LinkedList<Album> runTheJewels = artistAlbums.get(new Artist("Run the Jewels"));
        System.out.println(runTheJewels.size()); //NullPointerException
        System.out.println(runTheJewels.isEmpty()); //NullPointerException
        boolean secondalbum = runTheJewels.contains(new Album(14, "Second"));
        System.out.println(secondalbum);

        albums.sort(new Comparator<Album>() {
            @Override
            public int compare(Album o1, Album o2) {
                return o1.title.compareTo(o2.title);
            }
        });



    }
}

class Artist {
    String name;

    Artist(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}

class Album implements Comparable<Album>{
    int id;
    String title;

    public Album(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int compareTo(Album o) {
        return title.compareTo(o.title);
    }
}