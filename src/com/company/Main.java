package com.company;

import java.util.Scanner;

//Minimum Element Challenge
public class Main {
 static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
		System.out.println("Enter a count: ");
		int count= scanner.nextInt();
		scanner.nextLine();

		int[] returnedArray = readIntegers(count);
		int returnedMin =findMin(returnedArray);
		System.out.println("min value = "+returnedMin);

    }
public static int[] readIntegers(int count){
    	int[] array = new int[count];
    	for (int i=0; i<array.length ; i++){
			System.out.println("Enter a number: ");
			int value = scanner.nextInt();
			scanner.nextLine();
			array[i]=value;
    	}

return array;
}
public static int findMin(int[] array){
    	int min = Integer.MAX_VALUE;
    	for (int i=0 ; i<array.length ; i++){
    		int value = array[i];

    		if (value <min){
    			min =value;
			}
		}
    	return min;
}

}
