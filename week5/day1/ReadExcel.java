package week5.day1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Step 1: Set the excel work book path
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		// Step 2: Get the sheet 
		// option 1 by using sheet index -- index starts from zero
			XSSFSheet sheet = wb.getSheetAt(0);
		// option by using sheet name 
			XSSFSheet sheetName = wb.getSheet("CreateLeadData");
		// Step 3: get row from the sheet
			int rowCount = sheet.getLastRowNum();// counting starts from zero
			System.out.println("Row count is " + rowCount);
		// Step 4: Get the cloumn
			XSSFRow row1 = sheet.getRow(0);
			XSSFCell cell00 = row1.getCell(0);
			String data00 = cell00.getStringCellValue();
			System.out.println("data 00 is "+data00);
			
			String data20 = sheet.getRow(2).getCell(0).getStringCellValue();
			System.out.println("data 2,0 is "+ data20);
		/* not recommanded to use getNumericeCellValue 
		 *  because
		 *    reason 1 - sendKeys() will accept eithier sequence of char or String
		 *    reason 2 - Hard to known in which cell data the numeric value is present. 
			double data13 = sheet.getRow(1).getCell(3).getNumericCellValue();
			System.out.println("data 1,3 is "+ data13);
			*/
			CellType cellType = sheet.getRow(1).getCell(3).getCellType();
			System.out.println("Cell type for 1,3 "+ cellType);
			
			String data13 = sheet.getRow(1).getCell(3).getStringCellValue();
			System.out.println("Data 13 is "+data13);
			
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println("Column count is "+ columnCount);
			
			String data31  = sheetName.getRow(3).getCell(1).getStringCellValue();
			System.out.println("Data 31 by using sheet name is "+ data31);
	}

}
