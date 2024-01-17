package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InfoLinks {

	public List<WebElement> getAllLinks() {
		return AllLinks;
	}
	@FindAll(@FindBy(how = How.XPATH, using = "//a[@class='footer_link']"))
	private List<WebElement> AllLinks;
	public InfoLinks(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
