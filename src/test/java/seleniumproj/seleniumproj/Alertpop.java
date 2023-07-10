package seleniumproj.seleniumproj;

import java.time.Duration;

import org.checkerframework.checker.interning.qual.EqualsMethod;
import org.checkerframework.common.aliasing.qual.MaybeAliased;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
	/* driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	// Alert alertwindow=driver.switchTo().alert();
	 WebDriverWait wbwait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 Alert alertwindow= wbwait.until(ExpectedConditions.alertIsPresent());
	 System.out.println("gettext"+alertwindow.getText());
	 //alertwindow.accept();//this will close alert window using ok
	 alertwindow.dismiss();//canel butto
	 */
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();;
		Alert myalert=driver.switchTo().alert();
		myalert.getText();
		System.out.println("alert text"+myalert.getText());
		myalert.sendKeys("person");
		myalert.accept();
		//validation:
		String actualtext=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expected_text="You entered: person";
		if(actualtext.equals(expected_text))
		{System.out.println("test passed");
			
		}
		else
		{
			System.out.println("test failed");
		}
	

	}

}
