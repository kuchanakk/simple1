package ecom.simplemavemproj1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.ScreenShot;
import commonmethods.TestBase;
import excelinfo.Excelreadandwrite;
import objrep.HomePage;
import objrep.Productdetails;

public class PopitemsTest extends TestBase{
	
	static HomePage hp;
	static Productdetails pd;
	static Excelreadandwrite excel;
	static TestBase tb;
	
	@BeforeMethod
	public void openbrow() {
		 tb = new TestBase();
		tb.openbrowser("firefox");
		
	}
	
	@AfterMethod
	public void clodebrowser() {
		driver.close();
		
	}
	
	@Test
	public  void tabletest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		hp.popitemslink().click();
		hp.tabletlink().click();
		 pd = new Productdetails(driver);
		 Thread.sleep(5000);

		 String actualtabtext=pd.poducttext().getText();
		  excel = new Excelreadandwrite();
		String expectedtabtext= excel.readdata(1, 0);
		
		if(actualtabtext.contains(expectedtabtext)) {
			
			System.out.println("test is pass");
			excel.wriredata(1, 1, "validdata");
			
		}else {
			System.out.println("test is fail");
			excel.wriredata(1, 1, "invaliddata");
			ScreenShot sc = new ScreenShot(driver);
			sc.shot();
			
		}
		
		 
		
	}
	
	
	@Test
	public void laptoptest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		hp.popitemslink().click();
		hp.laptoplink().click();
		 pd = new Productdetails(driver);
		 Thread.sleep(5000);
		 String actuallaptoptext=pd.poducttext().getText();
		  excel = new Excelreadandwrite();
		String expectedlaptoptext= excel.readdata(2, 0);
		
		if(actuallaptoptext.contains(expectedlaptoptext)) {
			
			System.out.println("test is pass");
			excel.wriredata(2, 1, "validdata");
			
		}else {
			System.out.println("test is fail");
			excel.wriredata(2, 1, "invaliddata");
			ScreenShot sc = new ScreenShot(driver);
			sc.shot();
			
		}
		
		
	}
	
	
	@Test
	public void spktest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		hp.popitemslink().click();
		hp.spklink().click();
		 pd = new Productdetails(driver);
		 Thread.sleep(5000);

		 String actualspktext=pd.poducttext().getText();
		  excel = new Excelreadandwrite();
		String expectedapktext= excel.readdata(3, 0);
		
		if(actualspktext.contains(expectedapktext)) {
			
			System.out.println("test is pass");
			excel.wriredata(3, 1, "validdata");
			
		}else {
			System.out.println("test is fail");
			excel.wriredata(3, 1, "invaliddata");
			ScreenShot sc = new ScreenShot(driver);
			sc.shot();
			
		}
		
	}
	
	
	
	
	

}
