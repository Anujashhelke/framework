package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public ArrayList<String> excelTest(String excelPath) throws IOException {
	FileInputStream fin=new FileInputStream("C:\\Users\\Shree\\Documents\\Book1.xlsx");
    XSSFWorkbook workbook=new XSSFWorkbook(fin);
    ArrayList<String> array=new ArrayList<String>();
    int sheets=workbook.getNumberOfSheets();
    for(int i=0;i<sheets;i++)
    {
    	if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")){
    		XSSFSheet sheet=workbook.getSheetAt(i);
    		Iterator <Row> row=sheet.iterator();//collection of rows
    		Row firstrow =row.next();
    		Row secondrow=row.next();
    	Iterator<Cell> cell=secondrow.cellIterator();//collection of cell
    	while(cell.hasNext()) {
    		Cell value=cell.next();
    		String var=value.getStringCellValue();
    		array.add(var);
               }
    		
    	}

}
    return array;
	}
	
}

	
		// TODO Auto-generated method stub
		
	