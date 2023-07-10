package seleniumproj.seleniumproj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdpwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			}
	WebElement dropdown=	driver.findElement(By.xpath("//select[@id='country-list']"));
	Select drpcounty=new Select(dropdown);
	//1)selection option from dropdpwn
	//drpcounty.selectByVisibleText("USA");
	//drpcounty.selectByValue("4");;//use this value attribute is available option tag
	//drpcounty.selectByIndex(3);
	//findtotal option dropdown
	List<WebElement> option=drpcounty.getOptions();
	option.size();
	System.out.println("total number of option"+option.size());
	/*//3)print option on console window
	for(int i =0;i<option.size();i++)
	{
		System.out.println(option.get(i).getText());
		
	}*/
	//4)select multiple value dropdpwn


}
	}
