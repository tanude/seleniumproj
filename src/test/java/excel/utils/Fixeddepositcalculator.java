package excel.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Fixeddepositcalculator {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;

		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(
					"https://www.moneycontrol.com/fixed-income/calculator/hsbc/fixed-deposit-calculator-ZZZ-BHS001.html?classic=true");
			driver.manage().window().maximize();
		} catch (Exception e) {
		}
		String file = System.getProperty("user.dir") + "\\testdata\\TESTDATA1.xlsx";

		int rows = Excelutlis.getRowCount(file, "Sheet1");

		for (int i = 1; i <= rows; i++) {
			// read data from excel
			String princ = Excelutlis.getCellData(file, "Sheet1", i, 0);
			String rateofinterest = Excelutlis.getCellData(file, "Sheet1", i, 1);
			String per1 = Excelutlis.getCellData(file, "Sheet1", i, 2);
			String per2 = Excelutlis.getCellData(file, "Sheet1", i, 3);
			String fre = Excelutlis.getCellData(file, "Sheet1", i, 4);
			String exp_mvalue = Excelutlis.getCellData(file, "Sheet1", i, 5);

			// pass data to the app
			driver.findElement(By.id("principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);

			Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);

			Select fredrp = new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement calculate_btn = driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
			js.executeScript("arguments[0].click();", calculate_btn); // clicking
																		// on
																		// calculate
																		// button

			// validation & update results in excel
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();

			if (Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue)) {
				System.out.println("Test Passsed");
				Excelutlis.setCellData(file, "Sheet1", i, 7, "Passed");
				Excelutlis.fillGreenColor(file, "Sheet1", i, 7);
			} else {
				System.out.println("Test Failed");
				Excelutlis.setCellData(file, "Sheet1", i, 7, "Failed");
				Excelutlis.fillRedColor(file, "Sheet1", i, 7);
			}
			Thread.sleep(3000);

			WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));
			js.executeScript("arguments[0].click();", clear_btn); // clicking on
																	// clear
																	// button

		}

	}
}
