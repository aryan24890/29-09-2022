/*
 * 1.	Create a list of elements as shown below into the LinkedList and name it as languages.

C
C++
Java
Kotlin
Python
Perl
Ruby

Display the created list.

Remove an element at index 5 and display the list

Remove ‘Kotlin’ and display the list

Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.

Remove all the elements from the list and display the list.

 */
package com.collections.bll;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLIst01 {

	public static void main(String[] args) {
		LinkedList<String> languages = new LinkedList<>();
		
		//adding value in linked list
		languages.add("c");
		languages.add("c++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		
		//Display languages
		System.out.println("*******Languages********");
		for(int i=0; i<languages.size(); i++) {
			
			System.out.println(languages.get(i));
		}
		
		
		// Remove an element at index 5
		System.out.println("\n\n**********************");
		languages.remove(5);
		
		System.out.println("After remove element of index 5");
		
		for(int i=0; i<languages.size(); i++) {
			
			System.out.println(languages.get(i));
		}
		
		//remove Kotlin element
		System.out.println("\n\n**********************");
		languages.remove("Kotlin");
		
		System.out.println("After remove Kotlin");
		
		for(int i=0; i<languages.size(); i++) {
			
			System.out.println(languages.get(i));
		}
		
		//Removing the scripting languages 
		System.out.println("\n\n**********************");
		
		LinkedList<String> sl = new LinkedList<>(Arrays.asList("Python","Ruby","Perl"));
		
		languages.removeAll(sl); //remove python,ruby,perl from language
		System.out.println("After remove scripting languages");
				
		for(int i=0; i<languages.size(); i++) {
					
			System.out.println(languages.get(i));
		}
		
		
		//remove All element
		System.out.println("\n\n**********************");
		languages.removeAll(languages);
		
		System.out.println("After removeAll the language");
				
		for(int i=0; i<languages.size(); i++) {
					
			System.out.println(languages.get(i));
		}

	}

}
