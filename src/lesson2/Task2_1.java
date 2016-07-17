package lesson2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2_1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter writer = new PrintWriter("test.txt");
		
		for(int i=0; i<10;i++){
			writer.println("Hello "+i);
		}
		writer.flush();
		writer.close();
	}

}
