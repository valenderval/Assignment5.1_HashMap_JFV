
import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		/**
		Dictionary d = new Dictionary();
		d.loadDictionary();
	
		System.out.print(d.searchDictionary("appetency"));
		
		d.printDictionary();
		
		**/
		MapDictionary d2 = new MapDictionary();
		d2.loadDictionary();
		
		
		
		d2.printDictionary();
		
		System.out.println(d2.searchDictionary("appetency"));
		
		
	}//end main

}//end class