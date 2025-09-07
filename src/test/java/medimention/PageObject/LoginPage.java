package medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageFac{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="UserUsername")
	@CacheLookup
	public WebElement username;
	
	@FindBy(id="UserPassword")
	@CacheLookup
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']//span")
	@CacheLookup
	public WebElement logbtn;
}
