package PageObjectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory {

	WebDriver driver;
	
	WithPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement txtuser;
	
	@FindBy(name="password")
	WebElement txtpass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement logbtn;
	
	void setUser(String user)
	{
		txtuser.sendKeys(user);
	}
	
	void setPass(String pass)
	{
		txtpass.sendKeys(pass);
	}
	
	void clickLog()
	{
		logbtn.click();
	}
}
