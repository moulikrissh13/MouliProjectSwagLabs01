package ExcelLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelFiles {

	
	public FileInputStream fis;
	public Workbook book;
	
	
	public String readExcelData(String sheet,int row, int col) {
		
		//1. 
		try {
			fis = new FileInputStream("./src/test/resources/Checkout Credentials.xlsx");
		} catch (FileNotFoundException e) {
   			e.printStackTrace();
		}
		
		//2.
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//3.
		String data = book.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
}
