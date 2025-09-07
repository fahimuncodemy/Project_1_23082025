package medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsEle extends PageFac{

WebDriver driver;
	
	public ActionsEle(WebDriver driver)
	{
		super(driver);
	}
	
	public void enterText(WebElement ele, String value)
	{
		ele.sendKeys(value);;
	}
	
	public void Buttonpress(WebElement ele)
	{
		ele.click();
	}
	
	public String TextEle(WebElement ele)
	{
		return ele.getText();
	}
}
