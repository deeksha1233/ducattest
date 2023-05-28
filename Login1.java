package LoginDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {
	public static  void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	System.out.println("url of the page is="+url); 
	String Actualurl=driver.getCurrentUrl();
	String Expectedurl="https://www.saucedemo.com/";
	if(Actualurl.equals(Expectedurl))
	{System.out.println("Correct url");
	
	}
	else
	{System.out.println("Wrong url");
	}
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="swaglab";
	if(ActualTitle.equals(ExpectedTitle)) {
		System.out.println("Correct Title");
	}
	else
	{System.out.println("Incorrect Title");
	}
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.id("user-name"));
	ele.sendKeys("standard_user");
	WebElement ele1=driver.findElement(By.id("password"));
	ele1.sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	WebElement ele2 = driver.findElement(By.id("first-name"));
	ele2.sendKeys("Reyan");
	Thread.sleep(2000);
	WebElement ele3=driver.findElement(By.id("last-name"));
	ele3.sendKeys("Agarwal");
	Thread.sleep(2000);
	WebElement ele4=driver.findElement(By.id("postal-code"));
	ele4.sendKeys("201001");
	Thread.sleep(2000);
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("finish")).click();
		
	Thread.sleep(2000);
	//driver.findElement(By.id("cancel")).click();
	//Thread.sleep(2000);
	{driver.findElement(By.id("back-to-products")).click();
	Thread.sleep(2000);
	driver.close();
	}
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



