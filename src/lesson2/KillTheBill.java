package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KillTheBill {

	public static void main(String[] args) throws IOException {
		String resultString = ""; 
		PrintWriter writer = new PrintWriter("test2.txt");
		FileReader reader = new FileReader("test.txt");
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()){
			String textLine = scan.nextLine();
			System.out.println(textLine);
			for (int i = 0; i < textLine.length(); i++) {
				char symbol = textLine.charAt(i);
				if (Character.isUpperCase(symbol)) {
					resultString += symbol;
					//System.out.println(resultString);
				}
			}
			writer.write(resultString);
			writer.write(System.lineSeparator());	
		}
		reader.close();
		writer.flush();
		writer.close();
	}



}
