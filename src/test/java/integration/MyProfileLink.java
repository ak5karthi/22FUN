package integration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genric.BaseClass2;
import pom.HomePagee;
import pom.MyAccountModule;

public class MyProfileLink extends BaseClass2 {
	@Test
	public void Links() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		MyAccountModule mm = new MyAccountModule(driver);
		hp.getProfileLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (WebElement link : mm.getAllLinks()) {
			jse.executeScript("arguments[0].click()",link);
			String txt = link.getText().toLowerCase();
			 String[] words = txt.split("\\s+");
			   String firstWord = words[0];
			Thread.sleep(500);
			String url=driver.getCurrentUrl();
			if(url.contains(firstWord)) {
				System.out.println(txt+" is navigating properly");
			}
			else {
				System.out.println(txt+" is not navigating properly***************");
			}	
		}
	}


}
