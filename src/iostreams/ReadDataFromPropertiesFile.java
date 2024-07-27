package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream(new File("C:\\Users\\RAJU CHELLE\\Desktop\\Test.properties"));		
		Properties testProperties = new Properties();		
		testProperties.load(fis);
		
		String name = testProperties.getProperty("name");
		System.out.println(name);
		
		System.out.println(testProperties.getProperty("qualification"));
		System.out.println(testProperties.getProperty("first.name"));
		System.out.println(testProperties.getProperty("last.name"));
		System.out.println(testProperties.getProperty("lsat.name"));
		

	}

}
