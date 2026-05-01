/*
File: Lesson 5.1 - Introduction to Arrays
Author: Stephen Li
Date Created: April 20, 2026
Date Last Modified: April 27, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static int[] createIntArray() {
	    int[] array = new int[5];
	    for (int i = 0; i < 5; i++) {
	        array[i] = i + 1;
	        System.out.print(array[i] + " ");
	    }
	    return array;
	}
	
	public static String[] createArray(String word1, String word2, String word3, String word4) {
	    String[] array = {word1, word2, word3, word4};
	    return array;
	}
	
	public static String getElement(int num1, String[] array) {
	    return array[num1];
	}
	
	public static double[] replaceElement(int num1, double double1, double[] array) {
	    array[num1] = double1;
		return array;
	}
}