package com.autodesk.cucumberautomation.steps;

import com.autodesk.cucumberautomation.config.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class OtherSteps {

  TestContext testContext;

  @Autowired
  public OtherSteps(TestContext testContext) {
   this.testContext=testContext;
  }

  @When("inside background when")
  public void insideBackgroundWhen() {
    System.out.println("- ----------- Inside - inside background when");

   // testContext.getEmployee();
  }

  @Given("inside background given")
  public void insideBackgroundGiven() {
    System.out.println("- ----------- Inside - inside background given");
  }
}
