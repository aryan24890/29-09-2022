/*
 Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value in the list to the front, otherwise preserving the order of the elements. 
For example, if a list stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9} 
You may assume that the list stores at least one value

 */
package com.collections.bll;

import java.util.ArrayList;

public class MinFirstCome {
	public static void minToFront(ArrayList<Integer> list) {
	    int minIndex = 0;
	    
	    for (int i = 1; i < list.size(); i++) {
	        if (list.get(minIndex) > list.get(i)) {
	            minIndex = i;
	        }
	    }
	    
	    int minValue = list.remove(minIndex);
	    list.add(0, minValue);
	}

	public static void main(String[] args) {
		
		  ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(3);
		    list.add(8);
		    list.add(92);
		    list.add(1);
		    list.add(2);
		    list.add(17);
		    list.add(9);
		    System.out.println("********Original List.*******");
		    System.out.println(list);
		   
		    System.out.println("\n**********After minToFront() method*********");
		    minToFront(list);
		    System.out.println(list);
		

	}

}
