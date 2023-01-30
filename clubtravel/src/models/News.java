package models;

import java.time.LocalDateTime;

public class News {
    private int idNews;
    private String title;
    private String text;
    private String subtitle;
    private LocalDateTime dateTime;
    private String imageLink;
    private byte[] image;
    private Destinations destinations;
    private Traveler traveler;

    public News(Destinations dest, Traveler trav){
        destinations = dest;
        traveler = trav;
    }

    public void setIdNews(int id){
        idNews = id;
    }

    public int getIdNews(){
        return idNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Destinations getDestinations() {
        return destinations;
    }

    public void setDestinations(Destinations destinations) {
        this.destinations = destinations;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }
    
}
