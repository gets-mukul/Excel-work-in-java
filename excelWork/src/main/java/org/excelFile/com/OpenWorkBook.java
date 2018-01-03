package org.excelFile.com;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class OpenWorkBook {
   public static void main(String args[])throws Exception { 
      File file = new File("createworkbook.xlsx");
      FileInputStream fIP = new FileInputStream(file);//used to read character from file
      
      XSSFWorkbook workbook = new XSSFWorkbook(fIP);
      
      if(file.isFile() && file.exists()) {
         System.out.println("createworkbook.xlsx file open successfully.");
      } else {
         System.out.println("Error to open createworkbook.xlsx file.");
   
      }
      System.out.println(new File("createworkbook.xlsx").getAbsolutePath());
   }
   
   
}