package models;

import java.time.LocalDateTime;

public class News {
    private int idNews;
    private String title;
    private String text;
    private LocalDateTime dateTime;
    private String imageLink;
    private byte[] image;
    private Destinations destinations;

    public News(Destinations destinations){
        this.destinations = destinations;
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
}
