package models;

public class City {
    private int idCity;
    private String ibgeCode;
    private String name;
    private State state;

    public City(State state) {
        this.state = state;
    }
    
    public int getIdCity() {
        return idCity;
    }
    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }
    public String getIbgeCode() {
        return ibgeCode;
    }
    public void setIbgeCode(String ibgeCode) {
        this.ibgeCode = ibgeCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    } 
}
