package SignInModule;

import org.baseOneSelf.BaseClass;
import org.datadriven.DataDriven;
import org.locator.Page_Element;
import org.report.Report;

public class Login extends BaseClass implements Page_Element {
	public static  void tc_01Login() throws Throwable {
		Report.Report();
		Report.ReportCreateTestcase("To check whether only the existing user can able to sign in the application.");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
		try {
			driver.navigate().refresh();
			IsElementDisplayed(txtWelcome);	
			sendkeys(email,DataDriven.readData(1, 0, "TestData"));
			sendkeys(password,DataDriven.readData(1, 1, "TestData"));
			click(signin);
			
			Report.Pass("The admin should be signed in only by the existing users.");
		} catch (Exception e) {
			Report.Fail("The admin should not be signed in only by the existing users.");
			
			Report.ReportCooldown();
		}

	}

}
