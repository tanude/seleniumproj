package seleniumproj.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class OrangeHRMLOGINTEST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", value);
		//ebDriverManager.chromedriver().setup();
		//1)open url on browser
		
		WebDriver driver=null;
		try{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		

	
		}catch(Exception ex){
			System.out.println("Exception::"+ex);
		}finally{
			//if(driver != null)
				//driver.close();
		}
		
		//2)provide user name
		 driver.findElement(By.name("username")).sendKeys("admin");
		 //3)provide password
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 //4)login button click
		 driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 Thread.sleep(5000);
		//5)title of dashboard page
		 String title=driver.getTitle();
		 System.out.println("tittle"+title);
		 String exp_title="dashboard";
				 if(title.equals(exp_title))
				 {System.out.println("passed");
					 
				 }
				 
				 else{
					System.out.println("failed"); 
				 }
				 
				 
				 //7)close browser
				 //driver.close();

						 
				 

	}

}
