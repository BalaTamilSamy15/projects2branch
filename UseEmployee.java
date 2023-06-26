package com.onesoft.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raja", 30, "Male", 120000);
		Employee e2 = new Employee("Adtiya", 24, "Male", 720000);
		Employee e3 = new Employee("Mala", 28, "Female", 620000);
		Employee e4 = new Employee("Rajii", 21, "Female", 100000);
		Employee e5 = new Employee("Sudhar", 29, "Male", 600000);
		Employee e6 = new Employee("Selvi", 28, "Female", 130000);
		Employee e7 = new Employee("Ganesh", 28, "Male", 420000);

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		
		
//		
	Methods m =new  Methods();
//			Emp e=m :: maxSlaray;
//			System.out.println(e.find(emp));
//			
			
			
			Emp el=m::findMaxSalary;
			System.out.println(el.find(emp));
		}
		
//
//		List<Employee> femaleEmp = emp.stream().filter(x -> x.getGender().equalsIgnoreCase("female"))
//				.collect(Collectors.toList());
//		System.out.println(femaleEmp);
//
//		Long femCount = femaleEmp.stream().count();
//		System.out.println(femCount);
//
//		List<Employee> maleEmp = emp.stream().filter(x -> x.getGender().equalsIgnoreCase("Male"))
//				.collect(Collectors.toList());
//		System.out.println(maleEmp);
//		Long maleCount = maleEmp.stream().count();
//		System.out.println(maleCount);
//
//		List<Employee> salryEmp = emp.stream().filter(y -> y.getSalary() > 600000 && y.getSalary() < 900000)
//				.collect(Collectors.toList());
//		System.out.println(salryEmp);
//
//		Long salaryCount = salryEmp.stream().count();
//		System.out.println(salaryCount);
//
//		List<Employee> aName = emp.stream().filter(x -> x.getName().startsWith("A")).collect(Collectors.toList());
//		System.out.println("Employee" + aName);
//
//		List<Employee> ageAb28 = emp.stream().filter(x -> x.getAge() > 27 && x.getAge() < 31)
//				.collect(Collectors.toList());
//		System.out.println("List above 27 age emp" + ageAb28);
//
//		Long countAge30 = ageAb28.stream().count();
//		System.out.println(countAge30);
//
//		List<String > empName=emp.stream().map(x->x.getName())
//				.collect(Collectors.toList());
//		System.out.println("Only names of emp"+empName);
//		
//		
		
	}


