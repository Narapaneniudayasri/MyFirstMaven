package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	private static final String URL = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.instagram.com");
		//		String actualTitle="Instagram";
		//		String epectedTitile=driver.getTitle();
		//		if(epectedTitile.equals(actualTitle)) {
		//			System.out.println("this is pass");
		//		}
		//		else {
		//			System.out.println("this is fail");
		//		}
		//		System.out.println(driver.getCurrentUrl());
		//		System.out.println(driver.getPageSource());
		//driver.get("https://www.flipkart.com/search?q=power+bank&sid=tyy%2C4mr%2Cfu6&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_5_na_na_na&as-pos=2&as-type=HISTORY&suggestionId=power+bank%7CPower+Banks&requestId=f3b1ad78-eb93-4530-955f-83b4d9847a37");
		//driver.findElement(By.partialLinkText("Mi 3i 10000 mAh Power Bank (Fast Charging, 18W")).click();
       // System.out.println(driver.getWindowHandle()+"************parent");
        //System.out.println(driver.getWindowHandles());
		//driver.get("https://demowebshop.tricentis.com/");
		//WebElement element = driver.findElement(By.id("small-searchterms"));
		//element.sendKeys("abc");
		//Thread.sleep(2000);
		//element.clear();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//element.sendKeys("123",Keys.ENTER);
		driver.get("https://www.instagram.com/");
		WebElement element = driver.findElement(By.id("username"));
		System.out.println(element.getTagName());
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().to(URL);
		
		
	}

}
