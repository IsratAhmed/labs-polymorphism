package enclosures;

import publication.Publication;
import publication.Book;
import publication.Newspaper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnclosureTest {

    private Enclosure enclosure;

    @BeforeEach
    public void setUp(){
        enclosure = new Enclosure("Testing enclosure");
    }

    @Test
    public void canCountPublications(){
        int expected = 0;
        int actual = enclosure.countPublications();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddPublication(){
        Book publication = new Book("Brave New World", "Aldous Huxley", "Nightmarish vision of a future society", 11);
        enclosure.addPublication(publication);
        int expected = 1;
        int actual = enclosure.countPublications();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMultiplePublications(){
        Publication book = new Book("Brave New World", "Aldous Huxley", "Nightmarish vision of a future society", 11);
        Publication newspaper = new Newspaper("Orlando Sentinel", "Joy Dickinson", "Post offices hold special place in shaping of modern Florida", 21);
        enclosure.addPublication(book);
        enclosure.addPublication(newspaper);
        int expected = 2;
        int actual = enclosure.countPublications();
        assertEquals(expected, actual);
    }

}