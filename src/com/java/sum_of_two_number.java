package com.java;

import java.util.Scanner;

public class sum_of_two_number {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		int sum=a+b;
		
		System.out.println("addition" + sum);
		
	}

}
