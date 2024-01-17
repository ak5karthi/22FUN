package functionality;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genric.BaseClass2;
import pom.BankDetailsModule;
import pom.HomePagee;

public class BankDetails extends BaseClass2 {
	@Test(priority = 1)
	public void BankDetailss() throws InterruptedException {
		HomePagee hp = new HomePagee(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", hp.getProfileLink());
		BankDetailsModule BD = new BankDetailsModule(driver);
		if (BD.getBankDetails().isDisplayed()) {
			if (BD.getBankDetails().isEnabled()) {
				jse.executeScript("arguments[0].click()", BD.getBankDetails());
				System.out.println("Bank details button is working properly");
				if (BD.getBankButton().isDisplayed()) {
					if (BD.getBankButton().isEnabled()) {
						BD.getBankButton().click();
						System.out.println("Bank button is working properly");
						if (BD.getAddBankButton().isDisplayed()) {
							if (BD.getAddBankButton().isEnabled()) {
								BD.getAddBankButton().click();
								System.out.println("Add bank button is working properly");
								if (BD.getBankNameDropButton().isDisplayed()) {
									if(BD.getBankNameDropButton().isEnabled()) {
										BD.getBankNameDropButton().click();
										System.out.println("Bank name dropdown button is working properly");
										BD.getBankNameDropButton().click();
									}
									else {
										System.out.println("Bank name dropdown button is displayed but not working*********");
									}
								}
								else {
								System.out.println("Bank name dropdown button is not displayed*********");	
								}
					}else {
						System.out.println("Add Bank Button is displayed but working*********");
					}
						}
						else {
							System.out.println("Add Bank Button is not displsyed*********");
						}
					}
						else {
						System.out.println("Bank button is displayed button not working*********");
					}
				} else {
					System.out.println("Bank Button is not displayed*********");
				}

			} else {
				System.out.println("Bank details button is displayed but not working*********");
			}
		} else {
			System.out.println("Bank details button is not displayed*************");
		}

	}
	@Test(priority = 2)
	public void submitButton() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		BankDetailsModule BD = new BankDetailsModule(driver);
		jse.executeScript("arguments[0].click()", BD.getSubmitButton());
		if (BD.getErrorMessages().size()==3) {
			System.out.println("Invalid1 (Without entering any data)submit button working properly ");
		}
		else {
			System.out.println("Without any data it is Accepting**********");
		}
		driver.navigate().refresh();
		BD.getAddBankButton().click();
		BD.getAccountNameTextFld().sendKeys("AkashKumar");
		jse.executeScript("arguments[0].click()", BD.getSubmitButton());
		if (BD.getErrorMessages().size()==2) {
			System.out.println("Invalid2 (Without entering Account Number)submit button working properly ");
		}
		else {
			System.out.println("Without Account Number it is Accepting**********");
		}
		driver.navigate().refresh();
		
	}
	@Test(priority = 3)
	public void accountName() {
		BankDetailsModule BD = new BankDetailsModule(driver);
		BD.getAddBankButton().click();
		BD.getAccountNameTextFld().sendKeys("AkashKumar");
		System.out.println("Account name text field  is Working properly");	
		driver.navigate().refresh();
	}
	@Test(priority = 3)
	public void accountNumber() {
		BankDetailsModule BD = new BankDetailsModule(driver);
		BD.getAddBankButton().click();
		String MinLen = "4";
		String Actmin = BD.getAccountNumber().getAttribute("minlength");
		if(Actmin.equals(MinLen)) {
			System.out.println("Minimum Length of the password is working properly----------------------");
		}
		else {
			System.out.println("The length is mismatching Actual length :"+Actmin+"and Req Length :"+MinLen);
			System.out.println("Minimum Length of the password is not Matching******************");
		}
		String MaxLen = "12";
		String Actmax = BD.getAccountNumber().getAttribute("maxlength");
		if(Actmax.equals(MaxLen)) {
			System.out.println("Maximum Length of the password is working properly----------------------");
		}
		else {
			System.out.println("The length is mismatching Actual length :"+Actmax+"and Req Length :"+MaxLen);
			System.out.println("Maximum Length of the password is not Matching******************");
		}
	}
}
