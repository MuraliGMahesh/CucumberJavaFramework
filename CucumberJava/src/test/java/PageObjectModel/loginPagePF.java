package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPagePF 
{
WebDriver driver=null;

	@FindBy(id="name")
	WebElement user_name;
	
	@FindBy(id="passowrd")
	WebElement pass_word;
	
	@FindBy(id="login")
	WebElement login_btn;
	
	//Constructor
	public loginPagePF(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void enterUsername(String username) throws InterruptedException
	{
		user_name.sendKeys(username);
		Thread.sleep(1000);
	}
	public void enterPassword(String password) throws InterruptedException
	{
		pass_word.sendKeys(password);
		Thread.sleep(1000);
	}
	public void login_btn() throws InterruptedException
	{
		login_btn.click();
		Thread.sleep(3000);
	}
}
