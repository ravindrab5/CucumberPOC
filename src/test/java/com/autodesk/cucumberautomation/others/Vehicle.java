package com.autodesk.cucumberautomation.others;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Vehicle {
  String type;
  String id;
  String name="Tata Nexon";

  public Vehicle(String type, String id, String name) {
    this.type = type;
    this.id = id;
    this.name = name;
  }

  public Vehicle() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
            "type='" + type + '\'' +
            ", id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
