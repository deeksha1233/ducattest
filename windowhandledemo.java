package LoginDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowhandledemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.manage().window().maximize();
   Thread.sleep(2000);
  // String windowid=driver.getWindowHandle();
   //System.out.println(windowid);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
   Set<String>windowid=driver.getWindowHandles();
   System.out.println(windowid);
   Thread.sleep(2000);
   ArrayList<String>windowlist = new ArrayList<String>(windowid);
   
   
   String pwindoid=windowlist.get(0);
   System.out.println(pwindoid);
   String cwindoid=windowlist.get(1);
   System.out.println(cwindoid);
   driver.switchTo().window(pwindoid);
   System.out.println("The Title Of The page is="+driver.getTitle());
   Thread.sleep(2000);
   driver.switchTo().window(cwindoid);
   System.out.println("The Title of The Page is="+driver.getTitle());
   Thread.sleep(2000);
   driver.switchTo().window(pwindoid);
   Thread.sleep(2000);
   
   
   
   
   
   
   
   driver.quit();
	}

}
