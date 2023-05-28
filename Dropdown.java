package LoginDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("main");
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println("The Current Url is="+url);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		//driver.close();
		Select drp=new Select(ele);
		drp.selectByValue("Portland");
		Thread.sleep(2000);
		//drp.selectByValue("paris");
		//Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Select drp1 =new Select(ele1);
		drp1.selectByValue("London");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input")).click();
		Thread.sleep(2000);
		//driver.close();
		ScreenRecorderUtil.stopRecord();
		Thread.sleep(2000);
		TakesScreenshot sc1=((TakesScreenshot)driver);
		File src=sc1.getScreenshotAs(OutputType.FILE);
		File f1=new File("E:\\screenshot\\screenshot.png");
		FileUtils.copyFile(src, f1);
		
		Thread.sleep(2000);
		driver.close();
		
 		

	}

}
