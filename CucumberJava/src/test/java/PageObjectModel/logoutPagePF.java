package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logoutPagePF 
{
	WebDriver driver=null;

	@FindBy(id="logout")
	WebElement logout_btn;
	
	public void logoutBtn() throws InterruptedException
	{
		logout_btn.click();
		Thread.sleep(2000);
	}
	
}
