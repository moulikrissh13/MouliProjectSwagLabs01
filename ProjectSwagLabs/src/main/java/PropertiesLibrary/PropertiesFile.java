package PropertiesLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public  FileInputStream fis;
	public  Properties props;
	
	public  String readData(String key){
		//1.
		 try {
			fis = new FileInputStream("./src/test/resources/CommonData.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 
		
		//2.
		 try {
			props = new Properties();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//3.
		try {
			props.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//4.
		String value = props.getProperty(key);
		return value;
		
		
		
		
	}
}
