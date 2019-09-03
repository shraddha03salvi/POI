package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelsheet {

	public static void main(String[] args) throws Exception {
		File src = new File("E:\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(1).createCell(2).setCellValue("Pass");
		sheet1.getRow(2).createCell(2).setCellValue("Fail");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
	}

}
