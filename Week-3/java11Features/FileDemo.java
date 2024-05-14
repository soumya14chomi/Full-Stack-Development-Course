package java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		var path = "C:\\Users\\Raviteja Namani\\OneDrive\\Pictures\\Sample.txt";
		Files.writeString(Path.of(path), "Text Added Successfully", StandardOpenOption.CREATE);
		String readFile = Files.readString(Path.of(path));
		System.out.println(readFile);
	}

}
