package com.autodesk.cucumberautomation.steps;

import com.autodesk.cucumberautomation.config.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;



public class LoginStepDefs {
  TestContext testContext;

  @Autowired
  public LoginStepDefs(TestContext testContext) {
    this.testContext=testContext;
  }



  @Given("^a user navigates to login page$")
  public void userNavigatesToLoginPage(){

    System.out.println("Inside - a user navigates to login page "+ testContext);

  }

  @When("he enters valid username")
  public void heEntersValidUsername() {
    System.out.println("Inside - he enters valid username");
  }

  @And("valid password")
  public void validPassword() {
    System.out.println("Inside - valid password");
  }

  @Then("he successfully logs in to the system.")
  public void heSuccessfullyLogsInToTheSystem() {
    System.out.println("Inside - he successfully logs in to the system.");
  }

  @And("invalid password")
  public void invalidPassword() {
    System.out.println("Inside - invalid password");
  }

  @Then("an error message should be displayed.")
  public void anErrorMessageShouldBeDisplayed() {
    System.out.println("Inside - an error message should be displayed.");
  }

}
