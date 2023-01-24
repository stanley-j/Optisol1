package SignInModule;

import org.baseOneSelf.BaseClass;
import org.datadriven.DataDriven;
import org.locator.Page_Element;
import org.report.Report;


public class _01_valid_username_valid_password extends BaseClass implements Page_Element {

	public static void start() throws Throwable{
		Report.Report();
		Report.ReportCreateTestcase("To validate Sign In Functionality");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
		
		try {	
			driver.navigate().refresh();
			IsElementDisplayed(txtWelcome);	
			sendkeys(email,DataDriven.readData(1, 0, "TestData"));
			sendkeys(password,DataDriven.readData(1, 1, "TestData"));
			click(signin);
			IsElementDisplayed(welcome);
			Report.Pass("1.It successfully signin into the page");
		    }
		    catch(Exception e) {
			Report.Fail("It not successfully signin into the page");
		    }	
		Report.ReportCooldown();
		}
     }
 	
		/*
		 * try { IsElementDisplayed(email); click(email); Thread.sleep(5000);
		 * sendkeys(email,DataDriven.readData(16, 0, "TestData"));
		 * 
		 * 
		 * IsElementDisplayed(signin);
		 * 
		 * click(signin); IsElementDisplayed(passwordReq);
		 * 
		 * Report.Pass("15._valid_username_empty_password"); } catch(Exception e){
		 * Report.Fail("15.Error message not displayed successfully");
		 * 
		 * } Report.ReportCooldown(); }
		 */
	
	 
	/*	
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(14, 0, "TestData"));
		sendkeys(password,DataDriven.readData(14, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("14._valid_username_empty_password");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}	
	    
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(13, 0, "TestData"));
		sendkeys(password,DataDriven.readData(13, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errPassword);
		Report.Pass("13._valid_username_empty_password");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}
		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(12, 0, "TestData"));
		sendkeys(password,DataDriven.readData(12, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errPassword);
		Report.Pass("12._valid_username_empty_password");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}	
	
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(11, 0, "TestData"));
		sendkeys(password,DataDriven.readData(11, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errPassword);
		Report.Pass("11._valid_username_empty_password");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}	
				
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(10, 0, "TestData"));
		sendkeys(password,DataDriven.readData(10, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errPassword);
		Report.Pass("10.Enter the password of 8 characters with the combination of alphabets and not with the numbers.");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}	
		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(9, 0, "TestData"));
		sendkeys(password,DataDriven.readData(9, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errPassword);
		Report.Pass("9.Enter the password of less than 8 characters with the combination of alphanumeric and special characters.");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}
	
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(8, 0, "TestData"));
		sendkeys(password,DataDriven.readData(8, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errEmail);
		Report.Pass("8.Enter the password of atleast 8 characters with the combination of alphanumeric  and special characters");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}	
				
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(7, 0, "TestData"));
		sendkeys(password,DataDriven.readData(7, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("7.Enter the user name with less than 6 characters or more than 40 characters.");
		}
		catch(Exception e){
		Report.Fail("Error message not displayed successfully");
		}		
		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(6, 0, "TestData"));
		sendkeys(password,DataDriven.readData(6, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(invaliduserandpass);
		Report.Pass("6.Enter the user name with 6 to 40characters.");
		}
		catch(Exception e){
	    Report.Fail("Error message not displayed successfully");
	    }	
		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(5, 0, "TestData"));
		sendkeys(password,DataDriven.readData(5, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("5.Enter the user name without any domain");
	    }
		catch(Exception e){
	    Report.Fail("Error message not displayed successfully");
		}
	
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(4, 0, "TestData"));
		sendkeys(password,DataDriven.readData(4, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("4.Enter the user name with the combination of numbers and  special characters.");
	    }
	    catch(Exception e){
		Report.Fail("Error message not displayed successfully");
	    }
	    		
	try {
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(3, 0, "TestData"));
		sendkeys(password,DataDriven.readData(3, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(txtWelcome);
		Report.Pass("3.Enter  the user name");
	    }
	    catch(Exception e){
		Report.Fail("Error message not displayed successfully");
	    }
		
	try	{
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);
		sendkeys(email,DataDriven.readData(2, 0, "TestData"));
		sendkeys(password,DataDriven.readData(2, 1, "TestData"));
		click(signin);	
		IsElementDisplayed(errEmail);
		Report.Pass("2.Non registered user name");
	    }
	    catch(Exception e){
		Report.Fail("Error message not displayed successfully");
	    }

	try {	
		driver.navigate().refresh();
		IsElementDisplayed(txtWelcome);		
		sendkeys(email,DataDriven.readData(1, 0, "TestData"));
		sendkeys(password,DataDriven.readData(1, 1, "TestData"));
		click(signin);
		IsElementDisplayed(welcome);
		Report.Pass("1.It successfully signin into the page");
	    }
	    catch(Exception e) {
		Report.Fail("It not successfully signin into the page");
	    }	
	Report.ReportCooldown();
	}
	
}
	




	
	
	
	




		Report.Fail("user failed to create a role");
		click(btnClose);
		}catch(Exception e){
			Report.Pass("Role creation done successfully");
		}
	public static void signIn() throws Throwable {
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		email.sendKeys(DataDriven.readData(1, 0, "TestData"));

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys(DataDriven.readData(1, 1, "TestData"));
        
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
		
		/*public static void main(String[] args) throws Throwable {
			start();
		    signIn();
		    System.out.println("It Successfully sign in with valid username and valid password");
			
	}
  */
