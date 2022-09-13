package com.junits;

import com.main.classes.Book;
import com.main.classes.BookStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookStoreTest {

    @ParameterizedTest
    @CsvSource("Secret")
    public void retrieveBookFromStore(String bookName) {

        //Creating BookStore
        BookStore bookstore = new BookStore();

        //Act
        List<Book> lookUpResult = bookstore.retrieveBook(bookName);

        //Assert the result
        assertEquals(0, lookUpResult.size());

    }


}
