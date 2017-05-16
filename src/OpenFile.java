import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OpenFile {//This class opens the text file and puts every line into an array
	private String fileName;
	private ArrayList<String> list = new ArrayList<String>();
	private String textBook="";

	public OpenFile(String fileName){
		this.fileName = fileName;
	}
	
	public void readFile(){
		File file = new File(fileName);
		BufferedReader reader = null;
		
		try{
			reader = new  BufferedReader(new FileReader(file));
			String text = null;
			while((text = reader.readLine()) != null){
				list.add(text);
				//textBook += text;
				//System.out.println(text);
			}			
		} catch(IOException e){
		    e.printStackTrace();
		    System.out.println("Unsuccessful file read");
		}
	}
	
	public ArrayList getList(){
		return list;
	}
	
	public String getTextString(){
		return textBook;
	}
}
