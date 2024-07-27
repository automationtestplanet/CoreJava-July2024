package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToPropertiesFIle {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\RAJU CHELLE\\Desktop\\Test.properties"));		
		Properties testProperties = new Properties();		
		testProperties.load(fis);		
		testProperties.setProperty("Age", "30");
		
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\RAJU CHELLE\\Desktop\\Test.properties"));
		testProperties.store(fos, "This chnage is done by Raju Chelle");
		fos.close();
	}

}
