package KeywordDriven_Framework;


public class Excution {

	public static void main(String[] args) throws Exception {
		String path ="E:\\ExcelData\\TestCases.xlsx";
		ExcelUtility.setExcel(path,1);
		
		for(int i=0;i<=6;i++) 
		{
			String keyword = ExcelUtility.getData(i,6);
			
			if(keyword.equals("OpenBrowser")) 
			{
				ActionKeywords.OpenBrowser();
				System.out.println("Open browser successfully");
			}
//			else if(keyword.equals("navigate")) 
//			{
//				ActionKeywords.navigate();
//				System.out.println("Navigate to Url successfully");
//				
//			}
			else if(keyword.equals("Sendkeys_Textfield")) 
			{
				ActionKeywords.Sendkeys_Textfield();
				System.out.println("Pass Username successfully");
			}
			else if(keyword.equals("Sendkeys_Textfield1")) 
			{
				ActionKeywords.Sendkeys_Textfield1();
				System.out.println("Pass password successfully");
			}
			else if(keyword.equals("Click")) 
			{
				ActionKeywords.Click();
				System.out.println("Click on Login successfully");
			}
			else if(keyword.equals("closeBrowser")) 
			{
				ActionKeywords.closeBrowser();
				System.out.println("close driver successfully");
			}
		}
	}

}