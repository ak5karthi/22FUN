package integration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genric.BaseClass2;
import pom.InfoLinks;

public class InfoTest extends BaseClass2 {
	@Test
	public void Links() throws InterruptedException {
		InfoLinks IF=new InfoLinks(driver);
		for (int i=0;i<IF.getAllLinks().size();i++){
			WebElement link=IF.getAllLinks().get(i);
			String txt=link.getText().toLowerCase();
			 String[] words = txt.split("\\s+");
			   String firstWord = words[0];
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",link);
			Thread.sleep(1000);
			String url = driver.getCurrentUrl();
			if(url.contains(firstWord)) {
				System.out.println(txt+" is navigating properly");
			}
			else {
				System.out.println(txt+" is not navigating properly***************");
			}
			driver.navigate().back();	
		}
	}

}
