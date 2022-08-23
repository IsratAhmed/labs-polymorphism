package publication;

public class Magazine extends Publication{

    private int issn;

    public Magazine(String title, String author, String subject, int issn){
        super(title, author, subject);
        this.issn = issn;
    }

    public String addWordSearch(){
        return "Find Israt from 'vwemvpwvwbrvmVJEkrevenMvemIsratvjeVNvjej'.";
    }

    public String addSudoku(){
        return "What are the missing numbers: * 1 4 2 * 6 9 * 3 ";
    }

}