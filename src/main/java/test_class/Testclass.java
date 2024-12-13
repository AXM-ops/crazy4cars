package test_class;

import org.testng.annotations.Test;

import Projectutilities.xlutilities;
import base_class.Baseclass;
import page_class.Pageclass;

public class Testclass extends Baseclass
{
	@Test
	public void projecttest() throws Exception
	{
		Pageclass oblogin = new Pageclass(driver);
		oblogin.test1("axmym19@gmail.com","Asimov@031424");
	
		
		String xl="\"C:\\Users\\axm21\\Downloads\\Untitled spreadsheet (7).xlsx\"";
		String sheet="pro1";
		
		int rowCount =xlutilities.getRowCount(xl,sheet);
		
		for(int i=1;i<=rowCount;i++)
		{
			String emaill =xlutilities.getCellValue(xl,sheet,i,0);
			System.out.println("username"+emaill);
			String passwd =xlutilities.getCellValue(xl,sheet,i,1);
			System.out.println("username"+passwd);
		}
		Thread.sleep(2000);
		oblogin.drpdown();
		oblogin.cartt();
		
		
		
		
	}
}


