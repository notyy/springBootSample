package info.damotou.biz.book.model;

import info.damotou.biz.book.model.Book;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepo {
    private Map<String, Book> books = new HashMap<>();

    public BookRepo() {
        //initialize with some books
        Book scalaIsGreat = new Book("scala is great", "notyy");
        Book haskellIsMiracle = new Book("haskell", "notyy");
        Book javaNoWord = new Book("java is dying", "haha");

        books.put(scalaIsGreat.getName(), scalaIsGreat);
        books.put(haskellIsMiracle.getName(), haskellIsMiracle);
        books.put(javaNoWord.getName(), javaNoWord);
    }

    public Book create(String name, String author) {
        return new Book(name, author);
    }

    public void save(Book book) {
        books.put(book.getName(), book);
    }

    public Book findByName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("book name can't be empty");
        }
        return books.get(name);
    }
}
