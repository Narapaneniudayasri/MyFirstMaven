package actionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeTest 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/shop/kidswear?gclid=Cj0KCQjw4bipBhCyARIsAFsieCyjb4rXha1_XeHL_5NUNdoCTtkgnggC9JJM0Vb6fB7iUuIEK5ws4X4aAn8NEALw_wcB");
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.linkText("MEN"));
		act.moveToElement(element).perform();
		
		
	}

}
