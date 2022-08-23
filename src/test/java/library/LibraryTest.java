package library;

import publication.Book;
import publication.Publication;
import enclosures.Enclosure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    private Library library;
    private Enclosure enclosure1;
    private Enclosure enclosure2;
    private Enclosure enclosure3;

    @BeforeEach
    public void setup(){
        enclosure1 = new Enclosure("test enclosure 1");
        enclosure2 = new Enclosure("test enclosure 2");
        enclosure3 = new Enclosure("test enclosure 3");
        library = new Library(enclosure1, enclosure2, enclosure3);
    }

    @Test
    public void canAddAnimalToEnclosure(){
        Publication publication = new Book("Brave New World", "Aldous Huxley", "Nightmarish vision of a future society", 11);
        library.addPublicationtoEnclosure(publication, enclosure1);
        int expected = 1;
        int actual = enclosure1.countPublications();
        assertEquals(expected, actual);
    }

}
