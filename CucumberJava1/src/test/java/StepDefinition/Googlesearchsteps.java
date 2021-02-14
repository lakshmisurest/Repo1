 	 package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

public class Googlesearchsteps {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step-browser is open");	
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step- user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside step- user enters text");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(2000); 	
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside hit enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000); 
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step- user navigates to search results");


		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
