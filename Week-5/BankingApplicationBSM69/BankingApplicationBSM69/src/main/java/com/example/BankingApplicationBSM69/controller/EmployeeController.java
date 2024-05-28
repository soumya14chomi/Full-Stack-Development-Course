package com.example.BankingApplicationBSM69.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankingApplicationBSM69.model.Employee;
import com.example.BankingApplicationBSM69.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("GetData")
	public Employee test() {
		return new Employee(101, "Soumya", "soumyajdhjs@gmail.com", 34475l);
	}

	@PostMapping("save")
	public Employee saveEmployee(@RequestBody Employee emp) {

		if (emp != null) {
			Employee employee = employeeService.save(emp);

			System.out.println(employee);
			return employee;
		}
		return emp;

	}

	@GetMapping("GetEmployeeById")
	public Employee getEmployeeById(@RequestBody Integer id) {

		if (id == null) {
			System.out.println("Id is null");
			return null;
		}
		// System.out.println("Id is not Empty" + emp.getId());
		Employee employee = employeeService.getById(id);
		if (employee != null)
			return employee;
		System.out.println("Employee Not found");

		return null;

	}

	@GetMapping("FetchAll")
	public List<Employee> getAll() {

		List<Employee> employees = employeeService.getAll();

		if (employees != null) {
			return employees;
		}
		System.out.println("No Records Returned from Service");
		return null;

	}

	@DeleteMapping("DeleteById")
	public String delete(Integer id) {
		if (id == null) {
			System.out.println("Id is not passed from PostMan");
		}

		employeeService.delete(id);

		return "Delete Successful";
	}

	@PutMapping("updateEmployee")
	public Employee update(@RequestBody Employee emp) {
		if (emp == null) {
			System.out.println("Emloyee Not received from Postman");
			return null;
		}

		System.out.println("Employee Received froom postman:" + emp.getId());
		Employee employee = employeeService.update(emp);

		if (employee != null) {
			return employee;
		}

		System.out.println("Returned empty String from Service");
		return null;
	}
}
