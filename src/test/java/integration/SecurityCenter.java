package integration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import genric.BaseClass2;
import pom.HomePagee;
import pom.MyAccountModule;
import pom.SecurityCenterModule;


public class SecurityCenter extends BaseClass2 {
	@Test(priority = 1)
	public void securityCenter() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		hp.getProfileLink().click();
		MyAccountModule mm = new MyAccountModule(driver);
		jse.executeScript("arguments[0].click()",mm.getSecurityCenter());
		SecurityCenterModule sc = new SecurityCenterModule(driver);
		sc.getChangePassword().click();
		Thread.sleep(500);
		String url = driver.getCurrentUrl();
		if (url.contains("password")) {
			System.out.println("Change password is navigating properly------------------");
		} else {
			System.out.println("Change password is not navigating*****************");
		}
		String tt = sc.getMypro().getText();
		jse.executeScript("arguments[0].click();", sc.getMypro());
		Thread.sleep(1000);
		String Passurl = driver.getCurrentUrl();
		if (Passurl.contains("profile")) {
			System.out.println(tt + " is navigating properly-------------");
		} else {
			System.out.println(tt + " is not navigating*************");
		}
	}


	@Test(priority = 2)
	public void MobileVerify() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		hp.getProfileLink().click();
		MyAccountModule mm = new MyAccountModule(driver);
		jse.executeScript("arguments[0].click()",mm.getSecurityCenter());
		SecurityCenterModule sc = new SecurityCenterModule(driver);
		sc.getMobileVerification().click();
		Thread.sleep(1000);
		if (sc.getMobilePopup().isDisplayed()) {
			System.out.println("Mobile verify link is working-------------------");
			sc.getCloseButton().click();
		} else {
			System.out.println("Mobile verify link is not working ****************");
		}

	}

	@Test(priority = 3)
	public void EmailVerify() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		hp.getProfileLink().click();
		MyAccountModule mm = new MyAccountModule(driver);
		jse.executeScript("arguments[0].click()",mm.getSecurityCenter());
		SecurityCenterModule sc = new SecurityCenterModule(driver);
		sc.getEmailVerification().click();
		Thread.sleep(1000);
		if (sc.getEmailPopup().isDisplayed()) {
			System.out.println("Email verify link is working--------------------");
			sc.getEmailcloseButton().click();
		} else {
			System.out.println("Email verify link is not working****************");
		}
	}
	@Test(priority = 4)
	public void verificationButtons() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		SecurityCenterModule sc = new SecurityCenterModule(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		MyAccountModule mm = new MyAccountModule(driver);
		hp.getProfileLink().click();
		jse.executeScript("arguments[0].click()",sc.getIdverification());
		Thread.sleep(1000);
		String Passurl = driver.getCurrentUrl();
		if (Passurl.contains("verification")) {
			System.out.println("Idverification button is navigating properly-------------");
		} else {
			System.out.println("Idverification button is not navigating*************");
		}
		jse.executeScript("arguments[0].click()",sc.getBankDet());
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		if (url.contains("bank")) {
			System.out.println("Bank button is navigating properly-------------");
		} else {
			System.out.println("Bank button is not navigating*************");
		}
		jse.executeScript("arguments[0].click()",sc.getMobileBtn());
		Thread.sleep(2000);
		if (sc.getMobilePopup().isDisplayed()) {
			System.out.println("Mobile veify button is navigating properly-------------");
			sc.getCloseButton().click();
		} else {
			System.out.println("Mobile veify is not navigating*************");
		}
		sc.getEmailBtn().click();
		Thread.sleep(1000);
		if (sc.getEmailPopup().isDisplayed()) {
			System.out.println("Email verify button is working-------------------");
			Thread.sleep(2000);
			sc.getEmailcloseButton().click();
		} else {
			System.out.println("Email verify button is not working ****************");
		}

	}




}
	


