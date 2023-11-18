package findelements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionsData 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.amazon.in/");
	driver.get("https://www.google.com/");
	Scanner s=new Scanner(System.in);
	System.out.println("enter the search keyword");
	String data=s.next();
	driver.findElement(By.name("q")).sendKeys(data);
	List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'"+data+"')]"));
	for(WebElement suggestion:allSuggestion) {
		System.out.println(suggestion.getText());
	}
	driver.quit();
	}

}










