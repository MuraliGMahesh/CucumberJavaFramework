//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginDemoWebsite
//{
//	WebDriver driver=null;
//	
//	
//	@Given("user opens the chrome browser")
//	public void user_opens_the_chrome_browser() 
//	{
//		//System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//	}
//
//	@When("user opens the demo website")
//	public void user_opens_the_demo_website() throws InterruptedException
//	{
//		driver.get("https://example.testproject.io/web/");
//		Thread.sleep(3000);
//	}
//
//	@And("user provides the valid credentials")
//	public void user_provides_the_valid_credentials() throws InterruptedException  
//	{
//	   driver.findElement(By.id("name")).sendKeys("UserTest");
//	   String password = getPassword(driver);
//	   driver.findElement(By.id("password")).sendKeys(password);
//	   Thread.sleep(3000); 
//	}
//
//	@When("user clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException 
//	{
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(3000);
//		   
//	}
//
//	@Then("user must be logged in")
//	public void user_must_be_logged_in() 
//	{
//	    if (driver.findElement(By.id("logout")).isDisplayed())
//	    {
//	    	System.out.println("Logged in Sucessfully !!!");
//	    }
//	}
//	@And("user will close the browser")
//	public void user_will_close_the_browser() throws InterruptedException  
//	{
//	   driver.close();
//	}
//	public  static String getPassword(WebDriver driver)
//	{
//		String[] passwordHelp= driver.findElement(By.id("passwordHelp")).getText().split(" ");
//		String password=passwordHelp[3];
//		return password;
//	}
//}
