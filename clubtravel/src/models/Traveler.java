package models;

public class Traveler {
    private int idTraveler;
    private String name;
    private String phone;
    private String email;
    private String imageLink;
    private byte[] image;

    public int getIdTraveler() {
        return idTraveler;
    }
    public void setIdTraveler(int idTraveler) {
        this.idTraveler = idTraveler;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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

    
}
