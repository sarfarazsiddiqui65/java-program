package com.java;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {

     
		int n;
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
