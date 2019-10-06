package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDataFromExcel {
	
	public static String[][] readExcel(String excelFileName) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		//System.out.println(lastRowNum);
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		//System.out.println(lastCellNum);
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			 for (int j = 0; j < lastCellNum; j++) {
				 XSSFCell cell = row.getCell(j);
				 data[i-1][j] = cell.getStringCellValue();
				//System.out.println(data[i-1][j]);
			}
		}
		wbook.close();
		return data;
		
	}

}
