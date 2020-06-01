package Excel_Manager;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Request_PayLoad;


public class ReadBasicExcel {
	public static 	String path=System.getProperty("user.dir");
	public static void main(String[] args) throws Throwable {
		
		ArrayList<Request_PayLoad> a=new ArrayList<Request_PayLoad>();
		Request_PayLoad c=new Request_PayLoad(); 
		
		ArrayList<String> column1 = Read_Column.getColumn1();
		ArrayList<String> column2 = Read_Column.getColumn2();
		ArrayList<String> column3 = Read_Column.getColumn3();
		ArrayList<String> column4 = Read_Column.getColumn4();
		
		
		for (int i = 0; i < column1.size(); i++) {
			
			
			
			c.setTransaction_ID(column1.get(i));
			c.setTransaction_Time(column2.get(i));
			c.setNote(column3.get(i));
			
			a.add(c);
			
			
		}

		for(int i=0;i<a.size();i++)
		{
			ObjectMapper o=new ObjectMapper();
			o.writeValue(new File(path+"\\src\\test\\resource\\Request_Json\\"+i+".json"),a.get(i));

		}

		System.out.println("json ");
		
		
		
	}}