package com.java;

public class Student {
	private int id;
	private String name;
	private String email;
	
	Student(int id,String name, String email){
		this.id=id;
		this.name=name;
		this.email=email;
	}

	void show(){
		System.out.println(id + " " + name +" " + email);
	}
	public static void main(String[] args) {
    
    Student student = new Student(1, "Aamir","sarfaraz@gamil.com");
    student.show();
    


	}

}
