package TestRun;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Config_manager.FileReadManager;
import Excel_Manager.ReadBasicExcel2;
import Excel_Manager.extractJson;
import Utils_Manager.FileOperation;
import Utils_Manager.GetTime;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class TestRunner {

	    public static 	String path=System.getProperty("user.dir");

	    

	  @BeforeTest
	    public void startReport() throws Throwable {
	    	
		  ReadBasicExcel2.generate_JSON();
		  
	    }
	     

	
	@Test
		public  void TestRun() throws Throwable {
		

		   String endpoint = FileReadManager.getInstance().getCr().getEndpoint();
			int count = FileOperation.getRequestCount();
			if(count==0)
			{
				
				System.err.println("Request_Json File not Found Count:"+count);
				Assert.assertFalse(true);
			}else {
			for (int i = 0; i < count; i++) {
				
				
		 
		    File requestfile=new File(path+"\\src\\test\\resource\\Request_Json\\"+i+".json");
		    
		   
		    HttpClient client=HttpClientBuilder.create().build();
			
			HttpPost post=new HttpPost(endpoint);
			
			post.setEntity(new InputStreamEntity(new FileInputStream(requestfile)));

			//post.setHeader("Content-Type","text/xml");
			post.setHeader("Content-Type","application/json");
			HttpResponse reponse=client.execute(post);
			
			
			int statusCode = reponse.getStatusLine().getStatusCode();
		
			if(statusCode > 201 )
			{
				String failedXML=path+"\\src\\test\\resource\\Failed_Json\\Reponse"+i+".json";
			
				System.err.print("["+i+".json ]"+GetTime.getCurrentTime()+ " STATUS :"+statusCode+" FAIL");	
				
				
			FileOperation.moveFailedXML(requestfile,i);
		System.out.println(requestfile);  
		
			}else if (statusCode == 200 || statusCode ==201 ) {
	
			
				System.out.println("["+i+".json ] "+GetTime.getCurrentTime() +" STATUS :" +statusCode+ " PASS");
						}
		

			
			BufferedReader br=new BufferedReader(new InputStreamReader(reponse.getEntity().getContent()));
			String line=" ";
			
			StringBuffer sb=new StringBuffer();
			
			while((line=br.readLine())!=null)
			{
				sb.append( line);
			}
			PrintWriter pw=new PrintWriter(path+"\\src\\test\\resource\\Response_Json\\reponse"+i+".json");
			pw.write(sb.toString());
			pw.close();
			pw.flush();
			 
		        
		      
		
	}}

		
	

	}
	

	  @BeforeTest
	    public void ENDReport() throws Throwable {
	    	
		 System.out.println("Generating Excel Reports ");
		 
		
	    }
	
	     
	  
	}
