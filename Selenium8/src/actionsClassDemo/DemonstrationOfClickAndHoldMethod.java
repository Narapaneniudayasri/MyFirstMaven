package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrationOfClickAndHoldMethod {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		//act.clickAndHold(src).release(destination).perform();
		act.moveToElement(src).clickAndHold().release(destination).perform();		
	}

}
