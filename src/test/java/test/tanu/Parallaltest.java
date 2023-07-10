package test.tanu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallaltest {
	WebDriver driver = null;

	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appurl) throws InterruptedException {
		if(br.equals("chrome"))
		{
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
		}
		catch (Exception e) {
		}
		}
		else if(br.equals("edge"))
		{
			try{
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver =new EdgeDriver(options);
			
			
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
			
		}
		else
		{
			driver=new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		
	}
	
	

	@Test(priority = 1)
	void testlogo()  {
		try {	
			
			Boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding'][1]")).isDisplayed();
			System.out.println("actuallogo:" + status);
			//Thread.sleep(3000);
			Assert.assertEquals(status, true);
			System.out.println("actuallogo:" + status);


		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 2)
	void titleofhomepage() {
		//String expectedtilte="OrangeHRM.Login";
		//String actualtitle=driver.getTitle();
		//Assert.assertEquals(actualtitle, expectedtilte);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	/*@AfterClass
	void closeapp() {
		driver.quit();
	}
*/
}
