package seleniumproj.seleniumproj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdownchk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
		
		//driver.findElement(By.id("monday")).click();
		@SuppressWarnings("unchecked")
		List<WebElement>  checkbox= driver.findElements(By.xpath("//input[@Class='form-check-input' and @type='checkbox']"));
		checkbox.size();
		System.out.println("checkbox"+checkbox.size());
		//select all checkbox
		/*for(int i=0;i<=checkbox.size();i++)
		{
			checkbox.get(i).click();
			
		}*/
		//sellect 2 checkbox from bottom
		for(int i=0;i<=3;i++){
			
			checkbox.get(i).click();
	
		
		}
		Thread.sleep(1000);
		//uncheck check box
		
		
		for(int i=0;i<=3;i++){
			if(checkbox.get(i).isSelected())
			{
			
				checkbox.get(i).click();
			}
			
			
			
			}
			
		
		}
	
	}

