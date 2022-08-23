package publication;

public class Frankenstein extends Book{

    private int isbn;
    public Frankenstein(String title, String author, String subject, int isbn){
        super(title, author, subject, isbn);
    }

    @Override
    public String authorHistory() {
        return "English novelist";
    }

    public String seeTitle(){
        return String.format("The title of the book is %s.", this.title);
    }

    public String seeAuthor(){
        return String.format("The author of the book is %s.", this.author);
    }

    public String seeSubject(){
        return String.format("The subject of the book is %s.", this.subject);
    }

    public int seeIsbn(){
        return 12;
    }

}
