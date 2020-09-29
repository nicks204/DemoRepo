package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef {
	
	public StepDef() {
		
	}
	
	WebDriver driver = null; 
	
	   @Given("^the user navigates to Facebook$") 
	   public void goToFacebook() { 
	      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.navigate().to("https://www.facebook.com/"); 
	   } 
		
	   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
	      driver.findElement(By.id("email")).sendKeys(arg1);
	      driver.findElement(By.id("pass")).sendKeys(arg2);
	      driver.findElement(By.id("u_0_v")).click(); 
	   } 
		
	   @Then("^login should be unsuccessful$") 
	   public void validateRelogin() { 
	      if(driver.getCurrentUrl().equalsIgnoreCase(
	         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
	            System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
	      driver.close(); 
	   } 

}
