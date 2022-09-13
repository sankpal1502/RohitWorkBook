package com.main.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookStore {

    List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> retrieveBook(String bookName) {
        List<Book> localbookList = new ArrayList<>();

        if (bookName != null && bookList.contains(bookName)) {
            Iterator it = bookList.iterator();

            while (it.hasNext()) {
                Book book = (Book) it.next();
                if (bookName.equals(book.getBookName())) {
                    localbookList.add(book);
                }
            }
            return localbookList;
        } else {
            return localbookList;
        }

    }
}
