package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrationOfDoubleClickMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick");
		WebElement element=driver.findElement(By.xpath("//p[contains(text(),'Are you satisfied ')]"));
		Actions act=new Actions(driver);
		act.moveToElement(element).doubleClick().perform();
		//act.doubleClick(element).perform();
	}

}
