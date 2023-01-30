package models;

import java.time.LocalDateTime;

public class Events {
    private int idEvents;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;
    private Destinations destinations;

    public Events(Destinations destinations) {
        this.destinations = destinations;
    }

    public int getIdEvents() {
        return idEvents;
    }
    public void setIdEvents(int idEvents) {
        this.idEvents = idEvents;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Destinations getDestinations() {
        return destinations;
    }
    public void setDestinations(Destinations destinations) {
        this.destinations = destinations;
    }

    

}