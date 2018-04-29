package com.udr013.set;

import java.util.*;

public class TreeSets {

    public static void main(String[] args) {
        TreeSet<Album> albums = new TreeSet<>(
                new Comparator<Album>() {
                    @Override
                    public int compare(Album o1, Album o2) {
                        if (o1.equals(o2)) {
                            return 0; // seems to be the only valid value (true)
                        } else return -1; //can be any value but 0
                    }
                }
        );

        albums.add(new Album(0, "album1"));
        albums.add(new Album(0, "album1"));
        albums.add(new Album(1, "album1"));
        System.out.println(albums);

        List<Album> albumList = new ArrayList<>();
        albumList.add(new Album(0, "album1"));
        albumList.add(new Album(0, "album1"));
        albumList.add(new Album(1, "album1"));

        Comparator<Album> comparator = new Comparator<Album>() {
            @Override
            public int compare(Album o1, Album o2) {
                return 0;
            }
        };

//        TreeSet<Album> albums2 = new TreeSet<>(albumList); // Comparable needs to be implemented by album.class or
        TreeSet<Album> albums2 = new TreeSet<>(comparator);
        albums2.addAll(albumList);
        albumList.add(new Album(0, "album1"));// otherwise classCastException
        System.out.println(albums2);


    }
}

