package models;

public class State {
    int idState;
    int ufCode;
    String name;
    String uf;
    Country country;
    Region region;
    
    public State(Country country, Region region) {
        this.country = country;
        this.region = region;
    }
    
    public int getIdState() {
        return idState;
    }
    public void setIdState(int idState) {
        this.idState = idState;
    }
    public int getUfCode() {
        return ufCode;
    }
    public void setUfCode(int ufCode) {
        this.ufCode = ufCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public Region getRegion() {
        return region;
    }
    public void setRegion(Region region) {
        this.region = region;
    }

    
}
