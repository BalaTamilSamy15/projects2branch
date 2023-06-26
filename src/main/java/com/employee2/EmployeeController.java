package com.employee2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empser;

	@PostMapping(value = "/add")
	public String addEmployee(@RequestBody Employee e) {
		 return empser.addEmployee(e);
		}
		
	@PostMapping(value = "/addList")
	public String addEmployeeList(@RequestBody List<Employee> d) {
		return empser.addEmployeeList(d);

	}

	@GetMapping(value = "/getId/{g}")
	public Employee getEmployee(@PathVariable int g) throws EmployeeNotFoundException, Exception {
		return empser.getEmployee(g);
	}

	@GetMapping(value = "/getList")
	public List<Employee> getEmpList() {
		return empser.getEmpList();
	}

	@DeleteMapping(value = "/delone/{f}")
	public String delEmp(@PathVariable int f) {
		return empser.delEmp(f);
	}

	@DeleteMapping(value = "/delAll")
	public String delAll() {
		return empser.delAll();
	}

	@PutMapping(value = "/up/{e}")
	public String upEmp(@RequestBody Employee e) {
		return empser.addEmployee(e);
	}

	@GetMapping(value = "/filter/{name}")
	public List<Employee> getFilter(@PathVariable String name) throws DesireDetailsNotFound, Exception  {
		return empser.getFilter(name);
	}

	@GetMapping(value = "/filsal")
	public Employee getHisal() {
		return empser.getHisal();
	}

	@GetMapping(value = "/minsal")
	public Employee getMin(){
		return empser.getMin();
	}

	@GetMapping(value = "/!fem")
	public List<Employee> getFem() {
		return empser.getFem();
	}
	
	@GetMapping(value = "/filage/{n}")
	public List<Employee> getageFil(@PathVariable int n) throws DesireDetailsNotFound {
		return empser.getageFil(n);
	}
	@GetMapping(value = "/sort")
	public List<Employee> getSort(){
		return empser.getSort();
	}
	@GetMapping(value = "/findBySalary/{s1}/{s2}")
	public List<Employee> findEmpBySalary(@PathVariable int s1,@PathVariable int s2) throws DesireDetailsNotFound {
		
		return empser.findEmpBySalary(s1,s2);
	}
	@GetMapping(value = "/findMaxsal")
	public Employee getMaxSal() {
		
		return empser.getMaxSal();
		
	}
	@GetMapping(value = "/filtergen/{s}")
	public List<Employee> getGen(@PathVariable String s) {
		return empser.getGen(s);
	}
	@GetMapping(value = "/findByName/{s}")
	public List<Employee> findByName(@PathVariable String s) {
		return empser.findByName(s);
	}
    @GetMapping(value = "/nameage")
    public List<String> getNA() {
	return empser.getNA();
}
	
}
