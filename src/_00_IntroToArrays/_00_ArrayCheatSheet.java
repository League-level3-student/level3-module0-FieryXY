package _00_IntroToArrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArr = {"Bob","Joe","Robert","Cube Guy", "Super Dog"};
		//2. print the third element in the array
			System.out.println(stringArr[2]);
		//3. set the third element to a different value
			stringArr[2] = "Robert the Repairman";
		//4. print the third element again
			System.out.println(stringArr[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
			for(int i = 0; i < stringArr.length; i++) {
				stringArr[i] = "You have been hacked";
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		//7. make an array of 50 integers
			int[] intArr = new int[50];
		//8. use a for loop to make every value of the integer array a random number
			Random random = new Random();
			for(int l = 0; l < intArr.length; l++) {
				intArr[l] = random.nextInt(71);
			}
		//9. without printing the entire array, print only the smallest number on the array
			int smallest = intArr[0];
			int largest = intArr[0];
			for(int i = 0; i < intArr.length; i++) {
				if(intArr[i] < smallest) {
					smallest = intArr[i];
				}
				if(intArr[i] > largest) {
					largest = intArr[i];
				}
			}
			System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
			for(int i = 0; i < intArr.length; i++) {
				System.out.println(intArr[i]);
			}
		//11. print the largest number in the array.
			System.out.println(largest);
		//12. print only the last element in the array
			System.out.println(intArr.length-1);
		//Alternative Way to find smallest and largest
			Arrays.sort(intArr);
			System.out.println("Smallest: "+intArr[0]);
			System.out.println("Largest: "+intArr[intArr.length-1]);
	}
}
