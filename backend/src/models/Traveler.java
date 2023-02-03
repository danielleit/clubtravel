package models;

public class Traveler {
    private int idTraveler;
    private String imageLink;
    private byte[] image;
    private Contact contact;
    private User user;

    public Traveler(Contact contact, User user){
        this.contact = contact;
        this.user = user;
    }
    public int getIdTraveler() {
        return idTraveler;
    }
    public void setIdTraveler(int idTraveler) {
        this.idTraveler = idTraveler;
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
    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
