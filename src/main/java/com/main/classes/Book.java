package com.main.classes;

public class Book {

    String bookName;
    String bookPrice;

    public Book() {
    }

    public Book(String bookName, String bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }
}
