package seleniumproj.seleniumproj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(2000);
		@SuppressWarnings("unchecked")
		List<WebElement> lst= driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
		System.out.println("list sizelst"+lst.size());
		//select option from list
		for(int i=0;i<lst.size();i++)
		{
			//System.out.println("value :"+lst.get(i).getText());
			String text=lst.get(i).getText();
			if(text.equals("selenuim python")||text.equals("selenium food"));
			lst.get(i).click();
			break;
			
		}

	}

}
