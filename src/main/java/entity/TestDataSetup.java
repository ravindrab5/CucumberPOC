package entity;

import java.util.List;

public class TestDataSetup {
  String hubtype;

  String name;

  String owner;

  String username;

  List<Projects> projects;


  public void setHubtype(String hubtype) {
    this.hubtype = hubtype;
  }
  public String getHubtype() {
    return hubtype;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
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

  public void setProjects(List<Projects> projects) {
    this.projects = projects;
  }
  public List<Projects> getProjects() {
    return projects;
  }

}
