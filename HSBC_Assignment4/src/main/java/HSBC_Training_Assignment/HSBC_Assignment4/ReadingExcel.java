package HSBC_Training_Assignment.HSBC_Assignment4;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingExcel {

	public static void main(String[] args) throws IOException
	{	    
	    File source=new File("D:\\Learnings\\DATA1.xls");
	   
		FileInputStream ip=new FileInputStream(source);
		HSSFWorkbook wb=new HSSFWorkbook(ip);
		HSSFSheet sheet=wb.getSheetAt(0);
		
		String cell1=sheet.getRow(0).getCell(0).getStringCellValue();
		double cell2=sheet.getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println("number of Rows in sheet :"+sheet.getLastRowNum());
		
		System.out.println("EXCEL CELL VALUE FOR 0 ROW AND 0 COLOUMN "+cell1);
		System.out.println("EXCEL CELL VALUE FOR 0 ROW AND 1 COLOUMN "+cell2);
		
	}    

}


