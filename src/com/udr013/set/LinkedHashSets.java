package com.udr013.set;

import java.util.LinkedHashSet;

public class LinkedHashSets {

    public static void main(String[] args) {

        LinkedHashSet<Album> Albums = new LinkedHashSet<>();

        Albums.add(new Album(1, "title1"));
        boolean added = Albums.add(new Album(1, "title1"));
        Albums.add(new Album(2, "title2"));

        System.out.println(added); // true added because different reference, thou equals is overridden, but not hashcode
        System.out.println(Albums); //[com.udr013.set.Album@677327b6, com.udr013.set.Album@14ae5a5, com.udr013.set.Album@7f31245a]
        System.out.println(Albums.contains(new Album(1, "title1"))); //false
        // if we also override hashCode:
//        false
//        [com.udr013.set.Album@f36e2d7, com.udr013.set.Album@f36e2d7]
//        true
    }
}

class Album {
    private int id;
    private String title;

    public Album(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Album) {
            Album Album = (Album) obj; //cast from Object
            if (Album.id == this.id && Album.title.equals(this.title)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 255255255;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}