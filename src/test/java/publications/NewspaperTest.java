package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import publication.Newspaper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewspaperTest {

    private Newspaper newspaper;

    @BeforeEach
    public void setUp(){
        newspaper = new Newspaper("Orlando Sentinel", "Joy Dickinson", "Nightmarish vision of a future society", 21);
    }

    @Test
    public void canCalculateMarkUp(){
        String expected = "The Orlando Sentinel read has been added in the shop.";
        String actual = newspaper.calculateMarkUp();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddWeather(){
        String expected = "Sunny";
        String actual = newspaper.addWeather();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddHoroscope(){
        String expected = "People born in November will join BNTA";
        String actual = newspaper.addHoroscope();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddOpinion(){
        String expected = "Boris Johnson is not the prime minister";
        String actual = newspaper.opinion();
        assertEquals(expected, actual);
    }

}
