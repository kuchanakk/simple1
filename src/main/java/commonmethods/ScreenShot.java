package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import objrep.HomePage;

public class ScreenShot extends HomePage {
	
	
	
	public ScreenShot(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void shot() throws IOException {
		
		File scrshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrshotfile, new File("C:\\Users\\kiran\\eclipse-workspace\\simplemavemproj1\\resource\\screenshot\\error.png"));
		
		
	}
	
	
	
	

}
