package Testng.listener;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Testng.listener.Extentreportmanager.class)
public class Nopecpmmercetest {
	WebDriver driver = null;

	@BeforeClass
	void setup() {
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			driver.get("https://demo.nopcommerce.com/login");
			driver.manage().window().maximize();		
		} catch (Exception e) {
		}
	}

	@Test(priority=1)
	void tetslogin() throws InterruptedException {
		try{
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();//login
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tanude99@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kolkata@123");;
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(3000);
		//validation
	
		boolean status=driver.findElement(By.linkText("My account")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		

	}
	@Test(priority=2,dependsOnMethods={"tetslogin"})
	void Testlogout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}

	@AfterClass
	void teardown() {
		driver.close();
	}

	
	}


