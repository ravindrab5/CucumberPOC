package com.autodesk.cucumberautomation.config;

import com.autodesk.cucumberautomation.steps.Employee;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@Getter
@ContextConfiguration(classes = {ConfigurationClass.class})
public class TestContext {

  @Autowired
  Employee employee;

  @Before
  public void runBefore(Scenario scenario){
    System.out.println("Running before "+scenario.getSourceTagNames());
  }


  @After
  public void runafter(){
    System.out.println("Running after");
  }


}
