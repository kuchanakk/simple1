package commonmethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	protected static WebDriver driver;
	public void openbrowser(String browser) {
		
		//String browser ="firefox";
		
		if(browser.equals("firefox")) {
		 driver = new FirefoxDriver();	
		 driver.get("http://www.advantageonlineshopping.com/#/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
			
		}else if(browser.equals("chrome")) {
			
			 driver = new ChromeDriver();	
			 driver.get("http://www.advantageonlineshopping.com/#/");
			 driver.manage().window().maximize();
			 
			
		}else if(browser.equals("edge")) {
			driver = new EdgeDriver();	
			 driver.get("http://www.advantageonlineshopping.com/#/");
			 driver.manage().window().maximize();
			
		}
		
		
	}

}
