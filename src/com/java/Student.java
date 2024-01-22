package com.java;

public class Student {
	private int id;
	private String name;
	private String email;
	private long phone;
	
	Student(int id,String name, String email, long phone){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}

	void show(){
		System.out.println(id + " " + name +" " + email+" "+phone);
	}
	public static void main(String[] args) {
    
    Student student = new Student(1, "Aamir","sarfaraz@gamil.com",1224353522);
    student.show();
    


	}

}
