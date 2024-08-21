package com.wipro.bitwiseoperators;

public class CountSetBits {

    static int countSetBits(int n) {
	int count = 0;
	while (n > 0) {
	    count += n & 1;
	    n >>= 1;
	}
	return count;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int i = 45;
	System.out.println("Number of count set bits = " + countSetBits(i));

    }

}
