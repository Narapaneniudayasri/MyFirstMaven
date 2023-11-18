package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingTheCountOfLink
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	for(WebElement link:allLinks)
	{
		//System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
	}
	driver.quit();

}
}
