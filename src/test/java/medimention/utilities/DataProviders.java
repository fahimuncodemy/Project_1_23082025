package medimention.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="RegisterData")
	public String[][] RegData() throws IOException
	{
		String path= ".\\Test Data\\Data2408.xlsx";
		ExcelUtility xlu=new ExcelUtility(path);
		
		int rows=xlu.getRowCount("Random generator");
		int cols=xlu.getCellCount("Random generator", 1);
		
		String registerData[][]= new String[rows][cols];
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				registerData[i-1][j]=xlu.getCellData("Random generator", i, j);
			}
		}
		return registerData;
	}
	
}
