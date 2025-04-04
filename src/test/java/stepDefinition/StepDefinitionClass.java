package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass {

	public static WebDriver driver;
	
	@Given("Open the browser {string}")
	public void open_browser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@And("Launch the url {string}")
	public void launch_url(String url) {
		
		driver.get(url);
	}
	
	@When("Valid Email is entered (.*)$")
	public void enter_email(String email) {
		
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	@And("Valid password is entered (.*)$")
	public void enter_password(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("Submit button is clicked")
	public void click_submit() {
		
		driver.findElement(By.id("submit")).click();
	}
	
	@Then("Corresponding output should display \"([^\"]*)\" and \"([^\\\"]*)\"$")
	public void validate_login(String testtype, String expectedMessage) {
		
		if(testtype.equalsIgnoreCase("ValidDetils")) {
			String text=driver.findElement(By.xpath("//h1[text()='Contact List']")).getText();
			Assert.assertEquals(text, expectedMessage);
		} else if(testtype.equalsIgnoreCase("InavlidMail")) {
			String text = driver.findElement(By.xpath("//span[text()='Incorrect username or password']")).getText();
			Assert.assertEquals(text, expectedMessage);
			
		}
	}
}