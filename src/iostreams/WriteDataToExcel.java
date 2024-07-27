package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		
		File excelFile = new File("C:\\Users\\RAJU CHELLE\\Desktop\\Test.xlsx");

		FileInputStream excelFis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(excelFis);
		XSSFSheet newSheet = workbook.createSheet("July2024");
		Row newRow = newSheet.createRow(0);
		Cell newCell = newRow.createCell(0);
		newCell.setCellValue("New Cell Value");
		
		FileOutputStream fos = new FileOutputStream(excelFile);
		workbook.write(fos);
		fos.close();
	}

}
