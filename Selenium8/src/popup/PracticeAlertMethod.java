package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlertMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//simple Alert
		//		driver.findElement(By.id("alertBox")).click();
		//		Alert simpleAlert=driver.switchTo().alert();
		//		System.out.println(simpleAlert.getText());
		//		Thread.sleep(2000);
		//		simpleAlert.accept();
		//		Thread.sleep(2000);
		//		driver.quit();
		//		//confirmation Alert
						driver.findElement(By.id("confirmBox")).click();
						Alert confirmationAlert=driver.switchTo().alert();
						System.out.println(confirmationAlert.getText());
						Thread.sleep(2000);
						//confirmationAlert.accept();
						Thread.sleep(2000);
						System.out.println(confirmationAlert.getText());
				         driver.quit();
	       //Prompt alert  
//		         driver.findElement(By.id("promptBox")).click();
//				 Alert promptAlert=driver.switchTo().alert();
//				 System.out.println(promptAlert.getText());
//				 Thread.sleep(2000);
//				 promptAlert.sendKeys("Udayasri");
//				// promptAlert.accept();
			   	// Thread.sleep(2000);
			    //	 System.out.println(driver.findElement(By.id("output")).getText());
			
		

	}

}
