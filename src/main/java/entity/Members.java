package entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Members {

   String email;

   String projectrole;

   String hubrole;

   String username;


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    
    public void setProjectrole(String projectrole) {
        this.projectrole = projectrole;
    }
    public String getProjectrole() {
        return projectrole;
    }
    
    public void setHubrole(String hubrole) {
        this.hubrole = hubrole;
    }
    public String getHubrole() {
        return hubrole;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    
}