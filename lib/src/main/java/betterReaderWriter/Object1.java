package betterReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****
 * 
 * <b>Title:</b> Object1.java<br>
 * <b>Project:</b> betterReaderWriter-lib<br>
 * <b>Description:</b>This class has a constructor that accepts a file name as
 * an argument. It includes a method to read in a file and a method to write to
 * a file.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 13 2023
 * @updates:
 ****/

public class Object1 {

	private String textFromFile;
	private String fileName;

	/**
	 * Class constructor which requires a string to be passed in upon declaration
	 * 
	 * @param fileName
	 */
	public Object1(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Method that reads from a text file and builds a string with the data from the
	 * stream
	 * 
	 * @throws IOException
	 */
	public void readInFile() throws IOException {
		StringBuilder build = new StringBuilder();
		File inputFile = new File(getFileName());
		FileReader reader = new FileReader(inputFile);
		int c;
		while ((c = reader.read()) != -1) {
			build.append((char) c);
		}
		reader.close();
		textFromFile = build.toString();
	}

	/**
	 * Method that writes text to a new file and saves it to the resources folder
	 * 
	 * @param text
	 * @param file
	 * @throws IOException
	 */

	public void writeToFile(String text, String file) throws IOException {
		File outputFile = new File(file);
		FileWriter writer = new FileWriter(outputFile);
		writer.write(text);
		writer.close();
	}

	/**
	 * Gets the value for the fileName variable
	 * 
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Gets the value for the textFromFile variable
	 * 
	 * @return the textFromFile
	 */
	public String getTextFromFile() {
		return textFromFile;
	}
}