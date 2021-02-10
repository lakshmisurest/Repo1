package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage_PF {
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driver;

	public LogoutPage_PF(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver,LoginPage_PF.class);
	}

	
	public void checkLogoutIsDisplayed(){

		btn_logout.isDisplayed();

		}

}
