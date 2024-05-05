package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		try {
			Thread.sleep(0);
			System.out.println("Complete");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File("abc.txt");
		try {
			FileWriter fw = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName("ChildClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
