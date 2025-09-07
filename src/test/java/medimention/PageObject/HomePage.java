package medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageFac{

WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Join Us']")
	public WebElement regBtn;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement logBtn;
	
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	public WebElement MediHead;
	
//	public void clickReg()
//	{
//		regBtn.click();
//	}
//	
//	public void clickLog()
//	{
//		logBtn.click();
//	}
//	
//	public void clickHead()
//	{
//		MediHead.click();
//	}
}
