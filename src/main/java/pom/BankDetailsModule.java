package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BankDetailsModule {
	@FindBy(xpath = "//button[text()='Bank']")
	private WebElement BankButton;
	@FindBy(xpath = "//button[text()='+ Add Bank']")
	private WebElement AddBankButton;
	@FindBy(xpath = "//*[@class='o-select-arrow']")
	private WebElement BankNameDropButton;
	@FindBy(xpath = "//input[@placeholder='Account Name']")
	private WebElement AccountNameTextFld;
	@FindBy(xpath = "//input[@placeholder='Bank Account Number']")
	private WebElement AccountNumber;
	@FindBy(xpath = "//button[text()='Submit' and @class='btn bg-main !merchant_text_colors max-w-[200px] uppercase w-full !block mx-auto mt-5']")
	private WebElement submitButton;
	@FindBy(xpath = "//span[text()='Bank Details']")
	private WebElement BankDetails;
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='_df_ErrMsg']"))
	private List<WebElement> ErrorMessages;

	public List<WebElement> getErrorMessages() {
		return ErrorMessages;
	}

	public WebElement getBankDetails() {
		return BankDetails;
	}

	public BankDetailsModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBankButton() {
		return BankButton;
	}

	public WebElement getAddBankButton() {
		return AddBankButton;
	}

	public WebElement getBankNameDropButton() {
		return BankNameDropButton;
	}

	public WebElement getAccountNameTextFld() {
		return AccountNameTextFld;
	}

	public WebElement getAccountNumber() {
		return AccountNumber;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
}
