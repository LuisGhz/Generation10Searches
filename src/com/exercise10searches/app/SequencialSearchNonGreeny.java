package com.exercise10searches.app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SequencialSearchNonGreeny {

	public static void main(String[] args) {
		//Constants declaration
		final int ELEMENTS_ARRAYS = 10;
		
		//Variable declaration
		int nToFind = 0;
		int indexFound = -1;
		int indexArr = 0;
		boolean isFound = false;
		
		//Array declaration
		int[] vector = new int[ELEMENTS_ARRAYS];
		
		//Objects declaration
		Random nRandom = new Random(System.nanoTime());
		Scanner kInput = new Scanner(System.in);
		
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			vector[i] = nRandom.nextInt(101);
		}
		
		System.out.println(Arrays.toString(vector));
		
		do {
			System.out.println("Input the value to find inside the array");
			nToFind = kInput.nextInt();
			
			if (nToFind < 0) {
				System.out.println("Number must be greater than or equal to zero");
			}
		} while (nToFind < 0);
		
		/*for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			if(nToFind == vector[i]) {
				indexFound = i;
				break;
			}
		}*/
		
		while (indexArr < ELEMENTS_ARRAYS && !isFound) {
			if (nToFind == vector[indexArr]) {
				indexFound = indexArr;
				isFound = true;
			}
			indexArr++;
		}
		
		if (indexFound != -1) {
			System.out.println("Element found at index:" + indexFound);
		} else {
			System.out.println("Element not found");
		}
		
		kInput.close();
		
	}

}
