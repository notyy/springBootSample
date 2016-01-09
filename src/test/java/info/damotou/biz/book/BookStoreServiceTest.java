package info.damotou.biz.book;

import info.damotou.SpringDemoApplication;
import info.damotou.biz.book.model.Book;
import info.damotou.biz.book.model.BookRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;

//@SpringApplicationConfiguration(classes = BookStoreService.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringDemoApplication.class)
@WebAppConfiguration
public class BookStoreServiceTest {
    @Autowired
    private BookStoreService bookStoreService;

    @Test
    public void query_by_book_name_should_return_a_book_if_found() {
        Book book = bookStoreService.queryByName("haskell");
        assertNotNull(book);
        assertThat(book.getName(),is("haskell"));
    }
}