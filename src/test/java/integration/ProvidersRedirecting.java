package integration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genric.BaseClass;
import pom.HomePagee;

public class ProvidersRedirecting extends BaseClass{
	@Test(priority = 1)
	public void slotProviders()throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getSlotcat().click();
		for(int i=0;i<hp.getSlotProviders().size();i++) {
			WebElement prov=hp.getSlotProviders().get(i);
			prov.click();
			String name = prov.getText();
			Thread.sleep(1000);
		
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" Slot provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" Slot provider is not navigating properly*************");
			}
		}
	

	}
	@Test(priority = 2)
	public void cardGames() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getCardcat().click();
		for(int i=0;i<hp.getSlotProviders().size();i++) {
			WebElement prov=hp.getSlotProviders().get(i);
			prov.click();
			String name = prov.getText();
			Thread.sleep(1000);
		
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" Card Games provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" Card Games provider is not navigating properly*************");
			}
		}
	

	}
	@Test(priority = 3)
	public void FishGames() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getFishcat().click();
		for(int i=0;i<hp.getSlotProviders().size();i++) {
			WebElement prov=hp.getSlotProviders().get(i);
			prov.click();
			String name = prov.getText();
			Thread.sleep(1000);
		
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" Fish Games provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" Fish Games provider is not navigating properly*************");
			}
		}
	

	}
	@Test(priority = 4)
	public void bingoGames() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getBingocat().click();
		for(int i=0;i<hp.getSlotProviders().size();i++) {
			WebElement prov=hp.getSlotProviders().get(i);
			prov.click();
			String name = prov.getText();
			Thread.sleep(1000);
		
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" Bingo Games provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" Bingo Games provider is not navigating properly*************");
			}
		}
	

	}
	@Test(priority = 5)
	public void InstantGames() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		hp.getInstantcat().click();
		for(int i=0;i<hp.getSlotProviders().size();i++) {
			WebElement prov=hp.getSlotProviders().get(i);
			prov.click();
			String name = prov.getText();
			Thread.sleep(1000);
		
			if(driver.getCurrentUrl().contains(name)) {
				System.out.println(name+" Bingo Games provider is navigating properly----------------");
			}
			else
			{
				System.out.println(name+" Bingo Games provider is not navigating properly*************");
			}
		}
	

	}

}
