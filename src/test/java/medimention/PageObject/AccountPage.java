package medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageFac{

	WebDriver driver;
	
	public AccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	public WebElement AccHead;
	
	@FindBy(id="DetailName")
	public WebElement BName;
	
	@FindBy(xpath="//li[@class='green']//i[contains(@class, 'ace-icon fa fa-care')]")
	public WebElement Drop;
	
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")
	public WebElement logout;
	
	public String headAcc()
	{
		return AccHead.getText();
	}
	
	public String BName()
	{
		String att= BName.getAttribute("value");
		return att;
	}
	
	public void logDrop()
	{
		Drop.click();
	}
	
	public void logBtn()
	{
		logout.click();
	}
}
