package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//path of the file
		FileInputStream fis=new FileInputStream(".\\TestData\\AutomationBatch.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String value_00 = workbook.getSheet("Batch").getRow(0).getCell(0).getStringCellValue();
		String value_10 = workbook.getSheet("Batch").getRow(1).getCell(0).getStringCellValue();
		String value_20 = workbook.getSheet("Batch").getRow(2).getCell(0).getStringCellValue();
		String value_30 = workbook.getSheet("Batch").getRow(3).getCell(0).getStringCellValue();
		String value = workbook.getSheet("Batch").getRow(4).getCell(0).getStringCellValue();
		System.out.println(value_00);
		System.out.println(value_10);
		System.out.println(value_20);
		System.out.println(value_30);
		System.out.println(value);
	}

}
