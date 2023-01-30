package models;

import java.time.LocalDateTime;

public class Comments {
    private int idComments;
    private String text;
    private LocalDateTime dateTime;
    private Traveler traveler;
    private News news;

    public Comments(News news) {
        this.news = news;
    }

    public int getIdComments() {
        return idComments;
    }
    public void setIdComments(int idComments) {
        this.idComments = idComments;
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
    public Traveler getTraveler() {
        return traveler;
    }
    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }
    public News getNews() {
        return news;
    }
    public void setNews(News news) {
        this.news = news;
    }
}
