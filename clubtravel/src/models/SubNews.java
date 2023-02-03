package models;

public class SubNews {
    private int idSubNews;
    private String subTitle;
    private String text;
    private String imageLink;
    private byte[] image;
    private News news;

    public SubNews(News news){
        this.news = news;
    }
    public int getIdSubNews() {
        return idSubNews;
    }
    public void setIdSubNews(int idSubNews) {
        this.idSubNews = idSubNews;
    }
    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
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
    public News getNews() {
        return news;
    }
    public void setNews(News news) {
        this.news = news;
    }
}
