package betterReaderWriter;

import java.io.IOException;

/****
 * 
 * <b>Title:</b> Object2.java<br>
 * <b>Project:</b> betterReaderWriter-lib<br>
 * <b>Description:</b>This class serves to instantiate Object1, reads the data
 * from TextFile1, converts it to uppercase, and writes out a new file.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 13 2023
 * @updates:
 ****/

public class Object2 {

	/**
	 * Main method which executes the createNewFile procedure
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Object2 exe = new Object2();
		exe.createNewFile();
	}

	/**
	 * Method that follows the procedure to read from a data stream, convert the
	 * information to a string written in uppercase, and writes out a new file
	 * 
	 * @throws IOException
	 */

	public void createNewFile() throws IOException {
		Object1 one = new Object1(".//src//main//resources//TextFile1.txt");
		one.readInFile();
		one.writeToFile(one.getTextFromFile().toUpperCase(), ".//src//main//resources//TextFile2.txt");
	}
}
