package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	 public LoginPage1(WebDriver driver) {
		  PageFactory.initElements(driver, this);
		  
	  }
		
	      @FindBy(linkText="Log in")
	      private WebElement loginlink;
	      public WebElement getloginlink() {
			return loginlink;
		} 
	      
	      @FindBy(id="Email")
	      private WebElement emailid;
	      
	      
	      @FindBy(id="Password")
	      private WebElement pwdid;
	      
		public WebElement getemailid() {
			return emailid;
		}

		public WebElement getpwdid() {
			return pwdid;
		}

}
