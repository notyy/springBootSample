package info.damotou.controller;

import info.damotou.biz.book.BookStoreService;
import info.damotou.biz.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookStoreService bookStoreService;

    @RequestMapping(value = "/{bookName}", method = RequestMethod.GET)
    public Book findBook(@PathVariable String bookName) {
        return bookStoreService.queryByName(bookName);
    }
}
