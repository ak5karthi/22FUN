package genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/sm66.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
	}

	public String getExcelData(String name, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Sm66.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void WritingInExcel(String name, int row, int cell, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Sm66.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(name).getRow(row).getCell(cell).setCellValue(data);

	}
	public int getLastRow(String name) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Sm66.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet(name).getLastRowNum();
		return count;
	}

}
