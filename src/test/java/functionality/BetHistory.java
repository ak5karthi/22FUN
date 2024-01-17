package functionality;
import java.sql.Driver;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genric.BaseClass2;
import pom.BetHistoryModule;
import pom.HomePagee;




	public class BetHistory extends BaseClass2 {
		@Test(priority = 1)
		public void ProviderDropDown() throws InterruptedException {
			HomePagee hp = new HomePagee(driver);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()", hp.getProfileLink());
			BetHistoryModule BH = new BetHistoryModule(driver);
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			jse.executeScript("arguments[0].click()", BH.getBetHistoryTab());
			Thread.sleep(1000);
			if (BH.getBetHistoryButton().isDisplayed()) {
				if (BH.getBetHistoryButton().isEnabled()) {
					BH.getProviderDropdown().click();
					System.out.println("Get History button is working properly");
					for (int i = 0; i < BH.getProvidersNames().size(); i++) {
						List<WebElement> names = BH.getProvidersNames();
						WebElement name = names.get(i);
						String text = names.get(i).getText();
						name.click();
						System.out.println(text + " :provider is working properly");
						BH.getDropdownButton().click();
					}
					jse.executeScript("arguments[0].click()", BH.getBetHistoryTab());

				} else {
					System.out.println("Get History button is displayed but not able to click");
				}
			} else {
				System.out.println("Get History button is not displayed");
			}
			for (WebElement button : BH.getDateButtons()) {
				if (button.isDisplayed()) {
					if (button.isEnabled()) {
						button.click();
						String text = button.getText();
						if (text.contains("Today")) {
							List<String> texts = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts.add(txt);
							}
							String t1 = texts.get(0);
							String t2 = texts.get(1);
							if (t1.equals(t2)) {
								System.out.println("today button is working properly");
							} else {
								System.out.println("today button is not working properly");
							}

						} else if (text.contains("3 days")) {
							List<String> texts2 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts2.add(txt);
							}
							String t1 = texts2.get(0);
							String t2 = texts2.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 3) {
								System.out.println("3days Button is working fine");

							} else {
								System.out.println("3days button is not working properly********");
							}
						} else if (text.contains("a month")) {
							List<String> texts3 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts3.add(txt);
							}
							String t1 = texts3.get(0);
							String t2 = texts3.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 30) {
								System.out.println("Month Button is working fine");

							} else {
								System.out.println("Month button is not working properly********");
							}
						}

					} else {
						String text = button.getText();
						System.out.println(text + " is displayed but not able to click");
					}

				} else {
					String text = button.getText();
					System.out.println(text + " is not displayed");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			for (WebElement calender : BH.getCalanders()) {
				calender.click();
				if (BH.getDatescal().isDisplayed()) {
					System.out.println("Calender Button is working Properly");
				} else {
					System.out.println("Calender Button is not working Properly*********");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			if (BH.getSearchbutton().isDisplayed()) {
				if (BH.getSearchbutton().isEnabled()) {
					BH.getSearchbutton().click();
					System.out.println("search button is working properly");
				} else {
					System.out.println("Search is displayed not able to click");
				}
			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			List<String> texts3 = new ArrayList<>();
			for (WebElement date : BH.getDates()) {
				String txt = date.getText();
				System.out.println(txt);
				texts3.add(txt);
			}
			String t1 = texts3.get(0);
			String t2 = texts3.get(1);
			LocalDate tt1 = LocalDate.parse(t1);
			LocalDate tt2 = LocalDate.parse(t2);
			long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
			if (differenceInDays == 7) {
				System.out.println("week Button is working fine");

			} else {
				System.out.println("week button is not working properly********");
			}
		}


		
		@Test(priority = 2)
		public void deposit() throws InterruptedException {
			HomePagee hp = new HomePagee(driver);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()", hp.getProfileLink());
			BetHistoryModule BH = new BetHistoryModule(driver);
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			Thread.sleep(1000);
			for (WebElement button : BH.getDateButtons()) {
				if (button.isDisplayed()) {
					if (button.isEnabled()) {
						button.click();
						String text = button.getText();
						if (text.contains("Today")) {
							List<String> texts = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts.add(txt);
							}
							String t1 = texts.get(0);
							String t2 = texts.get(1);
							if (t1.equals(t2)) {
								System.out.println("today button is working properly");
							} else {
								System.out.println("today button is not working properly");
							}

						} else if (text.contains("3 days")) {
							List<String> texts2 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts2.add(txt);
							}
							String t1 = texts2.get(0);
							String t2 = texts2.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 3) {
								System.out.println("3days Button is working fine");

							} else {
								System.out.println("3days button is not working properly********");
							}
						} else if (text.contains("a month")) {
							List<String> texts3 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts3.add(txt);
							}
							String t1 = texts3.get(0);
							String t2 = texts3.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 30) {
								System.out.println("Month Button is working fine");

							} else {
								System.out.println("Month button is not working properly********");
							}
						}

					} else {
						String text = button.getText();
						System.out.println(text + " is displayed but not able to click");
					}

				} else {
					String text = button.getText();
					System.out.println(text + " is not displayed");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			for (WebElement calender : BH.getCalanders()) {
				calender.click();
				if (BH.getDatescal().isDisplayed()) {
					System.out.println("Calender Button is working Properly");
				} else {
					System.out.println("Calender Button is not working Properly*********");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			if (BH.getSearchbutton().isDisplayed()) {
				if (BH.getSearchbutton().isEnabled()) {
					BH.getSearchbutton().click();
					System.out.println("search button is working properly");
				} else {
					System.out.println("Search is displayed not able to click");
				}
			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			List<String> texts3 = new ArrayList<>();
			for (WebElement date : BH.getDates()) {
				String txt = date.getText();
				System.out.println(txt);
				texts3.add(txt);
			}
			String t1 = texts3.get(0);
			String t2 = texts3.get(1);
			LocalDate tt1 = LocalDate.parse(t1);
			LocalDate tt2 = LocalDate.parse(t2);
			long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
			if (differenceInDays == 7) {
				System.out.println("week Button is working fine");

			} else {
				System.out.println("week button is not working properly********");
			}
			
			

		}

		@Test(priority = 3)
		public void withdrawal() throws InterruptedException{
			HomePagee hp = new HomePagee(driver);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()", hp.getProfileLink());
			BetHistoryModule BH = new BetHistoryModule(driver);
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			jse.executeScript("arguments[0].click()", BH.getWithdrawalTab());
			Thread.sleep(1000);
			for (WebElement button : BH.getDateButtons()) {
				if (button.isDisplayed()) {
					if (button.isEnabled()) {
						button.click();
						String text = button.getText();
						if (text.contains("Today")) {
							List<String> texts = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts.add(txt);
							}
							String t1 = texts.get(0);
							String t2 = texts.get(1);
							if (t1.equals(t2)) {
								System.out.println("today button is working properly");
							} else {
								System.out.println("today button is not working properly");
							}

						} else if (text.contains("3 days")) {
							List<String> texts2 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts2.add(txt);
							}
							String t1 = texts2.get(0);
							String t2 = texts2.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 3) {
								System.out.println("3days Button is working fine");

							} else {
								System.out.println("3days button is not working properly********");
							}
						} else if (text.contains("a month")) {
							List<String> texts3 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts3.add(txt);
							}
							String t1 = texts3.get(0);
							String t2 = texts3.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 30) {
								System.out.println("Month Button is working fine");

							} else {
								System.out.println("Month button is not working properly********");
							}
						}

					} else {
						String text = button.getText();
						System.out.println(text + " is displayed but not able to click");
					}

				} else {
					String text = button.getText();
					System.out.println(text + " is not displayed");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			for (WebElement calender : BH.getCalanders()) {
				calender.click();
				if (BH.getDatescal().isDisplayed()) {
					System.out.println("Calender Button is working Properly");
				} else {
					System.out.println("Calender Button is not working Properly*********");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			if (BH.getSearchbutton().isDisplayed()) {
				if (BH.getSearchbutton().isEnabled()) {
					BH.getSearchbutton().click();
					System.out.println("search button is working properly");
				} else {
					System.out.println("Search is displayed not able to click");
				}
			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			List<String> texts3 = new ArrayList<>();
			for (WebElement date : BH.getDates()) {
				String txt = date.getText();
				System.out.println(txt);
				texts3.add(txt);
			}
			String t1 = texts3.get(0);
			String t2 = texts3.get(1);
			LocalDate tt1 = LocalDate.parse(t1);
			LocalDate tt2 = LocalDate.parse(t2);
			long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
			if (differenceInDays == 7) {
				System.out.println("week Button is working fine");

			} else {
				System.out.println("week button is not working properly********");
			}

			
		}

		@Test(priority = 4)
		public void promoApply() throws InterruptedException {
			HomePagee hp = new HomePagee(driver);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()", hp.getProfileLink());
			BetHistoryModule BH = new BetHistoryModule(driver);
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			jse.executeScript("arguments[0].click()", BH.getPromoApply());
			Thread.sleep(1000);
			for (WebElement button : BH.getDateButtons()) {
				if (button.isDisplayed()) {
					if (button.isEnabled()) {
						button.click();
						String text = button.getText();
						if (text.contains("Today")) {
							List<String> texts = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts.add(txt);
							}
							String t1 = texts.get(0);
							String t2 = texts.get(1);
							if (t1.equals(t2)) {
								System.out.println("today button is working properly");
							} else {
								System.out.println("today button is not working properly");
							}

						} else if (text.contains("3 days")) {
							List<String> texts2 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts2.add(txt);
							}
							String t1 = texts2.get(0);
							String t2 = texts2.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 3) {
								System.out.println("3days Button is working fine");

							} else {
								System.out.println("3days button is not working properly********");
							}
						} else if (text.contains("a month")) {
							List<String> texts3 = new ArrayList<>();
							for (WebElement date : BH.getDates()) {
								String txt = date.getText();
								System.out.println(txt);
								texts3.add(txt);
							}
							String t1 = texts3.get(0);
							String t2 = texts3.get(1);
							LocalDate tt1 = LocalDate.parse(t1);
							LocalDate tt2 = LocalDate.parse(t2);
							long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
							if (differenceInDays == 30) {
								System.out.println("Month Button is working fine");

							} else {
								System.out.println("Month button is not working properly********");
							}
						}

					} else {
						String text = button.getText();
						System.out.println(text + " is displayed but not able to click");
					}

				} else {
					String text = button.getText();
					System.out.println(text + " is not displayed");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			for (WebElement calender : BH.getCalanders()) {
				calender.click();
				if (BH.getDatescal().isDisplayed()) {
					System.out.println("Calender Button is working Properly");
				} else {
					System.out.println("Calender Button is not working Properly*********");
				}

			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			if (BH.getSearchbutton().isDisplayed()) {
				if (BH.getSearchbutton().isEnabled()) {
					BH.getSearchbutton().click();
					System.out.println("search button is working properly");
				} else {
					System.out.println("Search is displayed not able to click");
				}
			}
			jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
			List<String> texts3 = new ArrayList<>();
			for (WebElement date : BH.getDates()) {
				String txt = date.getText();
				System.out.println(txt);
				texts3.add(txt);
			}
			String t1 = texts3.get(0);
			String t2 = texts3.get(1);
			LocalDate tt1 = LocalDate.parse(t1);
			LocalDate tt2 = LocalDate.parse(t2);
			long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
			if (differenceInDays == 7) {
				System.out.println("week Button is working fine");

			} else {
				System.out.println("week button is not working properly********");
			}

		}
		@Test(priority = 5)
		public void rewards() throws InterruptedException {
				HomePagee hp = new HomePagee(driver);
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click()", hp.getProfileLink());
				BetHistoryModule BH = new BetHistoryModule(driver);
				jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
				jse.executeScript("arguments[0].click()", BH.getRewards());
				Thread.sleep(1000);
				if (BH.getBetHistoryButton().isDisplayed()) {
					if (BH.getBetHistoryButton().isEnabled()) {
						BH.getRewardDropdown().click();
						System.out.println("Get History button is working properly");
						for (int i = 0; i < BH.getProvidersNames().size(); i++) {
							List<WebElement> names = BH.getProvidersNames();
							WebElement name = names.get(i);
							String text = names.get(i).getText();
							name.click();
							System.out.println(text + " :provider is working properly");
							BH.getDropdownButton().click();
						}
						jse.executeScript("arguments[0].click()", BH.getBetHistoryTab());

					} else {
						System.out.println("Get History button is displayed but not able to click");
					}
				} else {
					System.out.println("Get History button is not displayed");
				}
				for (WebElement button : BH.getDateButtons()) {
					if (button.isDisplayed()) {
						if (button.isEnabled()) {
							button.click();
							String text = button.getText();
							if (text.contains("Today")) {
								List<String> texts = new ArrayList<>();
								for (WebElement date : BH.getDates()) {
									String txt = date.getText();
									System.out.println(txt);
									texts.add(txt);
								}
								String t1 = texts.get(0);
								String t2 = texts.get(1);
								if (t1.equals(t2)) {
									System.out.println("today button is working properly");
								} else {
									System.out.println("today button is not working properly");
								}

							} else if (text.contains("3 days")) {
								List<String> texts2 = new ArrayList<>();
								for (WebElement date : BH.getDates()) {
									String txt = date.getText();
									System.out.println(txt);
									texts2.add(txt);
								}
								String t1 = texts2.get(0);
								String t2 = texts2.get(1);
								LocalDate tt1 = LocalDate.parse(t1);
								LocalDate tt2 = LocalDate.parse(t2);
								long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
								if (differenceInDays == 3) {
									System.out.println("3days Button is working fine");

								} else {
									System.out.println("3days button is not working properly********");
								}
							} else if (text.contains("a month")) {
								List<String> texts3 = new ArrayList<>();
								for (WebElement date : BH.getDates()) {
									String txt = date.getText();
									System.out.println(txt);
									texts3.add(txt);
								}
								String t1 = texts3.get(0);
								String t2 = texts3.get(1);
								LocalDate tt1 = LocalDate.parse(t1);
								LocalDate tt2 = LocalDate.parse(t2);
								long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
								if (differenceInDays == 30) {
									System.out.println("Month Button is working fine");

								} else {
									System.out.println("Month button is not working properly********");
								}
							}

						} else {
							String text = button.getText();
							System.out.println(text + " is displayed but not able to click");
						}

					} else {
						String text = button.getText();
						System.out.println(text + " is not displayed");
					}

				}
				jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
				for (WebElement calender : BH.getCalanders()) {
					calender.click();
					if (BH.getDatescal().isDisplayed()) {
						System.out.println("Calender Button is working Properly");
					} else {
						System.out.println("Calender Button is not working Properly*********");
					}

				}
				jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
				if (BH.getSearchbutton().isDisplayed()) {
					if (BH.getSearchbutton().isEnabled()) {
						BH.getSearchbutton().click();
						System.out.println("search button is working properly");
					} else {
						System.out.println("Search is displayed not able to click");
					}
				}
				jse.executeScript("arguments[0].click()", BH.getBetHistoryButton());
				List<String> texts3 = new ArrayList<>();
				for (WebElement date : BH.getDates()) {
					String txt = date.getText();
					System.out.println(txt);
					texts3.add(txt);
				}
				String t1 = texts3.get(0);
				String t2 = texts3.get(1);
				LocalDate tt1 = LocalDate.parse(t1);
				LocalDate tt2 = LocalDate.parse(t2);
				long differenceInDays = Math.abs(ChronoUnit.DAYS.between(tt1, tt2) + 1);
				if (differenceInDays == 7) {
					System.out.println("week Button is working fine");

				} else {
					System.out.println("week button is not working properly********");
				}
			
		}
		
	}

