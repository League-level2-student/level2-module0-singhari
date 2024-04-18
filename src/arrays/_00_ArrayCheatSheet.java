package arrays;

import java.util.*;


public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] smth = {"bruh", "double bruh", "quad bruh", "16th bruh", "32nd bruh"};
		//2. print the third element in the array
		System.out.println(smth[2]);
		//3. set the third element to a different value
		smth[2] = "four bruhs later";
		//4. print the third element again
		System.out.println(smth[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		int len = smth.length;
		for(int i = 0; i < len; i++) {
			System.out.println(smth[i]);
		}
		
		//6. make an array of 50 integers
		int lengh = 5;
		int[] rnum = new int[lengh];
		int min = 30;
		int max = 0;
		Random ran = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for(int j = 0; j < lengh; j++) {
			int rn = ran.nextInt(20);
			rnum[j] = rn;
			if(j != 0) {
				if(rnum[j] < rnum[j-1]) {
					if(min > rn) {
					min = rn;
					}
				}
				else if(rnum[j] > rnum[j-1]){
					if(max < rn) {
						max = rn;
					}
				}
			}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(min);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(rnum));
		//10. print the largest number in the array.
		System.out.println(max);
	}
}
