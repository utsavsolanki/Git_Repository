
// Project is devloped by Utsav
// Ittems fetch from the collection
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fetchitems 
{
  public WebDriver driver;
	
  @Test
  public void fin()
  {
	  driver  = new FirefoxDriver();
	  driver.get("http://book.theautomatedtester.co.uk/chapter1");
  
	  WebElement we  =  driver.findElement(By.id("selecttype"));
	  Select s1  = new Select(we);
	  List<WebElement> l1 = s1.getOptions();
	  
	  for(WebElement fetchitem : l1)
  		{
		  System.out.println(fetchitem.getText());  
  		}
  }

 @Test
 public void NewTest() 
 {
	  
	 try
	 {
	 WebElement weButton = driver.findElement(By.id("verifybutton"));
	 boolean status = weButton.isEnabled();
	 Assert.assertTrue(status);
	 }
	 catch(NullPointerException ex)
	 {
		 ex.printStackTrace();
	 }
 }


}
  
  

