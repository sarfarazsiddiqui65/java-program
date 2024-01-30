package com.java;

import java.util.Scanner;

public class area_of_rectangle {

	public static void main(String[] args) {
       
		int length,breath, area;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		breath=sc.nextInt();
		
		area=length*breath;
		
		System.out.println("area of rectangle "+area);
		
		
	}

}
