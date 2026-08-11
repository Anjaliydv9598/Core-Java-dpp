package com.dsa.dpp;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//take the input from the user till user does not press x or X
		double ans =0;
		
		while(true) {
			//take the operator as input 
			System.out.println("EEnter the operator : ");
			char operator = input.next().trim().charAt(0);
			
			if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
				//input two num's
				System.out.println("Enter two numbers : ");
				if (!input.hasNextInt()) {
				    System.out.println("Invalid number! Please enter a valid integer.");
				    input.next();
				    continue;
				}
				int num1 = input.nextInt();
				if (!input.hasNextInt()) {
				    System.out.println("Invalid number! Please enter a valid integer.");
				    input.next();
				    continue;
				}
				int num2 = input.nextInt();
				
				
				if(operator == '+') {
					ans = num1 + num2 ;
				}
				if(operator == '-') {
					ans = num1 - num2 ;
				}
				if(operator == '*') {
					ans = num1 * num2 ;
				}
				if(operator == '/') {
					if(num2 == 0) {
						System.out.println("Can't divide by 0");
						break;
					}else if(num2>num1) {
						ans = (double) num1 / num2;
					}else {
						ans = num1 / num2;
					}
				}
				if(operator == '%') {
					ans = num1 % num2 ;
				}
				
			}else if(operator == 'x' || operator == 'X') {
				break;
			}else {
				System.out.println("Invalid operation!!");
			}
			System.out.println(ans);
		}
		
	}

}
