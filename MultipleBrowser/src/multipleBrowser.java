
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class multipleBrowser {

	public WebDriver selectBrowser(String Browser) {
		WebDriver driver = null;
		switch (Browser) {
		case "Firefox":
			driver = new FirefoxDriver();
			break;

		case "IE":
			System.setProperty("webdriver.ie.driver", "E:\\JavaProjects\\MultipleBrowser\\myjar\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			

		}
		return driver;

	}
	
	
	

}
