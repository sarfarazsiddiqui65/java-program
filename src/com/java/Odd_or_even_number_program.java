package com.java;

import java.util.Scanner;

public class Odd_or_even_number_program {

	public static void main(String[] args) {
      
		int n=0;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
