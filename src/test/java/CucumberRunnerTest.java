import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},plugin = {"pretty", "html:build/cucumber-report.html"})
public class CucumberRunnerTest {
  @BeforeClass
  public static void beforeAll(){
    System.out.println("Inside before all ");

  }

  @Test
  public void tests(){
    System.out.println("Running cucumber tests");
  }
}
