package TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PagesObjects.HomePage;
import Utility.utility;

public class PracticeExpanding extends utility {
	HomePage h=new  HomePage();
	@Test
	public void Test_Login(){
		 
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//	 js.executeScript("window.scrollBy(0,500)");
	//	 Thread.sleep(3000);;
		driver.findElement(By.linkText("Test Login Page")).click();
	}

}
