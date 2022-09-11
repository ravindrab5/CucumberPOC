import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},plugin = {"pretty", "html:build/cucumber-report.html"})
public class CucumberRunnerTest2 {
  @BeforeClass
  public static void beforeAll(){
    System.out.println("Inside before all CucumberRunnerTest2");

  }

  @Test
  public void tests(){
    System.out.println("Running cucumber tests CucumberRunnerTest2");
  }
}
