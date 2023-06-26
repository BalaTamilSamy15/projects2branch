package com.employee2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empdao;

	public String addEmployee(Employee e) {

		try {
			if (e.getAge() >= 18) {
				return empdao.addEmployee(e);
			} else {
				throw new Below18Exception();
			}
		} catch (Below18Exception h) {
			
			return "18 below";
		}

	}

	public String addEmployeeList(List<Employee> d) {

		return empdao.addEmployeeList(d);
	}

	public Employee getEmployee(int g) throws EmployeeNotFoundException, Exception {
		
		return empdao.getEmployee(g);
	}

	public List<Employee> getEmpList() {

		return empdao.getEmpList();
	}

	public String delEmp(int f) {

		return empdao.delEmp(f);
	}

	public String delAll() {

		return empdao.delAll();
	}

	public List<Employee> getFilter(String name) throws DesireDetailsNotFound, Exception {
		List<Employee> af = empdao.getEmpList();
		List <Employee> naEmp= af.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		if (naEmp.isEmpty()) {
			throw new DesireDetailsNotFound();
		} else {
		
		return naEmp;
		}
		
	}

	public String addEmployee1(Employee e) {

		return empdao.addEmployee1(e);
	}

	public Employee getHisal() {
		List<Employee> maxSal = empdao.getEmpList();
		return maxSal.stream().max(Comparator.comparing(Employee::getSalary)).get();
	}

	public List<Employee> getFem() {
		List<Employee> allEmp = empdao.getEmpList();
		return allEmp.stream().filter(x -> !x.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());
	}

	public Employee getMin() {
		List<Employee> mini = empdao.getEmpList();
		return mini.stream().min(Comparator.comparing(Employee::getSalary)).get();
	}

	public List<Employee> getageFil(int n) throws DesireDetailsNotFound {
		List<Employee>	getAge = empdao.getEmpList();
		
		 List<Employee> getByAge=  getAge.stream().filter(x -> x.getAge() > n).collect(Collectors.toList());
		 if (getByAge.isEmpty()) {
			 throw new DesireDetailsNotFound();
		}
		 else {
		 return getByAge; 
		 }
	}

	public List<Employee> getSort() {
		List<Employee> sor = empdao.getEmpList();
		return sor.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
	}
//  spring.jpa.hibernate.ddl-auto=update

	public List<Employee> findEmpBySalary(int s1, int s2) throws DesireDetailsNotFound {
		
	 List<Employee> find= empdao.findEmpBySalary(s1, s2);
	 if(find.isEmpty()) {
		 throw new DesireDetailsNotFound();
	 }
	 else {
	return find;
	}
	}
	public Employee getMaxSal() {

		return empdao.getMaxSal();
	}

	public List<Employee> getGen(String s) {

		return empdao.getGen(s);
	}

	public List<Employee> findByName(String s) {

		return empdao.findByName(s);
	}

	public List<String> getNA() {
		return empdao.getNA();
	}

}
