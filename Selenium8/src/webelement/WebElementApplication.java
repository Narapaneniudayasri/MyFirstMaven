package webelement;


import org.openqa.selenium.By;

 import org.openqa.selenium.Keys;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 public class WebElementApplication {

public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

       driver.get("https://www.amazon.com/gp/css/homepage.html?r on 20Amazon.com");
       WebElement element=driver.findElement(By.id("two tabsearchtextbox"));

        element.sendKeys("java");

        Thread.sleep(1000);
      
        element.clear();

         Thread.sleep(1000);


      element.sendKeys("selenium", Keys.ENTER); 
      
      driver.findElement(By.xpath("//*[text ()='Sell')")).click();


        WebElement element1=driver.findElement(By.id("twotabsearchtextbox"));


         System.out.println(element.getTagName());


         System.out.println(element.getAttribute ("class"));
         
         System.out.println(element.getAttribute("dir"));


          System.out.println(driver.findElement(By.linkText ("Customer Service")));


          WebElement element2=driver.findElement(By.linkText("Sign up"));

           System.out.println(element2.getText());

            System.out.println(element2.getCssValue("color"));
        }
}