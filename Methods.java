package com.onesoft.day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Methods {
	public Employee maxSlaray(ArrayList<Employee> l) {
		Employee max=l.get(0);
		for (int i = 0; i < l.size(); i++) {
			if (max.getSalary()<l.get(i).getSalary()) {
				max=l.get(i);
			}
		}
		return max;
		
		
	}
	public Employee minSlaray(ArrayList<Employee> l) {
		Employee min=l.get(0);
		for (int i = 0; i < l.size(); i++) {
			if (min.getSalary()>l.get(i).getSalary()) {
				min=l.get(i);
			}
		}
		return min;
	}
	
//	public Employee noOfExp(ArrayList<Employee> l) {
	//	Employee max=l.get(0);
//		for (int i = 0; i < l.size(); i++) {
//			if (max.getAge()>l.get(i).getAge()) {
//				max=l.get(i);
//			}
//		}
//		return max;	
//	}
//		for (Employee eg : l) {
//			if (max.getAge()>eg.getAge()) {
//				max=eg;
//			}
//				
//			}
//		return max;
//		 hf}
 
	public Employee findMaxSalary(ArrayList<Employee> employees) {
	    return employees.stream()
	            .max(Comparator.comparing(Employee::getSalary))
	            .orElse(null);
	}


	
}
