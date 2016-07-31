package lesson2;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork2_1 {

	public static void main(String[] args) throws IOException {
				
		PrintWriter writer = new PrintWriter("src/filesForTests/HomeWork2_1_out.txt");
		FileReader reader = new FileReader("src/filesForTests/HomeWork2_1_in.txt");
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()){
			String textLine = scan.nextLine();
			System.out.println(textLine);
			String reverseString = new StringBuffer(textLine).reverse().toString();
			System.out.println(reverseString);
			writer.write(reverseString);
			writer.write(System.lineSeparator());	
		}
		reader.close();
		writer.flush();
		writer.close();
	}
	
}
