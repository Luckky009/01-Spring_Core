package com.spring_core;

public class First_Spring {
	private int studentId;
	private String studentName;
	private String studentAddess;
	//Getter and Setter Injunction
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public String getStudentAddess() {
		return studentAddess;
	}
	public void setStudentAddess(String studentAddess) {
		System.out.println("Setting Student Address");
		this.studentAddess = studentAddess;
	}
	//Parameterized Constructor
	public First_Spring(int studentId, String studentName, String studentAddess) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddess = studentAddess;
	}
	//Default Constructor
	public First_Spring() {
		super();
		// TODO Auto-generated constructor stub
	}
	//toString() 
	@Override
	public String toString() {
		return "First_Spring [studentId=" + studentId + ", studentName=" + studentName + ", studentAddess="
				+ studentAddess + "]";
	}
	
	
}

