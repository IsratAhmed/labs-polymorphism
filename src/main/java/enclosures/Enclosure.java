package enclosures;

import publication.Publication;

import java.util.ArrayList;

public class Enclosure {

    private String name;

    private ArrayList<Publication> publications;

    public Enclosure(String name) {
        this.name = name;
        this.publications = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }

    public int countPublications() {
        return this.publications.size();
    }

    public void addPublication(Publication publication) {
        this.publications.add(publication);
    }

    //add public int calculateProfit() command
    //add public int sellPublicationItem() command
    //if needed (as explained by Zsolt's notes), add the commands in the publication folder
}
