package com.collections.bll;

import java.util.Comparator;

public class StateAndNameComparator implements Comparator<Students>{

	@Override
	public int compare(Students student1, Students student2) {
	
		if(student1.getState().compareTo(student2.getState())==0) {
			if(student1.getName().compareTo(student2.getName())==0) {
				return 0;
			}
			else if(student1.getName().compareTo(student2.getName())>0) {
			return 1;
			}
			else {
				return -1;
			}
		}
		else if(student1.getState().compareTo(student2.getState())>0) {
			if(student1.getName().compareTo(student2.getName())==0) {
				return 0;
			}
			else if(student1.getName().compareTo(student2.getName())>0) {
			return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}

}
