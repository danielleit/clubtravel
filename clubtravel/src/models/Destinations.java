package models;

public class Destinations {
    private int idDestinations;
    private String reference;
    private String imageLink;
    private byte[] image;
    private City city;

    public Destinations(City city){
        this.city = city;
    }

    public int getIdDestinations(){
        return idDestinations;
    }

    public void setIdDestinations(int idDestinations){
        this.idDestinations = idDestinations;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    
}
