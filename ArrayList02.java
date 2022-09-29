/*
 * 2.	Create an ArrayList object students, and store the following students in that list.

Student
	studentcode
	studentname
	age
	state

Student Code	Student Name	Age	State
AF0216223	Aryan Raj	21	Andra Pradhesh
AF0216224	Bivor Kumar	22	Andra Pradhesh
AF0216227	SUSHMITA KUMARI	23	Madhya Pradesh
AF0216231	Ragiv Zafar	24	Maharashtra
AF0216232	RAHUL MAHTO	25	Orissa
AF0216234	Nainsi Kumari	19	Gujarath
AF0216236	MD ALI	26	Madhya Pradesh
AF0216238	ABHISHEK KUMAR	22	Andra Pradhesh
AF0216240	AFROZ ANSARI	21	Maharashtra
AF0216259	RITIK RAJ	20	Orissa
AF0216263	Anant Kumar	25	Andra Pradhesh
AF0216305	BABU KUMAR	24	Gujarath
AF0216307	NIKITA KUMARI	23	Madhya Pradesh
AF0216353	PRANAV PANDEY	22	Orissa
AF0216964	Radheshyam Kumar	21	Maharashtra
AF0216973	Ankur Utpal	19	Gujarath
AF0217607	Banty Mishra	18	Madhya Pradesh
AF0217615	RIYA KUMARI	20	Karnataka
AF0217791	Priyadarshani Kumari	21	Maharashtra
AF0223373	Chanchal Thakur	22	Orissa
AF0221549	SATENDRA KUMAR	23	Maharashtra
AF0216212	Pappi Verma	24	
AF0216244	Ramkrishna Kushwah	25	Andra Pradhesh
AF0216245	Yogita Tamoliya	26	Orissa

Find the students aged over 20

Find students from the state Andhra Pradhesh

Sort students by their age.

	Sort students by state and student name.

 */
package com.collections.bll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList02 {

	
	public static void main(String[] args) {
		ArrayList<Students> students = new ArrayList<>();
		//adding new Student in Students Class
		students.add(new Students("AF0216223","Aryan Raj",21,"Andra Pradhesh"));
		students.add(new Students("AF0216224","Bivor Kumar",22,"Andra Pradhesh"));
		students.add(new Students("AF0216231","Ragiv Zafar",24,"Maharashtra"));
		students.add(new Students("AF0216232","Rahul Mahto",25,"Orisha"));
		students.add(new Students("AF0216234","Nansi Kumari",19,"Gujrath"));
		students.add(new Students("AF0216236","Md. Ali",26,"Madhya Pradesh"));
		students.add(new Students("AF0216238","Abhishek Kumar",22,"Andra Pradhesh"));
		students.add(new Students("AF0216240","Afroj Ansari",21,"Maharashtra"));
		students.add(new Students("AF0216259","Anant Raj",25,"Andra Pradhesh"));
		students.add(new Students("AF0216263","Babu Kumar",24,"Gujarath"));
		students.add(new Students("AF0216305","Nikita Kumari",23,"Madhya Pradesh"));
		students.add(new Students("AF0216307","Pranav Pandey",22,"Orissa"));
		students.add(new Students("AF0216353","Radheshyam Kumar",21,"Maharashtra"));
		students.add(new Students("AF0216964","Ankur Utpal",19,"Gujarath"));
		students.add(new Students("AF0217607","Banti Mishra",18,"Madhya Pradesh"));
		students.add(new Students("AF0217615","Riya Kumari",20,"Karnataka"));
		students.add(new Students("AF0217791","Priyadarshani Kumari",21,"Maharashtra"));
		students.add(new Students("AF0223373","Chanchal Thakur",22,"Orissa"));
		students.add(new Students("AF0221549","Satendra Kumar",23,"Maharashtra"));
		students.add(new Students("AF0216212","Pappi Verma",24,"Andra Pradhesh"));
		students.add(new Students("AF0216244","Ramkrishna Kushwaha",25,"Orissa"));
		students.add(new Students("AF0216245","Yogita Tamoliya",26,"Orissa"));
		
		
		//for printing All students list
		System.out.println("**********All Students***********");
		for(int i=0; i<students.size();i++) {
			System.out.println(students.get(i));
		}
		
		//Student Age above 20
		System.out.println("\n\n********Student Age Above 20 ***********");
		for(Students student:students) {
			if(student.getAge()>20)
				System.out.println(student);
		}
		
		//students from Andra Pradhesh..
		System.out.println("\n\n********Students from Andhra Pradesh.*******");
		for(Students student : students){
			
			if(student.getState().equals("Andra Pradhesh"))
				System.out.println(student);
		}
		
		
		//Sorting according to age
		 System.out.println("\n\n***********sorting by age...*************");  
		  
			Collections.sort(students,new AgeComparator());  
			 for(Students student : students) {
				 System.out.println(student);
			 }
			 
			 //Sorting by name and State
			 System.out.println("\n\n***********Sorting by name and State*************");
			 Collections.sort(students , new StateAndNameComparator());
				for(Students student : students) {
					System.out.println(student);
				}
			

	}

}
