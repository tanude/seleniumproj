package seleniumproj.seleniumproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
	WebElement firstframe=	driver.findElement(By.xpath("//frameset[1]/frame[1]"));
	driver.switchTo().frame(firstframe);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("tanu");
	
	driver.switchTo().defaultContent();
	
WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
//inner iframe
driver.switchTo().frame(frame3);
driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("tanude");
driver.switchTo().frame(0);
driver.findElement(By.cssSelector("div.AB7Lab ")).click();//select radio button
	}

}
