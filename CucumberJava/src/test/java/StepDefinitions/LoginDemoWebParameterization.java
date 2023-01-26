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
//public class LoginDemoWebParameterization
//{
//	WebDriver driver=null;
//	
//	
//	@Given("the user opens the chrome browser")
//	public void the_user_opens_the_chrome_browser() 
//	{
//		//System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//	}
//
//	@When("the user opens the demo website")
//	public void the_user_opens_the_demo_website() throws InterruptedException
//	{
//		driver.get("https://example.testproject.io/web/");
//		Thread.sleep(3000);
//	}
//
//	@And("^the user provides (.*) and (.*)$")
//	public void the_user_provides_the_username_and_password(String username,String password) throws InterruptedException  
//	{
//	   
//	   driver.findElement(By.id("name")).sendKeys(username);
//	  
//	   driver.findElement(By.id("password")).sendKeys(password);
//	   Thread.sleep(3000); 
//	}
//
//	@When("the user clicks on login button")
//	public void the_user_clicks_on_login_button() throws InterruptedException 
//	{
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(3000);
//		   
//	}
//
//	@Then("the user must be logged in")
//	public void the_user_must_be_logged_in() 
//	{
//	    if (driver.findElement(By.id("logout")).isDisplayed())
//	    {
//	    	System.out.println("Logged in Sucessfully !!!");
//	    }
//	}
//	@And("the user will close the browser")
//	public void the_user_will_close_the_browser() throws InterruptedException  
//	{
//	   driver.close();
//	}
//
//}
