package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	By user_name=By.id("name");
	By pass_word=By.id("password");
	By login_btn=By.id("login");
	
	WebDriver driver;
	//Constructor
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username) throws InterruptedException  
	{
	   
	   driver.findElement(user_name).sendKeys(username);
	   
	   Thread.sleep(1000); 
	}
	
	public void enterPassword(String password) throws InterruptedException  
	{
	   driver.findElement(pass_word).sendKeys(password);;
	   Thread.sleep(1000); 
	}
	public void loginBtn() throws InterruptedException  
	{
	   driver.findElement(login_btn).click();;
	   Thread.sleep(1000); 
	}
	
	

}
