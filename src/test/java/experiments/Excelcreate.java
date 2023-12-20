package experiments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelcreate {
public static void main(String[] args) throws FileNotFoundException {
	FileInputStream file = new FileInputStream(".//src//main//java//com//tutorials//qa//testdata//tabledata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook();
 XSSFSheet sheet=	workbook.createSheet("sample");
 XSSFRow  row =sheet.createRow(0);
 XSSFCell cell=row.createCell(0);
 cell.setCellValue("anil");
	}
}
