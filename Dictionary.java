
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private HashMap<Integer,String> dictionary; 
	
	public Dictionary() {
		dictionary = new HashMap<Integer, String>();
	}//end constructor
	
	public void loadDictionary() throws FileNotFoundException {
			Scanner sc = new Scanner(new File("DictionaryWordValuePairs.txt"));
			
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split("\t");
				//System.out.println(data[0] + ", " + data[1]);
				dictionary.put(data[0].hashCode(), data[1]);
		}
		sc.close();	
	}//end loadFile
	
	public String searchDictionary(String key){
		
		return dictionary.get(key.hashCode());	
	}//end search dictionary
	
	public void printDictionary(){

		for(Map.Entry<Integer, String> entry : dictionary.entrySet()) {
			System.out.println( entry.getKey() + " => " + ": " + entry.getValue() );
		}
	}	//end printDictionary
}//end class

