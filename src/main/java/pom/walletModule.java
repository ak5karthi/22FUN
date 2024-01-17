package pom;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class walletModule {
	@FindBy (xpath="//*[@class='min-w-5 w-5 icon_restore']")
	private WebElement RestoreButton;
	@FindBy (xpath="//span[text()='Wallet']")
	private WebElement WalletButton;
	@FindBy(xpath="//span[@class='text-xs sm:text-sm']")
	private WebElement RefershButton;
	@FindBy (xpath = "//span[text()='All Categories']")
	private WebElement DropdownButton;
	public List<WebElement> getPlusButton() {
		return PlusButton;
	}







	@FindAll(@FindBy(how = How.XPATH, using = "//span[@class='text-sm text-secondary']"))
	private List<WebElement> PlusButton;
	

	
	
	
	
	
	
	public WebElement getDropdownButton() {
		return DropdownButton;
	}







	public WebElement getRefershButton() {
		return RefershButton;
	}







	public WebElement getRestoreButton() {
		return RestoreButton;
	}







	public WebElement getWalletButton() {
		return WalletButton;
	}







	public walletModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
