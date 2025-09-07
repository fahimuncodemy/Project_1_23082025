package medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryPage extends PageFac{

	WebDriver driver;
	
	public EntryPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	public WebElement HomeBtn;
	
//	public void clickHome()
//	{
//		HomeBtn.click();
//	}
	
}
