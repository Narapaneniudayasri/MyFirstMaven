package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrower {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();


	}

}
