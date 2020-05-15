package com.bridgelabz.singleResponsibility;

public class Printer {
    public static void main(String[] args){
        Library books = new Library();
        System.out.println(books.science);
        System.out.println(books.novels);
        System.out.println(books.storyBooks);
    }
}
