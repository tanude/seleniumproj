package Grouping.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
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

	@Test(dataProvider = "dp1")
	void tetslogin(String email, String pwd) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		//Thread.sleep(2000);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		Thread.sleep(2000);
		String exp_title = "nopCommerce demo store";
		String actual_title = driver.getTitle();
		System.out.println("title"+driver.getTitle());
		Assert.assertEquals(actual_title, exp_title);

	}

	@AfterClass
	void teardown() {
		driver.close();
	}

	@DataProvider(name = "dp1")
	String[][] logindata1() {
		String data[][] = {
				{"abc@gmail.com","test123"},
				{"manu@gmail.com","test345"},
				{"tanude99@gmail.com","test123"}
		};
		return data;
	}

	@DataProvider(name = "dp2")
	String[][] logindata2() {
		String data[][] = {

				{ "abc@gmail.com", "test123" }, { "manu@gmail.com", "test345" }, { "ranu@hotmail.com", "re234@" },
				{ "pavanoltraining@gmail.com", "test@123" }

		};
		return data;
	}

}
