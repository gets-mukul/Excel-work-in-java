package org.excelFile.com;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class CreateWorkBook {
   public static void main(String[] args)throws Exception {
      
      XSSFWorkbook workbook = new XSSFWorkbook(); //creates XSSF object which use to create file with .xlsx extentions
      FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));//creates file with name ....
      workbook.write(out);
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
}