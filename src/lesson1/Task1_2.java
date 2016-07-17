package lesson1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1_2 {

public static void main(String[] args) throws  IOException {
	
	FileWriter writer = new FileWriter("c:/tmp/text.txt");
	for(int i= 0; i < 1000; i++){
	writer.write("Helllo!!");
	writer.write(System.lineSeparator());
	}
	
	
//	writer.flush();
//	writer.close();
}





}
