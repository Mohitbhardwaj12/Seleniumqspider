package genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	
	public String fetchDataFromPropertyFiles(String key) throws IOException{
		  FileInputStream fis = new FileInputStream("./testData/propertyData2.properties");  
	        
	        Properties property = new Properties();
	        property.load(fis);
	       return property.getProperty(key);
	     
	       
	}
	
	

}
