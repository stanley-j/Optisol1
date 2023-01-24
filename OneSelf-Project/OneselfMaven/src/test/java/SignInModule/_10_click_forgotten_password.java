package SignInModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _10_click_forgotten_password {
	public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stanleyathish.j\\eclipse-workspace\\Stephen\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oneself-admin-test.optisolbusiness.com");

	}
	@Test
	public static void signIn1() throws Throwable {
		WebElement signin = driver.findElement(By.xpath("//a[@routerlink='/forgot-password']"));
		signin.click();
	}
	@Test
	public static void main(String[] args) throws Throwable {
    browserLaunch();
    signIn1();
    System.out.println("Successfully redirect to forgot password webpage by clicking");

  }
}