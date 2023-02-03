package models;

import java.util.Set;

public class User {
    private int idUser;
    private String userName;
    private String password;
    private Set<Permission> permissions;

    public int getIdUser(){
        return idUser;
    }
    public void setIdUser(int idUser){
        this.idUser = idUser;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Permission> getPermissions(){
        return this.permissions;
    }
    public void setPermissions(Set<Permission> permissions){
        this.permissions = permissions;
    }
}
