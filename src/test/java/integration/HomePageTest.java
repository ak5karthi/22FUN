package integration;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genric.BaseClass;
import pom.HomePagee;


public class HomePageTest extends BaseClass {

	@Test(priority = 1)
	public void navigationBar() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePagee hp = new HomePagee(driver);
	for(int i=0;i<hp.getCategory().size();i++) {
		WebElement cat=hp.getCategory().get(i);
			String text = cat.getText();
			if(i==0) {
				System.out.println(text+" category is navigating properly------------------");
			}
			else {
			if (cat.isDisplayed()) {
				if (cat.isEnabled()) {
					cat.click();
					Thread.sleep(1000);
					String Currenturl = driver.getCurrentUrl();
					
					
						if (Currenturl.contains("sport")) {
							System.out.println(text + " navigating properly------------------");
						} else if (Currenturl.contains("live"))  {
							System.out.println(text + " navigating properly----------------");
						}
						else if (Currenturl.contains("slot"))  {
							System.out.println(text + " navigating properly-----------------");
						}
						else if (Currenturl.contains("card"))  {
							System.out.println(text + " navigating properly-------------------");
						}
						else if (Currenturl.contains("fish"))  {
							System.out.println(text + " navigating properly-------------------");
						}
						else if (Currenturl.contains("esport"))  {
							System.out.println(text + " navigating properly--------------------");
						}
						else if (Currenturl.contains("lottery"))  {
							System.out.println(text + " navigating properly-----------------");
						}
						else if (Currenturl.contains("cockfight"))  {
							System.out.println(text + " navigating properly-----------------");
						}
						else if (Currenturl.contains("bingo"))  {
							System.out.println(text + " navigating properly-----------------");
						}
						else if (Currenturl.contains("instantwin"))  {
							System.out.println(text + " navigating properly-----------------");
						}
						else {
								System.out.println(text+"category is displayed but not navigating*************");

						}
					}
				 else {
					System.out.println(text+"category is displayed but not able to click**************");
				}

			} else {
				System.out.println(text+"category is not displayed******************");
			}
			}
		}

	}

	@Test(priority = 2)
	public void sportsDropdown() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getSportscat().click();
		for(int i=0;i<hp.getSportsGame().size();i++) {
			WebElement game=hp.getSportsGame().get(i);
			game.click();
			String GameName = game.getAttribute("alt");
			String name = GameName.replace("provider_", "");
			Thread.sleep(1000);
			if(i==0){
				System.out.println(name+" game is navigating properly----------------");
			}
			else {
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" sports game is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" sports game is not navigating properly*************");
			}
			
		}}
	

	}

	@Test(priority = 3)
	public void liveCasinoDropdown() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getLivecat().click();
		for (int l = 0; l < hp.getLiveCasino().size(); l++) {
			WebElement pro = hp.getLiveCasino().get(l);
			pro.click();
			String GameName = pro.getAttribute("alt");
			String name = GameName.replace("provider_", "");
			Thread.sleep(1000);
			if(l==0){
				System.out.println(name+"liveCasino provider is navigating properly----------------");
			}
			else {
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" liveCasino provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" liveCasino provider is not navigating properly*************");
			}
			
		}}
		}
	@Test(priority = 4)
	public void EsportDropdown() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getEsportcat().click();
		for (int l = 0; l < hp.getLiveCasino().size(); l++) {
			WebElement pro = hp.getLiveCasino().get(l);
			pro.click();
			String GameName = pro.getAttribute("alt");
			String name = GameName.replace("provider_", "");
			Thread.sleep(1000);
			if(l==0){
				System.out.println(name+"Esport provider is navigating properly----------------");
			}
			else {
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" Esport provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" Esport provider is not navigating properly*************");
			}
			}
		}

	}

	
}
