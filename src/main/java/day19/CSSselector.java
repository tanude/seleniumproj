package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v105.input.Input;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		}catch(Exception ex){
			System.out.println("Exception::"+ex);

		}
		//css with tag and id combination
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("macbook");
		//tag and class
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("macbook");
		//driver.findElement(By.cssSelector("input[name=q]"));
		//driver.findElement(By.cssSelector("input[placeholder=Searchh store]"));
		//tag class attribute
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("macbook");
		driver.findElement(By.linkText("/books"));

	}
	

}
