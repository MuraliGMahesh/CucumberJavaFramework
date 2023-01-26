package StepDefinitions;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import PageObjectModel.loginPage;
import PageObjectModel.logoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_PF {
	WebDriver driver = null;
	//	loginPage login=new loginPage(driver);
	//	logoutPage logout = new logoutPage(driver);

	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination= new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/1.png");
	//FileHandler.copyFile(src,destination);

	@Given("the user opens the chrome browser")
	public void the_user_opens_the_chrome_browser() {

		System.out.println("I am inside PF model script");
		// System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@When("the user opens the demo website")
	public void the_user_opens_the_demo_website() throws InterruptedException {
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(3000);
	}

	@And("^the user provides (.*) and (.*)$")
	public void the_user_provides_the_username_and_password(String username, String password)
			throws InterruptedException {
		loginPage login=new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(3000);

	}

	@And("the user clicks on login button")
	public void the_user_clicks_on_login_button() throws InterruptedException {
		loginPage login=new loginPage(driver);
		login.loginBtn();

	}

	@Then("the user must be logged in")
	public void the_user_must_be_logged_in() throws InterruptedException {
		System.out.println(driver.findElement(By.id("logout")).isDisplayed());


	}
	@Then("the user will logout")
	public void the_user_will_logout() throws InterruptedException {
		logoutPage logout = new logoutPage(driver);

		logout.logoutBtn();
	}

	@And("the user will close the browser")
	public void the_user_will_close_the_browser() throws InterruptedException {
		driver.close();
	}

}
