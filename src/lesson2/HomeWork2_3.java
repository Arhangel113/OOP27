package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork2_3 {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter("src/filesForTests/HomeWork2_3_out.txt");
		FileReader reader = new FileReader("src/filesForTests/HomeWork2_3_in.txt");
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()){
			String resultString = ""; 
			String textLine = scan.nextLine();
			System.out.println(textLine);
			for (int i = 0; i < textLine.length(); i++) {
				char symbol = textLine.charAt(i);
				if (Character.isUpperCase(symbol)){
					resultString += Character.toLowerCase(symbol);
				}else{
					if(Character.isLowerCase(symbol)){
						resultString += Character.toUpperCase(symbol);;	
					}else{
						resultString += symbol;	
					}
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
