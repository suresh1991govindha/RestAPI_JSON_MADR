package Excel_Manager;

import java.io.File;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Request_PayLoad;
import POJO.PayLoad2;


public class ReadBasicExcel2 {
	public static String path=System.getProperty("user.dir");
	
	@Test
	public static void generate_JSON() throws Throwable {

		ArrayList<PayLoad2> a=new ArrayList<PayLoad2>();
		PayLoad2 c=new PayLoad2(); 
		
		ArrayList<String> column1 = Read_Column.getColumn1();
		ArrayList<String> column2 = Read_Column.getColumn2();
	
		for (int i = 0; i < column1.size(); i++) {
			
			
			
	
			c.setJob(column2.get(i));
			c.setName(column1.get(i));
			
			a.add(c);
			
			
		}

		for(int i=0;i<a.size();i++)
		{
			ObjectMapper o=new ObjectMapper();
			o.writeValue(new File(path+"\\src\\test\\resource\\Request_Json\\"+i+".json"),a.get(i));

		}

		System.out.println("json ");
		
		
		
	}}