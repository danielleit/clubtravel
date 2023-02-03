package models;

public class Contact {
    private int idContact;
    private String name;
    private String phone;
    private String email;

    public int getIdContact() {
        return idContact;
    }
    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }
    public String getName(){
        return this.name;
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
}
