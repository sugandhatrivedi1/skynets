package com.skynets.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData 
{
   public static void toExcel(String fName,String sName,int rIndex,int cIndex,String data) throws Exception
   {
	   File f=new File("./TestData/"+fName+".xlsx");
	   FileInputStream fis=new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sName);
		Row r=st.getRow(rIndex);
		Cell c=null;
		try
		{
			c=r.getCell(cIndex);
			c.setCellValue(data);
		}
		catch(NullPointerException e)
		{
			c=r.createCell(cIndex);
	        c.setCellValue(data);
		}
   }
   public static void toProperties(String fName,String key,String value,String comment)
   {
	   try
	   {
		      File f=new File("./ConfigData/"+fName+".properties");
			  FileInputStream fis=new FileInputStream(f);
			  FileOutputStream fos=new FileOutputStream(f,true); 
			  Properties prop=new Properties();
			  prop.load(fis);
			  prop.setProperty(key, value);
			  prop.store(fos, comment);
	   }
	   catch(Exception e)
	   {
		   
	   }
   }
}

