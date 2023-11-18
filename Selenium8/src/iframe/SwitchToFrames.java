package iframe;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchToFrames {

		public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","./Driver1/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.get("https://www.makemytrip.com/");

				WebElement Frame=driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb43881']"));

				//driver.switchTo().frame(3);	  
				//driver.switchTo().frame("notification-frame-~10cb43881");
				driver.switchTo().frame(Frame);

				driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));




			}

		
		

	

}
