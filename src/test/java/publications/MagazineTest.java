package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publication.Magazine;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MagazineTest {

    private Magazine magazine;

    @BeforeEach
    public void setUp(){
        magazine = new Magazine("The Moment That Changed My Life", "Mariska Hargitay", "People", 11);
    }

    @Test
    public void canCalculateMarkUp(){
        String expected = "The The Moment That Changed My Life read has been added in the shop.";
        String actual = magazine.calculateMarkUp();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddWordSearch(){
        String expected = "Find Israt from 'vwemvpwvwbrvmVJEkrevenMvemIsratvjeVNvjej'.";
        String actual = magazine.addWordSearch();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddSudoku(){
        String expected = "What are the missing numbers: * 1 4 2 * 6 9 * 3 ";
        String actual = magazine.addSudoku();
        assertEquals(expected, actual);
    }

}
