package info.damotou.biz.book;

import info.damotou.biz.book.model.Book;
import info.damotou.biz.book.model.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BookStoreService {
    @Autowired
    private BookRepo bookRepo;

    public Book queryByName(String name){
        return bookRepo.findByName(name);
    }
}
