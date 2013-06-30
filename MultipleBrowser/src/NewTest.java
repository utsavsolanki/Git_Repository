


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class NewTest
{
  // Function work for open the Google page URL and open the page.
	
  @Test
  public void Testmethod()
  {
	  multipleBrowser mb  = new multipleBrowser();
	  WebDriver driver = mb.selectBrowser("IE");
	  driver.get("https://www.google.com");
	  
	  
  }


}
