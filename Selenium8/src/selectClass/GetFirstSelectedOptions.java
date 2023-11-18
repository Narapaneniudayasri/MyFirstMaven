package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptions 
{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///E:/Uday/select.html");
	WebElement dropdown=driver.findElement(By.id("single"));// it will give unsuported operation exception
	Select select=new Select(dropdown);
	select.selectByValue("3");
	Thread.sleep(2000);
	select.selectByVisibleText("sql");
	Thread.sleep(2000);
	select.selectByIndex(0);
	//System.out.println(select.getFirstSelectedOption().getText());

	List<WebElement>allSelectedOptions=select.getAllSelectedOptions();
	for(WebElement option:allSelectedOptions){
		System.out.println(option.getText());

	}
	}

}

