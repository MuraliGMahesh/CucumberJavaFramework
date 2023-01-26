//package StepDefinitions;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//public class LoginSteps {
//	WebDriver driver=null;	
//	@Given("user opens the url of the google page")
//	public void user_opens_the_url_of_the_google_page() throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.google.com");
//		Thread.sleep(3000);
//	}
//
//	@When("sends the key words in search box")
//	public void sends_the_key_words_in_search_box() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Virat Kohli");
//		Thread.sleep(1000);
//	}
//
//	@And("user clicks on search button")
//	public void user_clicks_on_search_button() 
//	{
//		//driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]")).click();
//		driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]")).click();
//	}
//
//	@Then("validate serach results")
//	public void validate_serach_results() 
//	{
//		if (driver.getPageSource().contains("Virat Kohli"))
//		{
//			System.out.println("Validated search succesfully !");
//		}
//	}
//}
