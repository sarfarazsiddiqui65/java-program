package com.java;

import java.util.Scanner;

public class area_of_circle {

	public static void main(String[] args) {
    
		float pi=3.14f,area;
		int r;
		System.out.println("enter of redius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		
		area=pi*r*r;
		
		System.out.println("area of circle "+area);
		

	}

}
