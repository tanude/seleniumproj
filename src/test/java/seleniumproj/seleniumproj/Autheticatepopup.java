package seleniumproj.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autheticatepopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=null;
		
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		String elemnt=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!")).getText();
		System.out.println("conatns ");
		if(elemnt.contains("Congratulations"))
		{
			System.out.println("login sucessful");
		}
		else
		{
			System.out.println("failed");
		}
		}
		catch(Exception e)
		{
			}
		

	}

}
