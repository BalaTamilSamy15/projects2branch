package com.employee2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
	
@Query(value = "select*from employees where salary>=? and salary<=?",nativeQuery=true)
public List<Employee> getBySalary(int sal1,int sal2);


@Query(value = "select*from employees  where salary =(select Max(salary)from employees)",nativeQuery=true)
public Employee getSalaryMax();

@Query(value = "select*from employees where name =?",nativeQuery = true)
public List<Employee> getByName(String na);

@Query(value = "select*from employees where gender like ? ",nativeQuery=true)
public List<Employee> getGen(String gen);

@Query(value = "select name from employees",nativeQuery = true)
public List<String> getNeeds();

@Query(value = "select name,age from employees",nativeQuery = true)
public List<String> getNA();


}
