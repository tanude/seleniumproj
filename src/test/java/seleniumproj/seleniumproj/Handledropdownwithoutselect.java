package seleniumproj.seleniumproj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handledropdownwithoutselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
		
		//click on dropdown mutliselect dropdown
	 driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	 List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
	
	 //find total number of option
	 System.out.println("option"+options.size()); 
	 //print each every options
	/* for(int i=0;i<options.size();i++)
	 {
		 System.out.println(options.get(i).getText());
		 
	 }*/
	// select option from dropdown
	 for(int i=0;i<options.size();i++)
	 {
		 if(options.get(i).getText().equals("java"));
		 options.get(i).click();
		 break;
		 
	 }
	 
	 
	 
		

	}

}
