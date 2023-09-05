package testinfopack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import commonmethods.ScreenShot;
import objrep.HomePage;

public class CheckingTextofpopItem {
	
	@Test
	public void test1() throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(10000);
		hp.popitemslink().click();
		String actualtabletext=hp.tablettext().getText();
		if(actualtabletext.contains("apple  ELITEPAD 1000")) {
			
			System.out.println("test is pass");
			
			
		}else {
			
			
			System.out.println("test is fail");
			Thread.sleep(5000);
			ScreenShot sc = new ScreenShot(driver);
			sc.shot();
		}
		
		
		
		
		
	}
	
	
	

}
