package PageObjectDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockAdds {

	public static void main(String[] args) {

		ChromeOptions options= new ChromeOptions();
		File file=new File("C:\\Users\\Admin\\Desktop\\AdBlock2.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://text-compare.com/");
		
//		driver.findElement(By.xpath("//a[text()='Home']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Join Us']")).click();
	}

}
