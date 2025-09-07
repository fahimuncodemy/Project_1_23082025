package medimention.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageFac{

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[@data-id='UserRole']")
	public WebElement grpDrop;
	
	@FindBy(xpath="//ul[@role='menu']//a")
	public List<WebElement> options;
	
	@FindBy(id="DetailName")
	public WebElement Name;
	
	@FindBy(name="data[User][username]")
	public WebElement Uname;
	
	@FindBy(name="data[User][Email]")
	public WebElement Uemail;
	
	@FindBy(name="data[User][password]")
	public WebElement Upass;
	
	@FindBy(name="data[User][password1]")
	public WebElement Uconfpass;
	
	@FindBy(name="terms")
	public WebElement agree;
	
	@FindBy(xpath="//button[@type='submit']/span")
	public WebElement regButton;
	
//	public void GroupDrop()
//	{
//		grpDrop.click();
//	}
//	
//	public void OptDrop()
//	{
//		options.get(1).click();
//	}
//	
//	public void enterName(String name)
//	{
//		Name.sendKeys(name);
//	}
//	
//	public void enterUname(String username)
//	{
//		Uname.sendKeys(username);
//	}
//	
//	public void enterUemail(String email)
//	{
//		Uemail.sendKeys(email);
//	}
//	
//	public void enterPass(String pass)
//	{
//		Upass.sendKeys(pass);
//	}
//	
//	public void enterConfPass(String confPass)
//	{
//		Uconfpass.sendKeys(confPass);
//	}
//	
//	public void agreeCheck()
//	{
//		agree.click();
//	}
//	
//	public void regButton()
//	{
//		regButton.click();
//	}
}
