/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;


//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author iaw26509397
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		
		list.remove("Charlie");
		
		Collections.sort(list);
		
		for (String string: list) {
			System.out.println(string);
		}
		
		

	}

}
