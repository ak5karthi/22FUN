package functionality;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genric.BaseClass;

import pom.HomePagee;
import pom.LoginModule;

public class LoginFunctionality extends BaseClass {
	@Test(priority = 1)
	public void loginInvalid() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginModule lm = new LoginModule(driver);
		Thread.sleep(500);
		lm.getUsername().sendKeys("akashkr");
		Thread.sleep(500);
		lm.getPassword().sendKeys("123456a");
		Thread.sleep(1000);
		lm.getLoginBtn().click();
		Thread.sleep(500);
		String text1 = lm.getVerify().getText();
		if (text1.contains("Invalid")) {
			System.out.println("Invalid 1:working properly-------------");
			System.out.println(text1);
		} else {
			System.out.println("Accepting invalid 1 Error**********");
			System.out.println(text1);
		}
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(1000);
		lm.getUsername().sendKeys("akashkumarrr");
		Thread.sleep(500);
		lm.getPassword().sendKeys("awertyui");
		Thread.sleep(1500);
		lm.getLoginBtn().click();
		Thread.sleep(1000);
		String text2 = lm.getVerify().getText();
		if (text2.contains("Invalid")) {
			System.out.println("Invalid 2:working properly-------------");
			System.out.println(text2);
		} else {
			System.out.println("Accepting invalid 2 Error**********");
		}
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1000);
		lm.getUsername().sendKeys("Akashkumar$600555");
		Thread.sleep(500);
		lm.getPassword().sendKeys("12345@a");
		Thread.sleep(1500);
		lm.getLoginBtn().click();
		Thread.sleep(1500);
		String text3 = lm.getVerify().getText();
		if (text3.contains("Invalid")) {
			System.out.println("Invalid 3:working properly-------------");
			System.out.println(text3);
		} else {
			System.out.println("Accepting invalid 3 Error**********");
		}
		driver.navigate().refresh();
		Thread.sleep(1500);
		lm.getUsername().sendKeys("Akashkumarrr");
		Thread.sleep(500);
		lm.getPassword().sendKeys("12345678");
		Thread.sleep(1500);
		lm.getLoginBtn().click();
		Thread.sleep(1500);
		String text4 = lm.getVerify().getText();
		Thread.sleep(1500);
		if (text4.contains("Invalid")) {
			System.out.println("Invalid 4:working properly-------------");
			System.out.println(text4);
		} else {
			System.out.println("Accepting invalid 4 Error**********");
		}
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		String curlen = "16";
		String actlen = lm.getPassword().getAttribute("maxlength");
		if (actlen.equals(curlen)) {
			System.out.println("MaxLength for password:working properly-------------");
		} else {
			System.out.println("MaxLength for password Error**********");
		}
		driver.navigate().refresh();
		Thread.sleep(1500);
		String curle = "16";
		String actle = lm.getPassword().getAttribute("maxlength");
		if (actle.equals(curle)) {
			System.out.println("MaxLength for username:working properly-------------");
		} else {
			System.out.println("MaxLength for username Error**********");
		}
		driver.navigate().refresh();
		Thread.sleep(1500);
	}

	@Test(priority = 7)
	public void loginValid() throws InterruptedException {
		LoginModule lm = new LoginModule(driver);
		lm.getUsername().sendKeys("Akashkumarrr");
		lm.getPassword().sendKeys("qwer1234");
		Thread.sleep(1000);
		lm.getLoginBtn().click();
		HomePagee hp = new HomePagee(driver);
		if (hp.getProfileLink().isDisplayed()) {
			System.out.println("valid:working properly-------------");
		} else {
			System.out.println("Not Accepting valid Error**********");
			String text = lm.getVerify().getText();
			System.out.println("the popup displayed is " + text);
		}
	}

	@Test(priority = 2)
	public void forgotPassword() throws InterruptedException {
		LoginModule lm = new LoginModule(driver);
		if (lm.getForgotPass().isDisplayed()) {
			if (lm.getForgotPass().isEnabled()) {
				lm.getForgotPass().click();
				Thread.sleep(1000);
				System.out.println("forgot password link is working properly------------");
			} else {
				System.out.println("forgot password link is displayed but not able to click***************");
			}
		} else {
			System.out.println("forgot password link is not displayed***************");
		}
		driver.navigate().refresh();

	}

	@Test(priority = 4)
	public void rememberMe() throws InterruptedException {
		LoginModule lm = new LoginModule(driver);
		if (lm.getRememberMe().isDisplayed()) {
			if (lm.getRememberMe().isEnabled()) {
				lm.getRememberMe().click();
				System.out.println("RememberMe link is working properly------------");

			} else {
				System.out.println("RememberMe is displayed but not able to click***************");
			}
		} else {
			System.out.println("RememberMe link is not displayed***************");
		}
	}

	@Test(priority = 3)
	public void passVisible() throws InterruptedException {
		LoginModule lm = new LoginModule(driver);
		if (lm.getVisibleIcon().isDisplayed()) {
			if (lm.getVisibleIcon().isEnabled()) {
				lm.getPassword().sendKeys("1234564576");
				lm.getVisibleIcon().click();
				System.out.println("passVisible is working properly------------");

			} else {
				System.out.println("passVisible is displayed but not able to click***************");
			}
		} else {
			System.out.println("passVisible is not displayed***************");
		}
		driver.navigate().refresh();
	}

	@Test(priority = 5)
	public void LanguageButton() throws InterruptedException {
		LoginModule lm = new LoginModule(driver);
		if (lm.getLanguageButton().isDisplayed()) {
			if (lm.getLanguageButton().isEnabled()) {
				lm.getLanguageButton().click();
				Thread.sleep(2000);
				if (lm.getLanguagePopup().isDisplayed()) {
					lm.getLanClosePopup().click();
					Thread.sleep(1000);
					System.out.println("LanguageButton is working properly------------");
				} else {
					System.out.println("LanguageButton is not working properly**************");
				}
			} else {
				System.out.println("LanguageButton is displayed but not able to click***************");
			}
		} else {
			System.out.println("LanguageButton is not displayed***************");
		}
		driver.navigate().refresh();
	}

	@Test(priority = 6)
	public void SignUpButton() throws InterruptedException {
		LoginModule lm = new LoginModule(driver);
		if (lm.getSignUpButton().isDisplayed()) {
			if (lm.getSignUpButton().isEnabled()) {
				lm.getSignUpButton().click();
				Thread.sleep(2000);
				if (lm.getSignPopUp().isDisplayed()) {
					lm.getHomeButton().click();
					Thread.sleep(1000);
					System.out.println("SignUpButton is working properly------------");
				} else {
					System.out.println("SignUpButton is not working properly**************");
				}
			} else {
				System.out.println("SignUpButton is displayed but not able to click***************");
			}
		} else {
			System.out.println("SignUpButton is not displayed***************");
		}
		driver.navigate().refresh();
	}

}
