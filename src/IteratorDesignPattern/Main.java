package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books(100,"science"));
        booksList.add(new Books(100,"Math"));
        booksList.add(new Books(100,"English"));
        booksList.add(new Books(100,"computer"));
        booksList.add(new Books(100,"Social"));


        //concrete Aggreagte part
        Library library = new Library(booksList);
        Iterator iterator = library.createIterator();

        //concrete Iterator part
        while (iterator.hasNext()){
            Books book = (Books) iterator.next();
            System.out.println(book.getBookName()+" "+book.getPrice());
        }

    }
}
