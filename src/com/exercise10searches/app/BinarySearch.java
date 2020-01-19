package com.exercise10searches.app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		//Constants declaration
		final int ELEMENTS_ARRAY = 10;
		
		//Variable declaration
		int numberToFind = 0;
		int indexFound = -1;
		int limInf = 0;
		int limSup = ELEMENTS_ARRAY - 1;
		int pivotal = 0;
		int temp = 0;
		
		//Array declaration
		int[] myArr = new int[ELEMENTS_ARRAY];
		
		//Objects declaration
		Random nRandom = new Random(System.nanoTime());
		Scanner kInput = new Scanner(System.in);
		
		//Random asignation
		for (int i = 0; i < ELEMENTS_ARRAY; i++) {
			myArr[i] = nRandom.nextInt(10);
		}
		
		System.out.println(Arrays.toString(myArr));
		
		do {
			System.out.println("Input the number to find inside of the array");
			numberToFind = kInput.nextInt();
			
			if (numberToFind < 0) {
				System.out.println("Number must be zero or positive value!");
			}
		} while (numberToFind < 0);
		
		//Sorting
		for (int i = 1; i < ELEMENTS_ARRAY; i++) {
			for (int x = i; x > 0; x--) {
				if(myArr[x] < myArr[x - 1]) {
					temp = myArr[x];
					myArr[x] = myArr[x - 1];
					myArr[x - 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(myArr));
		
		//Binary search
		while (limInf < limSup) {
			 pivotal = (limInf + limSup) / 2;
			 
			 if (numberToFind == myArr[pivotal]) {
				 indexFound = pivotal;
				 break;
			 } else if (numberToFind > myArr[pivotal]) {
				 limInf = pivotal + 1;
			 } else if (numberToFind < myArr[pivotal]) {
				 limSup = pivotal - 1;
			 }
		}
		
		if (indexFound != -1) {
			System.out.println("Element found at index: " + indexFound);
		} else {
			System.out.println("Element not found");
		}
		
		kInput.close();
	}
}
