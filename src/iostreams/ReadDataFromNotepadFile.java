package iostreams;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFromNotepadFile {

	public static void main(String[] args) throws Exception {
		
		File nopadFile = new File("C:\\Users\\RAJU CHELLE\\Desktop\\Input.txt");
		FileInputStream fis = new FileInputStream(nopadFile);
		
		System.out.println(fis.available());
		
		byte[] sreamByteArr = new byte[fis.available()];
		fis.read(sreamByteArr);
		
		System.out.println(sreamByteArr.length);
		
		String fileContent = new String(sreamByteArr);
		
		System.out.println(fileContent);
		
	}

}
