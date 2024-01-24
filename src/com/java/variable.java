package com.java;

public class variable {
     
	static int a=10; //static variable
	int c=12; // instance variable
	
	public static void main(String[] args) {
      
		int b=10; //local variable
		
		 variable r=new variable();
		 
		 
		 System.out.println(a);
		 System.out.println(r.c);
		 System.out.println(b);
    
	}

}
