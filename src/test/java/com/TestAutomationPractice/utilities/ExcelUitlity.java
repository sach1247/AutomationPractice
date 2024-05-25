package com.TestAutomationPractice.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUitlity {

	public static int getTotalRows(String ExcelFileName, String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream(ExcelFileName);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		try
		{
			XSSFSheet sheet=workbook.getSheet(sheetName);
			
			if(sheet==null)
			{
				throw new Exception("Sheet with name"+ sheetName+ " is not present in "+  ExcelFileName);
			}
			
			int totalRows=sheet.getLastRowNum();
			return totalRows;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			return 0;
		}
		finally
		{
			workbook.close();
			fis.close();
		}
	}
	
	
	public static int getTotalColumns(String ExcelFileName, String sheetName,int rownum) throws IOException
	{
		FileInputStream fis=new FileInputStream(ExcelFileName);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		try
		{
			XSSFSheet sheet=workbook.getSheet(sheetName);
			
			if(sheet==null)
			{
				throw new Exception("Sheet with name"+ sheetName+ " is not present in "+  ExcelFileName);
			}
			
			XSSFRow row=sheet.getRow(rownum);
			int totalCol=row.getLastCellNum();
			return totalCol;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			return 0;
		}
		finally
		{
			workbook.close();
			fis.close();
		}
	}
	
	
	
	public static String getCellData(String ExcelFileName, String sheetName,int rownum ,int colnum) throws Exception
	{
		FileInputStream fis=new FileInputStream(ExcelFileName);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
			XSSFSheet sheet=workbook.getSheet(sheetName);
			
			XSSFRow row=sheet.getRow(rownum);
			XSSFCell cell=row.getCell(colnum);
			
		String data;
			
			
		try
		{
			DataFormatter df=new DataFormatter();
			String cellData=df.formatCellValue(cell);
			return cellData;			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			data=" ";
		}
		
		finally
		{
			workbook.close();
			fis.close();
		}
		
			
		return data;
			
	}
}
	


