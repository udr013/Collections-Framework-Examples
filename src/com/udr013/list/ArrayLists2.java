package com.udr013.list;

public class ArrayLists2 {

    public static void main(String[] args) {
    }


}

class Book{
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            Book book = (Book) obj; //cast from Object
            if (book.id == this.id && book.title.equals(this.title)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 255255255;
    }
}