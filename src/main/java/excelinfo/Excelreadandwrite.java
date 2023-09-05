package excelinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadandwrite {
	
	String Excelpath ="C:\\Users\\kiran\\eclipse-workspace\\simplemavemproj1\\resource\\testdatanew.xlsx";
	
	public String readdata(int row , int clm) throws IOException {
		
		FileInputStream fis = new FileInputStream(Excelpath);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String value= wb.getSheet("Sheet2").getRow(row).getCell(clm).getStringCellValue();
		return value;
		
		
	}
	
	
	
	public  void wriredata(int row , int clm , String value) throws IOException {
		FileInputStream fis = new FileInputStream(Excelpath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet2").getRow(row).createCell(clm).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(Excelpath);
		wb.write(fos);
		fos.close();
		
		
	}
	
	
	

}
