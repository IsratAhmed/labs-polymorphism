package library;

import interfaces.IBook;
import interfaces.IMagazine;
import interfaces.INewspaper;
import publication.Publication;
import enclosures.Enclosure;

import java.util.ArrayList;

public class Library {

    //private Enclosure book;

    private ArrayList<IBook> book;
    //private Enclosure magazine;
    private ArrayList<IMagazine> magazine;
    //private Enclosure newspaper;
    private ArrayList<INewspaper> newspaper;

    public Library() {
        this.book = new ArrayList<>();
        this.magazine = new ArrayList<>();
        this.newspaper = new ArrayList<>();
    }

    public void addBook(IBook book){
        this.book.add(book);
    }

    public ArrayList<IBook> getBooks() {
        return this.book;
    }

    //public void setBook(Enclosure book) {
    //    this.book = book;
    //}

    public void addMagazine(IMagazine magazine){
        this.magazine.add(magazine);
    }

    public ArrayList<IMagazine> getMagazines() {
        return this.magazine;
    }

    //public void setMagazine(Enclosure magazine) {
    //    this.magazine = magazine;
    //}

    public void addNewspaper(INewspaper newspaper){
        this.newspaper.add(newspaper);
    }

    public ArrayList<INewspaper> getNewspapers() {
        return this.newspaper;
    }

    //public void setNewspaper(Enclosure newspaper) {
    //    this.newspaper = newspaper;
    //}

    public void addPublicationtoEnclosure(Publication publication, Enclosure enclosure) {
        enclosure.addPublication(publication);
    }
}
