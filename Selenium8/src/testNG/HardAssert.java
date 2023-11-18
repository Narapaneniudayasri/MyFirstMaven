package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert 
{
	@Test
	public void demo(){
		String expectedTitle="demo";
		String actualTitle="sam";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle,expectedTitle);
		System.out.println("done");
		soft.assertAll();
	}

}
