package publication;

import java.util.Date;

public abstract class Publication {

    protected String title;
    protected String author;
    protected String subject;
    private boolean content;
    private Date publicationDate;

    public Publication(String title, String author, String subject){
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.content = true;
        this.publicationDate = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean getContent() {
        return content;
    }

    public void setContent(boolean content) {
        this.content = content;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String calculateMarkUp(){
        return String.format("The %s read has been added in the shop.", this.title);
    }

}
