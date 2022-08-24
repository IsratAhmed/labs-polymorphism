package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publication.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private Book book;

    @BeforeEach
    public void setUp(){
        book = new Book("Brave New World", "Aldous Huxley", "Nightmarish vision of a future society", 11);
        //book = new Book("Brave New World");
    }

    @Test
    public void canCalculateMarkUp(){
        String expected = "The Brave New World read has been added in the shop.";
        String actual = book.calculateMarkUp();
        assertEquals(expected, actual);
    }

    //@Test
    //public void canBook(){
    //    String result = book.book("Brave New World");
    //    assertThat(result).isEqualTo("The Brave New World read has been added in the shop.");
    //}

    @Test
    public void canPrintAuthorHistory(){
        String expected = "English novelist and critic";
        String actual = book.authorHistory();
        assertEquals(expected, actual);
    }
}
