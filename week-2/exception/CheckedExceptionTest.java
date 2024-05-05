package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f);
		fw.close();		
		}catch(IOException e) {
			System.out.println("here");
		}
		System.out.println("After Catch");
	}

}
