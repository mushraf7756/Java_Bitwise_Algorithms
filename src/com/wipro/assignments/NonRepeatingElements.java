package com.wipro.assignments;

public class NonRepeatingElements {

    public static void findTwoNonRepeating(int[] arr) {
	int xor = 0;

	// Step 1: XOR all elements. The result will be XOR of the two unique numbers.
	for (int num : arr) {
	    xor ^= num;
	}

	// Step 2: Find a set bit in the result (xor) (rightmost set bit).
	int setBit = xor & ~(xor - 1);

	// Step 3: Divide the numbers into two groups and XOR them separately.
	int num1 = 0, num2 = 0;
	for (int num : arr) {
	    if ((num & setBit) != 0) {
		num1 ^= num;
	    } else {
		num2 ^= num;
	    }
	}

	// num1 and num2 are the two non-repeating elements.
	System.out.println("The two non-repeating elements are: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] arr = { 1, 2, 3, 2, 1, 4 };
	findTwoNonRepeating(arr);
    }

}
