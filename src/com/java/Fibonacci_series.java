package com.java;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
    
		int term,a=0,b=1,c;
		System.out.println("enter term");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		for(int i=1;i<=term;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
