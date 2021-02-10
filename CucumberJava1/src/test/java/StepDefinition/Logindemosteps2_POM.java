//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.Loginpage;
//
//import java.util.concurrent.TimeUnit;
//
//import io.cucumber.java.en.*;
//
//
//public class Logindemosteps2_POM {
//
//	WebDriver driver = null;
//
//	Loginpage login;
//	@Given("browser is open")
//	
//	public void browser_is_open() {
//		System.out.println("------Inside PAGE OBJECT MODEL-----"); 
//
//		System.out.println("Inside step-browser is open");	
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
//
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside step- user is on login page");
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password( String username, String password) throws InterruptedException {
//		login = new Loginpage(driver);
//
//		login.enterUsername(username);
//		login.enterPassword(password);
//		//		driver.findElement(By.id("name")).sendKeys("username");
//		//		driver.findElement(By.id("password")).sendKeys("password");
//		Thread.sleep(2000); 
//	}
//
//	@When("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickLogin();
//		//	driver.findElement(By.id("login")).click(); 
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		login.checklogoutisdisplayed();
//
//		//driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000); 
//		driver.close();
//		driver.quit();
//
//
//	}
//
//
//
//}
