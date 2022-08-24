package publication;

import interfaces.IMagazine;

public class Magazine extends Publication implements IMagazine {

    private int issn;

    public Magazine(String title, String author, String subject, int issn){
        super(title, author, subject);
        this.issn = issn;
    }

    public String magazine(String title){
        return String.format("The %s read has been added in the shop.", title);
    }

    public String addWordSearch(){
        return "Find Israt from 'vwemvpwvwbrvmVJEkrevenMvemIsratvjeVNvjej'.";
    }

    public String addSudoku(){
        return "What are the missing numbers: * 1 4 2 * 6 9 * 3 ";
    }

}