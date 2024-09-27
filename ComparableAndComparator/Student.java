package com.ComparableAndComparator;
/*
 * Comparable (single
 * 1)Single sequence sorting(only one condition)
 * 
 * implement
 * override compareTo() Override
 * 
 * calling
 * main
 */
public class Student implements Comparable<Student>{
	
	//data
	int rollno;
	String name;
	int age;
	
	//constructor
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	
	public int compareTo(Student o) {
		if(age==o.age)
			return 0;
		
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
}
