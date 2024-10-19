package IteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class Library implements Aggregate{
    private List<Books> booksList;

    public Library(List<Books> booksList){
        this.booksList = booksList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(booksList);
    }
}
