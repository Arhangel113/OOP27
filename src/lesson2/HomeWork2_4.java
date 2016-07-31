package lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2_4 {

	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter("src/filesForTests/HomeWork2_4_Result.txt");
		ArrayList<String> censorWords = readDictionary("src/filesForTests/HomeWork2_4_censorWords.txt", ",");
		FileReader reader = new FileReader("src/filesForTests/HomeWork2_4.txt");
		Scanner scan = new Scanner(reader);

		while(scan.hasNextLine()){
			String modifiedLine = null;
			String readTextLine = scan.nextLine();
			for(int i=0; i<censorWords.size();i++){
				if(readTextLine.contains(censorWords.get(i))){
					modifiedLine = readTextLine.replaceAll(censorWords.get(i), "[вырезано цензурой]");
					System.out.println(modifiedLine);
					writer.write(modifiedLine);
					writer.write(System.lineSeparator());
				}
			}
		}
		reader.close();
		writer.flush();
		writer.close();

		//deleteFile("E:/OOP27/src/filesForTests/HomeWork2_4.txt");
		//renameFile("E:/OOP27/src/filesForTests/HomeWork2_4_Result.txt","E:/OOP27/src/filesForTests/HomeWork2_4.txt");

	}

	public static ArrayList<String> readDictionary(String pathToFileDictionary, String separatorValue) throws IOException{
		ArrayList<String> censorWords = 	new ArrayList<String>();
		FileReader reader = new FileReader(pathToFileDictionary);
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()){
			String readTextLine = scan.nextLine();
			String [] buffCensorWords =	readTextLine.split(separatorValue);
			for(int i=0;i<buffCensorWords.length;i++){
				censorWords.add(buffCensorWords[i]);
			}
		}
		reader.close();
		return censorWords;
	}

	public static void deleteFile(String pathToFile){
		Path path = Paths.get(pathToFile);
		try {
			Files.delete(path);
		} catch (NoSuchFileException x) {
			System.err.format("%s: no such" + " file or directory%n", path);
		} catch (DirectoryNotEmptyException x) {
			System.err.format("%s not empty%n", path);
		} catch (IOException x) {
			// File permission problems are caught here.
			System.err.println(x);
		} 
	} 


	public static void renameFile(String PathToFileForRename, String pathTorenamedFile){
		File file = new File(PathToFileForRename);
		File newFile = new File(pathTorenamedFile);
		if(file.renameTo(newFile)){
			System.out.println("File rename successful");;
		}else{
			System.out.println("Alarm! File rename unsuccessful!!!");
		}
	}






}
