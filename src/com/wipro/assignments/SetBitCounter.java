package com.wipro.assignments;

public class SetBitCounter {

    // Function to count the number of set bits in a single integer
    public static int countSetBits(int num) {
	int count = 0;
	while (num > 0) {
	    count += num & 1;
	    num >>= 1;
	}
	return count;
    }

    // Function to count the total number of set bits from 1 to n
    public static int countTotalSetBits(int n) {
	int totalCount = 0;
	for (int i = 1; i <= n; i++) {
	    totalCount += countSetBits(i);
	}
	return totalCount;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int i = 45;
	System.out.println("Number of count set bits = " + countSetBits(i));
	int totalSetBits = countTotalSetBits(i);
	System.out.println("Total number of set bits from 1 to " + i + " is: " + totalSetBits);
    }

}
