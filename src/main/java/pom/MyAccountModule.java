package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountModule {
	@FindBy(xpath = "//span[text()='Security Center']")
	private WebElement SecurityCenter;
	@FindBy(xpath = "//span[text()='My Profile']")
	private WebElement MyProfile;
	@FindBy(xpath = "//span[text()='Withdrawal PIN']")
	private WebElement WithdrawalPIN;
	@FindBy(xpath = "//input[@placeholder='New Withdrawal Pin' and @class='o-input o-2 password_input_right mobile-big']")
	private WebElement NewWithdrawalPINField;
	@FindBy(xpath = "//input[@placeholder='Confirm New Withdrawal Pin' and @class='o-input o-2 password_input_right mobile-big']")
	private WebElement ConfirmNewWithdrawalPINField;
	@FindBy(xpath = "//button[text()='Submit' and @class='btn !py-3 text-sm bg-main w-full mx-auto merchant_text_color']")
	private WebElement PINSubmitButton;
	@FindBy(xpath = "//input[@placeholder='Login Password']")
	private WebElement PINLoginPassword;
	@FindBy(xpath = "//button[text()='Submit' and @class='btn !py-3 text-sm bg-main w-full mx-auto merchant_text_color shining uppercase']")
	private WebElement ActivateSubmit;
	@FindBy(xpath = "//input[@placeholder='Current Withdrawal PIN']")
	private WebElement currentPin;
	@FindBy(xpath ="//div[@class='toast-message text-sm']")
	private WebElement VerifyChange;
	@FindBy(xpath="//div[text()='Change Withdrawal PIN']/preceding-sibling::button")
	private WebElement CloseButton;
	@FindAll(@FindBy(how = How.XPATH, using = "//span[@class='grid items-center h-[35px] md:h-auto text-xs md:text-sm']"))
	private List<WebElement> AllLinks;
	
	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getVerifyChange() {
		return VerifyChange;
	}

	public WebElement getCurrentPin() {
		return currentPin;
	}

	@FindBy(xpath="//a[@href='/en-th/profile/pin']")
	private WebElement verifyElement;
	public WebElement getActivateSubmit() {
		return ActivateSubmit;
	}

	public WebElement getVerifyElement() {
		return verifyElement;
	}

	public WebElement getPINLoginPassword() {
		return PINLoginPassword;
	}

	public WebElement getConfirmNewWithdrawalPINField() {
		return ConfirmNewWithdrawalPINField;
	}

	public WebElement getNewWithdrawalPINField() {
		return NewWithdrawalPINField;
	}

	public MyAccountModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSecurityCenter() {
		return SecurityCenter;
	}

	public WebElement getMyProfile() {
		return MyProfile;
	}

	public WebElement getWithdrawalPIN() {
		return WithdrawalPIN;
	}

	public WebElement getPINSubmitButton() {
		return PINSubmitButton;
	}
	public List<WebElement> getAllLinks() {
		return AllLinks;
	}

}
