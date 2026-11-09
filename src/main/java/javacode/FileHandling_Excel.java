package javacode;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling_Excel {
	
	public static void read_exceldata()throws Exception 
	{
		for (int a=0; a<11; a++)
		{
			System.out.println(a);
		}
			
	
		
		FileInputStream fis = new FileInputStream("./testdata/data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("signup");
		
		int nr = sh1.getPhysicalNumberOfRows();//4
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sh1.getRow(i); //i=0 first row, i=1 second row
			
			int nc = row.getPhysicalNumberOfCells(); //nc=2
			
			for(int j=0; j<nc; j++) //j=0, j=1
			{
				XSSFCell col = row.getCell(j);
				
				if (col.getCellType() == CellType.STRING)
				{
					System.out.print(col.toString() + "  ");	
				}
				
				else if (col.getCellType() == CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "  ");						
				}

				else if (col.getCellType() == CellType.NUMERIC)
				{
					
					if(DateUtil.isCellDateFormatted(col))
					{
						SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
						System.out.println(sdf.format(col.getDateCellValue())+ "  ");
					}
					
					else
					{
						System.out.print(col.getNumericCellValue() + "  ");	
					}
						
										
				}
		
			}
			
			System.out.println();
			
		}
						
		/*

		// first row
		XSSFRow row1 = sh1.getRow(0);

		XSSFCell col1 = row1.getCell(0); // first column

		System.out.print(col1.getStringCellValue() + "  ");
		
		XSSFCell col2 = row1.getCell(1); // second column

		System.out.print(col2.getStringCellValue() + "  ");

		// col1.getNumericCellValue();
		// col1.getBooleanCellValue();
		// col1.getDateCellValue();

		System.out.println();

		// second row
		XSSFRow row2 = sh1.getRow(1);

		XSSFCell col21 = row2.getCell(0); // first column

		System.out.print(col21.getStringCellValue() + "  ");

		XSSFCell col22 = row2.getCell(1); // second column

		System.out.print(col22.getStringCellValue() + "  ");

*/
		
	}

}
