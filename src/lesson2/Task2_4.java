package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//for(int i=0; i < args.length; i++){
		//	System.out.println(args[i]);
	//}
		
		String FileForCopy = args[0];
		String FileToCopy = args[1];
			
		FileReader reader = new FileReader(args[0]);
		FileWriter writer = new FileWriter(args[1]);
		int buffSize = 20;
		char [] buff = new char[buffSize];
		
		int count;
		String result = "";
		while((count = reader.read(buff)) != -1){
			String part = new String(buff,0,count);
			writer.write(part);
			//result += part;
			}
		//System.out.print(result);
			
		writer.flush();
		writer.close();	
		
	}

}
