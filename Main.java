package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {2, 5, 65, 4, 12, -7, 96, -63, 33, 5};
	int max = arr[0];
	int imax = 0;
	int i = 0;
	while ( i < arr.length){
	    if (arr[i] > max) {
	        max = arr[i];
	        imax = i;
        }
	    i++;
    }
	System.out.print("Maximum number = " + max);
	System.out.println(" is in " + (imax + 1) +  " place!");

	int sum = 0;
	for (int h = 0; h < arr.length; h++)  {
	if (arr[h] > 0)	{sum += arr[h]; }}
	System.out.println("Sum of positive numbers in array  = " + sum);


		int product = 0;
		for (int g = 0; g < arr.length; g++) {
			if (arr[g] < 0) {product += arr[g];}}
		System.out.println("Sum of negative numbers in array = " + product);


		int amount = 0;
		for (int a : arr) {
			if (a > 0) { amount++; }
		}
		System.out.println("Amount of positive numbers = " + amount);

		int amountMinus = 0;
		for (int a : arr) {
			if (a < 0) { amountMinus++; }
		}
		System.out.println("Amount of negative numbers = " + amountMinus);
	}
}
