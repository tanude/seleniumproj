package tanu.test.proj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locatorsdemo1 {

	public static void main(String[] args) {
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		}catch(Exception ex){
			System.out.println("Exception::"+ex);

		}
		//finding number of slider home page
		 List<WebElement> sliders=driver.findElements(By.className("carousel"));
		 sliders.size();
		 System.out.println("size"+sliders.size());
		 //find total number of images
	List<WebElement>images=	 driver.findElements(By.tagName("img"));
	System.out.println("count images:"+images.size());
	//capture to total number of link
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("numser of link"+links.size());
	
	driver.quit();
	
		 
}
	
}
