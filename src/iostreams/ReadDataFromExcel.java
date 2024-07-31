package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {

		File excelFile = new File("C:\\Users\\RAJU CHELLE\\Desktop\\Test.xlsx");

		FileInputStream excelFis = new FileInputStream(excelFile);

//		XSSFWorkbook  -> .xlsx		
//		HSSFWorkbook -> .xls

		XSSFWorkbook workbook = new XSSFWorkbook(excelFis);
		XSSFSheet languagesSheet = workbook.getSheet("Languages");
		Iterator<Row> allROws = languagesSheet.rowIterator();

		while (allROws.hasNext()) {
			Row eachRow = allROws.next();
			Iterator<Cell> allCells = eachRow.cellIterator();
			while (allCells.hasNext()) {
				Cell eachCell = allCells.next();
				if (Cell.CELL_TYPE_STRING == eachCell.getCellType()) {
					String cellData = eachCell.getStringCellValue();
					System.out.print(cellData+ " ");
				} else if (Cell.CELL_TYPE_NUMERIC == eachCell.getCellType()) {
					double cellData = eachCell.getNumericCellValue();
					System.out.print(cellData+ " ");
				} else if (eachCell.getCellType() == Cell.CELL_TYPE_BLANK) {
					String cellData = "";
					System.out.print(cellData+ " ");
				}
			}
			System.out.println();
		}
		
		excelFis.close();

	}

}
