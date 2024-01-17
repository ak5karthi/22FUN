package genric;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom.LoginModule;

public class BaseClass2 {
	public static WebDriver driver;
	@BeforeTest
	public void openingBrowser() throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLib fl = new FileLib();
		String url = fl.getProperty("url");
		String un = fl.getProperty("username");
		String pw = fl.getProperty("password");
		driver.get(url);
		Thread.sleep(2000);
		LoginModule lm = new LoginModule(driver);
		lm.setLogin(un, pw);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//if (lm.getBonusButton().isDisplayed()) {
		//	lm.getBonusButton().click();
		//}

	}

	@BeforeMethod
	public void Login() throws IOException {

	}

	@AfterMethod
	public void logout() {

	}

	@AfterTest
	public void closingBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
