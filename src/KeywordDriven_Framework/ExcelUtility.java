package KeywordDriven_Framework;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static XSSFWorkbook wb;
	static XSSFSheet sheet1;
	public static void setExcel(String path, int sheetnum) throws Exception 
	{
		
			File src = new File(path);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sheet1= wb.getSheetAt(sheetnum);
			
		
   }
	public static String getData(int rownum, int cellnum)
	{
	
		String data = sheet1.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
	}
	
}
