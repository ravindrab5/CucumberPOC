package com.autodesk.cucumberautomation.steps;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Employee {
  String id;
  String name;
}
