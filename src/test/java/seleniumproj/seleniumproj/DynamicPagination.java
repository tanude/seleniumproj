package seleniumproj.seleniumproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicPagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;

		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.opencart.com/admin/	");
			driver.manage().window().maximize();
		} catch (Exception e) {
		}
		//capture useranme
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		//capture password
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		//login
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//popup close
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		//customers------.customer 
		driver.findElement(By.cssSelector(".parent[href='#collapse-5']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		// number ofpages capture\
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println("total number of pages"+text);//total number of pagesShowing 1 to 10 of 13489 (1349 Pages)
		
		//capture index number pages dynamically
		int totalpages =Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("taotal number of pages"+totalpages);
		//pagination
		for(int p=1;p<=totalpages;p++)
		{
			if(totalpages>1)
			{
				WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
				System.out.println("active pages total"+activepage);
				activepage.click();
				Thread.sleep(2000);
				
			}
		}

		

		

		
	}

}
