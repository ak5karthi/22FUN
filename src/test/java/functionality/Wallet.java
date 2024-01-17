package functionality;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genric.BaseClass2;
import pom.BetHistoryModule;
import pom.HomePagee;
import pom.walletModule;

public class Wallet extends BaseClass2 {
	@Test(priority = 1)
	public void restoreButton() {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", hp.getProfileLink());
		walletModule wm = new walletModule(driver);
		jse.executeScript("arguments[0].click()", wm.getWalletButton());
		if (wm.getRestoreButton().isDisplayed()) {
			if (wm.getRestoreButton().isEnabled()) {
				wm.getRestoreButton().click();
				System.out.println("Restore button is working properly");
			} else {
				System.out.println("Restore button is displayed but not able to click");
			}

		} else {
			System.out.println("Restore button is not displayed");
		}

	}
	@Test(priority = 2)
	public void refreshButton() {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", hp.getProfileLink());
		walletModule wm = new walletModule(driver);
		jse.executeScript("arguments[0].click()", wm.getWalletButton());
		if (wm.getRefershButton().isDisplayed()) {
			if (wm.getRefershButton().isEnabled()) {
				wm.getRefershButton().click();
				System.out.println("Refresh button is working properly");
			} else {
				System.out.println("Refresh button is displayed but not able to click");
			}

		} else {
			System.out.println("Refresh button is not displayed");
		}
		

	}
	@Test(priority = 3)
	public void  allCat() {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", hp.getProfileLink());
		walletModule wm = new walletModule(driver);
		jse.executeScript("arguments[0].click()", wm.getWalletButton());
		if (wm.getDropdownButton().isDisplayed()) {
			if (wm.getDropdownButton().isEnabled()) {
				wm.getDropdownButton().click();
				System.out.println("DropDown button is working properly");
				BetHistoryModule BH = new BetHistoryModule(driver);
				for (int i = 0; i < BH.getProvidersNames().size(); i++) {
					List<WebElement> names = BH.getProvidersNames();
					WebElement name = names.get(i);
					String text = names.get(i).getText();
					name.click();
					System.out.println(text + " :provider is working properly");
					for (int j = 1; j <wm.getPlusButton().size(); j++) {
						WebElement button=wm.getPlusButton().get(j);
						button.click();
						System.out.println(text+"'s Plus icon is working fine");
						button.click();
					}
					BH.getDropdownButton().click();
				}
			} else {
				System.out.println("DropDown button is displayed but not able to click");
			}

		} else {
			System.out.println("DropDown button is not displayed");
		}
		
	}
}
