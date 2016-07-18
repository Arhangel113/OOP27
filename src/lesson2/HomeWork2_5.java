package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

public class HomeWork2_5 {

	public static void main(String[] args) throws IOException {
		System.out.println("Give me the word, my MASTER!");
		String searchWord = readLine();
		FileReader reader = new FileReader("src/filesForTests/HomeWork2_5_in.txt");
		Scanner scan = new Scanner(reader);
		int lineCount = 0;
		int totalWordCount = 0;
		while(scan.hasNextLine()){
			lineCount++;
			String textLine = scan.nextLine();
			if(textLine.indexOf(searchWord) != -1){
				String [] wordLine = textLine.split(" ");
				for(int i=0;i<wordLine.length;i++){
					if(wordLine[i].equals(searchWord)){
						totalWordCount++;
						int correctWordNum = i+1;
						System.out.println("String number for word "+searchWord+" is: "+lineCount);
						System.out.println("Word number in string is " +correctWordNum);
					}
				}
			}
			
		}
		reader.close();
		System.out.println("Total word count: "+totalWordCount);
	}

	
    public static String readLine() {
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            return new String();
        }
    }
	

}
