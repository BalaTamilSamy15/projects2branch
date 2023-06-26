package com.employee2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository emprepo;

	public String addEmployee(Employee e) {
		emprepo.save(e);
		return "Successfully Saved";
	}

	public String addEmployeeList(List<Employee> d) {
		emprepo.saveAll(d);
		return "Saved all the Datas";

	}

	public Employee getEmployee(int g) throws EmployeeNotFoundException, Exception {
		return emprepo.findById(g).orElseThrow(() -> new EmployeeNotFoundException());
	}

	public List<Employee> getEmpList() {
		return emprepo.findAll();
	}

	public String delEmp(int f) {
		emprepo.deleteById(f);
		return "Successfully Deleted ";
	}

	public String delAll() {
		emprepo.deleteAll();
		return "Deleted all the EmpData";
	}

//	public String upEmp(Employee c) {
//		
//		 emprepo.save(c);
//		 return "Upadted";
//	}

	public String addEmployee1(Employee e) {
		emprepo.save(e);
		return "Updated";
	}

	public List<Employee> findEmpBySalary(int s1, int s2) {
		return emprepo.getBySalary(s1, s2);
	}

	public Employee getMaxSal() {
		return emprepo.getSalaryMax();
	}

	public List<Employee> getGen(String s) {
		return emprepo.getGen(s);
	}

	public List<Employee> findByName(String s) {

		return emprepo.getByName(s);
	}

	public List<String> getNeeds() {

		return emprepo.getNeeds();
	}

	public List<String> getNA() {
		return emprepo.getNA();
	}

}
