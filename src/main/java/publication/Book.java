package publication;

import interfaces.IBook;

public class Book  extends Publication implements IBook{

    private int isbn;

    public Book(String title, String author, String subject, int isbn){
        super(title, author, subject);
        this.isbn = isbn;
    }

    public String book(String title){
        return String.format("The %s read has been added in the shop.", title);
    }

    public String authorHistory(){
        return "English novelist and critic";
    }


}