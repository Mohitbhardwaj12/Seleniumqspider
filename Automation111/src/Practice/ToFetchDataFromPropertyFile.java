package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {


		FileInputStream fis = new FileInputStream("./testData/propertyData2.properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		System.out.println(url);
		String username = property.getProperty("username");
		System.out.println("username");
		String password = property.getProperty("password");
		System.out.println(password);
	}

}
