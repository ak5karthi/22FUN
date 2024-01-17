package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BetHistoryModule {
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='o-select-option']/span"))
	private List<WebElement> providersNames;
	@FindBy(xpath = "//span[text()='History']")
	private WebElement BetHistoryButton;
	@FindBy(xpath = "//span[text()='Deposit']")
	private WebElement DepositButton;
	@FindBy(xpath="//button[text()='Withdrawal']")
	private WebElement withdrawalTab;
	@FindBy(xpath="//button[text()='Promo Apply']")
	private WebElement PromoApply;
	@FindBy(xpath="//button[text()='Rewards']")
	private WebElement Rewards;
	public WebElement getRewards() {
		return Rewards;
	}
	public WebElement getPromoApply() {
		return PromoApply;
	}
	public WebElement getDepositButton() {
		return DepositButton;
	}
	public WebElement getWithdrawalTab() {
		return withdrawalTab;
	}
	@FindBy(xpath = "//span[text()='Please Select']")
	private WebElement providerDropdown;
	public WebElement getRewardDropdown() {
		return RewardDropdown;
	}
	@FindBy(xpath = "//span[text()='Daily Mission']")
	private WebElement RewardDropdown;
	@FindBy(xpath = "//div[@class=\"o-input-wrapper right o-select-container cursor-pointer\"]")
	private WebElement DropdownButton;
	@FindAll(@FindBy(how = How.XPATH, using = "//button[@class='transaction-border p-3 rounded-[10px] selection-common']"))
	private List<WebElement> DateButtons;
	@FindBy(xpath = "//button[@class='p-3 rounded selection-common active']")
	private WebElement ActiveDateButton;
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='text-ellipsis overflow-hidden whitespace-nowrap']"))
	private List<WebElement> Dates;
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='w-[17px] md:w-[20px]']"))
	private List<WebElement> Calanders;
	@FindBy(xpath = "//div[@class='o-dp-body']")
	private WebElement datescal;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement Searchbutton;
@FindBy (xpath="//button[text()='Bet History']")
private WebElement BetHistoryTab;
	public WebElement getBetHistoryTab() {
	return BetHistoryTab;
}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public WebElement getDatescal() {
		return datescal;
	}

	public List<WebElement> getCalanders() {
		return Calanders;
	}

	public List<WebElement> getDates() {
		return Dates;
	}

	public List<WebElement> getDateButtons() {
		return DateButtons;
	}

	public WebElement getActiveDateButton() {
		return ActiveDateButton;
	}

	public WebElement getDropdownButton() {
		return DropdownButton;
	}

	public WebElement getProviderDropdown() {
		return providerDropdown;
	}

	public WebElement getBetHistoryButton() {
		return BetHistoryButton;
	}

	public List<WebElement> getProvidersNames() {
		return providersNames;
	}

	public BetHistoryModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
