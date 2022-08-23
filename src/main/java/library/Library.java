package library;

import publication.Publication;
import enclosures.Enclosure;

public class Library {

    private Enclosure book;
    private Enclosure magazine;
    private Enclosure newspaper;

    public Library(Enclosure book, Enclosure magazine, Enclosure newspaper) {
        this.book = book;
        this.magazine = magazine;
        this.newspaper = newspaper;
    }

    public Enclosure getBook() {
        return book;
    }

    public void setBook(Enclosure book) {
        this.book = book;
    }

    public Enclosure getMagazine() {
        return magazine;
    }

    public void setMagazine(Enclosure magazine) {
        this.magazine = magazine;
    }

    public Enclosure getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(Enclosure newspaper) {
        this.newspaper = newspaper;
    }

    public void addPublicationtoEnclosure(Publication publication, Enclosure enclosure) {
        enclosure.addPublication(publication);
    }
}
