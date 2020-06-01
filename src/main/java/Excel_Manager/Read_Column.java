package Excel_Manager;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Config_manager.FileReadManager;

	public class Read_Column   {
		
		
	
		
		public static ArrayList<String> getColumn1() throws Throwable
	{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
	//HashMap< Integer,String> map=new HashMap<Integer, String>();
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			  String column1 = FileReadManager.getInstance().getCr().getColumn1();
			String column_name ="DosageFormType";
		
		ArrayList<String> list=new ArrayList<String>();
		
	File file=new File(excellpath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
		int numberOfSheets = workbook.getNumberOfSheets();
		
		for (int i = 0; i < numberOfSheets; i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
			{
			XSSFSheet sheetAt = workbook.getSheetAt(i);
		
			Iterator<Row> rows = sheetAt.iterator();
			
			Row next =  rows.next();
			
			Iterator<Cell> cellIterator = next.cellIterator();
			
			int k=0;
			int column=0;
			
			while(cellIterator.hasNext())
			{
				Cell cellvalue = cellIterator.next();
			
				 if(cellvalue.getStringCellValue().equalsIgnoreCase(column1))
				 {
			
				    
					 column=k;
					// System.out.println(column);
				 }
			k++;
			}
			
			while(rows.hasNext())
			{
				Row r = rows.next();
				if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
				{
				
			String stringCellValue = r.getCell(column).getStringCellValue();
			//System.out.println(stringCellValue);
			list.add(stringCellValue);
			}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
			{
				RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
				list.add(" ");
				//System.out.println("blank"+richStringCellValue);
				
			}else {

				 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
				 list.add(String.valueOf(numericCellValue));
				// System.out.println(numericCellValue);
				 
				 
			}
			}
			
			}}
		return list;}
	public static ArrayList<String> getColumn2( ) throws Throwable
	{
		  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
		  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
		  String column2 = FileReadManager.getInstance().getCr().getColumn2();
		  //HashMap< Integer,String> map=new HashMap<Integer, String>();
		
		String column_name="DrugDefaultSig";
		ArrayList<String> list=new ArrayList<String>();
		
	File file=new File(excellpath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
		int numberOfSheets = workbook.getNumberOfSheets();
		
		for (int i = 0; i < numberOfSheets; i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
			{
			XSSFSheet sheetAt = workbook.getSheetAt(i);
		
			Iterator<Row> rows = sheetAt.iterator();
			
			Row next =  rows.next();
			
			Iterator<Cell> cellIterator = next.cellIterator();
			
			int k=0;
			int column=0;
			
			while(cellIterator.hasNext())
			{
				Cell cellvalue = cellIterator.next();
			
				 if(cellvalue.getStringCellValue().equalsIgnoreCase(column2))
				 {
			
				    
					 column=k;
					// System.out.println(column);
				 }
			k++;
			}
			
			while(rows.hasNext())
			{
				Row r = rows.next();
				if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
				{
				
			String stringCellValue = r.getCell(column).getStringCellValue();
			//System.out.println(stringCellValue);
			list.add(stringCellValue);
			}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
			{
				RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
				list.add(" ");
				//System.out.println("blank"+richStringCellValue);
				
			}else {

				 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
				 list.add(String.valueOf(numericCellValue));
				// System.out.println(numericCellValue);
				 
				 
			}
			}
			
			}}
		return list;}
	
		
		public static ArrayList<String> getColumn3() throws Throwable
		{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
			  String column3 = FileReadManager.getInstance().getCr().getColumn3();
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			  //HashMap< Integer,String> map=new HashMap<Integer, String>();
			
			String column_name ="DrugStrength";
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column3))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
				//System.out.println(stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
					// System.out.println(numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}
		
		public static ArrayList<String> getColumn4() throws Throwable
			{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
			
			  String column4 = FileReadManager.getInstance().getCr().getColumn4();
			  //HashMap< Integer,String> map=new HashMap<Integer, String>();
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			  String column_name ="DrugStrengthUOM";
					
					ArrayList<String> list=new ArrayList<String>();
					
				File file=new File(excellpath);
					FileInputStream fis=new FileInputStream(file);
					XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
					int numberOfSheets = workbook.getNumberOfSheets();
					
					for (int i = 0; i < numberOfSheets; i++) {
						
						if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
						{
						XSSFSheet sheetAt = workbook.getSheetAt(i);
					
						Iterator<Row> rows = sheetAt.iterator();
						
						Row next =  rows.next();
						
						Iterator<Cell> cellIterator = next.cellIterator();
						
						int k=0;
						int column=0;
						
						while(cellIterator.hasNext())
						{
							Cell cellvalue = cellIterator.next();
						
							 if(cellvalue.getStringCellValue().equalsIgnoreCase(column4))
							 {
						
							    
								 column=k;
								// System.out.println(column);
							 }
						k++;
						}
						
						while(rows.hasNext())
						{
							Row r = rows.next();
							if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
							{
							
						String stringCellValue = r.getCell(column).getStringCellValue();
						//System.out.println(stringCellValue);
						list.add(stringCellValue);
						}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
						{
							RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
							list.add(" ");
							//System.out.println("blank"+richStringCellValue);
							
						}else {

							 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
							 list.add(String.valueOf(numericCellValue));
							// System.out.println(numericCellValue);
							 
							 
						}
						}
						
						}}
					return list;}
		
		
		public static ArrayList<String> getColumn5() throws Throwable
		{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
		//HashMap< Integer,String> map=new HashMap<Integer, String>();
			
			  String column5 = FileReadManager.getInstance().getCr().getColumn5();
			//  String column_name ="GPI";
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column5))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING )
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
			//	System.out.println("getColumn5"+stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
				//	 System.out.println("getColumn5"+numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}

		public static ArrayList<String> getColumn6() throws Throwable
		{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
		//HashMap< Integer,String> map=new HashMap<Integer, String>();
		
			  String column6 = FileReadManager.getInstance().getCr().getColumn6();
			  String column_name="NDC";
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column6))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
			///	System.out.println("getColumn6"+stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
			//		System.out.println("getColumn6"+numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}
		
		public static ArrayList<String> getColumn7() throws Throwable
		{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
		//HashMap< Integer,String> map=new HashMap<Integer, String>();
			
			  String column7 = FileReadManager.getInstance().getCr().getColumn7();
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			//String column_name="RouteOfAdminCodedVal";
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column7))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
				//System.out.println(stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
					// System.out.println(numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}
	
		public static ArrayList<String> getColumn8( ) throws Throwable
		{ 
			String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
		//HashMap< Integer,String> map=new HashMap<Integer, String>();
			
			  String column8 = FileReadManager.getInstance().getCr().getColumn8();
			  String column_name="SingleActiveIngredientInd";
			
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column8))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
				//System.out.println(stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
					// System.out.println(numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}
	
	
		public static ArrayList<String> getColumn9() throws Throwable
		{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
		//HashMap< Integer,String> map=new HashMap<Integer, String>();
			  String column9 = FileReadManager.getInstance().getCr().getColumn9();
			  String column_name ="DrugClassType";
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column9))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
				//System.out.println(stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
					// System.out.println(numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}
	
		public static ArrayList<String> getColumn10() throws Throwable
		{
			  String excellpath = FileReadManager.getInstance().getCr().getExcellpath();
		//HashMap< Integer,String> map=new HashMap<Integer, String>();
			  String column10 = FileReadManager.getInstance().getCr().getColumn10();
			  String column_name ="DrugClassType";
			  String getsheetname = FileReadManager.getInstance().getCr().getsheetname();
			ArrayList<String> list=new ArrayList<String>();
			
		File file=new File(excellpath);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				
				if(workbook.getSheetName(i).equalsIgnoreCase(getsheetname))
				{
				XSSFSheet sheetAt = workbook.getSheetAt(i);
			
				Iterator<Row> rows = sheetAt.iterator();
				
				Row next =  rows.next();
				
				Iterator<Cell> cellIterator = next.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellIterator.hasNext())
				{
					Cell cellvalue = cellIterator.next();
				
					 if(cellvalue.getStringCellValue().equalsIgnoreCase(column10))
					 {
				
					    
						 column=k;
						// System.out.println(column);
					 }
				k++;
				}
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getCellTypeEnum()==CellType.STRING)
					{
					
				String stringCellValue = r.getCell(column).getStringCellValue();
				//System.out.println(stringCellValue);
				list.add(stringCellValue);
				}else if(r.getCell(column).getCellTypeEnum()==CellType.BLANK)
				{
					RichTextString richStringCellValue = r.getCell(column).getRichStringCellValue();
					list.add(" ");
					//System.out.println("blank"+richStringCellValue);
					
				}else {

					 Long numericCellValue = (long) r.getCell(column).getNumericCellValue();
					 list.add(String.valueOf(numericCellValue));
					// System.out.println(numericCellValue);
					 
					 
				}
				}
				
				}}
			return list;}
	
	
	}
			