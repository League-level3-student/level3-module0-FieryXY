package _03_More_Array_Fun;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	Random random = new Random();
	
	public static void main(String[] args) {
		String[] thing =  {"asdf", "adsf", "wet", "123"};
		MoreArrayFun mf = new MoreArrayFun();
		mf.printAllRandom(thing);
		mf.printAll(thing);
		mf.printAllReverse(thing);
		mf.printAlternate(thing);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printAll(String[] arr) {
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printAllReverse(String[] arr) {       
		for(int j = arr.length-1; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printAlternate(String[] arr) {
		for(int j = 0; j < arr.length; j = j+2) {
			System.out.println(arr[j]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	

	
	void printAllRandom(String[] arr) {
		ArrayList<Integer> usedKeys = new ArrayList<Integer>();
		
		boolean done = false;
		int randKey = 0;
		for(int j = 0; j < arr.length; j++) {
			done = false;
			while(done == false) {
				randKey = random.nextInt(arr.length);
				if(usedKeys.contains(randKey)) {
					//Do Nothing
				}
				else {
					usedKeys.add(randKey);
					done = true;
				}
			}
			System.out.println(arr[randKey]);
		}
		
	}
}
