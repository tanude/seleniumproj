package seleniumproj.seleniumproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigatecom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.macys.com/");
		driver.manage().window().maximize();

		driver.navigate().back();
		driver.manage().window().maximize();

		driver.navigate().forward();
		driver.manage().window().maximize();

		driver.navigate().refresh();
		driver.manage().window().maximize();

		/*String id=driver.getWindowHandle();
		System.out.println("windowids"+id);*/
		Thread.sleep(5000);
		}catch(Exception ex){
			System.out.println("Exception::"+ex);

		}

	}

}
