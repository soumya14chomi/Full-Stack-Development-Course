package com.example.BankingApplicationBSM69.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankingApplicationBSM69.model.Employee;
import com.example.BankingApplicationBSM69.respository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub

		if (emp != null) {
			employeeRepository.save(emp);

		}
		return emp;
	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		if (id == null) {
			System.out.println("Id is not in getByID");
		}
		System.out.println("Employee is not null in service:" + id);
		Employee emp = employeeRepository.findById(id).get();
		System.out.println("Employee is returned" + emp.getId() + " " + emp.getName());
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub

		List<Employee> employees = employeeRepository.findAll();

		if (employees != null) {
			return employees;
		}

		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

		if (id == null) {
			System.out.println("Id is not passed to service");
			return;
		}
		employeeRepository.deleteById(id);

		System.out.println("Employee Deleted:" + id);

		return;
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub

		if (emp == null) {
			System.out.println("Employee not received in Service");
			return null;
		}
		Employee oldEmp = getById(emp.getId());
		if (emp.getName() != null)
			oldEmp.setName(emp.getName());
		if (emp.getSalary() != null)
			oldEmp.setSalary(emp.getSalary());
		if (emp.getEmail() != null)
			oldEmp.setEmail(emp.getEmail());
		Employee employee = employeeRepository.save(oldEmp);
		if (employee != null) {
			System.out.println("Retrived Successfully");
			return employee;
		}
		return null;
	}

}
