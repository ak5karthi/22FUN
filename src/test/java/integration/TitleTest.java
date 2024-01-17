package integration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genric.BaseClass2;
import pom.HomePagee;
import pom.MyAccountModule;
import pom.SecurityCenterModule;

public class TitleTest extends BaseClass2 {
	@Test(priority = 1)
	public void homePageTitle() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		for (int i = 1; i < hp.getCategory().size(); i++) {
			WebElement cat = hp.getCategory().get(i);
			String txt = cat.getText();
			cat.click();
			Thread.sleep(1000);
			String title = driver.getTitle();
			if (title.contains(txt)) {
				System.out.println(txt + " Title is present properly");
			} else {
				System.out.println(txt + " Title is not present properly*************");
				System.out.println("title should be :" + txt + " but actual title is :" + title);
			}
		}
	}

	@Test(priority = 2)
	public void securityCenter() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		MyAccountModule mm = new MyAccountModule(driver);
		hp.getProfileLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (WebElement link : mm.getAllLinks()) {
			String txt = link.getText();
			jse.executeScript("arguments[0].click()", link);
			Thread.sleep(1000);
			String title = driver.getTitle();
			if (title.contains(txt)) {
				System.out.println(txt + " Title is present properly");
			} else {
				System.out.println(txt + " Title is not present properly*************");
				System.out.println("title should be :" + txt + " but actual title is :" + title);
			}
		}
		SecurityCenterModule sc = new SecurityCenterModule(driver);
		jse.executeScript("arguments[0].click()",sc.getIdverification());
		String title = driver.getTitle();
		if(title.contains("ID Verification")) {
			System.out.println("Id verification has proper title");
		}
		else {
			System.out.println("Title for id-verification is not present properly***********");
		}
		jse.executeScript("arguments[0].click()",sc.getBankDet());
		String title1 = driver.getTitle();
		if(title1.contains("Bank")) {
			System.out.println("Bank has proper title");
		}
		else {
			System.out.println("Title for Bank is not present properly***********");
		}
	}
}
