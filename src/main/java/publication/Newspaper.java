package publication;

public class Newspaper extends Publication{

    private int issn;

    public Newspaper(String title, String author, String subject, int issn){
        super(title, author, subject);
        this.issn = issn;
    }

    public String addWeather(){
        return "Sunny";
    }

    public String addHoroscope(){
        return "People born in November will join BNTA";
    }

    public String opinion(){
        return "Boris Johnson is not the prime minister";
    }
}
