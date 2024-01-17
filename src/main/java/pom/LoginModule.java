package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginModule {
	@FindBy(xpath = "//input[@placeholder='Enter Username']")
	private WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password' and @class='topbar-input !pr-[50px]']")
	private WebElement password;
	@FindBy(xpath = "//button[@class='topbar_btn_1 hidden md:block']")
	private WebElement loginBtn;
	@FindBy(xpath = "//*[@class='topbar_form_password_icon']")
	private WebElement PassIcon;
	@FindBy(xpath = "//div[@class='o-checkbox-wrapper whitespace-nowrap']")
	private WebElement RememberMe;
	@FindBy(xpath = "//button[text()='Forgot Password?' and @class='font-normal text-[12px] forgot-link whitespace-nowrap']")
	private WebElement ForgotPass;
	@FindBy(xpath = "//button[text()='Logout']")
	private WebElement Logout;
	@FindBy(xpath = "//div[@class='daily_bg']/ancestor::div[@class='relative p-4 md:px-0 overflow-auto']/descendant::button[text()='Home']")
	private WebElement BonusButton;
	@FindBy(xpath = "//button[@aria-label='Hide greeting']")
	private WebElement notification;
	@FindBy(xpath = "//div[@class='toast-message text-sm']")
	private WebElement verify;
	@FindBy(xpath = "//a[text()='customer service']")
	private WebElement ForgotpassPopup;
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement ForgotClose;
	@FindBy(xpath = "//*[@class='topbar_form_password_icon']")
	private WebElement visibleIcon;
	@FindBy(xpath = "//div[text()='in']")
	private WebElement LanguageButton;
	@FindBy(xpath = "//div[text()='Language' and @class='text-center md:font-bold text-[18px] md:text-[22px]']")
	private WebElement LanguagePopup;
	@FindBy(xpath = "//img[@alt='close']")
	private WebElement LanClosePopup;
	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement signUpButton;
	@FindBy(xpath = "//div[text()='Please fill out the following details to sign up for FREE']")
	private WebElement signPopUp;
	@FindBy (xpath = "//div[@class='header_logo_img cny topbar_logo_skeleton_size']")
	private WebElement homeButton;
	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getSignPopUp() {
		return signPopUp;
	}

	public WebElement getLanClosePopup() {
		return LanClosePopup;
	}

	public WebElement getLanguagePopup() {
		return LanguagePopup;
	}

	public WebElement getLanguageButton() {
		return LanguageButton;
	}

	public WebElement getVisibleIcon() {
		return visibleIcon;
	}

	public WebElement getForgotClose() {
		return ForgotClose;
	}

	public WebElement getForgotpassPopup() {
		return ForgotpassPopup;
	}

	public LoginModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBonusButton() {
		return BonusButton;
	}

	public WebElement getNotification() {
		return notification;
	}

	public WebElement getForgotPass() {
		return ForgotPass;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPassIcon() {
		return PassIcon;
	}

	public WebElement getRememberMe() {
		return RememberMe;
	}

	public void setLogin(String un, String pw) throws InterruptedException {
		username.sendKeys(un);
		Thread.sleep(500);
		password.sendKeys(pw);
		Thread.sleep(500);
		loginBtn.click();
	}

	public WebElement getVerify() {
		return verify;
	}

}
