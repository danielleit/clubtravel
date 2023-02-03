package models;

import java.util.Set;

public class Permission {
    private int idPermission;
    private String description;
    private Set<User> users;

    public Permission(Set<User> users){
        this.users = users;
    }
    public int getIdPermission() {
        return idPermission;
    }
    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    } 
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    public Set<User> getUsers(){
        return this.users;
    }
}
