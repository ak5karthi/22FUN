package functionality;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genric.BaseClass;
import pom.LoginModule;
import pom.SignUpModule;

public class SignUppModule extends BaseClass {
	@Test(priority = 1)
	public void SignUpButton() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		if (sm.getSignUpButton().isDisplayed()) {
			if (sm.getSignUpButton().isEnabled()) {
				sm.getSignUpButton().click();
				System.out.println("signup button is working properly");
			} else {
				System.out.println("Signup button is displayed but not able to click");
			}
		} else {
			System.out.println("Signup button is not displayed");
		}

	}

	@Test(priority = 2)
	public void Invalid1() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		if (sm.getNextButton().isDisplayed()) {
			if (sm.getNextButton().isEnabled()) {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click()", sm.getNextButton());
				Thread.sleep(1000);
				if (sm.getERRmSGS().size() == 3) {
					System.out.println("Invalid1  not accepting---------------");
					System.out.println("without entering username,pass,confirm pass");
				} else {
					System.out.println("Accepting Invalid ***************");
				}
			} else {
				System.out.println("NextButton  is displayed but not able to click");
			}
		} else {
			System.out.println("NextButton is not displayed");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void Invalid2() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);

		if (sm.getNextButton().isDisplayed()) {
			if (sm.getNextButton().isEnabled()) {
				sm.getUsernameFld().sendKeys("akashkumar");
				Thread.sleep(1000);
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click()", sm.getNextButton());
				Thread.sleep(1000);
				if (sm.getERRmSGS().size() == 2) {
					System.out.println("Invalid2 not accepting---------------");
					System.out.println("without entering pass,confirm pass");
				} else {
					System.out.println("Accepting Invalid ***************");
				}
			} else {
				System.out.println("NextButton  is displayed but not able to click");
			}
		} else {
			System.out.println("NextButton is not displayed");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public void Invalid3() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);

		if (sm.getNextButton().isDisplayed()) {
			if (sm.getNextButton().isEnabled()) {
				sm.getUsernameFld().sendKeys("akashkumar");
				Thread.sleep(1000);
				sm.getPasswordFld().sendKeys("qwer1234");
				Thread.sleep(1000);
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click()", sm.getNextButton());
				Thread.sleep(1000);
				if (sm.getERRmSGS().size() == 1) {
					System.out.println("Invalid3 not accepting---------------");
					System.out.println("without entering confirm pass");
				} else {
					System.out.println("Accepting Invalid ***************");
				}
			} else {
				System.out.println("NextButton  is displayed but not able to click");
			}
		} else {
			System.out.println("NextButton is not displayed");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	public void dropdown() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", sm.getDropDown());
		Thread.sleep(1000);
		for (int i = 0; i < sm.getNames().size(); i++) {
			WebElement name = sm.getNames().get(i);
			String text = name.getText();
			name.click();
			System.out.println(text + " :Country is working properly");
			Thread.sleep(1000);
			sm.getDropDown().click();
		}
	}

	@Test(priority = 6)
	public void Referral() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		if (sm.getReferalButton().isDisplayed()) {
			if (sm.getReferalButton().isEnabled()) {
				sm.getReferalButton().click();
				Thread.sleep(1000);
				if (sm.getReferalfield().isDisplayed()) {
					System.out.println("Referral Dropdown is working properly---------------");
				} else {
					System.out.println("Referral Dropdown is not working properly***************");
				}
			} else {
				System.out.println("ReferalButton  is displayed but not able to click");
			}
		} else {
			System.out.println("ReferalButton is not displayed");
		}
	}

	@Test(priority = 7)
	public void UserName() throws InterruptedException {
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("akash");
		sm.getPasswordFld().sendKeys("qwerqwer");
		sm.getConfrmPass().sendKeys("qwerqwer");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", sm.getNextButton());
		Thread.sleep(2000);
		if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(Less than 6 characters)------------------");
		} else if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting less than 6 characters(Invalid)***********************");
		} else {
			System.out.println("accepting less than 6 characters(Invalid)***********************");
		}
		driver.navigate().refresh();
		Thread.sleep(2000);
		sm.getUsernameFld().sendKeys("akashkumar123");
		sm.getPasswordFld().sendKeys("qwerqwer");
		sm.getConfrmPass().sendKeys("qwerqwer");
		jse.executeScript("arguments[0].click()", sm.getNextButton());
		Thread.sleep(2000);
		if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting More than 12 characters(Invalid)***********************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 12 characters)------------------");
		} else {
			System.out.println("accepting More than 12 characters(Invalid)***********************");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer");
		sm.getConfrmPass().sendKeys("qwerqwer");
		jse.executeScript("arguments[0].click()", sm.getNextButton());
		Thread.sleep(2000);
		if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting 6-12 characters(valid)------------------------");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting 6-12 characters(valid)***********************");
		} else {
			System.out.println("Not accepting 6-12 characters(valid)**************************");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

	@Test(priority = 8)
	public void Password() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting valid(More than 8 characters with number and spl characters)------------------");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting valid(More than 8 characters with number and spl characters)***********************");
		}
		else {
			System.out.println("Not accepting valid(More than 8 characters with number and spl characters)***********************");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
		String MinLen = "8";
		String Actmin = sm.getPasswordFld().getAttribute("minlength");
		if(Actmin.equals(MinLen)) {
			System.out.println("Minimum Length of the password is working properly----------------------");
		}
		else {
			System.out.println("The length is mismatching Actual length :"+Actmin+"and Req Length :"+MinLen);
			System.out.println("Minimum Length of the password is not Matching******************");
		}
		String MaxLen = "16";
		String Actmax = sm.getPasswordFld().getAttribute("maxlength");
		if(Actmax.equals(MaxLen)) {
			System.out.println("Maximum Length of the password is working properly----------------------");
		}
		else {
			System.out.println("The length is mismatching Actual length :"+Actmax+"and Req Length :"+MaxLen);
			System.out.println("Maximum Length of the password is not Matching******************");
		}
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer");
		sm.getConfrmPass().sendKeys("qwerqwer");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting Invalid(More than 8 and less than 16 characters without number and spl characters)****************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 8 and less than 16 characters without number and spl characters)---------------");
		}
		else {
			System.out.println("Not accepting Invalid(More than 8 and less than 16 characters without number and spl characters)----------------");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("12345678");
		sm.getConfrmPass().sendKeys("12345678");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting Invalid(More than 8 and less than 16 numbers without alphabets and spl characters)****************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 8 and less than 16 numbers without alphabets and spl characters)---------------");
		}
		else {
			System.out.println("Not accepting Invalid(More than 8 and less than 16 numbers without alphabets and spl characters)----------------");
		}
		driver.navigate().refresh();
		Thread.sleep(2000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("!@#$%^&*");
		sm.getConfrmPass().sendKeys("!@#$%^&*");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting Invalid(More than 8 and less than 16 spl characters without alphabets and numbers )****************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 8 and less than 16 spl characters without alphabets and numbers)---------------");
		}
		else {
			System.out.println("Not accepting Invalid(More than 8 and less than 16 spl characters without alphabets and numbers)----------------");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("1234!@#$");
		sm.getConfrmPass().sendKeys("1234!@#$");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting Invalid(More than 8 and less than 16 spl characters and numbers without alphabets)****************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 8 and less than 16 spl characters and numbers without alphabets)---------------");
		}
		else {
			System.out.println("Not accepting Invalid(More than 8 and less than 16 spl characters and numbers without alphabets)----------------");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwer!@#$");
		sm.getConfrmPass().sendKeys("qwer!@#$");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting Invalid(More than 8 and less than 16 spl characters and alphabets without numbers)****************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 8 and less than 16 spl characters and alphabets without numbers)---------------");
		}
		else {
			System.out.println("Not accepting Invalid(More than 8 and less than 16 spl characters and alphabets without numbers)----------------");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwer1234");
		sm.getConfrmPass().sendKeys("qwer1234");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
			System.out.println("accepting Invalid(More than 8 and less than 16 numbers and alphabets without spl characters)****************");
		} else if (sm.getVerify().isDisplayed()) {
			String error = sm.getVerify().getText();
			System.out.println("Error message :" + error);
			System.out.println("Not accepting Invalid(More than 8 and less than 16 numbers and alphabets without spl characters)---------------");
		}
		else {
			System.out.println("Not accepting Invalid(More than 8 and less than 16 numbers and alphabets without spl characters)----------------");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);		
	}
	@Test(priority = 9)
	public void confirmPassword() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		 if (sm.getMobileNumber().isDisplayed()) {
				System.out.println("accepting valid(Both password and confirm password are matched)-----------------------");
			} else if (sm.getVerify().isDisplayed()) {
				String error = sm.getVerify().getText();
				System.out.println("Error message :" + error);
				System.out.println("Not accepting valid(Both password and confirm password are matched***************");
			}
			else {
				System.out.println("Not accepting valid(Both password and confirm password are matched***************");
			}
		 driver.navigate().refresh();
			Thread.sleep(1000);	
			sm.getUsernameFld().sendKeys("kumarakashhhh");
			sm.getPasswordFld().sendKeys("qwerqwer@1");
			sm.getConfrmPass().sendKeys("qwerqwer@");
			Thread.sleep(500);
			 if (sm.getERRmSGS().size()!=0) {
				  String error = sm.getERRmSGS().get(0).getText();
				  if(error.contains("Passwords do NOT match")) {
					System.out.println("Invalid (Both password and confirm password are not matched)-----------------------");
				  }
				  else {
					  System.out.println("Accepting Invalid(Both password and confirm password are matched***************");
				  }
				}
				else {
					System.out.println("Accepting Invalid(Both password and confirm password are matched***************");
				}
			 driver.navigate().refresh();
				Thread.sleep(1000);
				String MinLen = "8";
				String Actmin = sm.getConfrmPass().getAttribute("minlength");
				if(Actmin.equals(MinLen)) {
					System.out.println("Minimum Length of the password is working properly----------------------");
				}
				else {
					System.out.println("The length is mismatching Actual length :"+Actmin+"and Req Length :"+MinLen);
					System.out.println("Minimum Length of the password is not Matching******************");
				}
				String MaxLen = "16";
				String Actmax = sm.getConfrmPass().getAttribute("maxlength");
				if(Actmax.equals(MaxLen)) {
					System.out.println("Maximum Length of the password is working properly----------------------");
				}
				else {
					System.out.println("The length is mismatching Actual length :"+Actmax+"and Req Length :"+MaxLen);
					System.out.println("Maximum Length of the password is not Matching******************");
				}
				driver.navigate().refresh();
				Thread.sleep(1000);
	}
	@Test(priority = 10)
public void fullName() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click()",sm.getNext2Button());
		Thread.sleep(2000);
		if(sm.getERRmSGS().size()==2) {
			System.out.println("Invalid1 Without entering email and fullname is working properly-----------------");
		}
		else if(sm.getVerify().isDisplayed()) {
			if(sm.getVerify().getText().contains("Registration")) {
				System.out.println("Accepting Invalid1 Without entering email and fullname is not working properly**************");	
			}
			else {
				System.out.println("Invalid1 Without entering email and fullname is working properly-----------------");
			}
			
		}
		else {
			System.out.println("Accepting Invalid1 Without entering email and fullname is not working properly**************");
		}
		 driver.navigate().refresh();
			Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		sm.getEmail().sendKeys("ak@1234.com");
		jse.executeScript("arguments[0].click()",sm.getNext2Button());
		Thread.sleep(2000);
		if(sm.getERRmSGS().size()==1) {
			System.out.println("Invalid2 Without entering fullname is working properly-----------------");
		}
		else if(sm.getVerify().isDisplayed()) {
			if(sm.getVerify().getText().contains("Registration")) {
				System.out.println("Accepting Invalid2 Without entering fullname is not working properly**************");	
			}
			else {
				System.out.println("Invalid2 Without entering fullname is working properly-----------------");
			}
			
		}
		else {
			System.out.println("Accepting Invalid2 Without entering fullname is not working properly**************");
		}
		 driver.navigate().refresh();
			Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		sm.getFullName().sendKeys("akashkumar");
		jse.executeScript("arguments[0].click()",sm.getNext2Button());
		Thread.sleep(2000);
		if(sm.getERRmSGS().size()==1) {
			System.out.println("Invalid3 Without entering fullname is working properly-----------------");
		}
		else if(sm.getVerify().isDisplayed()) {
			if(sm.getVerify().getText().contains("Registration")) {
				System.out.println("Accepting Invalid3 Without entering Email is not working properly**************");	
			}
			else {
				System.out.println("Invalid3 Without entering Email is working properly-----------------");
			}
			
		}
		else {
			System.out.println("Accepting Invalid3 Without entering Email is not working properly**************");
		}
		
		 driver.navigate().refresh();
			Thread.sleep(1000);
	}
	@Test(priority = 12)
	public void PhoneNumber() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		SignUpModule sm = new SignUpModule(driver);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
	 String MinLen = "10";
		String Actmin = sm.getMobileNumber().getAttribute("minlength");
		if(Actmin.equals(MinLen)) {
			System.out.println("Minimum Length of the Mobile Number is working properly----------------------");
		}
		else {
			System.out.println("The length is mismatching Actual length :"+Actmin+"and Req Length :"+MinLen);
			System.out.println("Minimum Length of the Mobile Number is not Matching******************");
		}
		String MaxLen = "10";
		String Actmax = sm.getMobileNumber().getAttribute("maxlength");
		if(Actmax.equals(MaxLen)) {
			System.out.println("Maximum Length of the Mobile Number is working properly----------------------");
		}
		else {
			System.out.println("The length is mismatching Actual length :"+Actmax+"and Req Length :"+MaxLen);
			System.out.println("Maximum Length of the Mobile Number"
					+ " is not Matching******************");
		}
		sm.getFullName().sendKeys("Akashkumar");
		sm.getEmail().sendKeys("ak@12356.com");
		sm.getMobileNumber().sendKeys("9876543200");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNext2Button());
		Thread.sleep(2000);
		if (sm.getVerify().getText().contains("Registration")) {
			System.out.println("Accepting valid 10 numbers working properly---------------");
		}
		else {
			System.out.println("Not accepting valid not working properly*********************");
		}
	}
	@Test(priority = 11)
	public void emailId() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		SignUpModule sm = new SignUpModule(driver);
		Thread.sleep(1000);
		sm.getUsernameFld().sendKeys("kumarakashhhh");
		sm.getPasswordFld().sendKeys("qwerqwer@1");
		sm.getConfrmPass().sendKeys("qwerqwer@1");
		Thread.sleep(500);
		jse.executeScript("arguments[0].click()",sm.getNextButton());
		Thread.sleep(2000);
		sm.getEmail().sendKeys("ak@1234");
		if (sm.getERRmSGS().size()!=0) {
			 String error = sm.getERRmSGS().get(0).getText();
			 if(error.contains("Please enter a valid email.")) {
				 System.out.println("Not accepting Invalid 1 (eamil without .com) working properly----------------");
			 }
			 else {
				 System.out.println(" accepting Invalid 1 (eamil without .com) not working properly**************");
			 }
			
			
		}
		else {
			System.out.println(" accepting Invalid 1 (eamil without .com) not working properly**************");
		}
			sm.getEmail().clear();
			Thread.sleep(1000);
			sm.getEmail().sendKeys("ak@.com");
			if (sm.getERRmSGS().size()!=0) {
				 String error = sm.getERRmSGS().get(0).getText();
				 if(error.contains("Please enter a valid email.")) {
					 System.out.println("Not accepting Invalid 2 (eamil without domain name) working properly----------------");
				 }
				 else {
					 System.out.println(" accepting Invalid 2 (eamil without domain name) not working properly**************");
				 }
				
				
			}
			else {
				System.out.println(" accepting Invalid 2 (eamil without domain name) not working properly**************");
			}
			sm.getEmail().clear();
			Thread.sleep(1000);
				sm.getEmail().sendKeys("ak1234.com");
				if (sm.getERRmSGS().size()!=0) {
					 String error = sm.getERRmSGS().get(0).getText();
					 if(error.contains("Please enter a valid email.")) {
						 System.out.println("Not accepting Invalid 3 (eamil without @) working properly----------------");
					 }
					 else {
						 System.out.println(" accepting Invalid 3 (eamil without @) not working properly**************");
					 }
					
					
				}
				else {
					System.out.println(" accepting Invalid 3 (eamil without @) not working properly**************");
				}
				sm.getEmail().clear();
				Thread.sleep(1000);
					sm.getEmail().sendKeys("@1234.com");
					if (sm.getERRmSGS().size()!=0) {
						 String error = sm.getERRmSGS().get(0).getText();
						 if(error.contains("Please enter a valid email.")) {
							 System.out.println("Not accepting Invalid 4 (eamil without username ) working properly----------------");
						 }
						 else {
							 System.out.println(" accepting Invalid 4 (eamil without username) not working properly**************");
						 }
						
						
					}
					else {
						System.out.println(" accepting Invalid 4 (eamil without username) not working properly**************");
					}
					sm.getEmail().clear();
					Thread.sleep(1000);
					sm.getEmail().sendKeys("akkkk@1234.com");
					if (sm.getERRmSGS().size()!=0) {
						 String error = sm.getERRmSGS().get(0).getText();
						 if(error.contains("Please enter a valid email.")) {
							 System.out.println("Not accepting valid not working properly***************");
						 }
						 else {
							 System.out.println(" accepting valid working properly---------------");
						 }
						
						
					}
					else {
						System.out.println(" accepting valid working properly---------------");
					}
					driver.navigate().refresh();
					Thread.sleep(1000);
	}
	
	
}
