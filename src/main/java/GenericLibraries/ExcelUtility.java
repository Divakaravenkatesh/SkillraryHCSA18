package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook wb;
	public void excelInitialization(String excelpath)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelpath);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch(ExcryptedDocumentException | IOException e)
		{
			
		}
	}

}
