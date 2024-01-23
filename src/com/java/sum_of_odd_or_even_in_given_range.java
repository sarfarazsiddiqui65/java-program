package com.java;

import java.util.Scanner;

public class sum_of_odd_or_even_in_given_range {

	public static void main(String[] args) {
      //even 10(0+2+4+6+8+10=30)
	 //	odd 11(1+3+5+7+9+11)
		
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
			for(int i=1;i<=n;i=i+2)
			{
              sum=sum+i;
			}
			
			System.out.println("sum of odd number"+sum);
		}	

	}

}
