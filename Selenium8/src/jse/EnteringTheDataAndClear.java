package jse;


	import java.util.Scanner;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class EnteringTheDataAndClear {

		public static void main(String[] args) throws InterruptedException {
		
			
			 Scanner scan=new Scanner(System.in);
			 System.out.println("enter the data");
			 String data=scan.nextLine();

			 System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();	


			 driver.get("https://demowebshop.tricentis.com/");
			 WebElement element=driver.findElement(By.xpath("//strong[text()='Popular tags']"));
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
			 
			 
			 
			 // String data="udayasri";
			 WebElement Searchstore = driver.findElement(By.id("small-searchterms"));
		
			 WebElement SearchButton = driver.findElement(By.xpath("//input[@value='Search']"));
			 //jse.executeScript("arguments[0].value='udayasri'", Searchstore);
			 jse.executeScript("arguments[0].value='"+data+"'", Searchstore);
			 Thread.sleep(2000);
			
			 jse.executeScript("arguments[0].value=' '",Searchstore );
			  
			 Thread.sleep(2000);
	 
			 jse.executeScript("arguments[0].click()",SearchButton);
			}

	}


