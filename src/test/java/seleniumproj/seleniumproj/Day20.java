package seleniumproj.seleniumproj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/register");
		String id=driver.getWindowHandle();
		System.out.println("windowids"+id);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		}catch(Exception ex){
			System.out.println("Exception::"+ex);

		}
		//befor eselection
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("male rd"+male.isSelected());//false
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("female rd"+female.isSelected());//false
		//after selected
		System.out.println("after selection of male radio button");
		//male.click();
		System.out.println("male rd"+male.isSelected());//false
		
		female.click();
		Thread.sleep(2000);
		System.out.println("female rd"+female.isSelected());//false
		driver.findElement(By.linkText("Sitemap")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String winid:windows)
		{
			System.out.println("winid");
		}


		
		
		
	}

}
