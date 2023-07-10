package seleniumproj.seleniumproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sleepstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//explicitwait
		WebDriverWait mywait=new WebDriverWait( driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("admin");
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");


	}
		catch(Exception e)
		{
			
		}
		//driver.findElement(By.name("username")).sendKeys("admin");
		
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();


}
	
}
