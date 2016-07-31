package lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_4 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader(args[0]);
		FileWriter writer = new FileWriter(args[1]);
		int buffSize = 20;
		char [] buff = new char[buffSize];
		int count;
		while((count = reader.read(buff)) != -1){
			String part = new String(buff,0,count);
			writer.write(part);
		}
		writer.flush();
		writer.close();	
	}
}
