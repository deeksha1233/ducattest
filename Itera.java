package LoginDemo;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
public class Itera {

	public static  void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("main");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://itera-qa.azurewebsites.net/");
driver.manage().window().maximize();
String url=driver.getCurrentUrl();
System.out.println("The Current URL IS="+url);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();

WebElement ele=driver.findElement(By.id("FirstName"));
ele.sendKeys("1234");
Thread.sleep(2000);

WebElement ele1=driver.findElement(By.id("Surname"));
ele1.sendKeys("2345");
WebElement ele2=driver.findElement(By.id("E_post"));
ele2.sendKeys("MCA");
WebElement ele3=driver.findElement(By.id("Mobile"));
ele3.sendKeys("abcgrtyuyt");
Thread.sleep(2000);
TakesScreenshot sc01=((TakesScreenshot)driver);
File src4=sc01. getScreenshotAs(OutputType.FILE);
File f5=new File("E:\\screenshotiteraautomation01\\screenshot01.png");
FileUtils.copyFile(src4,f5);


WebElement ele4=driver.findElement(By.id("Username"));
ele4.sendKeys("deeksha@gmail.com");
Thread.sleep(2000);
WebElement ele5=driver.findElement(By.id("Password"));
ele5.sendKeys("ADeeksha3#");
WebElement ele6=driver.findElement(By.id("ConfirmPassword"));
ele6.sendKeys("ADeeksha3#");
TakesScreenshot sc=((TakesScreenshot)driver);
File src2=sc. getScreenshotAs(OutputType.FILE);
File f4=new File("E:\\screenshotiteraautomation0\\screenshot0.png");
FileUtils.copyFile(src2,f4);

driver.findElement(By.xpath("/html/body/div/form/div/div[8]/div")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")).click();
Thread.sleep(2000);
WebElement ele7=driver.findElement(By.id("Username"));
ele7.sendKeys("deeksha@gmail.com");
Thread.sleep(2000);
WebElement ele8=driver.findElement(By.id("Password"));
ele8.sendKeys("ADeeksha3#");
Thread.sleep(2000);
TakesScreenshot sc1=((TakesScreenshot)driver);
File src0=sc1. getScreenshotAs(OutputType.FILE);
File f3=new File("E:\\screenshot iteraAutomation1\\screenshot1.png");
FileUtils.copyFile(src0,f3);

driver.findElement(By.xpath("/html/body/div/div[1]/form/table/tbody/tr[7]/td[2]/input[1]")).click();
Thread.sleep(2000);

WebElement ele9=driver.findElement(By.id("searching"));
ele9.sendKeys("Manish");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td[7]/a[1]")).click();
Thread.sleep(2000);

driver.findElement(By.id("Name")).clear();
WebElement ele10=driver.findElement(By.id("Name"));

ele10.sendKeys("Mani");

//WebElement ele10=driver.findElement(By.id("searching"));

//

//ele9.sendKeys(Keys.BACK_SPACE);
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.id("searching")).clear();
WebElement ele11=driver.findElement(By.id("searching"));
ele11.sendKeys("Mani");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).click();
Thread.sleep(2000);
ScreenRecorderUtil.stopRecord();
TakesScreenshot sc2=((TakesScreenshot)driver);
File src1=sc2.getScreenshotAs(OutputType.FILE);
File f2=new File("E:\\screenshot itera Automation\\screenshot.png");
FileUtils.copyFile(src1, f2);

driver.close();




















driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td[7]/a[3]")).click();
Thread.sleep(2000);

driver.close();




	}

}
