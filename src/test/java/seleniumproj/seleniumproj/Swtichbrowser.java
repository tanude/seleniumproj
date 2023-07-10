package seleniumproj.seleniumproj;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Swtichbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=null;
		
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
		//
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		/*//apperoch1
		//capture ids browser window
		Set<String>windowsid=driver.getWindowHandles();//two window id
		List windowsislist=new ArrayList(windowsid);//convert set to list
		String parentid=(String) windowsislist.get(0);
		String childid=(String) windowsislist.get(1);
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[@href='/en/contact-sales/']//button[@class='btn btn-ohrm btn-free-demo'][normalize-space()='Contact Sales']")).click();
		driver.switchTo().window(parentid)
;
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		*/
		//aproch2
		Set<String>windowsid=driver.getWindowHandles();//two window id
		
		for(String winid:windowsid)
		{
			String tile=driver.switchTo().window(winid).getTitle();
			if(tile.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				driver.findElement(By.xpath("//a[@href='/en/contact-sales/']//button[@class='btn btn-ohrm btn-free-demo'][normalize-space()='Contact Sales']")).click();
				driver.close();

			}
		}
		

	}

}
