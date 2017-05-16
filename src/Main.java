import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){ 
		//Open book text file
		OpenFile openBook = new OpenFile("D:\\Documents\\JavaProjects\\BookCipher\\src\\sherlock.txt");
		openBook.readFile();
		
		ArrayList<String>list = new ArrayList<String>();
		list = openBook.getList();
		
		int MAX = 7018;
		int startPoint = 11 + (int)(Math.random()*7008);
		int minPoint = startPoint - 5;
		int endPoint = startPoint + 5;
		
		String encryptedCode = "";
		
		String sample = "";
		
		for(int i = minPoint; i < endPoint; i++){
			sample += list.get(i);
		}
		
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a secret word/message to encrypt: ");
		String secretWord = reader.nextLine();
		
		String paragraph = "";
		for(String word : sample.split("     ")) {
		    paragraph += word;
		}
		
		ArrayList<String> wordArrayList = new ArrayList<String>();
		for(String word : paragraph.split(" ")) {
		    wordArrayList.add(word);
		}
		
		for(char c : secretWord.toCharArray()) {
		    // process c
			for(int i = 0; i<wordArrayList.size();i++){
				if(wordArrayList.get(i).charAt(0) == c){
					encryptedCode += i;
					break;
				} else {
					encryptedCode += "";
				}
			}	
		}
		
		System.out.println(encryptedCode);
		
		for(int i = 0; i<wordArrayList.size();i++){
			//System.out.println(wordArrayList.get(i));
		}
	}
}
