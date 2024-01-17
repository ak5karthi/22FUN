package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpModule {
	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement signUpButton;
	@FindBy(xpath = "//button[text()='Next' and @class='btn outline-primary text-sm !py-[8px] uppercase']")
	private WebElement NextButton;
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='_df_ErrMsg']"))
	private List<WebElement> ERRmSGS;
	@FindBy(xpath = "//input[@placeholder='Enter Your Username' and @type='text']")
	private WebElement usernameFld;
	@FindBy(xpath = "//input[@placeholder='Enter Your Password' and @class='mobile-big with_tooltip o-input o-2 password_input_right']")
	private WebElement PasswordFld;
	@FindBy(xpath = "//div[@class='o-select-value-label-img-container']")
	private WebElement DropDown;
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='o-select-option']/span"))
	private List<WebElement> Names;
	@FindBy(xpath = "//input[@placeholder='Enter your mobile number']")
	private WebElement MobileNumber;
	@FindBy(xpath = "//div[text()='Email']/ancestor::div[@class='grid gap-6']/child::button")
	private WebElement Next2Button;
	@FindBy(xpath = "//input[@placeholder='Enter your full name' and @class='o-input mobile-big']")
	private WebElement FullName;
	@FindBy(xpath = "//input[@placeholder='Enter Your Email']")
	private WebElement Email;

	public WebElement getFullName() {
		return FullName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getNext2Button() {
		return Next2Button;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getConfrmPass() {
		return confrmPass;
	}

	public WebElement getVerify() {
		return verify;
	}

	@FindBy(xpath = "//*[@class='referral_arrow close']")
	private WebElement ReferalButton;
	@FindBy(xpath = "//input[@placeholder='Enter Referral / Affiliate Code']")
	private WebElement Referalfield;
	@FindBy(xpath = "//input[@placeholder='Enter Confirm Password']")
	private WebElement confrmPass;
	@FindBy(xpath = "//div[@class='toast-message text-sm']")
	private WebElement verify;

	public WebElement getReferalButton() {
		return ReferalButton;
	}

	public WebElement getReferalfield() {
		return Referalfield;
	}

	public List<WebElement> getNames() {
		return Names;
	}

	public WebElement getDropDown() {
		return DropDown;
	}

	public WebElement getPasswordFld() {
		return PasswordFld;
	}

	public WebElement getUsernameFld() {
		return usernameFld;
	}

	public List<WebElement> getERRmSGS() {
		return ERRmSGS;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

	public SignUpModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

}
