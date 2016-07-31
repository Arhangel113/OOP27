package lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader("src/filesForTests/HomeWork2_4.txt");
		Scanner scan = new Scanner(reader);
		Scanner newScan = scan.useDelimiter(" ");
		newScan.next();
		  String str = "!!!! \"hello\", \"world\', \"hssergsergero\", world, hello, world";
		  
		  String res = str.replaceAll("\"([^\"']*)\"", "'$1'");
		  String res2 = str.replaceAll("(hello), (world)", "/$1/ .... $2");
		  
		
		
	}

}
