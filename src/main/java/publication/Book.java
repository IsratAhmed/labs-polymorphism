package publication;

public class Book extends Publication{

    private int isbn;

    public Book(String title, String author, String subject, int isbn){
        super(title, author, subject);
        this.isbn = isbn;
    }

    public String authorHistory(){
        return "English novelist and critic";
    }


}