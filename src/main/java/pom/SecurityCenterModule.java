package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityCenterModule {
	@FindBy(xpath = "//span[text()='Personal Information']")
	private WebElement personalInfo;
	@FindBy(xpath = "//span[text()='ID Verification']")
	private WebElement IDVerification;
	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement ChangePassword;
	@FindBy(xpath = "//span[text()='Withdrawal PIN']")
	private WebElement WithdrawalPIN;
	@FindBy(xpath = "//button[text()='Mobile Verification']")
	private WebElement MobileVerification;
	@FindBy(xpath = "//button[text()='Email Verification']")
	private WebElement EmailVerification;
	public WebElement getMobileBtn() {
		return MobileBtn;
	}

	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement SafelyLogout;
	@FindBy(xpath = "//div[text()='Verify Mobile Number']")
	private WebElement MobilePopup;
	@FindBy(xpath = "//div[text()='Verify Mobile Number']/preceding-sibling::button")
	private WebElement closeButton;
	@FindBy(xpath="//div[text()='Verify Email']")
	private WebElement EmailPopup;
	@FindBy(xpath = "//div[text()='Verify Email']/preceding-sibling::button")
	private WebElement EmailcloseButton;
	@FindBy (xpath="//a[text()='My Profile']")
private WebElement mypro;
	@FindBy(xpath="//i[@class='icon-account_profile']")
	private WebElement idverification;
	@FindBy(xpath="//i[@class='icon-bank']")
	private WebElement BankDet;
@FindBy(xpath="//i[@class='icon-mobile']")
private WebElement MobileBtn;
@FindBy(xpath="//i[@class='icon-email-email_verify']")
private WebElement EmailBtn;
	public WebElement getEmailBtn() {
	return EmailBtn;
}

	public WebElement getBankDet() {
		return BankDet;
	}

	public WebElement getIdverification() {
		return idverification;
	}

	public WebElement getMypro() {
		return mypro;
	}

	public WebElement getEmailcloseButton() {
		return EmailcloseButton;
	}

	public SecurityCenterModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPersonalInfo() {
		return personalInfo;
	}

	public WebElement getIDVerification() {
		return IDVerification;
	}

	public WebElement getChangePassword() {
		return ChangePassword;
	}

	public WebElement getWithdrawalPIN() {
		return WithdrawalPIN;
	}

	public WebElement getMobileVerification() {
		return MobileVerification;
	}

	public WebElement getEmailVerification() {
		return EmailVerification;
	}

	public WebElement getSafelyLogout() {
		return SafelyLogout;
	}

	public WebElement getMobilePopup() {
		return MobilePopup;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getEmailPopup() {
		return EmailPopup;
	}

}
