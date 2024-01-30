package com.java;

import java.util.Scanner;

public class even_or_odd_an_sum_program {

	public static void main(String[] args) {

		int n,sum=0;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0)
		{
			for(int i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("sum of even number"+sum);
		}
		else
		{
			for(int i=0; i<=n; i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("sum of odd number"+sum);
		}
	}

}
