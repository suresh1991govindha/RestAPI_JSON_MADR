package Excel_Manager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.ReponsePayLoad2;
import Utils_Manager.FileOperation;

public class extractJson {
	 public static 	String path=System.getProperty("user.dir");
	 
	 
	 @Test
	public static void generate_Reports() throws JsonParseException, JsonMappingException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub
	
			int count = FileOperation.getResponseCount();
			if(count==0)
			{
				
				System.err.println("Response_Json File not Found Count:"+count);
				Assert.assertFalse(true);
			}else {
			for (int i = 0; i < count; i++) {
				
		ObjectMapper o=new ObjectMapper();
		ReponsePayLoad2 c=o.readValue(new File(path+"\\src\\test\\resource\\Response_Json\\Reponse"+i+".json"), ReponsePayLoad2.class);
		
		
/*		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getJob());
		System.out.println(c.getCreatedAt());
		*/
	
		Write_Row3.Write_Excel(i,c.getId(),c.getName(),c.getJob(),c.getCreatedAt());

	}

}}}
