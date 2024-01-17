package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePagee {
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='flex-shrink-0 flex items-center']"))
	private List<WebElement> category;
	@FindBy(xpath = "//span[text()='Lobby']")
	private WebElement Homecat;
	@FindBy(xpath = "//span[text()='Sports']")
	private WebElement sportscat;
	@FindBy(xpath = "//span[text()='Live Casino']")
	private WebElement livecat;
	@FindBy(xpath = "//span[text()='Slot']")
	private WebElement Slotcat;
	@FindBy(xpath = "//span[text()='Card Games']")
	private WebElement Cardcat;
	@FindBy(xpath = "//span[text()='Fish Games']")
	private WebElement Fishcat;
	@FindBy(xpath = "//span[text()='Esports']")
	private WebElement Esportcat;
	@FindBy(xpath = "//span[text()='Cockfight']")
	private WebElement CockFightcat;
	@FindBy(xpath = "//span[text()='Lottery']")
	private WebElement Lotterycat;
	@FindBy(xpath = "//span[text()='Bingo']")
	private WebElement Bingocat;
	@FindBy(xpath = "//span[text()='Instant Win']")
	private WebElement Instantcat;
	public WebElement getBingocat() {
		return Bingocat;
	}

	public WebElement getInstantcat() {
		return Instantcat;
	}
	@FindBy(xpath = "//div[text()='Hi, ']")
	private WebElement ProfileLink;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'slot')]"))
	private List<WebElement> SlotImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'live')]"))
	private List<WebElement> LiveImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'/sport/')]"))
	private List<WebElement> SportsImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'card')]"))
	private List<WebElement> cardImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'fish')]"))
	private List<WebElement> FishImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'esport')]"))
	private List<WebElement> EsportImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'lottery')]"))
	private List<WebElement> LotteryImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='dd_img' and contains(@src,'cockfight')]"))
	private List<WebElement> fightImg;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='provider_logo']"))
	private List<WebElement> sportsGame;
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='game_provider_logo_play']/child::button"))
	private List<WebElement> sportsplayNow;
	@FindAll(@FindBy(how = How.XPATH, using = "//img[@class='provider_logo']"))
	private List<WebElement> LiveCasino;	
	@FindAll(@FindBy(how = How.XPATH, using = "//div[text()='Game Providers']/ancestor::div[@class='game_container_bg']/descendant::button[@class='game_provider_btn']"))
	private List<WebElement> SlotProviders;
	

	public List<WebElement> getSlotProviders() {
		return SlotProviders;
	}

	public void setSlotProviders(List<WebElement> slotProviders) {
		SlotProviders = slotProviders;
	}

	public List<WebElement> getLiveCasino() {
		return LiveCasino;
	}

	public WebElement getFishcat() {
		return Fishcat;
	}

	public List<WebElement> getSportsGame() {
		return sportsGame;
	}

	public List<WebElement> getSportsplayNow() {
		return sportsplayNow;
	}

	public WebElement getEsportcat() {
		return Esportcat;
	}

	public WebElement getLotterycat() {
		return Lotterycat;
	}

	public List<WebElement> getFishImg() {
		return FishImg;
	}

	public List<WebElement> getEsportImg() {
		return EsportImg;
	}

	public List<WebElement> getLotteryImg() {
		return LotteryImg;
	}

	public HomePagee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getLiveImg() {
		return LiveImg;
	}
	public List<WebElement> getCategory() {
		return category;
	}

	public WebElement getSportscat() {
		return sportscat;
	}

	public WebElement getLivecat() {
		return livecat;
	}

	public WebElement getSlotcat() {
		return Slotcat;
	}

	public List<WebElement> getSlotImg() {
		return SlotImg;
	}

	public List<WebElement> getSportsImg() {
		return SportsImg;
	}

	public WebElement getCardcat() {
		return Cardcat;
	}

	public List<WebElement> getCardImg() {
		return cardImg;
	}

	public WebElement getHomecat() {
		return Homecat;
	}

	public WebElement getProfileLink() {
		return ProfileLink;
	}

	public WebElement getCockFightcat() {
		return CockFightcat;
	}
	public List<WebElement> getFightImg() {
		return fightImg;
	}

}
