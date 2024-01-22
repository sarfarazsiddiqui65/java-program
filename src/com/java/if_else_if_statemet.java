package com.java;

import java.util.Scanner;

public class if_else_if_statemet {

	public static void main(String[] args) {
    int marks;
    System.out.println("enter number");
    Scanner sc=new Scanner(System.in);
    marks=sc.nextInt();
    if(marks>80)
     {
    	System.out.println("toper");
     }
     else if (marks<80 && marks>=60)
     {
    	System.out.println("middle");
     }
     else
     {
    	System.out.println("lower"); 
     }  
	}
}
