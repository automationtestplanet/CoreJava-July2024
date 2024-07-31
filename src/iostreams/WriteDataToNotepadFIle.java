package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteDataToNotepadFIle {

	public static String readDataFromNotepad(String fileInputPath) throws Exception {
		File inputFile = new File(fileInputPath);
		FileInputStream fis = new FileInputStream(inputFile);
		byte[] sreamByteArr = new byte[fis.available()];
		fis.read(sreamByteArr);
		String fileContent = new String(sreamByteArr);
		return fileContent;
	}

	public static void writeDataToNotepad(String outputFilePath, String outputData) throws Exception {
		File outputFile = new File(outputFilePath);
		FileOutputStream fos = new FileOutputStream(outputFile);
		byte[] ouputStream = outputData.getBytes();
		fos.write(ouputStream);
	}

	public static void main(String[] args) throws Exception {

//		File nopadFile = new File("C:\\Users\\RAJU CHELLE\\Desktop\\Input.txt");
//		FileInputStream fis = new FileInputStream(nopadFile);
//
//		System.out.println(fis.available());
//
//		byte[] sreamByteArr = new byte[fis.available()];
//		fis.read(sreamByteArr);
//
//		System.out.println(sreamByteArr.length);
//
//		String fileContent = new String(sreamByteArr);
//
//		System.out.println(fileContent);
//
//		String outputData = fileContent.substring(0, 12);
//		System.out.println(outputData);
//
//		byte[] ouputStream = outputData.getBytes();
//
//		File outputFile = new File("C:\\Users\\RAJU CHELLE\\Desktop\\Output.txt");
//		FileOutputStream fos = new FileOutputStream(outputFile);
//		fos.write(ouputStream);
		
		String fileContent = readDataFromNotepad("C:\\Users\\RAJU CHELLE\\Desktop\\Input.txt");
		System.out.println(fileContent);
		
		String outputData = fileContent.substring(0, 12);
		
		writeDataToNotepad("C:\\Users\\RAJU CHELLE\\Desktop\\Output.txt", outputData);

	}

}
