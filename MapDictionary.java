import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class MapDictionary {
	
	private TreeMap<String,String> dictionary;
	
	public MapDictionary(){
		dictionary = new TreeMap<String,String>();
	}//end mapDictionary
	
	public void loadDictionary() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DictionaryWordValuePairs.txt"));
		
		while(sc.hasNextLine()){
			String data[] = sc.nextLine().split("\t");
			//System.out.println(data[0] + ", " + data[1]);
			dictionary.put(data[0], data[1]);
			
	}
	sc.close();	
}//end loadFile
	
	
public String searchDictionary(String key){
		
		return dictionary.get(key);	
	}//end searchDictionary
	
	public void printDictionary(){

		for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println( entry.getKey() + " => " + ": " + entry.getValue() );
		}
	}//end printDictionary
	
}//end class
