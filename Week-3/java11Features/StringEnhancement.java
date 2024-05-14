package java11Features;

import java.util.List;
import java.util.stream.Collectors;

public class StringEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   Wel\rcome   ";
		String str1 = "   Hel\nlo   ";
		
		List<String> res1 = str.lines().collect(Collectors.toList());
		
		List<String> res2 = str1.lines().collect(Collectors.toList());
		
		System.out.println(res1);
		System.out.println(res2);
		
		String str2 = "      Soumya     ";
		String str3 = "     Shruthi    ";
		System.out.println(":"+str2.stripLeading()+":");
		System.out.println(":"+str3.stripTrailing()+":");
		System.out.println(":"+str2.strip()+":");
		System.out.println(str3.repeat(10));
	}

}
