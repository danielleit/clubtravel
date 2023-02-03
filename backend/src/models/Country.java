package models;

public class Country {
    private int idCountry;
    private String portugueseName;
    private String englishCame;
    private String imageLink;
    private byte[] image;
    
    public int getIdCountry() {
        return idCountry;
    }
    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
    public String getPortugueseName() {
        return portugueseName;
    }
    public void setPortugueseName(String portugueseName) {
        this.portugueseName = portugueseName;
    }
    public String getEnglishCame() {
        return englishCame;
    }
    public void setEnglishCame(String englishCame) {
        this.englishCame = englishCame;
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
