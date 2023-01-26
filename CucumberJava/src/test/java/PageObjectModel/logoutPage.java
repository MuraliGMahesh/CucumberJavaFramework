package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutPage {
	By logout_btn=By.id("logout");
	
	WebDriver driver;
	
	//Constructor
	public logoutPage(WebDriver driver) {
		this.driver = driver;
	}


	public void logoutBtn() throws InterruptedException  
	{
	   
	   driver.findElement(logout_btn).click();
	   Thread.sleep(1000); 
	}

}
