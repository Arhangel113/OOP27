package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("test.txt");
		
		Scanner scan = new Scanner(reader);
		
		while(scan.hasNextLine()){
		System.out.println(scan.nextLine());	
		}
		
		
	}




}
