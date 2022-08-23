package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publication.Frankenstein;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrankensteinTest {

    private Frankenstein frankenstein;

        @BeforeEach
        public void setUp(){
            frankenstein = new Frankenstein("Frankenstein", "Mary Shelley", "A monster created by a scientist and explores themes of life", 12);
        }

        @Test
        public void addAuthorHistory(){
            String expected = "English novelist";
            String actual = frankenstein.authorHistory();
            assertEquals(expected, actual);
        }


        @Test
        public void canSeeTitle(){
            String expected = "The title of the book is Frankenstein.";
            String actual = frankenstein.seeTitle();
            assertEquals(expected, actual);
        }

        @Test
        public void canSeeAuthor(){
            String expected = "The author of the book is Mary Shelley.";
            String actual = frankenstein.seeAuthor();
            assertEquals(expected, actual);
        }

        @Test
        public void canSeeSubject(){
            String expected = "The subject of the book is A monster created by a scientist and explores themes of life.";
            String actual = frankenstein.seeSubject();
            assertEquals(expected, actual);
        }

        @Test
        public void canSeeIsbn(){
            int expected = 12;
            int actual = frankenstein.seeIsbn();
            assertEquals(expected, actual);
        }
}
