package seleniumproj.seleniumproj;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v105.page.Page.GetAppIdResponse;

import io.netty.util.internal.SystemPropertyUtil;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;

		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		} catch (Exception e) {
		}
		// find total number of rows]
		int tablerow = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		System.out.println("row_:" + tablerow);

		// find total number of cloumns
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("number of col:" + col);

		// read specific rows and column data
		// String
		// data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
		// System.out.println("table specfiicdata "+data);

		// read data from all the rows and columns
		/*for (int r = 2; r < tablerow; r++) {
			for (int c = 1; c <= col; c++) {
				String tabeldata = driver
						.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
				System.out.print(tabeldata + "           ");

			}
			System.out.println();
		}
*/
		// print book name whose author amit

		/*for (int r = 2; r <= tablerow; r++) {
			String authorlist = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]"))
					.getText();
			//System.out.println(authorlist);
			 if (authorlist.equals("Amit")) 
				{//System.out.println("in a if");
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[1]")).getText();
				System.out.println(authorlist+"   "+bookname);
						
			}

		}*/

		// price of all books sum
		 int sum=0;

		for(int r=2;r<=tablerow;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ r +"]//td[4]")).getText();
		System.out.println(price);
		
		 sum=sum+Integer.parseInt(price);

		}
		System.out.print("total price of books"+sum);

		
		
		
		// find total number of rows

	}

}
