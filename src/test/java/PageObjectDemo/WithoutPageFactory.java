package PageObjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutPageFactory {

	WebDriver driver;
	
	WithoutPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By txtuser= By.name("username");
	By txtpass= By.name("password");
	By logbtn= By.xpath("//button[@type='submit']");
	
	void setUser(String user)
	{
		driver.findElement(txtuser).sendKeys(user);
	}
	
	void setPass(String pass)
	{
		driver.findElement(txtpass).sendKeys(pass);
	}
	
	void clickLog()
	{
		driver.findElement(logbtn).click();
	}
}
