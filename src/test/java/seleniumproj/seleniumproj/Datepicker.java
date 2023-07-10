package seleniumproj.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Datepicker {

	public static void main(String[] args) {
WebDriver driver=null;
		
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
		driver.switchTo().frame(0);//swtich frame
		//aapproch1
		driver.findElement(By.id("datepicker")).sendKeys("06/15/2023");//mm//d//yy
		//aproch2
		String year="2023";
		String month="March";
		String date="13";
		driver.findElement(By.id("datepicker")).click();//mm//d//yy
		


		
		
		 

	}

}
