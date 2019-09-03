package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
		File src = new File("E:\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
//		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
//		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
//		System.out.println("Data from Excel Sheet is"  +data);
//		System.out.println("Data from Excel Sheet is"  +data1);
//		String data2 = sheet1.getRow(1).getCell(0).getStringCellValue();
//		System.out.println("Data from Excel Sheet is"  +data2);
//		String data3 = sheet1.getRow(1).getCell(1).getStringCellValue();
//		System.out.println("Data from Excel Sheet is"  +data3);
		
		int rowcount = sheet1.getLastRowNum();
		
	System.out.println("Total rows are" +(rowcount+1));
	
		for(int i=0;i<=rowcount;i++) 
		{  
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			//String data1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data are" +data);
			
		}
		wb.close();
	}

}
