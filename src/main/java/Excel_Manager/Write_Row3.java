package Excel_Manager;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import POJO.ReponsePayLoad2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Write_Row3 {


    private static String[] columns = {"id","name","job","createdAt"};
    private static List<ReponsePayLoad2> ReponsePayLoad2 =  new ArrayList<ReponsePayLoad2>();
    public static 	String path=System.getProperty("user.dir");
// Initializing employees data to insert into the excel file
   

	
   
  public static void Write_Excel(int k,String col1,String col2,String col3,String col4) throws IOException, InvalidFormatException {
        // Create a Workbook
 	
	  System.out.println(col1);
	  System.out.println(col2);
	  System.out.println(col3);
	  System.out.println(col4);

       Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

      
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Reports");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

    
     
        int rowNum = 1;
          Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(col1);

            row.createCell(1)
                    .setCellValue(col2);

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(col3);
        
            row.createCell(3)
                    .setCellValue(col4);
            
      
         // Resize all columns to fit the content size
            for(int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }
        

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream(path+"\\src\\test\\resource\\output_Excell\\poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
      
    	System.out.println("Json Response Reports generated ");
    }
       
    }
