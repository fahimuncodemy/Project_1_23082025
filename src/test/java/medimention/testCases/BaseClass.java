package medimention.testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	public void setUp(String bro, String url) throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		EdgeOptions opt=new EdgeOptions();
		opt.setAcceptInsecureCerts(true);
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		switch(bro)
		{
		case "chrome":driver= new ChromeDriver(options);break;
		case "edge":driver= new EdgeDriver(opt);break;
		default:System.out.println("Invalid browser");return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomString()
	{
		String generateStr= RandomStringUtils.randomAlphabetic(5);
		return generateStr;
	}
	
	public String randomNumber()
	{
		String generateNum= RandomStringUtils.randomNumeric(5);
		return generateNum;
	}
}
