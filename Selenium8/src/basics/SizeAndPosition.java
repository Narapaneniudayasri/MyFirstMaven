package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://instagram.com");
		System.out.println("get size:"+driver.manage().window().getSize().height);
		System.out.println("get size:"+driver.manage().window().getSize().width);
		Dimension d=new Dimension(200,500);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getPosition().x);
		

	}

}
