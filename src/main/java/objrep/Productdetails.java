package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productdetails {
	
	static WebDriver driver;
	
	public Productdetails(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public  WebElement poducttext() {
		
		
		return driver.findElement(By.xpath("//*[@id='Description']/h1"));
		
		
		
	}
	
	
	
	

}
