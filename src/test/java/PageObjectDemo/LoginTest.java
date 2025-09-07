package PageObjectDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin()
	{
//		WithoutPageFactory wpf= new WithoutPageFactory(driver);
		WithPageFactory wpf=new WithPageFactory(driver);
		wpf.setUser("Admin");
		wpf.setPass("admin123");
		wpf.clickLog();
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
