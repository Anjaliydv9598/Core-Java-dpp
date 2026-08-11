package com.dsa.dpp;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int first_no =0;
		int second_no = 1;
		int count =2;
		
		while(count<=n) {
			int temporary_var = second_no;
			second_no += first_no;
			first_no = temporary_var;
			count++;
		}
		System.out.println(second_no);
	}
}
