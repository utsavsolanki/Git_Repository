


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class NewTest
{
  
	
  @Test
  public void Testmethod()
  {
	  multipleBrowser mb  = new multipleBrowser();
	  WebDriver driver = mb.selectBrowser("IE");
	  driver.get("https://www.google.com");
	  
	  
  }


}
