package com.dsa.dpp;

public class CountingOccurrences {

	public static void main(String[] args) {
		
		int n = 3455678;
		int count =0;
		
		while(n>0) {
			int rem = n % 10;
			if(rem == 3) {
				count++;
			}
			n = n/10; //or		 n /= 10;
		}
		System.out.println(count);
	}
}
