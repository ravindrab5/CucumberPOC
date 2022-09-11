package entity;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Projects {

   String projectname;

   String projecttype;

   String owner;

   String username;

   List<Members> members;


    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
    public String getProjectname() {
        return projectname;
    }
    
    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype;
    }
    public String getProjecttype() {
        return projecttype;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    
    public void setMembers(List<Members> members) {
        this.members = members;
    }
    public List<Members> getMembers() {
        return members;
    }
    
}