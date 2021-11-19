package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class ReadPropertyFile {

	Properties prob = null;
	ArrayList<String> d=null;
	
	
    //  WE WILL ESTABLISH CONNECTION BTW PROB OBJECT AND PROPERTY FILE TO READ DATA FROM FILE.
   public ReadPropertyFile()
	{
	  prob = new Properties(); 
	  
	  try
	  {
	    FileInputStream fis = new FileInputStream(".//resources//config.properties");
	    prob.load(fis);
	  }
	  catch(FileNotFoundException e)
	  {
		  System.out.println(e.getMessage());
	  }
      catch(IOException e)
	  {
    	  System.out.println(e.getMessage());
	  }
	}
	
   
   public String getUrl() throws Exception
   {
	   String url = prob.getProperty("url");
	   if(url==null)
		   throw new Exception("url not found in property file"); 
	   
	   return url;
   }
	
   public String getUserName() throws Exception
   {
	   
	   String username = prob.getProperty("username");
	   if(username==null)
		   throw new Exception("username not found in property file"); 
	   
	   return username;
   }
   
   public String getPassword() throws Exception
   {
	   String pass =  prob.getProperty("password");
	   if(pass==null)
		   throw new Exception("password not found in property file"); 
	   
	   return pass;
   }
   
   public String getDriverPath() throws Exception
   {
	   String path =  prob.getProperty("chromedriverpath");
	   if(path==null)
		   throw new Exception("password not found in property file"); 
	   
	   return path;
   }
   
   public String getBrowser() throws Exception
   {
	   String browser =  prob.getProperty("browser");
	   if(browser==null)
		   throw new Exception("browser not found in property file"); 
	   
	   return browser;
   } 
   
   
   
   public String getExcelSheetPath()
   {
	   String path =  prob.getProperty("excelsheetpath");
	   
	   return path;
   }
   
   
   public String getName() throws IOException {
	   d = RetreiveExcelData.getData("Name");
	   return d.get(1);
   }
   
   public String getEmail() throws IOException {
	   d = RetreiveExcelData.getData("Email");
	   return d.get(1);
   }
   
   public String getMessage() throws IOException {
	   d = RetreiveExcelData.getData("Message");
	   return d.get(1);
   }
   
}
