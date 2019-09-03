package ReadExcelData;

import Lib.ExcelDataConfig;

public class ReadExcel1 {

	public static void main(String[] args) {
		
		ExcelDataConfig obj = new ExcelDataConfig("E:\\\\ExcelData\\\\TestData.xlsx");
		
		System.out.println(obj.getData(1,0,1));
	}

}
