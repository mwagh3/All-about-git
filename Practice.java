package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice 	
{
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act=new Actions(driver);
	
	
	
	
	
	act.contextClick(ele).perform();
	
//	act.moveToElement(ele).contextClick().build().perform();
//	
//	act.contextClick().perform();
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
