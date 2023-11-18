package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.flipkart.com/tempt-10000-mah-power-bank-12-w-fast-charging/p/itma1c2a2056a252?pid=PWBGQMTCJUZRRZDM&lid=LSTPWBGQMTCJUZRRZDMVXYNSL&marketplace=FLIPKART&q=power+bank&store=tyy%2F4mr%2Ffu6&srno=s_1_8&otracker=AS_QueryStore_OrganicAutoSuggest_1_5_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_5_na_na_na&fm=organic&iid=en_imJ4ubAkeaduNDZtqQ0jXOs90cb5AZumeHLFD8i61OhpApmDABdA3gpuwOvRoeDhJPTZ_JRrjQjyMYQfadk9lQ%3D%3D&ppt=hp&ppn=homepage&ssid=7ssaxy6t1s0000001694064853650&qH=93838e3a65b51e46");
		ref.findElement(By.partialLinkText("ORAIMO 20000 mAh  Power Bank")).click();	
		System.out.println(ref.getWindowHandle()+"********** parent");
		System.out.println(ref.getWindowHandles());
			
				
 
	

	}

	}


